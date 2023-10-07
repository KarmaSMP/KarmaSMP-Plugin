package io.github.karmasmp.command;

import cloud.commandframework.annotations.Argument;
import cloud.commandframework.annotations.CommandDescription;
import cloud.commandframework.annotations.CommandMethod;
import cloud.commandframework.annotations.CommandPermission;
import cloud.commandframework.annotations.processing.CommandContainer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@SuppressWarnings("unused")
@CommandContainer
public class FakeOp {

    @CommandMethod("op <player>")
    @CommandDescription("Make a player an operator")
    @CommandPermission("karma.command.fakeOp")
    public void runFakeOp(CommandSender sender, @Argument("player") Player player) {
        sender.sendMessage("made you look lol imagine trying to op " + player.getName());
    }
}
