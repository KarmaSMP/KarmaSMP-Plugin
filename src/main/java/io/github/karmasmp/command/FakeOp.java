package io.github.karmasmp.command;

import cloud.commandframework.annotations.Argument;
import cloud.commandframework.annotations.CommandDescription;
import cloud.commandframework.annotations.CommandMethod;
import cloud.commandframework.annotations.CommandPermission;
import cloud.commandframework.annotations.processing.CommandContainer;
import io.github.karmasmp.KarmaCommandSender;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

@SuppressWarnings("unused")
@CommandContainer
public class FakeOp {

    @CommandMethod("op <player>")
    @CommandDescription("Make a player an operator")
    @CommandPermission("karma.command.fakeOp")
    public void runFakeOp(KarmaCommandSender sender, @Argument("player") Player player) {
        sender.sendMessage(Component.text("made you look lol imagine trying to op " + player.getName()));
    }
}
