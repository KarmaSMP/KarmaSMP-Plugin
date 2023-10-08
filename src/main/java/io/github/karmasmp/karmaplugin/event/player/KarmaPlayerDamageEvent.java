package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityDamageEvent;

public class KarmaPlayerDamageEvent extends KarmaPlayerEvent implements Cancellable {

    private boolean cancel;
    private final EntityDamageEvent.DamageCause cause;
    private final double finalDamage;
    private static final HandlerList handlers = new HandlerList();

    public KarmaPlayerDamageEvent(EntityDamageEvent.DamageCause cause, double finalDamage, Player player, PluginLifecycle pluginLifecycle) {
        super(player, pluginLifecycle);

        this.cause = cause;
        this.finalDamage = finalDamage;
    }

    public EntityDamageEvent.DamageCause getCause() {
        return cause;
    }

    public double getFinalDamage() {
        return finalDamage;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}
