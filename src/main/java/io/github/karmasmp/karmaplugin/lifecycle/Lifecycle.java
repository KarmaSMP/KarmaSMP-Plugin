package io.github.karmasmp.karmaplugin.lifecycle;

import io.github.karmasmp.karmaplugin.Tickable;
import io.github.karmasmp.karmaplugin.event.PluginEventable;
import io.github.karmasmp.karmaplugin.phase.DummyPhase;
import io.github.karmasmp.karmaplugin.phase.Phase;
import io.github.karmasmp.karmaplugin.phase.QueuedPhase;

import java.util.ArrayList;
import java.util.List;

public abstract class Lifecycle implements PluginEventable, Tickable {

    private Phase currentPhase;
    private boolean queuedFinalPhase;
    private final List<QueuedPhase> queuedPhases;

    public Lifecycle() {
        this.currentPhase = new DummyPhase(this);
        this.queuedFinalPhase = false;
        this.queuedPhases = new ArrayList<>();
    }

    private Phase createInstance() {
        return queuedPhases.remove(0).newInstance();
    }

    protected abstract QueuedPhase createQueuedPhase(Class<? extends Phase> clazz) throws NoSuchMethodException;

    protected abstract QueuedPhase createQueuedPhase(Class<? extends Phase> clazz, Class<?>[] constructorTypes, Object... parameters) throws NoSuchMethodException;

    protected QueuedPhase createQueuePhase(Class<? extends Phase> clazz, Class<? extends Lifecycle> lifecycleClazz, Lifecycle lifecycleInstance) throws NoSuchMethodException {
        return new QueuedPhase(clazz.getConstructor(lifecycleClazz), lifecycleInstance);
    }

    protected QueuedPhase createQueuePhase(Class<? extends Phase> clazz, Class<? extends Lifecycle> lifecycleClazz, Lifecycle lifecycleInstance, Class<?>[] constructorTypes, Object... parameters) throws NoSuchMethodException {
        Class<?>[] newConstructorTypes = new Class<?>[constructorTypes.length + 1];
        newConstructorTypes[0] = lifecycleClazz;
        System.arraycopy(constructorTypes, 0, newConstructorTypes, 1, constructorTypes.length);

        Object[] newParams = new Object[parameters.length + 1];
        newParams[0] = lifecycleInstance;
        System.arraycopy(parameters, 0, newParams, 1, parameters.length);

        return new QueuedPhase(clazz.getConstructor(newConstructorTypes), newParams);
    }

    public void forceFinalPhase() {
        this.queueFinalPhase();
        this.queuedFinalPhase = true;
        this.forcePhase(this.queuedPhases.remove(this.queuedPhases.size() - 1).newInstance());
    }

    public void forcePhase(Phase phase) {
        this.currentPhase.stop();
        this.currentPhase = phase;
        this.currentPhase.start();
    }

    public Phase getCurrentPhase() {
        return currentPhase;
    }

    public void nextPhase() {
        if(this.queuedFinalPhase) {
            this.stop();
            return;
        }

        if(this.queuedPhases.size() == 0) {
            this.forceFinalPhase();
            return;
        }

        this.forcePhase(this.createInstance());
    }

    public abstract void queueFinalPhase();

    public void queuePhase(Class<? extends Phase> clazz) {
        try {
            this.queuedPhases.add(createQueuedPhase(clazz));
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Could not queue a phase!");
        }
    }

    public void queuePhase(Class<? extends Phase> clazz, Class<?>[] constructorTypes, Object... parameters) {
        try {
            this.queuedPhases.add(createQueuedPhase(clazz, constructorTypes, parameters));
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Could not queue a phase!");
        }
    }

    public abstract void queuePhases();

    @Override
    public void start() {
        this.queuePhases();

        Tickable.super.start();

        this.nextPhase();
    }

    @Override
    public void stop() {
        this.currentPhase.stop();

        Tickable.super.stop();
    }

    @Override
    public void tick() {
        Tickable.super.tick();

        this.currentPhase.tick();
    }
}
