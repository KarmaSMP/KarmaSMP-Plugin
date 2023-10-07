package io.github.karmasmp.command;

import cloud.commandframework.annotations.*;
import cloud.commandframework.annotations.processing.CommandContainer;
import cloud.commandframework.arguments.standard.StringArgument;
import io.github.karmasmp.ComponentSort;
import io.github.karmasmp.KarmaCommandSender;
import io.github.karmasmp.lifecycle.Lifecycle;
import io.github.karmasmp.lifecycle.PlayerLifecycle;
import io.github.karmasmp.lifecycle.PluginLifecycle;
import io.github.karmasmp.lifecycle.world.WorldLifecycle;
import io.github.karmasmp.phase.Phase;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.JoinConfiguration;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
@CommandContainer
@CommandDescription("Commands for debugging lifecycle technology.")
public class LifecycleCommand {

    @CommandMethod("lifecycle")
    @CommandPermission("karma.command.lifecycle")
    public void runLifecycle(KarmaCommandSender karmaCommandSender
            , @Flag("help") boolean help) {
        CommandSender sender = karmaCommandSender.getCommandSender();
        PluginLifecycle pluginLifecycle = karmaCommandSender.getPluginLifecycle();

        if(!(sender instanceof Player)) {
            return;
        }

        Player player = (Player) sender;

        if(help) {
            this.sendCommandsMessage(player);
            return;
        }

        this.sendErrorMessage(player);
    }

    @CommandMethod("lifecycle help")
    @CommandPermission("karma.command.lifecycle")
    public void runLifecycleWorld(KarmaCommandSender karmaCommandSender) {
        CommandSender sender = karmaCommandSender.getCommandSender();
        PluginLifecycle pluginLifecycle = karmaCommandSender.getPluginLifecycle();

        if(!(sender instanceof Player)) {
            return;
        }

        Player player = (Player) sender;

        this.sendCommandsMessage(player);
    }

    @CommandMethod("lifecycle player")
    @CommandPermission("karma.command.lifecycle")
    public void runLifecyclePlayer(KarmaCommandSender karmaCommandSender
            , @Flag("help") boolean help) {
        CommandSender sender = karmaCommandSender.getCommandSender();
        PluginLifecycle pluginLifecycle = karmaCommandSender.getPluginLifecycle();

        if(!(sender instanceof Player)) {
            return;
        }

        Player player = (Player) sender;

        if(help) {
            this.sendPlayerCommandsMessage(player);
            return;
        }

        this.sendErrorMessage(player);
    }

    @CommandMethod("lifecycle player status")
    @CommandPermission("karma.command.lifecycle")
    public void runLifecyclePlayerStatus(KarmaCommandSender karmaCommandSender) {
        CommandSender sender = karmaCommandSender.getCommandSender();
        PluginLifecycle pluginLifecycle = karmaCommandSender.getPluginLifecycle();

        if(!(sender instanceof Player)) {
            return;
        }

        Player player = (Player) sender;

        this.sendPlayerStatusesMessage(pluginLifecycle, player);
    }

    @CommandMethod("lifecycle plugin")
    @CommandPermission("karma.command.lifecycle")
    public void runLifecyclePlugin(KarmaCommandSender karmaCommandSender
            , @Flag("help") boolean help) {
        CommandSender sender = karmaCommandSender.getCommandSender();
        PluginLifecycle pluginLifecycle = karmaCommandSender.getPluginLifecycle();

        if(!(sender instanceof Player)) {
            return;
        }

        Player player = (Player) sender;

        if(help) {
            this.sendPluginCommandsMessage(player);
            return;
        }

        this.sendErrorMessage(player);
    }

    @CommandMethod("lifecycle plugin status")
    @CommandPermission("karma.command.lifecycle")
    public void runLifecyclePluginStatus(KarmaCommandSender karmaCommandSender) {
        CommandSender sender = karmaCommandSender.getCommandSender();
        PluginLifecycle pluginLifecycle = karmaCommandSender.getPluginLifecycle();

        if(!(sender instanceof Player)) {
            return;
        }

        Player player = (Player) sender;

        this.sendPluginStatusMessage(pluginLifecycle, player);
    }

    @CommandMethod("lifecycle status")
    @CommandPermission("karma.command.lifecycle")
    public void runLifecycleStatus(KarmaCommandSender karmaCommandSender) {
        CommandSender sender = karmaCommandSender.getCommandSender();
        PluginLifecycle pluginLifecycle = karmaCommandSender.getPluginLifecycle();

        if(!(sender instanceof Player)) {
            return;
        }

        Player player = (Player) sender;

        this.sendStatusMessage(pluginLifecycle, player);
    }

    @CommandMethod("lifecycle world")
    @CommandPermission("karma.command.lifecycle")
    public void runLifecycleWorld(KarmaCommandSender karmaCommandSender
            , @Flag("help") boolean help) {
        CommandSender sender = karmaCommandSender.getCommandSender();
        PluginLifecycle pluginLifecycle = karmaCommandSender.getPluginLifecycle();

        if(!(sender instanceof Player)) {
            return;
        }

        Player player = (Player) sender;

        if(help) {
            this.sendWorldCommandsMessage(player);
            return;
        }

        this.sendErrorMessage(player);
    }

