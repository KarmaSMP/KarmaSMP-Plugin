package io.github.karmasmp.karmaplugin.lifecycle.world;

import io.github.karmasmp.karmaplugin.PluginWorldType;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import io.github.karmasmp.karmaplugin.phase.world.DefaultWorldPhase;
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
