package io.github.karmasmp.karmaplugin.function.example;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerBlockBreakEvent;

public interface NoBlockBreaking extends PluginEventable {

    @Override
    default boolean event(KarmaPlayerBlockBreakEvent event) {
        event.setCancelled(true);
        return true;
    }
}
