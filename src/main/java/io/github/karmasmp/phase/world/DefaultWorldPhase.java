package io.github.karmasmp.phase.world;

import io.github.karmasmp.lifecycle.world.WorldLifecycle;

public class DefaultWorldPhase extends WorldPhase {

    public DefaultWorldPhase(WorldLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
