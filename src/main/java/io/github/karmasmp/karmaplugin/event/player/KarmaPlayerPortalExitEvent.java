package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityPortalExitEvent;
import org.bukkit.util.Vector;

public class KarmaPlayerPortalExitEvent extends KarmaPlayerEvent {

    private final EntityPortalExitEvent event;

    public KarmaPlayerPortalExitEvent(EntityPortalExitEvent event, PluginLifecycle pluginLifecycle) {
        super((Player) event.getEntity(), pluginLifecycle);

        this.event = event;
    }

    public Vector getAfter() {
        return event.getAfter();
    }

    public Vector getBefore() {
        return event.getBefore();
    }

    public Location getFrom() {
        return event.getFrom();
    }

    public Location getTo() {
        return event.getTo();
    }

    public boolean isCancelled() {
        return event.isCancelled();
    }

    public void setAfter(Vector after) {
        this.event.setAfter(after);
    }

    public void setCancelled(boolean cancel) {
        this.event.setCancelled(cancel);
    }

    public void setFrom(Location from) {
        this.event.setFrom(from);
    }

    public void setTo(Location to) {
        this.event.setTo(to);
    }
}
