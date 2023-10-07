package io.github.karmasmp.lifecycle;

import io.github.karmasmp.phase.Phase;
import io.github.karmasmp.phase.QueuedPhase;
import io.github.karmasmp.phase.player.FinalPlayerPhase;
import io.github.karmasmp.phase.player.SMPPlayerPhase;
import org.bukkit.entity.Player;

import java.util.logging.Logger;

public final class PlayerLifecycle extends Lifecycle {

    private final Player player;
    private final PluginLifecycle pluginLifecycle;

    public PlayerLifecycle(PluginLifecycle pluginLifecycle, Player player) {
        this.player = player;
        this.pluginLifecycle = pluginLifecycle;
    }

    @Override
    protected QueuedPhase createQueuedPhase(Class<? extends Phase> clazz) throws NoSuchMethodException {
        return createQueuePhase(clazz, PlayerLifecycle.class, this);
    }

    @Override
    protected QueuedPhase createQueuedPhase(Class<? extends Phase> clazz, Class<?>[] constructorTypes, Object... parameters) throws NoSuchMethodException {
        return createQueuePhase(clazz, PlayerLifecycle.class, this, constructorTypes, parameters);
    }

    public Logger getLogger() {
        return pluginLifecycle.getLogger();
    }

    public Player getPlayer() {
        return player;
    }

    public PluginLifecycle getPluginLifecycle() {
        return pluginLifecycle;
    }

    @Override
    public void queueFinalPhase() {
        queuePhase(FinalPlayerPhase.class);
    }

    @Override
    public void queuePhases() {
        queuePhase(SMPPlayerPhase.class);
    }

    @Override
    public void start() {
        super.start();
        this.getLogger().info("Player lifecycle started! (Name: " + this.player.getName() + ")");
    }

    @Override
    public void stop() {
        super.stop();
        this.getLogger().info("Player lifecycle stopped! (Name: " + this.player.getName() + ")");
    }
}
