package io.github.karmasmp.karmaplugin.phase.world;

import io.github.karmasmp.karmaplugin.lifecycle.world.WorldLifecycle;

public class DefaultWorldPhase extends WorldPhase {

    public DefaultWorldPhase(WorldLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
