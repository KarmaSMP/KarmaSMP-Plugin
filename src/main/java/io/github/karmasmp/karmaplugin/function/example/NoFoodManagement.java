package io.github.karmasmp.karmaplugin.function.example;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerFoodLevelChangeEvent;

public interface NoFoodManagement extends PluginEventable {

    @Override
    default boolean event(KarmaPlayerFoodLevelChangeEvent event) {
        event.setCancelled(true);
        return true;
    }
}
