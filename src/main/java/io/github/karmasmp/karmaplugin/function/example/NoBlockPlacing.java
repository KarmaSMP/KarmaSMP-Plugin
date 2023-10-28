package io.github.karmasmp.karmaplugin.function.example;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerBlockPlaceEvent;

public interface NoBlockPlacing extends PluginEventable {

    @Override
    default boolean event(KarmaPlayerBlockPlaceEvent event) {
        event.setCancelled(true);
        return true;
    }
}
