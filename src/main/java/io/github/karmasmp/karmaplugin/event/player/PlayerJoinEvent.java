package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;

public class PlayerJoinEvent extends org.bukkit.event.player.PlayerJoinEvent {

    private final KarmaPlayer karmaPlayer;

    public PlayerJoinEvent(org.bukkit.event.player.PlayerJoinEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), event.joinMessage());

        this.karmaPlayer = pluginLifecycle.getKarmaPlayer(event.getPlayer());
    }

    public KarmaPlayer getKarmaPlayer() {
        return karmaPlayer;
    }
}
