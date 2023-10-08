package io.github.karmasmp.karmaplugin.function.example;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import org.bukkit.event.block.BlockBreakEvent;

public interface NoBlockBreaking extends PluginEventable {

    @Override
    default boolean event(BlockBreakEvent event) {
        event.setCancelled(true);
        return true;
    }
}
