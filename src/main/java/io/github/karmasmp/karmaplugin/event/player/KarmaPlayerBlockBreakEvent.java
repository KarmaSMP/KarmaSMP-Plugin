package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;

public class KarmaPlayerBlockBreakEvent extends KarmaPlayerEvent {

    private final BlockBreakEvent event;

    public KarmaPlayerBlockBreakEvent(BlockBreakEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), pluginLifecycle);

        this.event = event;
    }

    public Block getBlock() {
        return event.getBlock();
    }

    public int getExpToDrop() {
        return event.getExpToDrop();
    }

    public boolean isCancelled() {
        return event.isCancelled();
    }

    public boolean isDropItems() {
        return event.isDropItems();
    }

    public void setCancelled(boolean cancel) {
        this.event.setCancelled(cancel);
    }

    public void setDropItems(boolean dropItems) {
        this.event.setDropItems(dropItems);
    }

    public void setExpToDrop(int exp) {
        this.event.setExpToDrop(exp);
    }

}
