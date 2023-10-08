package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.inventory.ItemStack;

public class KarmaPlayerFoodLevelChangeEvent extends KarmaPlayerEvent {

    private final FoodLevelChangeEvent event;

    public KarmaPlayerFoodLevelChangeEvent(FoodLevelChangeEvent event, PluginLifecycle pluginLifecycle) {
        super((Player) event.getEntity(), pluginLifecycle);

        this.event = event;
    }

    public int getFoodLevel() {
        return event.getFoodLevel();
    }

    public ItemStack getItem() {
        return event.getItem();
    }

    public boolean isCancelled() {
        return event.isCancelled();
    }

    public void setCancelled(boolean cancel) {
        this.event.setCancelled(cancel);
    }

    public void setFoodLevel(int level) {
        this.event.setFoodLevel(level);
    }
}
