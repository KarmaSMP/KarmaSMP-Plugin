package io.github.karmasmp.karmaplugin.function.example;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerInteractEvent;

public interface NoInteraction extends PluginEventable {

    @Override
    default boolean event(KarmaPlayerInteractEvent event) {
        event.setCancelled(true);
        return true;
    }
}
