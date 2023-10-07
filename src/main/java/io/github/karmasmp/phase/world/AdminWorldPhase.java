package io.github.karmasmp.phase.world;

import io.github.karmasmp.lifecycle.world.WorldLifecycle;

public final class AdminWorldPhase extends WorldPhase {

    public AdminWorldPhase(WorldLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
