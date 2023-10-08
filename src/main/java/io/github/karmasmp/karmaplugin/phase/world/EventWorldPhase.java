package io.github.karmasmp.karmaplugin.phase.world;

import io.github.karmasmp.karmaplugin.lifecycle.world.WorldLifecycle;

public final class EventWorldPhase extends WorldPhase {

    public EventWorldPhase(WorldLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
