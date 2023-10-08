package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public abstract class KarmaPlayerEvent extends Event {

    protected final KarmaPlayer karmaPlayer;

    public KarmaPlayerEvent(Player player, PluginLifecycle pluginLifecycle) {
        this.karmaPlayer = pluginLifecycle.getKarmaPlayer(player);
    }

    public KarmaPlayer getKarmaPlayer() {
        return karmaPlayer;
    }
}
