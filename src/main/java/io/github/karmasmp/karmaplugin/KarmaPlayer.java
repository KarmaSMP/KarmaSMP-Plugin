package io.github.karmasmp.karmaplugin;

import io.github.karmasmp.karmaplugin.lifecycle.PlayerLifecycle;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.title.Title;
import net.kyori.adventure.title.TitlePart;
import net.kyori.adventure.util.Ticks;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import java.util.UUID;

public class KarmaPlayer {

    private boolean activeLives;
    private boolean isGhost;
    private int lives;
    private final Player player;
    private final PlayerLifecycle playerLifecycle;

    public KarmaPlayer(Player player, PlayerLifecycle playerLifecycle) {
        this.player = player;
        this.playerLifecycle = playerLifecycle;
    }

    public void addPotionEffect(PotionEffectType type, int duration, int amplifier) {
        this.player.addPotionEffect(new PotionEffect(type, duration, amplifier, false, false, false));
    }

    public void closeInventory() {
        this.player.closeInventory();
    }

    public EntityEquipment getEquipment() {
        return player.getEquipment();
    }

    public Inventory getInventory() {
        return player.getInventory();
    }

    public int getLives() {
        return lives;
    }

    public PlayerLifecycle getLifecycle() {
        return playerLifecycle;
    }

    public Location getLocation() {
        return player.getLocation();
    }

    public String getName() {
        return player.getName();
    }

    public UUID getUniqueId() {
        return player.getUniqueId();
    }

    public World getWorld() {
        return player.getWorld();
    }

    public boolean isActiveLives() {
        return activeLives;
    }

    public boolean isGhost() {
        return isGhost;
    }

    public boolean isOp() {
        return player.isOp();
    }

    public void openInventory(Inventory inventory) {
        this.player.openInventory(inventory);
    }

    public void playSound(Location location, KarmaSound karmaSound) {
        this.player.playSound(location, karmaSound.getSound(), karmaSound.getCategory(), karmaSound.getVolume(), karmaSound.getPitch());
    }

    public void playSound(KarmaSound karmaSound) {
        this.player.playSound(this.player.getLocation(), karmaSound.getSound(), karmaSound.getCategory(), karmaSound.getVolume(), karmaSound.getPitch());
    }

    public void sendActionBar(Component message) {
        this.player.sendActionBar(message);
    }

    public void sendMessage(Component message) {
        this.player.sendMessage(message);
    }

    public void sendPlayerList(Component header, Component footer) {
        this.player.sendPlayerListHeaderAndFooter(header, footer);
    }

    public void sendTitle(Component title, Component subtitle, int fadeIn, int stay, int fadeOut) {
        this.player.sendTitlePart(TitlePart.TIMES, Title.Times.times(Ticks.duration(fadeIn), Ticks.duration(stay), Ticks.duration(fadeOut)));
        this.player.sendTitlePart(TitlePart.TITLE, title);
        this.player.sendTitlePart(TitlePart.SUBTITLE, subtitle);
    }

    public void setActiveLives(boolean activeLives) {
        this.activeLives = activeLives;
    }

    public void setGameMode(GameMode gameMode) {
        this.player.setGameMode(gameMode);
    }

    public void setGhost(boolean isGhost) {
        this.isGhost = isGhost;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setVelocity(Vector vector) {
        this.player.setVelocity(vector);
    }

    public void teleport(Location location) {
        this.player.teleport(location);
    }
}
