package io.github.karmasmp.karmaplugin.command;

import cloud.commandframework.annotations.Argument;
import cloud.commandframework.annotations.CommandDescription;
import cloud.commandframework.annotations.CommandMethod;
import cloud.commandframework.annotations.CommandPermission;
import cloud.commandframework.annotations.processing.CommandContainer;
import io.github.karmasmp.karmaplugin.KarmaPlayer;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandContainer
public class LivesCommand {

    public enum LivesCommandActions {
        ADD, REMOVE, SET, VIEW
    }

    @CommandMethod("lives <player> <action> [value]")
    @CommandPermission("karma.command.lives")
    @CommandDescription("Command for adding/removing lives of players.")
    public void runLives(CommandSender sender, PluginLifecycle lifecycle
            , @Argument(value = "player") Player player
            , @Argument(value = "action") LivesCommandActions action
            , @Argument(value = "value", defaultValue = "0") int value) {
        KarmaPlayer karmaPlayer = lifecycle.getKarmaPlayer(player);

        switch (action) {
            case ADD -> addLives(karmaPlayer, value);
            case REMOVE -> removeLives(karmaPlayer, value);
            case SET -> setLives(karmaPlayer, value);
            case VIEW -> viewLives(karmaPlayer);
        }
    }

    private void addLives(KarmaPlayer karmaPlayer, int lives) {
        setLives(karmaPlayer, karmaPlayer.getLives() + lives);
    }

    private void removeLives(KarmaPlayer karmaPlayer, int lives) {
        setLives(karmaPlayer, karmaPlayer.getLives() - lives);
    }

    private void setLives(KarmaPlayer karmaPlayer, int lives) {
        karmaPlayer.setLives(lives);
        karmaPlayer.sendMessage(Component.empty()
                .append(Component.text("Player", NamedTextColor.YELLOW))
                .appendSpace()
                .append(Component.text(karmaPlayer.getName(), NamedTextColor.GOLD))
                .appendSpace()
                .append(Component.text("now has", NamedTextColor.YELLOW))
                .appendSpace()
                .append(Component.text(karmaPlayer.getLives() + " lives", NamedTextColor.GREEN))
                .append(Component.text("!", NamedTextColor.YELLOW)));
    }

    private void viewLives(KarmaPlayer karmaPlayer) {
        karmaPlayer.sendMessage(Component.empty()
                .append(Component.text("Player", NamedTextColor.YELLOW))
                .appendSpace()
                .append(Component.text(karmaPlayer.getName(), NamedTextColor.GOLD))
                .appendSpace()
                .append(Component.text("has", NamedTextColor.YELLOW))
                .appendSpace()
                .append(Component.text(karmaPlayer.getLives() + " lives", NamedTextColor.GREEN))
                .append(Component.text("!", NamedTextColor.YELLOW)));
    }
}
