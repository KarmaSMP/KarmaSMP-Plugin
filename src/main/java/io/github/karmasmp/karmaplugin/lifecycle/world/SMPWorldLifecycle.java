package io.github.karmasmp.karmaplugin.lifecycle.world;

import io.github.karmasmp.karmaplugin.PluginWorldType;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import io.github.karmasmp.karmaplugin.phase.world.SMPWorldPhase;
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
