package io.github.karmasmp.phase.player;

import io.github.karmasmp.lifecycle.PlayerLifecycle;

public class AdminPlayerPhase extends PlayerPhase {

    public AdminPlayerPhase(PlayerLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
