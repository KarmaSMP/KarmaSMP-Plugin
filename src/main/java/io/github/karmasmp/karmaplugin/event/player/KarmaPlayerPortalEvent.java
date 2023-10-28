package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.Location;
import org.bukkit.event.player.PlayerPortalEvent;

public class KarmaPlayerPortalEvent extends KarmaPlayerEvent {

    private final PlayerPortalEvent event;

    public KarmaPlayerPortalEvent(PlayerPortalEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), pluginLifecycle);

        this.event = event;
    }

    public boolean getCanCreatePortal() {
        return event.getCanCreatePortal();
    }

    public int getCreationRadius() {
        return event.getCreationRadius();
    }


    public Location getFrom() {
        return event.getFrom();
    }

    public int getSearchRadius() {
        return event.getSearchRadius();
    }

    public boolean isCancelled() {
        return event.isCancelled();
    }

    public void setCancelled(boolean cancel) {
        this.event.setCancelled(cancel);
    }

    public void setCanCreatePortal(boolean canCreatePortal) {
        this.event.setCanCreatePortal(canCreatePortal);
    }

    public void setCreationRadius(int creationRadius) {
        this.event.setCreationRadius(creationRadius);
    }

    public void setFrom(Location from) {
        this.event.setFrom(from);
    }

    public Location getTo() {
        return event.getTo();
    }

    public void setSearchRadius(int searchRadius) {
        this.event.setSearchRadius(searchRadius);
    }

    public void setTo(final Location to) {
        this.event.setTo(to);
    }
}
