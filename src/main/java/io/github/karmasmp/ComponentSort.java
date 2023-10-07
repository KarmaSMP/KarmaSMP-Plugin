package io.github.karmasmp;

import io.papermc.paper.adventure.PaperAdventure;
import net.kyori.adventure.text.Component;

import java.util.Comparator;
import java.util.Locale;

public class ComponentSort implements Comparator<Component> {

    @Override
    public int compare(Component component1, Component component2) {
        return PaperAdventure.asPlain(component1, Locale.US).compareTo(PaperAdventure.asPlain(component2, Locale.US));
    }
}
