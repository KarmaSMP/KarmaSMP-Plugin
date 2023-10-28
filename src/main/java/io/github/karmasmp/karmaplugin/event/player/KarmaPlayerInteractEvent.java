package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.Event;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

public class KarmaPlayerInteractEvent extends KarmaPlayerEvent {

    private final PlayerInteractEvent event;

    public KarmaPlayerInteractEvent(PlayerInteractEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), pluginLifecycle);

        this.event = event;
    }

    public Action getAction() {
        return event.getAction();
    }

    public BlockFace getBlockFace() {
        return event.getBlockFace();
    }

    public Block getClickedBlock() {
        return event.getClickedBlock();
    }

    public EquipmentSlot getHand() {
        return event.getHand();
    }

    public Location getInteractionPoint() {
        return event.getInteractionPoint();
    }

    public ItemStack getItem() {
        return event.getItem();
    }

    public boolean hasBlock() {
        return event.hasBlock();
    }

    public boolean hasItem() {
        return event.hasItem();
    }

    public boolean isBlockInHand() {
        return event.isBlockInHand();
    }

    public Material getMaterial() {
        return event.getMaterial();
    }

    public void setCancelled(boolean cancel) {
        this.event.setCancelled(cancel);
    }

    public void setUseInteractedBlock(Event.Result useInteractedBlock) {
        this.event.setUseInteractedBlock(useInteractedBlock);
    }

    public void setUseItemInHand(Event.Result useItemInHand) {
        this.event.setUseItemInHand(useItemInHand);
    }

    public Event.Result useInteractedBlock() {
        return event.useInteractedBlock();
    }

    public Event.Result useItemInHand() {
        return event.useItemInHand();
    }
}
