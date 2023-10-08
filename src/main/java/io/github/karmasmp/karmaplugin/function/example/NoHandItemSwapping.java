package io.github.karmasmp.karmaplugin.function.example;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerSwapHandItemsEvent;

public interface NoHandItemSwapping extends PluginEventable {

    @Override
    default boolean event(KarmaPlayerSwapHandItemsEvent event) {
        event.setCancelled(true);
        return true;
    }
}
