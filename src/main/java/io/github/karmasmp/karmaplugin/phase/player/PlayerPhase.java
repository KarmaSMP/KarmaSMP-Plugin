package io.github.karmasmp.karmaplugin.phase.player;

import io.github.karmasmp.karmaplugin.lifecycle.PlayerLifecycle;
import io.github.karmasmp.karmaplugin.phase.Phase;
import org.bukkit.entity.Player;

public abstract class PlayerPhase extends Phase {

    public PlayerPhase(PlayerLifecycle lifecycle, int startTicks) {
        super(lifecycle, startTicks);
    }

    protected PlayerLifecycle getLifecycle() {
        return (PlayerLifecycle) lifecycle;
    }

    public Player getPlayer() {
        return getLifecycle().getPlayer();
    }
}
