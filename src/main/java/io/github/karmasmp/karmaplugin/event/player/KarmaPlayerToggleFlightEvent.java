package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;

public class KarmaPlayerToggleFlightEvent extends org.bukkit.event.player.PlayerToggleFlightEvent {

    private final KarmaPlayer karmaPlayer;

    public KarmaPlayerToggleFlightEvent(org.bukkit.event.player.PlayerToggleFlightEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), event.isFlying());

        this.karmaPlayer = pluginLifecycle.getKarmaPlayer(event.getPlayer());
    }

    public KarmaPlayer getKarmaPlayer() {
        return karmaPlayer;
    }
}
