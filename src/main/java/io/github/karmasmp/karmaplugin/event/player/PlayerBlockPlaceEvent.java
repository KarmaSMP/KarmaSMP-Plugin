package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlayerBlockPlaceEvent extends BlockPlaceEvent {

    private final KarmaPlayer karmaPlayer;

    public PlayerBlockPlaceEvent(BlockPlaceEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getBlockPlaced(), event.getBlockReplacedState(), event.getBlockAgainst(), event.getItemInHand(), event.getPlayer(), event.canBuild(), event.getHand());

        this.karmaPlayer = pluginLifecycle.getKarmaPlayer(event.getPlayer());
    }

    public KarmaPlayer getKarmaPlayer() {
        return karmaPlayer;
    }
}