    @CommandMethod("lifecycle world status")
    @CommandPermission("karma.command.lifecycle")
    public void runLifecycleWorldStatus(KarmaCommandSender karmaCommandSender) {
        CommandSender sender = karmaCommandSender.getCommandSender();
        PluginLifecycle pluginLifecycle = karmaCommandSender.getPluginLifecycle();

        if(!(sender instanceof Player)) {
            return;
        }

        Player player = (Player) sender;

        this.sendWorldStatusesMessage(pluginLifecycle, player);
    }

    private List<Component> getCommands() {
        return Arrays.asList(Component.empty()
                        .append(Component.text("/lifecycle help", NamedTextColor.GRAY))
                        .appendSpace()
                        .append(Component.text("-", NamedTextColor.DARK_GRAY))
                        .appendSpace()
                        .append(Component.text("Shows this help message.", NamedTextColor.WHITE)),
                Component.empty()
                        .append(Component.text("/lifecycle status", NamedTextColor.GRAY))
                        .appendSpace()
                        .append(Component.text("-", NamedTextColor.DARK_GRAY))
                        .appendSpace()
                        .append(Component.text("Shows the status of all lifecycles.", NamedTextColor.WHITE)));
    }

    private Component getCommandsTitle() {
        return Component.empty()
                .append(Component.text("=====[", NamedTextColor.GOLD, TextDecoration.BOLD))
                .appendSpace()
                .append(Component.text("Lifecycle Commands", NamedTextColor.WHITE))
                .appendSpace()
                .append(Component.text("]=====", NamedTextColor.GOLD, TextDecoration.BOLD));
    }

    private Component getCurrentLifecycle(Lifecycle lifecycle) {
        return Component.empty()
                .append(Component.text("Current lifecycle:", NamedTextColor.GRAY))
                .appendNewline()
                .append(Component.empty()
                        .append(Component.text("-", NamedTextColor.DARK_GRAY))
                        .appendSpace()
                        .append(Component.text("Name:", NamedTextColor.GRAY))
                        .appendSpace()
                        .append(Component.text(lifecycle.getClass().getSimpleName())));
    }

    private Component getCurrentPhase(Phase phase) {
        return Component.empty()
                .append(Component.text("Current phase:", NamedTextColor.GRAY))
                .appendNewline()
                .append(Component.empty()
                        .append(Component.text("-", NamedTextColor.DARK_GRAY))
                        .appendSpace()
                        .append(Component.text("Name:", NamedTextColor.GRAY))
                        .appendSpace()
                        .append(Component.text(phase.getClass().getSimpleName())))
                .appendNewline()
                .append(Component.empty()
                        .append(Component.text("-", NamedTextColor.DARK_GRAY))
                        .appendSpace()
                        .append(Component.text("Ticks left:", NamedTextColor.GRAY))
                        .appendSpace()
                        .append(Component.text(phase.getTick())));
    }

    private List<Component> getPlayerCommands() {
        return Arrays.asList(Component.empty()
                .append(Component.text("/lifecycle player status", NamedTextColor.GRAY))
                .appendSpace()
                .append(Component.text("-", NamedTextColor.DARK_GRAY))
                .appendSpace()
                .append(Component.text("Shows the status of all player lifecycles.", NamedTextColor.WHITE)));
    }

    private Component getPlayerStatus(PlayerLifecycle playerLifecycle) {
        return Component.empty()
                .append(Component.empty()
                        .append(Component.text("=====[", NamedTextColor.RED, TextDecoration.BOLD))
                        .appendSpace()
                        .append(Component.text("Player Lifecycle", NamedTextColor.WHITE))
                        .appendSpace()
                        .append(Component.text("]=====", NamedTextColor.RED, TextDecoration.BOLD)))
                .appendNewline()
                .append(Component.empty()
                        .append(Component.text("Name:", NamedTextColor.GRAY))
                        .appendSpace()
                        .append(Component.text(playerLifecycle.getPlayer().getName())))
                .appendNewline()
                .append(this.getCurrentLifecycle(playerLifecycle))
                .appendNewline()
                .append(this.getCurrentPhase(playerLifecycle.getCurrentPhase()));
    }

    private List<Component> getPlayerStatuses(PluginLifecycle pluginLifecycle) {
        List<Component> statuses = new ArrayList<>();

        for(PlayerLifecycle playerLifecycle : pluginLifecycle.getPlayerLifecycles()) {
            statuses.add(this.getPlayerStatus(playerLifecycle));
        }
        statuses.sort(new ComponentSort());

        return statuses;
    }

    private List<Component> getPluginCommands() {
        return Arrays.asList(Component.empty()
                .append(Component.text("/lifecycle plugin status", NamedTextColor.GRAY))
                .appendSpace()
                .append(Component.text("-", NamedTextColor.DARK_GRAY))
                .appendSpace()
                .append(Component.text("Shows the status of plugin lifecycle.", NamedTextColor.WHITE)));
    }

