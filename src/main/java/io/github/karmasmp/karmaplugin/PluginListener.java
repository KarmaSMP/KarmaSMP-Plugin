package io.github.karmasmp.karmaplugin;

import io.github.karmasmp.karmaplugin.event.PluginEventablePaperFix;
import io.github.karmasmp.karmaplugin.lifecycle.PlayerLifecycle;
import io.github.karmasmp.karmaplugin.lifecycle.PluginLifecycle;
import io.github.karmasmp.karmaplugin.lifecycle.world.WorldLifecycle;
import io.papermc.paper.event.player.AsyncChatEvent;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.entity.*;
import org.bukkit.event.inventory.*;
import org.bukkit.event.player.*;
import org.bukkit.event.raid.RaidFinishEvent;
import org.bukkit.event.raid.RaidSpawnWaveEvent;
import org.bukkit.event.raid.RaidStopEvent;
import org.bukkit.event.raid.RaidTriggerEvent;
import org.bukkit.event.server.*;
import org.bukkit.event.vehicle.*;
import org.bukkit.event.weather.LightningStrikeEvent;
import org.bukkit.event.weather.ThunderChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.event.world.*;
import org.spigotmc.event.entity.EntityDismountEvent;

public final class PluginListener implements Listener, PluginEventablePaperFix {

    private final PluginLifecycle pluginLifecycle;

    public PluginListener(PluginLifecycle pluginLifecycle) {
        this.pluginLifecycle = pluginLifecycle;
    }

    @EventHandler
    public void event(BlockBreakEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());
        
        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockBurnEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockCanBuildEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockCookEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockDamageEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockDispenseArmorEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockDispenseEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockDropItemEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockExpEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockExplodeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockFadeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockFertilizeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockFormEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockFromToEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockGrowEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockIgniteEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        Player player = event.getPlayer();

