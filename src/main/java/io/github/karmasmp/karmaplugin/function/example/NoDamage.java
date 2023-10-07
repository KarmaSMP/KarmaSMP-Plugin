package io.github.karmasmp.karmaplugin.function.example;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public interface NoDamage extends PluginEventable {

    @Override
    default boolean event(EntityDamageEvent event) {
        event.setCancelled(true);
        return true;
    }

    @Override
    default boolean event(EntityDamageByBlockEvent event) {
        event.setCancelled(true);
        return true;
    }

    @Override
    default boolean event(EntityDamageByEntityEvent event) {
        event.setCancelled(true);
        return true;
    }
}
