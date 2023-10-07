package io.github.karmasmp.lifecycle.world;

import io.github.karmasmp.PluginWorldType;
import io.github.karmasmp.lifecycle.PluginLifecycle;
import io.github.karmasmp.phase.world.AdminWorldPhase;
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
