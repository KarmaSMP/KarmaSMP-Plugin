package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;

public class KarmaPlayerDamageByPlayerEvent extends KarmaPlayerDamageEvent {

    private final KarmaPlayer karmaPlayerDamager;

    public KarmaPlayerDamageByPlayerEvent(EntityDamageEvent.DamageCause cause, double finalDamage, Player player, Player playerDamager, PluginLifecycle pluginLifecycle) {
        super(cause, finalDamage, player, pluginLifecycle);

        this.karmaPlayerDamager = pluginLifecycle.getKarmaPlayer(playerDamager);
    }

    public KarmaPlayer getKarmaPlayerDamager() {
        return karmaPlayerDamager;
    }
}