    private Component getPluginStatus(PluginLifecycle pluginLifecycle) {
        return Component.empty()
                .append(Component.empty()
                        .append(Component.text("=====[", NamedTextColor.GOLD, TextDecoration.BOLD))
                        .appendSpace()
                        .append(Component.text("Plugin Lifecycle", NamedTextColor.WHITE))
                        .appendSpace()
                        .append(Component.text("]=====", NamedTextColor.GOLD, TextDecoration.BOLD)))
                .appendNewline()
                .append(this.getCurrentLifecycle(pluginLifecycle))
                .appendNewline()
                .append(this.getCurrentPhase(pluginLifecycle.getCurrentPhase()));
    }

    private List<Component> getWorldCommands() {
        return Arrays.asList(Component.empty()
                .append(Component.text("/lifecycle world status", NamedTextColor.GRAY))
                .appendSpace()
                .append(Component.text("-", NamedTextColor.DARK_GRAY))
                .appendSpace()
                .append(Component.text("Shows the status of all world lifecycles.", NamedTextColor.WHITE)));
    }

    private Component getWorldStatus(WorldLifecycle worldLifecycle) {
        return Component.empty()
                .append(Component.empty()
                        .append(Component.text("=====[", NamedTextColor.GREEN, TextDecoration.BOLD))
                        .appendSpace()
                        .append(Component.text("World Lifecycle", NamedTextColor.WHITE))
                        .appendSpace()
                        .append(Component.text("]=====", NamedTextColor.GREEN, TextDecoration.BOLD)))
                .appendNewline()
                .append(Component.empty()
                        .append(Component.text("Name:", NamedTextColor.GRAY))
                        .appendSpace()
                        .append(Component.text(worldLifecycle.getWorld().getName(), NamedTextColor.WHITE)))
                .appendNewline()
                .append(this.getCurrentLifecycle(worldLifecycle))
                .appendNewline()
                .append(this.getCurrentPhase(worldLifecycle.getCurrentPhase()));
    }

    private List<Component> getWorldStatuses(PluginLifecycle pluginLifecycle) {
        List<Component> statuses = new ArrayList<>();

        for(WorldLifecycle worldLifecycle : pluginLifecycle.getWorldLifecycles()) {
            statuses.add(this.getWorldStatus(worldLifecycle));
        }
        statuses.sort(new ComponentSort());

        return statuses;
    }

    private void sendCommandsMessage(Player player) {
        List<Component> commands = new ArrayList<>();

        commands.addAll(this.getCommands());
        commands.addAll(this.getPlayerCommands());
        commands.addAll(this.getPluginCommands());
        commands.addAll(this.getWorldCommands());
        commands.sort(new ComponentSort());

        player.sendMessage(Component.empty()
                .append(this.getCommandsTitle())
                .appendNewline()
                .append(Component.join(JoinConfiguration.newlines(), commands)));
    }

    private void sendErrorMessage(Player player) {
        player.sendMessage(Component.empty()
                .append(Component.text("Invalid command syntax. Type:", NamedTextColor.RED))
                .appendSpace()
                .append(Component.text("/lifecycle --help", NamedTextColor.GRAY)));
    }

    private void sendPlayerCommandsMessage(Player player) {
        player.sendMessage(Component.empty()
                .append(this.getCommandsTitle())
                .appendNewline()
                .append(Component.join(JoinConfiguration.newlines(), this.getPlayerCommands())));
    }

    private void sendPlayerStatusesMessage(PluginLifecycle pluginLifecycle, Player player) {
        player.sendMessage(Component.join(JoinConfiguration.newlines(), this.getPlayerStatuses(pluginLifecycle)));
    }

    private void sendPluginCommandsMessage(Player player) {
        player.sendMessage(Component.empty()
                .append(this.getCommandsTitle())
                .appendNewline()
                .append(Component.join(JoinConfiguration.newlines(), this.getPluginCommands())));
    }

    private void sendPluginStatusMessage(PluginLifecycle pluginLifecycle, Player player) {
        player.sendMessage(this.getPluginStatus(pluginLifecycle));
    }

    private void sendStatusMessage(PluginLifecycle pluginLifecycle, Player player) {
        List<Component> statuses = new ArrayList<>();

        statuses.add(this.getPluginStatus(pluginLifecycle));
        statuses.addAll(this.getPlayerStatuses(pluginLifecycle));
        statuses.addAll(this.getWorldStatuses(pluginLifecycle));
        statuses.sort(new ComponentSort());

        player.sendMessage(Component.join(JoinConfiguration.newlines(), statuses));
    }

    private void sendWorldCommandsMessage(Player player) {
        player.sendMessage(Component.empty()
                .append(this.getCommandsTitle())
                .appendNewline()
                .append(Component.join(JoinConfiguration.newlines(), this.getWorldCommands())));
    }

    private void sendWorldStatusesMessage(PluginLifecycle pluginLifecycle, Player player) {
        player.sendMessage(Component.join(JoinConfiguration.newlines(), this.getWorldStatuses(pluginLifecycle)));
    }
}
