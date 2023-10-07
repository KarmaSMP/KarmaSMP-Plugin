package io.github.karmasmp;

import io.github.karmasmp.lifecycle.PluginLifecycle;
import net.kyori.adventure.text.Component;
import org.bukkit.command.CommandSender;

public class KarmaCommandSender {

    private CommandSender commandSender;
    private PluginLifecycle pluginLifecycle;

    public KarmaCommandSender(CommandSender commandSender, PluginLifecycle pluginLifecycle) {
        this.commandSender = commandSender;
        this.pluginLifecycle = pluginLifecycle;
    }

    public CommandSender getCommandSender() {
        return commandSender;
    }

    public PluginLifecycle getPluginLifecycle() {
        return pluginLifecycle;
    }

    public void sendMessage(Component message) {
        this.commandSender.sendMessage(message);
    }
}
