package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.event.block.BlockBreakEvent;

public class PlayerBlockBreakEvent extends BlockBreakEvent {

    private final KarmaPlayer karmaPlayer;

    public PlayerBlockBreakEvent(BlockBreakEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getBlock(), event.getPlayer());

        this.karmaPlayer = pluginLifecycle.getKarmaPlayer(event.getPlayer());
    }

    public KarmaPlayer getKarmaPlayer() {
        return karmaPlayer;
    }
}
