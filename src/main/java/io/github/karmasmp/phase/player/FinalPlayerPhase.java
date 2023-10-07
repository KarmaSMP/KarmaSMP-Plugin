package io.github.karmasmp.phase.player;

import io.github.karmasmp.lifecycle.PlayerLifecycle;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.title.Title;
import net.kyori.adventure.title.TitlePart;
import org.bukkit.entity.Player;

import java.time.Duration;

public final class FinalPlayerPhase extends PlayerPhase {

    public FinalPlayerPhase(PlayerLifecycle lifecycle) {
        super(lifecycle, 150);
    }

    @Override
    public void onStart() {
        Player player = this.getPlayer();

        player.sendTitlePart(TitlePart.TIMES, Title.Times.times(Duration.ofSeconds(20), Duration.ofSeconds(60), Duration.ofSeconds(20)));
        player.sendTitlePart(TitlePart.TITLE, Component.text("Disconnecting", NamedTextColor.RED));
        player.sendTitlePart(TitlePart.SUBTITLE, Component.text("You are about to be disconnected...", NamedTextColor.WHITE));
        player.sendMessage(Component.text("You are about to be disconnected...", NamedTextColor.RED));
    }

    @Override
    public void onStop() {
        this.getPlayer().kick(Component.text("Disconnected!", NamedTextColor.GREEN));
    }
}
