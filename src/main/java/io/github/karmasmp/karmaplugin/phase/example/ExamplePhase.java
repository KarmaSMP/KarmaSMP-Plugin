package io.github.karmasmp.karmaplugin.phase.example;

import io.github.karmasmp.karmaplugin.lifecycle.ExampleLifecycle;
import io.github.karmasmp.karmaplugin.phase.Phase;

public abstract class ExamplePhase extends Phase {

    public ExamplePhase(ExampleLifecycle lifecycle, int startTicks) {
        super(lifecycle, startTicks);
    }
}
