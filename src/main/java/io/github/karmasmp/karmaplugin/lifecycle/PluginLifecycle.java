package io.github.karmasmp.karmaplugin.lifecycle;

import cloud.commandframework.annotations.AnnotationParser;
import cloud.commandframework.arguments.parser.StandardParameters;
import cloud.commandframework.arguments.standard.StringArgument;
import cloud.commandframework.execution.CommandExecutionCoordinator;
import cloud.commandframework.meta.CommandMeta;
import cloud.commandframework.meta.SimpleCommandMeta;
import cloud.commandframework.minecraft.extras.AudienceProvider;
import cloud.commandframework.minecraft.extras.MinecraftHelp;
import cloud.commandframework.paper.PaperCommandManager;
import io.github.karmasmp.karmaplugin.*;
import io.github.karmasmp.karmaplugin.lifecycle.world.*;
import io.github.karmasmp.karmaplugin.phase.Phase;
import io.github.karmasmp.karmaplugin.phase.QueuedPhase;
import io.github.karmasmp.karmaplugin.phase.plugin.FinalPluginPhase;
import io.github.karmasmp.karmaplugin.phase.plugin.MainPluginPhase;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;
import java.util.function.Function;
import java.util.logging.Logger;

public final class PluginLifecycle extends Lifecycle {

    private final Map<UUID, KarmaPlayer> karmaPlayerMap;
    private final Map<UUID, PlayerLifecycle> playerLifecycleMap;
    private final JavaPlugin plugin;
    private final PluginTimer timer;
    private final Map<String, WorldLifecycle> worldLifecycleMap;

    public PluginLifecycle(JavaPlugin plugin) {
        this.karmaPlayerMap = new HashMap<>();
        this.playerLifecycleMap = new HashMap<>();
        this.plugin = plugin;
        this.timer = new PluginTimer(this);
        this.worldLifecycleMap = new HashMap<>();
    }

    public WorldLifecycle createWorldLifecycle(World world, PluginWorldType worldType) {
        WorldLifecycle worldLifecycle = null;

        switch (worldType) {
            case ADMIN -> worldLifecycle = new AdminWorldLifecycle(this, world, worldType);
            case DEFAULT -> worldLifecycle = new DefaultWorldLifecycle(this, world, worldType);
            case EVENT -> worldLifecycle = new EventWorldLifecycle(this, world, worldType);
            //case SMP -> worldLifecycle = new SMPWorldLifecycle(this, world);
        }

        this.worldLifecycleMap.put(world.getName(), worldLifecycle);
        return worldLifecycle;
    }

    @Override
    public QueuedPhase createQueuedPhase(Class<? extends Phase> clazz) throws NoSuchMethodException {
        return createQueuePhase(clazz, PluginLifecycle.class, this);
    }

    @Override
    public QueuedPhase createQueuedPhase(Class<? extends Phase> clazz, Class<?>[] constructorTypes, Object... parameters) throws NoSuchMethodException {
        return createQueuePhase(clazz, PluginLifecycle.class, this, constructorTypes, parameters);
    }

    public KarmaPlayer getKarmaPlayer(Player player) {
        KarmaPlayer karmaPlayer = this.getKarmaPlayer(player.getUniqueId());

        if(karmaPlayer == null) {
            karmaPlayer = new KarmaPlayer(player, this.getPlayerLifecycle(player));
            this.karmaPlayerMap.put(player.getUniqueId(), karmaPlayer);
        }

        return karmaPlayer;
    }

    public KarmaPlayer getKarmaPlayer(UUID uuid) {
        return karmaPlayerMap.get(uuid);
    }

    public PlayerLifecycle getPlayerLifecycle(Player player) {
        PlayerLifecycle playerLifecycle = this.getPlayerLifecycle(player.getUniqueId());

        if (playerLifecycle == null) {
            playerLifecycle = new PlayerLifecycle(this, player);
            playerLifecycle.start();
            this.playerLifecycleMap.put(player.getUniqueId(), playerLifecycle);
        }

        return playerLifecycle;
    }

    public PlayerLifecycle getPlayerLifecycle(UUID uuid) {
        return playerLifecycleMap.get(uuid);
    }

    public Collection<PlayerLifecycle> getPlayerLifecycles() {
        return playerLifecycleMap.values();
    }

    public Logger getLogger() {
        return plugin.getLogger();
    }

