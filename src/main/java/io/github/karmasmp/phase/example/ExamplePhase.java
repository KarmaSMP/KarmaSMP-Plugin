package io.github.karmasmp.phase.example;

import io.github.karmasmp.lifecycle.ExampleLifecycle;
import io.github.karmasmp.phase.Phase;

public abstract class ExamplePhase extends Phase {

    public ExamplePhase(ExampleLifecycle lifecycle, int startTicks) {
        super(lifecycle, startTicks);
    }
}
