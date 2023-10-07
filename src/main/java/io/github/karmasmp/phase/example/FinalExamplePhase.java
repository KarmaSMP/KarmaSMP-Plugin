package io.github.karmasmp.phase.example;

import io.github.karmasmp.lifecycle.ExampleLifecycle;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;

public final class FinalExamplePhase extends ExamplePhase {

    public FinalExamplePhase(ExampleLifecycle lifecycle) {
        super(lifecycle, 50);
    }

    @Override
    public void onStart() {
        Bukkit.broadcast(Component.text("This example lifecycle is ending!"));
    }
}
