package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;

public class KarmaPlayerDamageEvent extends KarmaPlayerEvent {

    private final EntityDamageEvent event;

    public KarmaPlayerDamageEvent(EntityDamageEvent event, PluginLifecycle pluginLifecycle) {
        super((Player) event.getEntity(), pluginLifecycle);

        this.event = event;
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

    public double getFinalDamage() {
        return event.getFinalDamage();
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
