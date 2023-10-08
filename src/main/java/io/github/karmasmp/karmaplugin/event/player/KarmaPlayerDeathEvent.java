package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;

public class KarmaPlayerDeathEvent extends org.bukkit.event.entity.PlayerDeathEvent {

    private final KarmaPlayer karmaPlayer;

    public KarmaPlayerDeathEvent(org.bukkit.event.entity.PlayerDeathEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), event.getDrops(), event.getDroppedExp(), event.getNewExp(), event.getNewTotalExp(), event.getNewLevel(), event.deathMessage(), event.getDeathMessage(), event.shouldDropExperience());

        this.karmaPlayer = pluginLifecycle.getKarmaPlayer(event.getPlayer());
    }

    public KarmaPlayer getKarmaPlayer() {
        return karmaPlayer;
    }
}
