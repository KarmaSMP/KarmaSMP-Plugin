package io.github.karmasmp.karmaplugin.phase.plugin;

import io.github.karmasmp.karmaplugin.function.KarmaSMPChat;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;

public final class MainPluginPhase extends PluginPhase implements
        KarmaSMPChat {

    public MainPluginPhase(PluginLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
