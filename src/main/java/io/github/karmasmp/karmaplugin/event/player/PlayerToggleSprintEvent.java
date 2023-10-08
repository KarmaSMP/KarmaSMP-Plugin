package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;

public class PlayerToggleSprintEvent extends org.bukkit.event.player.PlayerToggleSprintEvent {

    private final KarmaPlayer karmaPlayer;

    public PlayerToggleSprintEvent(org.bukkit.event.player.PlayerToggleSprintEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), event.isSprinting());

        this.karmaPlayer = pluginLifecycle.getKarmaPlayer(event.getPlayer());
    }

    public KarmaPlayer getKarmaPlayer() {
        return karmaPlayer;
    }
}
