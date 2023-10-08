package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;

public class KarmaPlayerInteractEvent extends org.bukkit.event.player.PlayerInteractEvent {

    private final KarmaPlayer karmaPlayer;

    public KarmaPlayerInteractEvent(org.bukkit.event.player.PlayerInteractEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), event.getAction(), event.getItem(), event.getClickedBlock(), event.getBlockFace(), event.getHand(), event.getClickedPosition());

        this.karmaPlayer = pluginLifecycle.getKarmaPlayer(event.getPlayer());
    }

    public KarmaPlayer getKarmaPlayer() {
        return karmaPlayer;
    }
}
