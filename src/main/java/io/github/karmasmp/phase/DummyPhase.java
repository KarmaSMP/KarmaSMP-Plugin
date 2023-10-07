package io.github.karmasmp.phase;

import io.github.karmasmp.lifecycle.Lifecycle;

public final class DummyPhase extends Phase {

    public DummyPhase(Lifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
