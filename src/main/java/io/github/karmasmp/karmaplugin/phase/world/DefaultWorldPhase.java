package io.github.karmasmp.karmaplugin.phase.world;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerDeathEvent;
import io.github.karmasmp.karmaplugin.lifecycle.world.WorldLifecycle;

public class DefaultWorldPhase extends WorldPhase {

    public DefaultWorldPhase(WorldLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }

    @Override
    public boolean event(KarmaPlayerDeathEvent event) {
        KarmaPlayer karmaPlayer = event.getKarmaPlayer();

        if (karmaPlayer.isActiveLives()) {
            karmaPlayer.setLives(karmaPlayer.getLives() - 1);
        }

        return true;
    }
}
