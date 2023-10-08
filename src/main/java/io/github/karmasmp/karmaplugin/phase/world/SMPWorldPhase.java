package io.github.karmasmp.karmaplugin.phase.world;

import io.github.karmasmp.karmaplugin.lifecycle.world.WorldLifecycle;

public final class SMPWorldPhase extends WorldPhase {

    public SMPWorldPhase(WorldLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
