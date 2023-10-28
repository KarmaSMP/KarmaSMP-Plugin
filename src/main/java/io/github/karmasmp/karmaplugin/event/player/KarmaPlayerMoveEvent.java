package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.Location;
import org.bukkit.event.player.PlayerMoveEvent;
import org.jetbrains.annotations.NotNull;

public class KarmaPlayerMoveEvent extends KarmaPlayerEvent {

    private final PlayerMoveEvent event;

    public KarmaPlayerMoveEvent(PlayerMoveEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), pluginLifecycle);

        this.event = event;
    }

    public Location getFrom() {
        return event.getFrom();
    }

    public Location getTo() {
        return event.getTo();
    }

    public boolean hasChangedBlock() {
        return event.hasChangedBlock();
    }

    public boolean hasChangedOrientation() {
        return event.hasChangedOrientation();
    }

    public boolean hasChangedPosition() {
        return event.hasChangedPosition();
    }

    public boolean hasExplicitlyChangedBlock() {
        return event.hasExplicitlyChangedBlock();
    }

    public boolean hasExplicitlyChangedPosition() {
        return event.hasExplicitlyChangedPosition();
    }

    public boolean isCancelled() {
        return event.isCancelled();
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
