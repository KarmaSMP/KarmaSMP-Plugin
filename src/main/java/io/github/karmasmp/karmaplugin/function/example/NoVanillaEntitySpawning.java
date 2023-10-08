package io.github.karmasmp.karmaplugin.function.example;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import org.bukkit.event.entity.CreatureSpawnEvent;

public interface NoVanillaEntitySpawning extends PluginEventable {

    @Override
    default boolean event(CreatureSpawnEvent event) {
        if(event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.CUSTOM) {
            return false;
        }

        event.setCancelled(true);
        return true;
    }
}
