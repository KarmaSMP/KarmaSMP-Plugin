package io.github.karmasmp;

import io.github.karmasmp.lifecycle.PluginLifecycle;
import org.bukkit.plugin.java.JavaPlugin;

public final class MainPlugin extends JavaPlugin {

    private final PluginLifecycle pluginLifecycle;

    public MainPlugin() {
        this.pluginLifecycle = new PluginLifecycle(this);
    }

    @Override
    public void onEnable() {
        this.pluginLifecycle.start();
        this.getLogger().info("Plugin enabled!");
    }

    @Override
    public void onDisable() {
        this.pluginLifecycle.stop();
        this.getLogger().info("Plugin disabled!");
    }
}
