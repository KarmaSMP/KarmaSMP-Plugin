package io.github.karmasmp.karmaplugin.phase.world;

import io.github.karmasmp.karmaplugin.lifecycle.world.WorldLifecycle;
import io.github.karmasmp.karmaplugin.phase.Phase;
import org.bukkit.Server;
import org.bukkit.World;

public abstract class WorldPhase extends Phase {

    public WorldPhase(WorldLifecycle lifecycle, int startTicks) {
        super(lifecycle, startTicks);
    }

    protected WorldLifecycle getLifecycle() {
        return (WorldLifecycle) lifecycle;
    }

    public Server getServer() {
        return getLifecycle().getPluginLifecycle().getServer();
    }

    public World getWorld() {
        return getLifecycle().getWorld();
    }
}
