package io.github.karmasmp.karmaplugin.function.example;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import io.github.karmasmp.karmaplugin.event.player.PlayerBlockBreakEvent;

public interface NoBlockBreaking extends PluginEventable {

    @Override
    default boolean event(PlayerBlockBreakEvent event) {
        event.setCancelled(true);
        return true;
    }
}
