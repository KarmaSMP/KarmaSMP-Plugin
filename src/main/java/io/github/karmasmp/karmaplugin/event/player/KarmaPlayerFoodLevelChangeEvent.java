package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class KarmaPlayerFoodLevelChangeEvent extends FoodLevelChangeEvent {

    private final KarmaPlayer karmaPlayer;

    public KarmaPlayerFoodLevelChangeEvent(FoodLevelChangeEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getEntity(), event.getFoodLevel(), event.getItem());

        this.karmaPlayer = pluginLifecycle.getKarmaPlayer((Player) event.getEntity());
    }

    public KarmaPlayer getKarmaPlayer() {
        return karmaPlayer;
    }
}
