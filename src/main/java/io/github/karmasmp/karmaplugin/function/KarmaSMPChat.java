package io.github.karmasmp.karmaplugin.function;

import io.github.karmasmp.karmaplugin.event.PluginEventable;
import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Server;
import org.bukkit.entity.Player;

public interface KarmaSMPChat extends PluginEventable {

    Server getServer();

    default boolean event(AsyncChatEvent event) {
        for(Player player : getServer().getOnlinePlayers()) {
            player.sendMessage(Component.empty()
                    .append(Component.text(event.getPlayer().getName(), NamedTextColor.YELLOW))
                    .append(Component.text(":", NamedTextColor.GRAY))
                    .appendSpace()
                    .append(event.message()));
        }

        event.setCancelled(true);
        return true;
    }
}
