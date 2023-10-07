package io.github.karmasmp.karmaplugin.phase.player;

import io.github.karmasmp.karmaplugin.lifecycle.PlayerLifecycle;

public class EventPlayerPhase extends PlayerPhase {

    public EventPlayerPhase(PlayerLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
