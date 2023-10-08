package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityPortalEnterEvent;

public class KarmaPlayerPortalEnterEvent extends KarmaPlayerEvent {

    private final EntityPortalEnterEvent event;

    public KarmaPlayerPortalEnterEvent(EntityPortalEnterEvent event, PluginLifecycle pluginLifecycle) {
        super((Player) event.getEntity(), pluginLifecycle);

        this.event = event;
    }

    public Location getLocation() {
        return event.getLocation();
    }
}
