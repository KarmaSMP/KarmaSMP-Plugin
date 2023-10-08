package io.github.karmasmp.karmaplugin;

import io.github.karmasmp.karmaplugin.lifecycle.PlayerLifecycle;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import io.github.karmasmp.karmaplugin.lifecycle.world.WorldLifecycle;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class PluginTimer extends BukkitRunnable {

    private PluginLifecycle pluginLifecycle;

    public PluginTimer(PluginLifecycle pluginLifecycle) {
        this.pluginLifecycle = pluginLifecycle;
    }

    @Override
    public void run() {
        try {
            this.pluginLifecycle.tick();

            for(WorldLifecycle worldLifecycle : this.pluginLifecycle.getWorldLifecycles()) {
                worldLifecycle.tick();
            }

            for(PlayerLifecycle playerLifecycle : this.pluginLifecycle.getPlayerLifecycles()) {
                playerLifecycle.tick();
            }
        } catch (Exception ex) {
            ex.printStackTrace();

            for(Player player : this.pluginLifecycle.getServer().getOnlinePlayers()) {
                if(!player.isOp()) {
                    continue;
                }

                player.sendMessage(Component.text("Plugin timer crashed!", NamedTextColor.RED));
            }

            this.stop();
        }
    }

    public void start() {
        this.runTaskTimer(this.pluginLifecycle.getPlugin(), 0L, 1L);
        this.pluginLifecycle.getLogger().info("Plugin timer started!");
    }

    public void stop() {
        this.pluginLifecycle.getServer().getScheduler().cancelTask(this.getTaskId());
        this.pluginLifecycle.getLogger().info("Plugin timer stopped!");
    }
}
