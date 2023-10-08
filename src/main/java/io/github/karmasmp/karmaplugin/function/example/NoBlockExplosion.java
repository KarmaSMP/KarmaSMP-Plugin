package io.github.karmasmp.karmaplugin.function.example;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import org.bukkit.event.entity.EntityExplodeEvent;

public interface NoBlockExplosion extends PluginEventable {

    @Override
    default boolean event(EntityExplodeEvent event) {
        event.blockList().clear();
        return true;
    }
}
