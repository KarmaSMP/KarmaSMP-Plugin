package io.github.karmasmp.karmaplugin;

import cloud.commandframework.annotations.AnnotationParser;
import cloud.commandframework.arguments.parser.StandardParameters;
import cloud.commandframework.execution.CommandExecutionCoordinator;
import cloud.commandframework.meta.CommandMeta;
import cloud.commandframework.meta.SimpleCommandMeta;
import cloud.commandframework.paper.PaperCommandManager;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

@SuppressWarnings("unused")
public final class KarmaPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        setUpCommands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void setUpCommands() {
        getLogger().info("Setting up commands");
        PaperCommandManager<CommandSender> commandManager;
        try {
            commandManager = new PaperCommandManager<>(
                    this,
                    CommandExecutionCoordinator.simpleCoordinator(),
                    Function.identity(),
                    Function.identity()
            );
        } catch (Exception e) {
            getLogger().severe("Failed to initialize the command manager");
            getServer().getPluginManager().disablePlugin(this);
            throw new RuntimeException(e);
        }

        commandManager.registerAsynchronousCompletions();
        commandManager.registerBrigadier();
        commandManager.commandSuggestionProcessor((context, strings) -> {
            String input;

            if (context.getInputQueue().isEmpty()) {
                input = "";
            } else {
                input = context.getInputQueue().peek();
            }

            input = input.toLowerCase();
            List<String> suggestions = new LinkedList<>();

            for (String suggestion : strings) {
                suggestion = suggestion.toLowerCase();

                if (suggestion.startsWith(input)) {
                    suggestions.add(suggestion);
                }
            }

            return suggestions;
        });

        var annotationParser = new AnnotationParser<>(
                commandManager,
                CommandSender.class,
                param -> SimpleCommandMeta.simple()
                        .with(CommandMeta.DESCRIPTION, param.get(StandardParameters.DESCRIPTION, "No description"))
                        .build()
        );

        try {
            annotationParser.parseContainers();
        } catch(Exception e ) {
            getLogger().severe("Failed to parse commands");
            getServer().getPluginManager().disablePlugin(this);
            throw new RuntimeException(e);
        }
        getLogger().info("Finished setting up commands");
    }
}
