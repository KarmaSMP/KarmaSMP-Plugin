package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;

public class PlayerDamageByPlayerEvent extends PlayerDamageEvent {

    private final KarmaPlayer karmaPlayerDamager;

    public PlayerDamageByPlayerEvent(EntityDamageEvent.DamageCause cause, double finalDamage, Player player, Player playerDamager, PluginLifecycle pluginLifecycle) {
        super(cause, finalDamage, player, pluginLifecycle);

        this.karmaPlayerDamager = pluginLifecycle.getKarmaPlayer(playerDamager);
    }

    public KarmaPlayer getKarmaPlayerDamager() {
        return karmaPlayerDamager;
    }
}
