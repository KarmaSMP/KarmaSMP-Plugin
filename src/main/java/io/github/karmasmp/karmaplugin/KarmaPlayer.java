package io.github.karmasmp.karmaplugin;

import io.github.karmasmp.karmaplugin.lifecycle.PlayerLifecycle;
import io.github.karmasmp.karmaplugin.phase.player.SMPGhostPhase;
import io.github.karmasmp.karmaplugin.phase.player.SMPPlayerPhase;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
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
    private boolean hasJoinedBefore; // I don't trust Bukkit that Player#hasPlayedBefore works the way I want to
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

    public boolean hasJoinedBefore() {
        return hasJoinedBefore;
    }

    public boolean isActiveLives() {
        return activeLives;
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

    public void setJoinedBefore(boolean hasJoinedBefore) {
        this.hasJoinedBefore = hasJoinedBefore;
    }

    public void setLives(int lives) {
        this.lives = lives;

        this.updateLives();
    }

    public void setVelocity(Vector vector) {
        this.player.setVelocity(vector);
    }

    public void teleport(Location location) {
        this.player.teleport(location);
    }

    private void updateLives() {
        if (this.lives > 0 && this.playerLifecycle.getCurrentPhase() instanceof SMPGhostPhase) {
            this.playerLifecycle.forcePhase(new SMPPlayerPhase(this.playerLifecycle));
            this.sendMessage(Component.empty()
                    .append(Component.text("You are now a", NamedTextColor.GREEN))
                    .appendSpace()
                    .append(Component.text("Player", NamedTextColor.DARK_GREEN))
                    .append(Component.text("!", NamedTextColor.GREEN)));
        } else if (this.lives <= 0 && this.playerLifecycle.getCurrentPhase() instanceof SMPPlayerPhase) {
            this.playerLifecycle.forcePhase(new SMPGhostPhase(this.playerLifecycle));
            this.sendMessage(Component.empty()
                    .append(Component.text("You are now a", NamedTextColor.RED))
                    .appendSpace()
                    .append(Component.text("Ghost", NamedTextColor.GRAY))
                    .append(Component.text("!", NamedTextColor.RED)));
        }
    }
}
