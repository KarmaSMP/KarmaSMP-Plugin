package io.github.karmasmp.karmaplugin.event.player;

import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import net.kyori.adventure.text.Component;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class KarmaPlayerDeathEvent extends KarmaPlayerEvent {

    private final PlayerDeathEvent event;

    public KarmaPlayerDeathEvent(PlayerDeathEvent event, PluginLifecycle pluginLifecycle) {
        super(event.getPlayer(), pluginLifecycle);

        this.event = event;
    }

    public Component deathMessage() {
        return this.event.deathMessage();
    }

    public void deathMessage(Component deathMessage) {
        this.event.deathMessage(deathMessage);
    }

    public Sound getDeathSound() {
        return event.getDeathSound();
    }

    public SoundCategory getDeathSoundCategory() {
        return event.getDeathSoundCategory();
    }

    public float getDeathSoundPitch() {
        return event.getDeathSoundPitch();
    }

    public float getDeathSoundVolume() {
        return event.getDeathSoundVolume();
    }

    public int getDroppedExp() {
        return event.getDroppedExp();
    }

    public List<ItemStack> getDrops() {
        return event.getDrops();
    }

    public List<ItemStack> getItemsToKeep() {
        return event.getItemsToKeep();
    }

    public boolean getKeepInventory() {
        return event.getKeepInventory();
    }

    public boolean getKeepLevel() {
        return event.getKeepLevel();
    }

    public int getNewExp() {
        return event.getNewExp();
    }

    public int getNewLevel() {
        return event.getNewLevel();
    }

    public int getNewTotalExp() {
        return event.getNewTotalExp();
    }

    public double getReviveHealth() {
        return event.getReviveHealth();
    }

    public boolean isCancelled() {
        return event.isCancelled();
    }

    public boolean shouldDropExperience() {
        return event.shouldDropExperience();
    }

    public boolean shouldPlayDeathSound() {
        return event.shouldPlayDeathSound();
    }

    public void setCancelled(boolean cancel) {
        this.event.setCancelled(cancel);
    }

    public void setDeathSound(Sound sound) {
        this.event.setDeathSound(sound);
    }

    public void setDeathSoundCategory(SoundCategory soundCategory) {
        this.event.setDeathSoundCategory(soundCategory);
    }

    public void setDeathSoundPitch(float pitch) {
        this.event.setDeathSoundPitch(pitch);
    }

    public void setDeathSoundVolume(float volume) {
        this.event.setDeathSoundVolume(volume);
    }

    public void setDroppedExp(int exp) {
        this.event.setDroppedExp(exp);
    }

    public void setKeepInventory(boolean keepInventory) {
        this.event.setKeepInventory(keepInventory);
    }

    public void setKeepLevel(boolean keepLevel) {
        this.event.setKeepLevel(keepLevel);
    }

    public void setNewExp(int exp) {
        this.event.setNewExp(exp);
    }

    public void setNewLevel(int level) {
        this.event.setNewLevel(level);
    }

    public void setNewTotalExp(int totalExp) {
        this.event.setNewTotalExp(totalExp);
    }

    public void setReviveHealth(double reviveHealth) {
        this.event.setReviveHealth(reviveHealth);
    }

    public void setShouldDropExperience(boolean doExpDrop) {
        this.event.setShouldDropExperience(doExpDrop);
    }

    public void setShouldPlayDeathSound(boolean playDeathSound) {
        this.event.setShouldPlayDeathSound(playDeathSound);
    }
}
