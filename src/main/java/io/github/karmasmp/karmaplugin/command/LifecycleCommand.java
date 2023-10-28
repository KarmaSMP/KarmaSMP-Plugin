package io.github.karmasmp.karmaplugin.command;

import cloud.commandframework.annotations.*;
import cloud.commandframework.annotations.processing.CommandContainer;
import io.github.karmasmp.karmaplugin.ComponentSort;
import io.github.karmasmp.karmaplugin.lifecycle.Lifecycle;
import io.github.karmasmp.karmaplugin.lifecycle.PlayerLifecycle;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import io.github.karmasmp.karmaplugin.lifecycle.world.WorldLifecycle;
import io.github.karmasmp.karmaplugin.phase.Phase;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.JoinConfiguration;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
@CommandContainer
public class LifecycleCommand {

    public enum LifecycleTypeSelection {
        ALL, PLUGIN, WORLD, PLAYER
    }

    @CommandMethod("lifecycle <type>")
    @CommandPermission("karma.command.lifecycle")
    @CommandDescription("Command for debugging lifecycle technology. If no type is passed then information on all lifecycles will be provided.")
    public void runLifecycleGeneric(CommandSender sender, PluginLifecycle lifecycle,
                                    @Argument(value = "type", description = "Which lifecycle should be inspected.") LifecycleTypeSelection type) {

        if (!(sender instanceof Player player)) {
            return;
        }

        switch (type) {
            case ALL -> this.sendStatusMessage(lifecycle, player);
            case WORLD -> this.sendWorldStatusesMessage(lifecycle, player);
            case PLAYER -> this.sendPlayerStatusesMessage(lifecycle, player);
            case PLUGIN -> this.sendPluginStatusMessage(lifecycle, player);
        }
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

        for (PlayerLifecycle playerLifecycle : pluginLifecycle.getPlayerLifecycles()) {
            statuses.add(this.getPlayerStatus(playerLifecycle));
        }
        statuses.sort(new ComponentSort());

        return statuses;
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

        for (WorldLifecycle worldLifecycle : pluginLifecycle.getWorldLifecycles()) {
            statuses.add(this.getWorldStatus(worldLifecycle));
        }
        statuses.sort(new ComponentSort());

        return statuses;
    }

    private void sendPlayerStatusesMessage(PluginLifecycle pluginLifecycle, Player player) {
        player.sendMessage(Component.join(JoinConfiguration.newlines(), this.getPlayerStatuses(pluginLifecycle)));
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

    private void sendWorldStatusesMessage(PluginLifecycle pluginLifecycle, Player player) {
        player.sendMessage(Component.join(JoinConfiguration.newlines(), this.getWorldStatuses(pluginLifecycle)));
    }
}
