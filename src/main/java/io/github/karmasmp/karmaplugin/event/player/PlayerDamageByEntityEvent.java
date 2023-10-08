package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;

public class PlayerDamageByEntityEvent extends PlayerDamageEvent {

    private final Entity entityDamager;

    public PlayerDamageByEntityEvent(EntityDamageEvent.DamageCause cause, Entity entityDamager, double finalDamage, Player player, PluginLifecycle pluginLifecycle) {
        super(cause, finalDamage, player, pluginLifecycle);

        this.entityDamager = entityDamager;
    }

    public Entity getEntityDamager() {
        return entityDamager;
    }
}
