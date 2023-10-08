package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;

public class KarmaPlayerSwapHandItemsEvent extends org.bukkit.event.player.PlayerSwapHandItemsEvent {

    private final KarmaPlayer karmaPlayer;

    public KarmaPlayerSwapHandItemsEvent(org.bukkit.event.player.PlayerSwapHandItemsEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), event.getMainHandItem(), event.getOffHandItem());

        this.karmaPlayer = pluginLifecycle.getKarmaPlayer(event.getPlayer());
    }

    public KarmaPlayer getKarmaPlayer() {
        return karmaPlayer;
    }
}
