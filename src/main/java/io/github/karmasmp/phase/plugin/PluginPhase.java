package io.github.karmasmp.phase.plugin;

import io.github.karmasmp.lifecycle.PluginLifecycle;
import io.github.karmasmp.phase.Phase;
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
