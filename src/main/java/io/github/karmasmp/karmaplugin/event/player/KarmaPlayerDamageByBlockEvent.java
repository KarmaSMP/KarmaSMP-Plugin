package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;

public class KarmaPlayerDamageByBlockEvent extends KarmaPlayerDamageEvent {

    private final Block blockDamager;
    private final BlockState blockDamagerState;

    public KarmaPlayerDamageByBlockEvent(Block blockDamager, BlockState blockDamagerState, EntityDamageEvent.DamageCause cause, double finalDamage, Player player, PluginLifecycle pluginLifecycle) {
        super(cause, finalDamage, player, pluginLifecycle);

        this.blockDamager = blockDamager;
        this.blockDamagerState = blockDamagerState;
    }

    public Block getBlockDamager() {
        return blockDamager;
    }

    public BlockState getBlockDamagerState() {
        return blockDamagerState;
    }
}
