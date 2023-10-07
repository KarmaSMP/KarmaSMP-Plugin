package io.github.karmasmp.phase.plugin;

import io.github.karmasmp.function.KarmaSMPChat;
import io.github.karmasmp.lifecycle.PluginLifecycle;

public final class MainPluginPhase extends PluginPhase implements
        KarmaSMPChat {

    public MainPluginPhase(PluginLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
