package io.github.karmasmp.lifecycle;

import io.github.karmasmp.PluginListener;
import io.github.karmasmp.PluginWorldType;
import io.github.karmasmp.lifecycle.world.*;
import io.github.karmasmp.phase.Phase;
import io.github.karmasmp.phase.QueuedPhase;
import io.github.karmasmp.phase.plugin.FinalPluginPhase;
import io.github.karmasmp.phase.plugin.MainPluginPhase;
import io.github.karmasmp.testcommand.LifecycleCommand;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.command.CommandMap;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

public final class PluginLifecycle extends Lifecycle {

    private final Map<UUID, PlayerLifecycle> playerLifecycleMap;
    private final JavaPlugin plugin;
    private final Map<String, WorldLifecycle> worldLifecycleMap;

    public PluginLifecycle(JavaPlugin plugin) {
        this.playerLifecycleMap = new HashMap<>();
        this.plugin = plugin;
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
        CommandMap commandMap = this.getServer().getCommandMap();

        commandMap.register("karmasmp", new LifecycleCommand(this));

        this.getLogger().info("Registered commands!");
    }

    public void registerEvents() {
        this.getServer().getPluginManager().registerEvents(new PluginListener(this), this.plugin);

        this.getLogger().info("Registered events!");
    }

    @Override
    public void start() {
        super.start();
        this.getLogger().info("Plugin lifecycle started!");
    }

    @Override
    public void stop() {
        super.stop();
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
