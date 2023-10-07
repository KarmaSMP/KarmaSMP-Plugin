package io.github.karmasmp.lifecycle;

import io.github.karmasmp.phase.Phase;
import io.github.karmasmp.phase.QueuedPhase;
import io.github.karmasmp.phase.example.FinalExamplePhase;
import io.github.karmasmp.phase.example.MainExamplePhase;

public final class ExampleLifecycle extends Lifecycle {

    public ExampleLifecycle() {}

    @Override
    public QueuedPhase createQueuedPhase(Class<? extends Phase> clazz) throws NoSuchMethodException {
        return createQueuePhase(clazz, ExampleLifecycle.class, this);
    }

    @Override
    public QueuedPhase createQueuedPhase(Class<? extends Phase> clazz, Class<?>[] constructorTypes, Object... parameters) throws NoSuchMethodException {
        return createQueuePhase(clazz, ExampleLifecycle.class, this, constructorTypes, parameters);
    }

    @Override
    public void queueFinalPhase() {
        queuePhase(FinalExamplePhase.class);
    }

    @Override
    public void queuePhases() {
        queuePhase(MainExamplePhase.class);
    }
}
