package io.github.karmasmp.testcommand;

import io.github.karmasmp.ComponentSort;
import io.github.karmasmp.lifecycle.PlayerLifecycle;
import io.github.karmasmp.lifecycle.PluginLifecycle;
import io.github.karmasmp.lifecycle.world.WorldLifecycle;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.JoinConfiguration;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class LifecycleCommand extends Command {

    private final PluginLifecycle pluginLifecycle;

    public LifecycleCommand(PluginLifecycle pluginLifecycle) {
        super("lifecycle");

        this.pluginLifecycle = pluginLifecycle;
    }

    @Override
    public boolean execute(CommandSender sender, String alias, String[] args) {
        if(!(sender instanceof Player)) {
            return false;
        }

        Player player = (Player) sender;

        if(args.length == 0) {
            this.sendHelpMessage(player);
            return true;
        }

        if(args[0].equalsIgnoreCase("help")) {
            this.sendHelpMessage(player);
            return true;
        }

        if(args[0].equalsIgnoreCase("status")) {
            this.sendStatusMessage(player);
            return true;
        }

        player.sendMessage(Component.empty()
                .append(Component.text("Invalid command syntax. Type:", NamedTextColor.RED))
                .appendSpace()
                .append(Component.text("/lifecycle help", NamedTextColor.GRAY)));
        return true;
    }

    @Override
    public List<String> tabComplete(CommandSender sender, String alias, String[] args) throws IllegalArgumentException {
        return super.tabComplete(sender, alias, args);
    }

    private void sendHelpMessage(Player player) {
        player.sendMessage(Component.empty()
                .append(Component.empty()
                        .append(Component.text("=====[", NamedTextColor.GOLD))
                        .appendSpace()
                        .append(Component.text("Lifecycle Commands", NamedTextColor.WHITE))
                        .appendSpace()
                        .append(Component.text("]=====", NamedTextColor.GOLD)))
                .appendNewline()
                .append(Component.empty()
                        .append(Component.text("/lifecycle help", NamedTextColor.GRAY))
                        .appendSpace()
                        .append(Component.text("-", NamedTextColor.DARK_GRAY))
                        .appendSpace()
                        .append(Component.text("Shows this message", NamedTextColor.WHITE)))
                .appendNewline()
                .append(Component.empty()
                        .append(Component.text("/lifecycle status", NamedTextColor.GRAY))
                        .appendSpace()
                        .append(Component.text("-", NamedTextColor.DARK_GRAY))
                        .appendSpace()
                        .append(Component.text("Shows the status of all lifecycles!", NamedTextColor.WHITE))));
    }

    private void sendStatusMessage(Player player) {
        List<Component> activeWorldLifecycles = new ArrayList<>();
        for(WorldLifecycle worldLifecycle : this.pluginLifecycle.getWorldLifecycles()) {
            activeWorldLifecycles.add(Component.empty()
                    .append(Component.empty()
                            .append(Component.text("-----[", NamedTextColor.GREEN))
                            .appendSpace()
                            .append(Component.text("World lifecycle", NamedTextColor.WHITE))
                            .appendSpace()
                            .append(Component.text("]-----", NamedTextColor.GREEN)))
                    .appendNewline()
                    .append(Component.empty()
                            .append(Component.text("Name:", NamedTextColor.GRAY))
                            .appendSpace()
                            .append(Component.text(worldLifecycle.getWorld().getName(), NamedTextColor.WHITE)))
                    .appendNewline()
                    .append(Component.empty()
                            .append(Component.text("Current lifecycle:", NamedTextColor.GRAY))
                            .appendSpace()
                            .append(Component.text(worldLifecycle.getClass().getSimpleName(), NamedTextColor.WHITE)))
                    .appendNewline()
                    .append(Component.empty()
                            .append(Component.text("Current lifecycle phase:", NamedTextColor.GRAY))
                            .appendSpace()
                            .append(Component.text(worldLifecycle.getCurrentPhase().getClass().getSimpleName(), NamedTextColor.WHITE))));
        }
        activeWorldLifecycles.sort(new ComponentSort());

        List<Component> activePlayerLifecycles = new ArrayList<>();
        for(PlayerLifecycle playerLifecycle : this.pluginLifecycle.getPlayerLifecycles()) {
            activePlayerLifecycles.add(Component.empty()
                    .append(Component.empty()
                            .append(Component.text("-----[", NamedTextColor.RED))
                            .appendSpace()
                            .append(Component.text("Player lifecycle", NamedTextColor.WHITE))
                            .appendSpace()
                            .append(Component.text("]-----", NamedTextColor.RED)))
                    .appendNewline()
                    .append(Component.empty()
                            .append(Component.text("Name:", NamedTextColor.GRAY))
                            .appendSpace()
                            .append(Component.text(playerLifecycle.getPlayer().getName(), NamedTextColor.WHITE)))
                    .appendNewline()
                    .append(Component.empty()
                            .append(Component.text("Current lifecycle:", NamedTextColor.GRAY))
                            .appendSpace()
                            .append(Component.text(playerLifecycle.getClass().getSimpleName(), NamedTextColor.WHITE)))
                    .appendNewline()
                    .append(Component.empty()
                            .append(Component.text("Current lifecycle phase:", NamedTextColor.GRAY))
                            .appendSpace()
                            .append(Component.text(playerLifecycle.getCurrentPhase().getClass().getSimpleName(), NamedTextColor.WHITE))));
        }
        activePlayerLifecycles.sort(new ComponentSort());

        Component message = Component.empty()
                .append(Component.empty()
                        .append(Component.text("=====[", NamedTextColor.GOLD))
                        .appendSpace()
                        .append(Component.text("Plugin lifecycle", NamedTextColor.WHITE))
                        .appendSpace()
                        .append(Component.text("]=====", NamedTextColor.GOLD)))
                .appendNewline()
                .append(Component.empty()
                        .append(Component.text("Current lifecycle:", NamedTextColor.GRAY))
                        .appendSpace()
                        .append(Component.text(this.pluginLifecycle.getClass().getSimpleName(), NamedTextColor.WHITE)))
                .appendNewline()
                .append(Component.empty()
                        .append(Component.text("Current lifecycle phase:", NamedTextColor.GRAY))
                        .appendSpace()
                        .append(Component.text(this.pluginLifecycle.getCurrentPhase().getClass().getSimpleName(), NamedTextColor.WHITE)))
                .appendNewline()
                .append(Component.join(JoinConfiguration.newlines(), activeWorldLifecycles))
                .appendNewline()
                .append(Component.join(JoinConfiguration.newlines(), activePlayerLifecycles));

        player.sendMessage(message);
    }
}
