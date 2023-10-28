package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.event.player.PlayerToggleSprintEvent;

public class KarmaPlayerToggleSprintEvent extends KarmaPlayerEvent {

    private final PlayerToggleSprintEvent event;

    public KarmaPlayerToggleSprintEvent(PlayerToggleSprintEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), pluginLifecycle);

        this.event = event;
    }

    public boolean isCancelled() {
        return event.isCancelled();
    }

    public boolean isSprinting() {
        return event.isSprinting();
    }

    public void setCancelled(boolean cancel) {
        this.event.setCancelled(cancel);
    }
}
