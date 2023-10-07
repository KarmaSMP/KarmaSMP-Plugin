package io.github.karmasmp.phase.player;

import io.github.karmasmp.lifecycle.PlayerLifecycle;

public class EventPlayerPhase extends PlayerPhase {

    public EventPlayerPhase(PlayerLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
