package io.github.karmasmp.karmaplugin.function.example;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import org.bukkit.event.entity.EntityPickupItemEvent;

public interface NoItemPickup extends PluginEventable {

    @Override
    default boolean event(EntityPickupItemEvent event) {
        event.setCancelled(true);
        return true;
    }
}
