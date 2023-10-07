package io.github.karmasmp.function.example;

import io.github.karmasmp.event.PluginEventable;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public interface NoFoodManagement extends PluginEventable {

    @Override
    default boolean event(FoodLevelChangeEvent event) {
        event.setCancelled(true);
        return true;
    }
}
