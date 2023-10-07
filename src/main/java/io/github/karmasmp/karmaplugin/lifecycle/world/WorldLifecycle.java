package io.github.karmasmp.karmaplugin.lifecycle.world;

import io.github.karmasmp.karmaplugin.PluginWorldType;
import io.github.karmasmp.karmaplugin.lifecycle.Lifecycle;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import io.github.karmasmp.karmaplugin.phase.Phase;
import io.github.karmasmp.karmaplugin.phase.QueuedPhase;
import io.github.karmasmp.karmaplugin.phase.world.FinalWorldPhase;
import org.bukkit.World;

import java.util.logging.Logger;

public abstract class WorldLifecycle extends Lifecycle {

    private final PluginLifecycle pluginLifecycle;
    private final World world;
    private final PluginWorldType worldType;

    public WorldLifecycle(PluginLifecycle pluginLifecycle, World world, PluginWorldType worldType) {
        this.pluginLifecycle = pluginLifecycle;
        this.world = world;
        this.worldType = worldType;
    }

    @Override
    protected QueuedPhase createQueuedPhase(Class<? extends Phase> clazz) throws NoSuchMethodException {
        return createQueuePhase(clazz, WorldLifecycle.class, this);
    }

    @Override
    protected QueuedPhase createQueuedPhase(Class<? extends Phase> clazz, Class<?>[] constructorTypes, Object... parameters) throws NoSuchMethodException {
        return createQueuePhase(clazz, WorldLifecycle.class, this, constructorTypes, parameters);
    }

    public Logger getLogger() {
        return pluginLifecycle.getLogger();
    }

    public PluginLifecycle getPluginLifecycle() {
        return pluginLifecycle;
    }

    public World getWorld() {
        return world;
    }

    @Override
    public void queueFinalPhase() {
        queuePhase(FinalWorldPhase.class);
    }

    @Override
    public void start() {
        super.start();
        this.getLogger().info("World lifecycle started! (Name: " + this.world.getName() + ", Type: " + this.worldType.getName() + ", Environment: " + this.world.getEnvironment().name() + ")");
    }

    @Override
    public void stop() {
        super.stop();
        this.getLogger().info("World lifecycle stopped! (Name: " + this.world.getName() + ", Type: " + this.worldType.getName() + ", Environment: " + this.world.getEnvironment().name() + ")");
    }
}
