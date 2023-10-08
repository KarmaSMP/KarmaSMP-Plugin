package io.github.karmasmp.karmaplugin.phase.player;

import io.github.karmasmp.karmaplugin.lifecycle.PlayerLifecycle;

public class AdminPlayerPhase extends PlayerPhase {

    public AdminPlayerPhase(PlayerLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
