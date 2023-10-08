package io.github.karmasmp.karmaplugin.phase.world;

import io.github.karmasmp.karmaplugin.lifecycle.world.WorldLifecycle;

public final class AdminWorldPhase extends WorldPhase {

    public AdminWorldPhase(WorldLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
