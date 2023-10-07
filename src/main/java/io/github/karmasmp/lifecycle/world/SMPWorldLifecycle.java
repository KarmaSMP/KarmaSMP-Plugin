package io.github.karmasmp.lifecycle.world;

import io.github.karmasmp.PluginWorldType;
import io.github.karmasmp.lifecycle.PluginLifecycle;
import io.github.karmasmp.phase.world.SMPWorldPhase;
import org.bukkit.World;

public final class SMPWorldLifecycle extends WorldLifecycle {

    public SMPWorldLifecycle(PluginLifecycle pluginLifecycle, World world, PluginWorldType worldType) {
        super(pluginLifecycle, world, worldType);
    }

    @Override
    public void queuePhases() {
        queuePhase(SMPWorldPhase.class);
    }
}
