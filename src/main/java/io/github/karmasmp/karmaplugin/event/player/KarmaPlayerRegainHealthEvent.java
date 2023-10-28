package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityRegainHealthEvent;

public class KarmaPlayerRegainHealthEvent extends KarmaPlayerEvent {

    private final EntityRegainHealthEvent event;

    public KarmaPlayerRegainHealthEvent(EntityRegainHealthEvent event, PluginLifecycle pluginLifecycle) {
        super((Player) event.getEntity(), pluginLifecycle);

        this.event = event;
    }

    public double getAmount() {
        return event.getAmount();
    }

    public EntityRegainHealthEvent.RegainReason getRegainReason() {
        return event.getRegainReason();
    }

    public boolean isCancelled() {
        return event.isCancelled();
    }

    public boolean isFastRegen() {
        return event.isFastRegen();
    }

    public void setAmount(double amount) {
        this.event.setAmount(amount);
    }

    public void setCancelled(boolean cancel) {
        this.event.setCancelled(cancel);
    }
}
