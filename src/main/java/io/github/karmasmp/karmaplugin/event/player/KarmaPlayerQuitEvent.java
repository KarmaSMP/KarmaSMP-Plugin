package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;

public class KarmaPlayerQuitEvent extends org.bukkit.event.player.PlayerQuitEvent {

    private final KarmaPlayer karmaPlayer;

    public KarmaPlayerQuitEvent(org.bukkit.event.player.PlayerQuitEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), event.quitMessage(), event.getReason());

        this.karmaPlayer = pluginLifecycle.getKarmaPlayer(event.getPlayer());
    }

    public KarmaPlayer getKarmaPlayer() {
        return karmaPlayer;
    }
}
