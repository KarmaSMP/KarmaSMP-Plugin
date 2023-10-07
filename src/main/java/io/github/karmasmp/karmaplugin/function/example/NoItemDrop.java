package io.github.karmasmp.karmaplugin.function.example;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import org.bukkit.event.player.PlayerDropItemEvent;

public interface NoItemDrop extends PluginEventable {

    @Override
    default boolean event(PlayerDropItemEvent event) {
        event.setCancelled(true);
        return true;
    }
}