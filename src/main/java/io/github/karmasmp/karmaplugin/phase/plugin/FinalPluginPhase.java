package io.github.karmasmp.karmaplugin.phase.plugin;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.title.Title;
import net.kyori.adventure.title.TitlePart;
import org.bukkit.entity.Player;

import java.time.Duration;

public final class FinalPluginPhase extends PluginPhase {

    public FinalPluginPhase(PluginLifecycle lifecycle) {
        super(lifecycle, 200);
    }

    @Override
    public void onStart() {
        for(Player player : this.getServer().getOnlinePlayers()) {
            player.sendTitlePart(TitlePart.TIMES, Title.Times.times(Duration.ofSeconds(20), Duration.ofSeconds(60), Duration.ofSeconds(20)));
            player.sendTitlePart(TitlePart.TITLE, Component.text("Server shutdown", NamedTextColor.RED));
            player.sendTitlePart(TitlePart.SUBTITLE, Component.text("The server is shutting down...", NamedTextColor.WHITE));
            player.sendMessage(Component.text("The server is shutting down...", NamedTextColor.RED));
        }
    }

    @Override
    public void onStop() {
        this.getServer().shutdown();
    }
}
