package io.github.karmasmp.function.example;

import io.github.karmasmp.event.PluginEventable;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

public interface NoHandItemSwapping extends PluginEventable {

    @Override
    default boolean event(PlayerSwapHandItemsEvent event) {
        event.setCancelled(true);
        return true;
    }
}
