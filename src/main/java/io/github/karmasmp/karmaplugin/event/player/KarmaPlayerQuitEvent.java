package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import net.kyori.adventure.text.Component;
import org.bukkit.event.player.PlayerQuitEvent;

public class KarmaPlayerQuitEvent extends KarmaPlayerEvent {

    private final PlayerQuitEvent event;

    public KarmaPlayerQuitEvent(PlayerQuitEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), pluginLifecycle);

        this.event = event;
    }

    public PlayerQuitEvent.QuitReason getReason() {
        return event.getReason();
    }

    public Component quitMessage() {
        return event.quitMessage();
    }

    public void quitMessage(Component quitMessage) {
        this.event.quitMessage(quitMessage);
    }
}
