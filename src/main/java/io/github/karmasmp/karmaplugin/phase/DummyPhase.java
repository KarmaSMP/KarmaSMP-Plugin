package io.github.karmasmp.karmaplugin.phase;

import io.github.karmasmp.karmaplugin.lifecycle.Lifecycle;

public final class DummyPhase extends Phase {

    public DummyPhase(Lifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }
}
