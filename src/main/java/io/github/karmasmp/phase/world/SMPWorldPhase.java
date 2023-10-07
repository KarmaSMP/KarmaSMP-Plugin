package io.github.karmasmp.phase.world;

import io.github.karmasmp.lifecycle.world.WorldLifecycle;

public final class SMPWorldPhase extends WorldPhase {

    public SMPWorldPhase(WorldLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
