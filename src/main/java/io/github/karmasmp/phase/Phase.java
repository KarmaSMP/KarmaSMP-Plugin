package io.github.karmasmp.phase;

import io.github.karmasmp.Tickable;
import io.github.karmasmp.event.PluginEventable;
import io.github.karmasmp.lifecycle.Lifecycle;

public abstract class Phase implements PluginEventable, Tickable {

    protected final Lifecycle lifecycle;
    private int tick;

    public Phase(Lifecycle lifecycle, int startTicks) {
        this.lifecycle = lifecycle;
        this.tick = startTicks;
    }

    protected int getTick() {
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
