package io.github.karmasmp.phase.player;

import io.github.karmasmp.lifecycle.PlayerLifecycle;

public final class SMPPlayerPhase extends PlayerPhase {

    public SMPPlayerPhase(PlayerLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
