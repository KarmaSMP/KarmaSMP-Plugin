package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Entity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class KarmaPlayerDamageByEntityEvent extends KarmaPlayerDamageEvent {

    private final EntityDamageByEntityEvent event;

    public KarmaPlayerDamageByEntityEvent(EntityDamageByEntityEvent event, PluginLifecycle pluginLifecycle) {
        super(event, pluginLifecycle);

        this.event = event;
    }

    public Entity getEntityDamager() {
        return event.getDamager();
    }

    public boolean isCritical() {
        return event.isCritical();
    }
}