    public JavaPlugin getPlugin() {
        return plugin;
    }

    public Server getServer() {
        return plugin.getServer();
    }

    public WorldLifecycle getWorldLifecycle(String name) {
        return worldLifecycleMap.get(name);
    }

    public WorldLifecycle getWorldLifecycle(World world) {
        return getWorldLifecycle(world.getName());
    }

    public Collection<WorldLifecycle> getWorldLifecycles() {
        return worldLifecycleMap.values();
    }

    @Override
    public void queueFinalPhase() {
        queuePhase(FinalPluginPhase.class);
    }

    @Override
    public void queuePhases() {
        queuePhase(MainPluginPhase.class);
    }

    public void registerCommands() {
        this.getLogger().info("Setting up commands!");
        PaperCommandManager<CommandSender> commandManager;
        try {
            commandManager = new PaperCommandManager<>(this.plugin, CommandExecutionCoordinator.simpleCoordinator(),
                    Function.identity(),
                    Function.identity());
        } catch (Exception e) {
            this.getLogger().severe("Failed to initialize the command manager!");
            throw new RuntimeException(e);
        }

        commandManager.registerAsynchronousCompletions();
        commandManager.registerBrigadier();
        commandManager.commandSuggestionProcessor((context, strings) -> {
            String input;

            if (context.getInputQueue().isEmpty()) {
                input = "";
            } else {
                input = context.getInputQueue().peek();
            }

            input = input.toLowerCase();
            List<String> suggestions = new LinkedList<>();

            for (String suggestion : strings) {
                suggestion = suggestion.toLowerCase();

                if (suggestion.startsWith(input)) {
                    suggestions.add(suggestion);
                }
            }

            return suggestions;
        });

        var minecraftHelp = new MinecraftHelp<>(
                "/karma",
                AudienceProvider.nativeAudience(),
                commandManager
        );

        commandManager.command(
                commandManager.commandBuilder("karma")
                        .literal("help")
                        .argument(StringArgument.optional("query", StringArgument.StringMode.GREEDY))
                        .handler(context -> minecraftHelp.queryCommands(context.getOrDefault("query", ""), context.getSender()))
        );

        AnnotationParser<CommandSender> annotationParser = new AnnotationParser<>(commandManager, CommandSender.class,
                param -> SimpleCommandMeta.simple()
                        .with(CommandMeta.DESCRIPTION, param.get(StandardParameters.DESCRIPTION, "No description"))
                        .build()
        );

        annotationParser.getParameterInjectorRegistry().registerInjector(PluginLifecycle.class, (context, annotations) -> this);

        try {
            annotationParser.parseContainers();
        } catch(Exception ex) {
            this.getLogger().severe("Failed to parse commands!");
            throw new RuntimeException(ex);
        }
        this.getLogger().info("Finished setting up commands!");
    }

    public void registerEvents() {
        this.getServer().getPluginManager().registerEvents(new PluginListener(this), this.plugin);

        this.getLogger().info("Registered events!");
    }

    @Override
    public void start() {
        super.start();

        this.timer.start();
        this.getLogger().info("Plugin lifecycle started!");
    }

    @Override
    public void stop() {
        super.stop();

        this.timer.stop();
        this.getLogger().info("Plugin lifecycle stopped!");
    }

    @Override
    public void onStart() {
        this.registerCommands();
        this.registerEvents();

        PluginWorldType defaultWorldType = PluginWorldType.DEFAULT;
        for(World world : this.getServer().getWorlds()) {
            WorldLifecycle worldLifecycle = this.createWorldLifecycle(world, defaultWorldType);

            worldLifecycle.start();
        }
    }

    @Override
    public void onStop() {
        for(WorldLifecycle worldLifecycle : this.worldLifecycleMap.values()) {
            worldLifecycle.stop();
        }

        for(PlayerLifecycle playerLifecycle : this.playerLifecycleMap.values()) {
            playerLifecycle.stop();
        }
    }

    @Override
    public void onTick() {
        for(WorldLifecycle worldLifecycle : this.worldLifecycleMap.values()) {
            worldLifecycle.tick();
        }

        for(PlayerLifecycle playerLifecycle : this.playerLifecycleMap.values()) {
            playerLifecycle.tick();
        }
    }

    // #################################################################################################################
    // EVENTS
    // #################################################################################################################
}
