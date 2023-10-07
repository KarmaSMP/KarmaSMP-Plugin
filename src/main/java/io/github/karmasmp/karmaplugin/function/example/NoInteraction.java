package io.github.karmasmp.karmaplugin.function.example;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import org.bukkit.event.player.PlayerInteractEvent;

public interface NoInteraction extends PluginEventable {

    @Override
    default boolean event(PlayerInteractEvent event) {
        event.setCancelled(true);
        return true;
    }
}
