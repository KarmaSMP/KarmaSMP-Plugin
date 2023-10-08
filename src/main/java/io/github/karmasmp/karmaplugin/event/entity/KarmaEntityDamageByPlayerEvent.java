package io.github.karmasmp.karmaplugin.event.entity;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class KarmaEntityDamageByPlayerEvent {

    private final EntityDamageByEntityEvent event;
    private final KarmaPlayer karmaPlayerDamager;

    public KarmaEntityDamageByPlayerEvent(EntityDamageByEntityEvent event, PluginLifecycle pluginLifecycle) {
        this.event = event;
        this.karmaPlayerDamager = pluginLifecycle.getKarmaPlayer((Player) event.getDamager());
    }

    public EntityDamageEvent.DamageCause getCause() {
        return event.getCause();
    }

    public double getDamage() {
        return event.getDamage();
    }

    public double getDamage(EntityDamageEvent.DamageModifier type) {
        return event.getDamage(type);
    }

    public Entity getEntity() {
        return event.getEntity();
    }

    public double getFinalDamage() {
        return event.getFinalDamage();
    }

    public KarmaPlayer getKarmaPlayerDamager() {
        return karmaPlayerDamager;
    }

    public double getOriginalDamage(EntityDamageEvent.DamageModifier type) {
        return event.getOriginalDamage(type);
    }

    public boolean isApplicable(EntityDamageEvent.DamageModifier type) {
        return event.isApplicable(type);
    }

    public boolean isCancelled() {
        return event.isCancelled();
    }

    public void setCancelled(boolean cancel) {
        this.event.setCancelled(cancel);
    }

    public void setDamage(double damage) {
        this.event.setDamage(damage);
    }

    public void setDamage(EntityDamageEvent.DamageModifier type, double damage) {
        this.event.setDamage(type, damage);
    }
}
