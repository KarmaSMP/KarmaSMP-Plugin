package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Player;

public abstract class KarmaPlayerEvent {

    protected final KarmaPlayer karmaPlayer;

    public KarmaPlayerEvent(Player player, PluginLifecycle pluginLifecycle) {
        this.karmaPlayer = pluginLifecycle.getKarmaPlayer(player);
    }

    public KarmaPlayer getKarmaPlayer() {
        return karmaPlayer;
    }
}
