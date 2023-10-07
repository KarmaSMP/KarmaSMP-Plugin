package io.github.karmasmp.karmaplugin.phase;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class QueuedPhase {

    private final Constructor<? extends Phase> constructor;
    private final Object[] parameters;

    public QueuedPhase(Constructor<? extends Phase> constructor, Object... parameters) {
        this.constructor = constructor;
        this.parameters = parameters;
    }

    public Phase newInstance() {
        try {
            return constructor.newInstance(this.parameters);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException ex) {
            throw new IllegalStateException("Could not create a new instance of a queued phase!", ex);
        }
    }
}
