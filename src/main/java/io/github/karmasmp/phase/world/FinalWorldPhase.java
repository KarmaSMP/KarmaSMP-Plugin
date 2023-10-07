package io.github.karmasmp.phase.world;

import io.github.karmasmp.lifecycle.world.WorldLifecycle;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.title.Title;
import net.kyori.adventure.title.TitlePart;
import org.bukkit.entity.Player;

import java.time.Duration;

public final class FinalWorldPhase extends WorldPhase {

    public FinalWorldPhase(WorldLifecycle lifecycle) {
        super(lifecycle, 100);
    }

    @Override
    public void onStart() {
        for(Player player : this.getWorld().getPlayers()) {
            player.sendTitlePart(TitlePart.TIMES, Title.Times.times(Duration.ofSeconds(20), Duration.ofSeconds(60), Duration.ofSeconds(20)));
            player.sendTitlePart(TitlePart.TITLE, Component.text("World shutdown", NamedTextColor.RED));
            player.sendTitlePart(TitlePart.SUBTITLE, Component.text("The world is shutting down...", NamedTextColor.WHITE));
            player.sendMessage(Component.text("The world is shutting down...", NamedTextColor.RED));
        }
    }

    @Override
    public void onStop() {
        this.getServer().unloadWorld(this.getWorld(), true);
    }
}
