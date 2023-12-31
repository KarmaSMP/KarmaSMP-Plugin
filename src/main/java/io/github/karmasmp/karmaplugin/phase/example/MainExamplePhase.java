package io.github.karmasmp.karmaplugin.phase.example;

import io.github.karmasmp.karmaplugin.function.example.*;
import io.github.karmasmp.karmaplugin.lifecycle.ExampleLifecycle;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;

public final class MainExamplePhase extends ExamplePhase implements
        NoBlockBreaking
        , NoBlockExplosion
        , NoBlockPlacing
        , NoDamage
        , NoFallingBlockPlacement
        , NoFoodManagement
        , NoHandItemSwapping
        , NoInteraction
        , NoInventoryManagement
        , NoItemDrop
        , NoItemPickup
        , NoVanillaEntitySpawning {

    public MainExamplePhase(ExampleLifecycle lifecycle) {
        super(lifecycle, Integer.MAX_VALUE);
    }

    @Override
    public void onStart() {
        Bukkit.broadcast(Component.text("The example main phase has started!"));
    }
}
