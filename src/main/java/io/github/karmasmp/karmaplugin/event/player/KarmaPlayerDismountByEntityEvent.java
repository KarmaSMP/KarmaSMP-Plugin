package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.spigotmc.event.entity.EntityDismountEvent;

public class KarmaPlayerDismountByEntityEvent extends KarmaPlayerEvent {

    private final EntityDismountEvent event;

    public KarmaPlayerDismountByEntityEvent(EntityDismountEvent event, PluginLifecycle pluginLifecycle) {
        super((Player) event.getEntity(), pluginLifecycle);

        this.event = event;
    }

    public Entity getEntityDismounted() {
        return event.getDismounted();
    }

    public boolean isCancellable() {
        return event.isCancellable();
    }

    public boolean isCancelled() {
        return event.isCancelled();
    }

    public void setCancelled(boolean cancel) {
        this.event.setCancelled(cancel);
    }
}
