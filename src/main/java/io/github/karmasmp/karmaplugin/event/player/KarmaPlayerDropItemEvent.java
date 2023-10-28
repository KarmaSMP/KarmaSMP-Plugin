package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Item;
import org.bukkit.event.player.PlayerDropItemEvent;

public class KarmaPlayerDropItemEvent extends KarmaPlayerEvent {

    private final PlayerDropItemEvent event;

    public KarmaPlayerDropItemEvent(PlayerDropItemEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), pluginLifecycle);

        this.event = event;
    }

    public Item getItemDrop() {
        return event.getItemDrop();
    }

    public boolean isCancelled() {
        return event.isCancelled();
    }

    public void setCancelled(boolean cancel) {
        this.event.setCancelled(cancel);
    }
}
