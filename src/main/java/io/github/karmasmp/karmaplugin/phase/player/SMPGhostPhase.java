package io.github.karmasmp.karmaplugin.phase.player;

import io.github.karmasmp.karmaplugin.lifecycle.PlayerLifecycle;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public final class SMPGhostPhase extends PlayerPhase {

    public SMPGhostPhase(PlayerLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }

    @Override
    public boolean event(BlockBreakEvent event) {
        event.setCancelled(true);
        return true;
    }

    @Override
    public boolean event(EntityDamageByEntityEvent event) {
        if (!(event.getDamager() instanceof Player)) {
            return false;
        }

        event.setCancelled(true);
        return true;
    }

    @Override
    public boolean event(FoodLevelChangeEvent event) {
        event.setCancelled(true);
        return true;
    }

    @Override
    public boolean event(PlayerInteractEvent event) {
        event.setCancelled(true);
        return true;
    }
}
