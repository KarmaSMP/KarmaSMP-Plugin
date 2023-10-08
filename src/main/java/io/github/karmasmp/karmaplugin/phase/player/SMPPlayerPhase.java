package io.github.karmasmp.karmaplugin.phase.player;

import io.github.karmasmp.karmaplugin.lifecycle.PlayerLifecycle;

public final class SMPPlayerPhase extends PlayerPhase {

    public SMPPlayerPhase(PlayerLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
