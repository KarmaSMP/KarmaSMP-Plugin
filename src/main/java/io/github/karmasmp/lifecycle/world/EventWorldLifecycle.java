package io.github.karmasmp.lifecycle.world;

import io.github.karmasmp.PluginWorldType;
import io.github.karmasmp.lifecycle.PluginLifecycle;
import io.github.karmasmp.phase.world.EventWorldPhase;
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
