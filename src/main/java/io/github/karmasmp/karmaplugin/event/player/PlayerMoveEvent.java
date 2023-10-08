package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;

public class PlayerMoveEvent extends org.bukkit.event.player.PlayerMoveEvent {

    private final KarmaPlayer karmaPlayer;

    public PlayerMoveEvent(org.bukkit.event.player.PlayerMoveEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), event.getFrom(), event.getTo());

        this.karmaPlayer = pluginLifecycle.getKarmaPlayer(event.getPlayer());
    }

    public KarmaPlayer getKarmaPlayer() {
        return karmaPlayer;
    }
}