        if(player == null) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(player);

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockMultiPlaceEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockPhysicsEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockPistonExtendEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockPistonRetractEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockPlaceEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockReceiveGameEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockRedstoneEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockShearEntityEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BlockSpreadEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(CauldronLevelChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityBlockFormEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(FluidLevelChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(LeavesDecayEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(MoistureChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(NotePlayEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(SignChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(SpongeAbsorbEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EnchantItemEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEnchantBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getEnchanter());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PrepareItemEnchantEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEnchantBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getEnchanter());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(AreaEffectCloudApplyEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        // TODO: players
    }

    @EventHandler
    public void event(ArrowBodyCountChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        // TODO: players
    }

    @EventHandler
    public void event(BatToggleSleepEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(CreatureSpawnEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(CreeperPowerEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EnderDragonChangePhaseEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityAirChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityBreakDoorEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityBreedEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityCombustByBlockEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityCombustByEntityEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        // TODO: players
    }

    @EventHandler
    public void event(EntityCombustEvent event) {
        if(event instanceof EntityCombustByBlockEvent) {
            this.event((EntityCombustByBlockEvent) event);
            return;
        } else if(event instanceof EntityCombustByEntityEvent) {
            this.event((EntityCombustByEntityEvent) event);
            return;
        }

        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityDamageByBlockEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityDamageByEntityEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityDamageEvent event) {
        if (event instanceof EntityDamageByBlockEvent) {
            this.event((EntityDamageByBlockEvent) event);
            return;
        }

        if (event instanceof EntityDamageByEntityEvent) {
            this.event((EntityDamageByEntityEvent) event);
            return;
        }

        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityDeathEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        // TODO: players
    }

    @EventHandler
    public void event(EntityDropItemEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        // TODO: players
    }

    @EventHandler
    public void event(EntityEnterBlockEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityEnterLoveModeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityExhaustionEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityExplodeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityChangeBlockEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityPickupItemEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        // TODO: players
    }

    @EventHandler
    public void event(EntityPlaceEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityPortalEnterEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        if(event.getEntity().getType() != EntityType.PLAYER) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getEntity());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityPortalEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        if(event.getEntity().getType() != EntityType.PLAYER) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getEntity());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityPortalExitEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        if(event.getEntity().getType() != EntityType.PLAYER) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getEntity());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityPoseChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityPotionEffectEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        if(event.getEntity().getType() != EntityType.PLAYER) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getEntity());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityRegainHealthEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        if(event.getEntity().getType() != EntityType.PLAYER) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getEntity());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityResurrectEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        if(event.getEntity().getType() != EntityType.PLAYER) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getEntity());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityShootBowEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        if(event.getEntity().getType() != EntityType.PLAYER) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getEntity());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntitySpawnEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntitySpellCastEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityTameEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        if(!(event.getOwner() instanceof Player)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getOwner());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityTargetEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityTargetLivingEntityEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityTeleportEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityToggleGlideEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        if(event.getEntity().getType() != EntityType.PLAYER) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getEntity());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityToggleSwimEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        if(event.getEntity().getType() != EntityType.PLAYER) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getEntity());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityTransformEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntityUnleashEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(ExpBottleEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(ExplosionPrimeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(FireworkExplodeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(FoodLevelChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getEntity());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(HorseJumpEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(ItemDespawnEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(ItemMergeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(ItemSpawnEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(LingeringPotionSplashEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PiglinBarterEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PigZapEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PigZombieAngerEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerLeashEntityEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PotionSplashEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(ProjectileHitEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(ProjectileLaunchEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(SheepDyeWoolEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(SheepRegrowWoolEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(SlimeSplitEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(SpawnerSpawnEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(StriderTemperatureChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(VillagerAcquireTradeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(VillagerCareerChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(VillagerReplenishTradeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BrewEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BrewingStandFuelEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(CraftItemEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWhoClicked().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getWhoClicked());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(FurnaceBurnEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(FurnaceExtractEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(FurnaceSmeltEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(FurnaceStartSmeltEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getBlock().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(InventoryClickEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWhoClicked().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getWhoClicked());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(InventoryCloseEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(InventoryCreativeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWhoClicked().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getWhoClicked());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(InventoryDragEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWhoClicked().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getWhoClicked());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(InventoryMoveItemEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(InventoryOpenEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(InventoryPickupItemEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PrepareAnvilEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PrepareItemCraftEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PrepareSmithingEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(SmithItemEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWhoClicked().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getWhoClicked());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(TradeSelectEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWhoClicked().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getWhoClicked());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(AsyncPlayerPreLoginEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerAdvancementDoneEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerAnimationEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerArmorStandManipulateEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerBedEnterEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerBedLeaveEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerBucketEmptyEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerBucketEntityEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerBucketFillEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerCommandPreprocessEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerCommandSendEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerDropItemEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerEditBookEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerEggThrowEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerExpChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerFishEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerGameModeChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerHarvestBlockEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerChangedMainHandEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerChangedWorldEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerInteractAtEntityEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerInteractEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerItemBreakEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerItemConsumeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerItemDamageEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerItemHeldEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerItemMendEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerJoinEvent event) {
        this.pluginLifecycle.event(event);
        this.pluginLifecycle.getCurrentPhase().event(event);

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        worldLifecycle.event(event);
        worldLifecycle.getCurrentPhase().event(event);

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        playerLifecycle.event(event);
        playerLifecycle.getCurrentPhase().event(event);
    }

    @EventHandler
    public void event(PlayerKickEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerLevelChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerLocaleChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerLoginEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerMoveEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerPortalEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerQuitEvent event) {
        this.pluginLifecycle.event(event);
        this.pluginLifecycle.getCurrentPhase().event(event);

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        worldLifecycle.event(event);
        worldLifecycle.getCurrentPhase().event(event);

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        playerLifecycle.event(event);
        playerLifecycle.getCurrentPhase().event(event);
    }

    @EventHandler
    public void event(PlayerRecipeDiscoverEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerRegisterChannelEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerResourcePackStatusEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerRespawnEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerRiptideEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerShearEntityEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerStatisticIncrementEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerSwapHandItemsEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerTakeLecternBookEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerTeleportEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerToggleFlightEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerToggleSneakEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerToggleSprintEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerUnleashEntityEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerUnregisterChannelEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PlayerVelocityEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(RaidFinishEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(RaidSpawnWaveEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(RaidStopEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(RaidTriggerEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(BroadcastMessageEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(MapInitializeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PluginDisableEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PluginEnableEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(RemoteServerCommandEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(ServerCommandEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(ServerListPingEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(ServerLoadEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(ServiceRegisterEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(ServiceUnregisterEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(TabCompleteEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(VehicleBlockCollisionEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getVehicle().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(VehicleCreateEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getVehicle().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(VehicleDamageEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getVehicle().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(VehicleDestroyEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getVehicle().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(VehicleEnterEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getVehicle().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        if(event.getEntered().getType() != EntityType.PLAYER) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getEntered());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(VehicleEntityCollisionEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getVehicle().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        if(event.getEntity().getType() != EntityType.PLAYER) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getEntity());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(VehicleExitEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getVehicle().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        if(event.getExited().getType() != EntityType.PLAYER) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getExited());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(VehicleMoveEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getVehicle().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(VehicleUpdateEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getVehicle().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(LightningStrikeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(ThunderChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(WeatherChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntitiesLoadEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(EntitiesUnloadEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(GenericGameEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(ChunkLoadEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(ChunkPopulateEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(ChunkUnloadEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(LootGenerateEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(PortalCreateEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(SpawnChangeEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(StructureGrowEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(TimeSkipEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(WorldInitEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(WorldLoadEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(WorldSaveEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    @EventHandler
    public void event(WorldUnloadEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    // Spigot

    @EventHandler
    public void event(EntityDismountEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getEntity().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        if(event.getDismounted().getType() != EntityType.PLAYER) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle((Player) event.getDismounted());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }

    // Paper

    @EventHandler
    public void event(AsyncChatEvent event) {
        if (this.pluginLifecycle.event(event)) {
            return;
        }

        if (this.pluginLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        WorldLifecycle worldLifecycle = this.pluginLifecycle.getWorldLifecycle(event.getPlayer().getWorld());

        if(worldLifecycle.event(event)) {
            return;
        }

        if(worldLifecycle.getCurrentPhase().event(event)) {
            return;
        }

        PlayerLifecycle playerLifecycle = this.pluginLifecycle.getPlayerLifecycle(event.getPlayer());

        if(playerLifecycle.event(event)) {
            return;
        }

        if(playerLifecycle.getCurrentPhase().event(event)) {
            return;
        }
    }
}
