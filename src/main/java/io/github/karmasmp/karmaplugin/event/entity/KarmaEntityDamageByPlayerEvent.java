package io.github.karmasmp.karmaplugin.event.entity;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityEvent;
import org.jetbrains.annotations.NotNull;

public class KarmaEntityDamageByPlayerEvent extends EntityEvent implements Cancellable {

    private final EntityDamageEvent.DamageCause cause;
    private boolean cancel;
    private final double finalDamage;
    private static final HandlerList handlers = new HandlerList();
    private final KarmaPlayer karmaPlayerDamager;

    public KarmaEntityDamageByPlayerEvent(EntityDamageEvent.DamageCause cause, Entity entity, double finalDamage, Player playerDamager, PluginLifecycle pluginLifecycle) {
        super(entity);

        this.cause = cause;
        this.finalDamage = finalDamage;
        this.karmaPlayerDamager = pluginLifecycle.getKarmaPlayer(playerDamager);
    }

    public EntityDamageEvent.DamageCause getCause() {
        return cause;
    }

    public double getFinalDamage() {
        return finalDamage;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public KarmaPlayer getKarmaPlayerDamager() {
        return karmaPlayerDamager;
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
