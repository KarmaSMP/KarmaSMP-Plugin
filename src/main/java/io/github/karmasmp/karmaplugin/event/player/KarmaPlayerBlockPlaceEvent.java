package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

public class KarmaPlayerBlockPlaceEvent extends KarmaPlayerEvent {

    private final BlockPlaceEvent event;

    public KarmaPlayerBlockPlaceEvent(BlockPlaceEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), pluginLifecycle);

        this.event = event;
    }

    public boolean canBuild() {
        return event.canBuild();
    }

    public Block getBlockAgainst() {
        return event.getBlockAgainst();
    }

    public Block getBlockPlaced() {
        return event.getBlockPlaced();
    }

    public BlockState getBlockReplacedState() {
        return event.getBlockReplacedState();
    }

    public EquipmentSlot getHand() {
        return event.getHand();
    }

    public ItemStack getItemInHand() {
        return event.getItemInHand();
    }

    public boolean isCancelled() {
        return event.isCancelled();
    }

    public void setBuild(boolean canBuild) {
        this.event.setBuild(canBuild);
    }

    public void setCancelled(boolean cancel) {
        this.event.setCancelled(cancel);
    }
}
