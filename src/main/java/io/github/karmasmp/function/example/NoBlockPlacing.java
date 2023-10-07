package io.github.karmasmp.function.example;

import io.github.karmasmp.event.PluginEventable;
import org.bukkit.event.block.BlockPlaceEvent;

public interface NoBlockPlacing extends PluginEventable {

    @Override
    default boolean event(BlockPlaceEvent event) {
        event.setCancelled(true);
        return true;
    }
}
