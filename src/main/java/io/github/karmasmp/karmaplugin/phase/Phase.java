package io.github.karmasmp.karmaplugin.phase;

import io.github.karmasmp.karmaplugin.Tickable;
import io.github.karmasmp.karmaplugin.event.PluginEventable;
import io.github.karmasmp.karmaplugin.lifecycle.Lifecycle;

public abstract class Phase implements PluginEventable, Tickable {

    protected final Lifecycle lifecycle;
    private int tick;

    public Phase(Lifecycle lifecycle, int startTicks) {
        this.lifecycle = lifecycle;
        this.tick = startTicks;
    }

    public int getTick() {
        return tick;
    }

    @Override
    public void tick() {
        if(this.tick == 0) {
            this.lifecycle.nextPhase();
            return;
        }

        Tickable.super.tick();
        this.tick--;
    }
}
