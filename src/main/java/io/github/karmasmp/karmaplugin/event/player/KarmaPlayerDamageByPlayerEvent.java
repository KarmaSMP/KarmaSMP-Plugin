package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class KarmaPlayerDamageByPlayerEvent extends KarmaPlayerDamageEvent {

    private final EntityDamageByEntityEvent event;
    private final KarmaPlayer karmaPlayerDamager;

    public KarmaPlayerDamageByPlayerEvent(EntityDamageByEntityEvent event, PluginLifecycle pluginLifecycle) {
        super(event, pluginLifecycle);

        this.event = event;
        this.karmaPlayerDamager = pluginLifecycle.getKarmaPlayer((Player) event.getDamager());
    }

    public KarmaPlayer getKarmaPlayerDamager() {
        return karmaPlayerDamager;
    }

    public boolean isCritical() {
        return this.event.isCritical();
    }
}
