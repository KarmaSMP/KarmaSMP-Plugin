package io.github.karmasmp.lifecycle;

import cloud.commandframework.annotations.AnnotationParser;
import cloud.commandframework.arguments.parser.StandardParameters;
import cloud.commandframework.execution.CommandExecutionCoordinator;
import cloud.commandframework.meta.CommandMeta;
import cloud.commandframework.meta.SimpleCommandMeta;
import cloud.commandframework.paper.PaperCommandManager;
import io.github.karmasmp.KarmaCommandSender;
import io.github.karmasmp.PluginListener;
import io.github.karmasmp.PluginTimer;
import io.github.karmasmp.PluginWorldType;
import io.github.karmasmp.lifecycle.world.*;
import io.github.karmasmp.phase.Phase;
import io.github.karmasmp.phase.QueuedPhase;
import io.github.karmasmp.phase.plugin.FinalPluginPhase;
import io.github.karmasmp.phase.plugin.MainPluginPhase;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;
import java.util.logging.Logger;

public final class PluginLifecycle extends Lifecycle {

    private final Map<UUID, PlayerLifecycle> playerLifecycleMap;
    private final JavaPlugin plugin;
    private final PluginTimer timer;
    private final Map<String, WorldLifecycle> worldLifecycleMap;

    public PluginLifecycle(JavaPlugin plugin) {
        this.playerLifecycleMap = new HashMap<>();
        this.plugin = plugin;
        this.timer = new PluginTimer(this);
        this.worldLifecycleMap = new HashMap<>();
    }

    public PlayerLifecycle createPlayerLifecycle(Player player) {
        PlayerLifecycle playerLifecycle = new PlayerLifecycle(this, player);
        this.playerLifecycleMap.put(player.getUniqueId(), playerLifecycle);
        return playerLifecycle;
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

    public PlayerLifecycle getPlayerLifecycle(Player player) {
        return getPlayerLifecycle(player.getUniqueId());
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
        PaperCommandManager<KarmaCommandSender> commandManager;
        try {
            commandManager = new PaperCommandManager<>(this.plugin, CommandExecutionCoordinator.simpleCoordinator()
                    , (sender) -> new KarmaCommandSender(sender, this)
                    , (customSender) -> customSender.getCommandSender());
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

        AnnotationParser<KarmaCommandSender> annotationParser = new AnnotationParser<>(commandManager, KarmaCommandSender.class,
                param -> SimpleCommandMeta.simple()
                        .with(CommandMeta.DESCRIPTION, param.get(StandardParameters.DESCRIPTION, "No description"))
                        .build()
        );

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

        for(Player player : this.getServer().getOnlinePlayers()) {
            PlayerLifecycle playerLifecycle = this.createPlayerLifecycle(player);

            playerLifecycle.start();
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

    @Override
    public void event(PlayerJoinEvent event) {
        PlayerLifecycle playerLifecycle = this.createPlayerLifecycle(event.getPlayer());

        playerLifecycle.start();
    }
}
