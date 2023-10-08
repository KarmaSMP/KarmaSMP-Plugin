package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.inventory.ItemStack;

public class KarmaPlayerSwapHandItemsEvent extends KarmaPlayerEvent {

    private final PlayerSwapHandItemsEvent event;

    public KarmaPlayerSwapHandItemsEvent(PlayerSwapHandItemsEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), pluginLifecycle);

        this.event = event;
    }

    public ItemStack getMainHandItem() {
        return event.getMainHandItem();
    }

    public ItemStack getOffHandItem() {
        return event.getOffHandItem();
    }

    public boolean isCancelled() {
        return event.isCancelled();
    }

    public void setCancelled(boolean cancel) {
        this.event.setCancelled(cancel);
    }

    public void setMainHandItem(ItemStack mainHandItem) {
        this.event.setMainHandItem(mainHandItem);
    }

    public void setOffHandItem(ItemStack offHandItem) {
        this.event.setOffHandItem(offHandItem);
    }
}
