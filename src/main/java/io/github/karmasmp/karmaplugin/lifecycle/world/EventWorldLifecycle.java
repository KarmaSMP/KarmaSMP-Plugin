package io.github.karmasmp.karmaplugin.lifecycle.world;

import io.github.karmasmp.karmaplugin.PluginWorldType;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import io.github.karmasmp.karmaplugin.phase.world.EventWorldPhase;
import org.bukkit.World;

public final class EventWorldLifecycle extends WorldLifecycle {

    public EventWorldLifecycle(PluginLifecycle pluginLifecycle, World world, PluginWorldType worldType) {
        super(pluginLifecycle, world, worldType);
    }

    @Override
    public void queuePhases() {
        queuePhase(EventWorldPhase.class);
    }
}
