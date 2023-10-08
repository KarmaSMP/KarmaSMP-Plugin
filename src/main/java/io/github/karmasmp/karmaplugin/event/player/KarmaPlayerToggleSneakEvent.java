package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;

public class KarmaPlayerToggleSneakEvent extends org.bukkit.event.player.PlayerToggleSneakEvent {

    private final KarmaPlayer karmaPlayer;

    public KarmaPlayerToggleSneakEvent(org.bukkit.event.player.PlayerToggleSneakEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), event.isSneaking());

        this.karmaPlayer = pluginLifecycle.getKarmaPlayer(event.getPlayer());
    }

    public KarmaPlayer getKarmaPlayer() {
        return karmaPlayer;
    }
}
