package io.github.karmasmp.karmaplugin.lifecycle.world;

import io.github.karmasmp.karmaplugin.PluginWorldType;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import io.github.karmasmp.karmaplugin.phase.world.AdminWorldPhase;
import org.bukkit.World;

public final class AdminWorldLifecycle extends WorldLifecycle {

    public AdminWorldLifecycle(PluginLifecycle pluginLifecycle, World world, PluginWorldType worldType) {
        super(pluginLifecycle, world, worldType);
    }

    @Override
    public void queuePhases() {
        queuePhase(AdminWorldPhase.class);
    }
}
