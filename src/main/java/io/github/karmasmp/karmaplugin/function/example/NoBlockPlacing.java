package io.github.karmasmp.karmaplugin.function.example;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import io.github.karmasmp.karmaplugin.event.player.PlayerBlockPlaceEvent;

public interface NoBlockPlacing extends PluginEventable {

    @Override
    default boolean event(PlayerBlockPlaceEvent event) {
        event.setCancelled(true);
        return true;
    }
}
