package io.github.karmasmp.function.example;

import io.github.karmasmp.event.PluginEventable;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityChangeBlockEvent;

public interface NoFallingBlockPlacement extends PluginEventable {

    @Override
    default boolean event(EntityChangeBlockEvent event) {
        if(event.getEntityType() != EntityType.FALLING_BLOCK) {
            return false;
        }

        event.setCancelled(true);
        return true;
    }
}
