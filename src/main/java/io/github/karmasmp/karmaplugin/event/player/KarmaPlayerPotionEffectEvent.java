package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityPotionEffectEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class KarmaPlayerPotionEffectEvent extends KarmaPlayerEvent {

    private final EntityPotionEffectEvent event;

    public KarmaPlayerPotionEffectEvent(EntityPotionEffectEvent event, PluginLifecycle pluginLifecycle) {
        super((Player) event, pluginLifecycle);

        this.event = event;
    }

    public EntityPotionEffectEvent.Action getAction() {
        return event.getAction();
    }

    public EntityPotionEffectEvent.Cause getCause() {
        return event.getCause();
    }

    public PotionEffectType getModifiedType() {
        return event.getModifiedType();
    }

    public PotionEffect getNewEffect() {
        return event.getNewEffect();
    }

    public PotionEffect getOldEffect() {
        return event.getOldEffect();
    }

    public boolean isCancelled() {
        return event.isCancelled();
    }

    public boolean isOverride() {
        return event.isOverride();
    }

    public void setCancelled(boolean cancel) {
        this.event.setCancelled(cancel);
    }

    public void setOverride(boolean override) {
        this.event.setOverride(override);
    }
}
