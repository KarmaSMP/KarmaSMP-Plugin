package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.event.entity.EntityDamageByBlockEvent;

public class KarmaPlayerDamageByBlockEvent extends KarmaPlayerDamageEvent {

    private final EntityDamageByBlockEvent event;

    public KarmaPlayerDamageByBlockEvent(EntityDamageByBlockEvent event, PluginLifecycle pluginLifecycle) {
        super(event, pluginLifecycle);

        this.event = event;
    }

    public Block getBlockDamager() {
        return event.getDamager();
    }

    public BlockState getBlockStateDamager() {
        return event.getDamagerBlockState();
    }
}
