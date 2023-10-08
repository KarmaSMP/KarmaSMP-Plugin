package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;

public class KarmaPlayerDropItemEvent extends org.bukkit.event.player.PlayerDropItemEvent {

    private final KarmaPlayer karmaPlayer;

    public KarmaPlayerDropItemEvent(org.bukkit.event.player.PlayerDropItemEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), event.getItemDrop());

        this.karmaPlayer = pluginLifecycle.getKarmaPlayer(event.getPlayer());
    }

    public KarmaPlayer getKarmaPlayer() {
        return karmaPlayer;
    }
}
