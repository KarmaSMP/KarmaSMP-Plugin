package io.github.karmasmp.karmaplugin.phase.player;

import io.github.karmasmp.karmaplugin.event.entity.KarmaEntityDamageByPlayerEvent;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerBlockBreakEvent;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerFoodLevelChangeEvent;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerInteractEvent;
import io.github.karmasmp.karmaplugin.lifecycle.PlayerLifecycle;

public final class SMPGhostPhase extends PlayerPhase {

    public SMPGhostPhase(PlayerLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }

    @Override
    public boolean event(KarmaPlayerBlockBreakEvent event) {
        event.setCancelled(true);
        return true;
    }

    @Override
    public boolean event(KarmaEntityDamageByPlayerEvent event) {
        event.setCancelled(true);
        return true;
    }

    @Override
    public boolean event(KarmaPlayerFoodLevelChangeEvent event) {
        event.setCancelled(true);
        return true;
    }

    @Override
    public boolean event(KarmaPlayerInteractEvent event) {
        event.setCancelled(true);
        return true;
    }
}
