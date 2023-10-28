package io.github.karmasmp.karmaplugin;

import org.bukkit.Sound;
import org.bukkit.SoundCategory;

public class KarmaSound {

    private final SoundCategory category;
    private final float pitch;
    private final Sound sound;
    private final float volume;

    public KarmaSound(Sound sound, SoundCategory soundCategory, float pitch, float volume) {
        this.sound = sound;
        this.category = soundCategory;
        this.pitch = pitch;
        this.volume = volume;
    }

    public SoundCategory getCategory() {
        return category;
    }

    public float getPitch() {
        return pitch;
    }

    public Sound getSound() {
        return sound;
    }

    public float getVolume() {
        return volume;
    }
}
