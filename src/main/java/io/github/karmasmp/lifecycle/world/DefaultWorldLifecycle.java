package io.github.karmasmp.lifecycle.world;

import io.github.karmasmp.PluginWorldType;
import io.github.karmasmp.lifecycle.PluginLifecycle;
import io.github.karmasmp.phase.world.DefaultWorldPhase;
import org.bukkit.World;

public class DefaultWorldLifecycle extends WorldLifecycle {

    public DefaultWorldLifecycle(PluginLifecycle pluginLifecycle, World world, PluginWorldType worldType) {
        super(pluginLifecycle, world, worldType);
    }

    @Override
    public void queuePhases() {
        queuePhase(DefaultWorldPhase.class);
    }
}
