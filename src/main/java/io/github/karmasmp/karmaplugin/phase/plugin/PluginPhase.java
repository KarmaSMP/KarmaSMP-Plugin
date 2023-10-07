package io.github.karmasmp.karmaplugin.phase.plugin;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import io.github.karmasmp.karmaplugin.phase.Phase;
import org.bukkit.Server;

public abstract class PluginPhase extends Phase {

    public PluginPhase(PluginLifecycle lifecycle, int startTicks) {
        super(lifecycle, startTicks);
    }

    protected PluginLifecycle getLifecycle() {
        return (PluginLifecycle) lifecycle;
    }

    public Server getServer() {
        return getLifecycle().getServer();
    }
}
