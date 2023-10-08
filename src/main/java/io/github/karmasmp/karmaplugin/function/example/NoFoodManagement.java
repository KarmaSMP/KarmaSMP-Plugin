package io.github.karmasmp.karmaplugin.function.example;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import io.github.karmasmp.karmaplugin.event.player.PlayerFoodLevelChangeEvent;

public interface NoFoodManagement extends PluginEventable {

    @Override
    default boolean event(PlayerFoodLevelChangeEvent event) {
        event.setCancelled(true);
        return true;
    }
}
