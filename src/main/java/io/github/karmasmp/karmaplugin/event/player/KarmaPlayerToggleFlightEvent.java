package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.event.player.PlayerToggleFlightEvent;

public class KarmaPlayerToggleFlightEvent extends KarmaPlayerEvent {

    private final PlayerToggleFlightEvent event;

    public KarmaPlayerToggleFlightEvent(PlayerToggleFlightEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), pluginLifecycle);

        this.event = event;
    }

    public boolean isCancelled() {
        return event.isCancelled();
    }

    public boolean isFlying() {
        return event.isFlying();
    }

    public void setCancelled(boolean cancel) {
        this.event.setCancelled(cancel);
    }
}
