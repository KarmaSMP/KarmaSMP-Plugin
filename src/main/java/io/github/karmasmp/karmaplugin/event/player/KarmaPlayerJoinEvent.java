package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import net.kyori.adventure.text.Component;
import org.bukkit.event.player.PlayerJoinEvent;

public class KarmaPlayerJoinEvent extends KarmaPlayerEvent {

    private final PlayerJoinEvent event;

    public KarmaPlayerJoinEvent(PlayerJoinEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), pluginLifecycle);

        this.event = event;
    }

    public Component joinMessage() {
        return event.joinMessage();
    }

    public void joinMessage(Component joinMessage) {
        this.event.joinMessage(joinMessage);
    }
}
