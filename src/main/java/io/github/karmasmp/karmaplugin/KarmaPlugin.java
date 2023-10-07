package io.github.karmasmp.karmaplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.logging.Logger;

public final class KarmaPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getPluginMeta().getVersion()
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    private static Plugin getPlugin() {
        return Objects.requireNonNull(Bukkit.getServer().getPluginManager().getPlugin("KarmaPlugin"));
    }

    public static Logger logger() {
        return getPlugin().getLogger();
    }

    public static String getVersion() {
        return getPlugin().getPluginMeta().getVersion();
    }
}
