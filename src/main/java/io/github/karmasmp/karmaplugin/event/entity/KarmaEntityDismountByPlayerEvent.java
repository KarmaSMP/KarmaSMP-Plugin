package io.github.karmasmp.karmaplugin.event.entity;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.spigotmc.event.entity.EntityDismountEvent;

public class KarmaEntityDismountByPlayerEvent {

    private final EntityDismountEvent event;
    private final KarmaPlayer karmaPlayerDismounted;

    public KarmaEntityDismountByPlayerEvent(EntityDismountEvent event, PluginLifecycle pluginLifecycle) {
        this.event = event;
        this.karmaPlayerDismounted = pluginLifecycle.getKarmaPlayer((Player) event.getDismounted());
    }

    public Entity getEntity() {
        return event.getEntity();
    }

    public KarmaPlayer getKarmaPlayerDismounted() {
        return karmaPlayerDismounted;
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
