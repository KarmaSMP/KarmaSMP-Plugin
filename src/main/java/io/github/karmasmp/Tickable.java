package io.github.karmasmp;

public interface Tickable {

    default void onStart() {}

    default void onStop() {}

    default void onTick() {}

    default void start() {
        onStart();
    }

    default void stop() {
        onStop();
    }

    default void tick() {
        onTick();
    }
}
