package io.github.karmasmp.karmaplugin.function.example;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import org.bukkit.event.inventory.InventoryClickEvent;

public interface NoInventoryManagement extends PluginEventable {

    @Override
    default boolean event(InventoryClickEvent event) {
        event.setCancelled(true);
        return true;
    }
}
