package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class KarmaPlayerToggleSneakEvent extends KarmaPlayerEvent {

    private final PlayerToggleSneakEvent event;

    public KarmaPlayerToggleSneakEvent(PlayerToggleSneakEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), pluginLifecycle);

        this.event = event;
    }

    public boolean isCancelled() {
        return event.isCancelled();
    }

    public boolean isSneaking() {
        return event.isSneaking();
    }

    public void setCancelled(boolean cancel) {
        this.event.setCancelled(cancel);
    }
}
