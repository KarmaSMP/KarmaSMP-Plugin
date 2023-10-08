package io.github.karmasmp.karmaplugin.event;

import io.github.karmasmp.karmaplugin.event.entity.EntityDamageByPlayerEvent;
import io.github.karmasmp.karmaplugin.event.player.*;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerDropItemEvent;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerInteractEvent;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerJoinEvent;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerMoveEvent;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerQuitEvent;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerSwapHandItemsEvent;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerToggleFlightEvent;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerToggleSneakEvent;
import io.github.karmasmp.karmaplugin.event.player.KarmaPlayerToggleSprintEvent;
import io.papermc.paper.event.player.AsyncChatEvent;
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

@SuppressWarnings("unused")
public interface PluginEventable {

    // Bukkit
    default boolean event(BlockBurnEvent event) { return false; }
    default boolean event(BlockCanBuildEvent event) { return false; }
    default boolean event(BlockCookEvent event) { return false; }
    default boolean event(BlockDamageEvent event) { return false; }
    default boolean event(BlockDispenseArmorEvent event) { return false; }
    default boolean event(BlockDispenseEvent event) { return false; }
    default boolean event(BlockDropItemEvent event) { return false; }
    default boolean event(BlockExpEvent event) { return false; }
    default boolean event(BlockExplodeEvent event) { return false; }
    default boolean event(BlockFadeEvent event) { return false; }
    default boolean event(BlockFertilizeEvent event) { return false; }
    default boolean event(BlockFormEvent event) { return false; }
    default boolean event(BlockFromToEvent event) { return false; }
    default boolean event(BlockGrowEvent event) { return false; }
    default boolean event(BlockIgniteEvent event) { return false; }
    default boolean event(BlockMultiPlaceEvent event) { return false; }
    default boolean event(BlockPhysicsEvent event) { return false; }
    default boolean event(BlockPistonExtendEvent event) { return false; }
    default boolean event(BlockPistonRetractEvent event) { return false; }
    default boolean event(BlockReceiveGameEvent event) { return false; }
    default boolean event(BlockRedstoneEvent event) { return false; }
    default boolean event(BlockShearEntityEvent event) { return false; }
    default boolean event(BlockSpreadEvent event) { return false; }
    default boolean event(CauldronLevelChangeEvent event) { return false; }
    default boolean event(EntityBlockFormEvent event) { return false; }
    default boolean event(FluidLevelChangeEvent event) { return false; }
    default boolean event(LeavesDecayEvent event) { return false; }
    default boolean event(MoistureChangeEvent event) { return false; }
    default boolean event(NotePlayEvent event) { return false; }
    default boolean event(SignChangeEvent event) { return false; }
    default boolean event(SpongeAbsorbEvent event) { return false; }

    default boolean event(EnchantItemEvent event) { return false; }
    default boolean event(PrepareItemEnchantEvent event) { return false; }

    default boolean event(AreaEffectCloudApplyEvent event) { return false; }
    default boolean event(ArrowBodyCountChangeEvent event) { return false; }
    default boolean event(BatToggleSleepEvent event) { return false; }
    default boolean event(CreatureSpawnEvent event) { return false; }
    default boolean event(CreeperPowerEvent event) { return false; }
    default boolean event(EnderDragonChangePhaseEvent event) { return false; }
    default boolean event(EntityAirChangeEvent event) { return false; }
    default boolean event(EntityBreakDoorEvent event) { return false; }
    default boolean event(EntityBreedEvent event) { return false; }
    default boolean event(EntityCombustByBlockEvent event) { return false; }
    default boolean event(EntityCombustByEntityEvent event) { return false; }
    default boolean event(EntityCombustEvent event) { return false; }
    default boolean event(EntityDamageEvent event) { return false; }
    default boolean event(EntityDamageByBlockEvent event) { return false; }
    default boolean event(EntityDamageByEntityEvent event) { return false; }
    default boolean event(EntityDeathEvent event) { return false; }
    default boolean event(EntityDropItemEvent event) { return false; }
    default boolean event(EntityEnterBlockEvent event) { return false; }
    default boolean event(EntityEnterLoveModeEvent event) { return false; }
    default boolean event(EntityExhaustionEvent event) { return false; }
    default boolean event(EntityExplodeEvent event) { return false; }
    default boolean event(EntityChangeBlockEvent event) { return false; }
    default boolean event(EntityPickupItemEvent event) { return false; }
    default boolean event(EntityPlaceEvent event) { return false; }
    default boolean event(EntityPortalEnterEvent event) { return false; }
    default boolean event(EntityPortalEvent event) { return false; }
    default boolean event(EntityPortalExitEvent event) { return false; }
    default boolean event(EntityPoseChangeEvent event) { return false; }
    default boolean event(EntityPotionEffectEvent event) { return false; }
    default boolean event(EntityRegainHealthEvent event) { return false; }
    default boolean event(EntityResurrectEvent event) { return false; }
    default boolean event(EntityShootBowEvent event) { return false; }
    default boolean event(EntitySpawnEvent event) { return false; }
    default boolean event(EntitySpellCastEvent event) { return false; }
    default boolean event(EntityTameEvent event) { return false; }
    default boolean event(EntityTargetEvent event) { return false; }
    default boolean event(EntityTargetLivingEntityEvent event) { return false; }
    default boolean event(EntityTeleportEvent event) { return false; }
    default boolean event(EntityToggleGlideEvent event) { return false; }
    default boolean event(EntityToggleSwimEvent event) { return false; }
    default boolean event(EntityTransformEvent event) { return false; }
    default boolean event(EntityUnleashEvent event) { return false; }
    default boolean event(ExpBottleEvent event) { return false; }
    default boolean event(ExplosionPrimeEvent event) { return false; }
    default boolean event(FireworkExplodeEvent event) { return false; }
    default boolean event(HorseJumpEvent event) { return false; }
    default boolean event(ItemDespawnEvent event) { return false; }
    default boolean event(ItemMergeEvent event) { return false; }
    default boolean event(ItemSpawnEvent event) { return false; }
    default boolean event(LingeringPotionSplashEvent event) { return false; }
    default boolean event(PiglinBarterEvent event) { return false; }
    default boolean event(PigZapEvent event) { return false; }
    default boolean event(PigZombieAngerEvent event) { return false; }
    default boolean event(PlayerLeashEntityEvent event) { return false; }
    default boolean event(PotionSplashEvent event) { return false; }
    default boolean event(ProjectileHitEvent event) { return false; }
    default boolean event(ProjectileLaunchEvent event) { return false; }
    default boolean event(SheepDyeWoolEvent event) { return false; }
    default boolean event(SheepRegrowWoolEvent event) { return false; }
    default boolean event(SlimeSplitEvent event) { return false; }
    default boolean event(SpawnerSpawnEvent event) { return false; }
    default boolean event(StriderTemperatureChangeEvent event) { return false; }
    default boolean event(VillagerAcquireTradeEvent event) { return false; }
    default boolean event(VillagerCareerChangeEvent event) { return false; }
    default boolean event(VillagerReplenishTradeEvent event) { return false; }

    default boolean event(BrewEvent event) { return false; }
    default boolean event(BrewingStandFuelEvent event) { return false; }
    default boolean event(CraftItemEvent event) { return false; }
    default boolean event(FurnaceBurnEvent event) { return false; }
    default boolean event(FurnaceExtractEvent event) { return false; }
    default boolean event(FurnaceSmeltEvent event) { return false; }
    default boolean event(FurnaceStartSmeltEvent event) { return false; }
    default boolean event(InventoryClickEvent event) { return false; }
    default boolean event(InventoryCloseEvent event) { return false; }
    default boolean event(InventoryCreativeEvent event) { return false; }
    default boolean event(InventoryDragEvent event) { return false; }
    default boolean event(InventoryMoveItemEvent event) { return false; }
    default boolean event(InventoryOpenEvent event) { return false; }
    default boolean event(InventoryPickupItemEvent event) { return false; }
    default boolean event(PrepareAnvilEvent event) { return false; }
    default boolean event(PrepareItemCraftEvent event) { return false; }
    default boolean event(PrepareSmithingEvent event) { return false; }
    default boolean event(SmithItemEvent event) { return false; }
    default boolean event(TradeSelectEvent event) { return false; }

    default boolean event(AsyncPlayerPreLoginEvent event) { return false; }
    default boolean event(PlayerAdvancementDoneEvent event) { return false; }
    default boolean event(PlayerAnimationEvent event) { return false; }
    default boolean event(PlayerArmorStandManipulateEvent event) { return false; }
    default boolean event(PlayerBedEnterEvent event) { return false; }
    default boolean event(PlayerBedLeaveEvent event) { return false; }
    default boolean event(PlayerBucketEmptyEvent event) { return false; }
    default boolean event(PlayerBucketEntityEvent event) { return false; }
    default boolean event(PlayerBucketFillEvent event) { return false; }
    default boolean event(PlayerCommandPreprocessEvent event) { return false; }
    default boolean event(PlayerCommandSendEvent event) { return false; }
    default boolean event(PlayerEditBookEvent event) { return false; }
    default boolean event(PlayerEggThrowEvent event) { return false; }
    default boolean event(PlayerExpChangeEvent event) { return false; }
    default boolean event(PlayerFishEvent event) { return false; }
    default boolean event(PlayerGameModeChangeEvent event) { return false; }
    default boolean event(PlayerHarvestBlockEvent event) { return false; }
    default boolean event(PlayerChangedMainHandEvent event) { return false; }
    default boolean event(PlayerChangedWorldEvent event) { return false; }
    default boolean event(PlayerInteractAtEntityEvent event) { return false; }
    default boolean event(PlayerItemBreakEvent event) { return false; }
    default boolean event(PlayerItemConsumeEvent event) { return false; }
    default boolean event(PlayerItemDamageEvent event) { return false; }
    default boolean event(PlayerItemHeldEvent event) { return false; }
    default boolean event(PlayerItemMendEvent event) { return false; }
    default boolean event(PlayerKickEvent event) { return false; }
    default boolean event(PlayerLevelChangeEvent event) { return false; }
    default boolean event(PlayerLocaleChangeEvent event) { return false; }
    default boolean event(PlayerLoginEvent event) { return false; }
    default boolean event(PlayerPortalEvent event) { return false; }
    default boolean event(PlayerRecipeDiscoverEvent event) { return false; }
    default boolean event(PlayerRegisterChannelEvent event) { return false; }
    default boolean event(PlayerResourcePackStatusEvent event) { return false; }
    default boolean event(PlayerRespawnEvent event) { return false; }
    default boolean event(PlayerRiptideEvent event) { return false; }
    default boolean event(PlayerShearEntityEvent event) { return false; }
    default boolean event(PlayerStatisticIncrementEvent event) { return false; }
    default boolean event(PlayerTakeLecternBookEvent event) { return false; }
    default boolean event(PlayerTeleportEvent event) { return false; }
    default boolean event(PlayerUnleashEntityEvent event) { return false; }
    default boolean event(PlayerUnregisterChannelEvent event) { return false; }
    default boolean event(PlayerVelocityEvent event) { return false; }

    default boolean event(RaidFinishEvent event) { return false; }
    default boolean event(RaidSpawnWaveEvent event) { return false; }
    default boolean event(RaidStopEvent event) { return false; }
    default boolean event(RaidTriggerEvent event) { return false; }

    default boolean event(BroadcastMessageEvent event) { return false; }
    default boolean event(MapInitializeEvent event) { return false; }
    default boolean event(PluginDisableEvent event) { return false; }
    default boolean event(PluginEnableEvent event) { return false; }
    default boolean event(RemoteServerCommandEvent event) { return false; }
    default boolean event(ServerCommandEvent event) { return false; }
    default boolean event(ServerListPingEvent event) { return false; }
    default boolean event(ServerLoadEvent event) { return false; }
    default boolean event(ServiceRegisterEvent event) { return false; }
    default boolean event(ServiceUnregisterEvent event) { return false; }
    default boolean event(TabCompleteEvent event) { return false; }

    default boolean event(VehicleBlockCollisionEvent event) { return false; }
    default boolean event(VehicleCreateEvent event) { return false; }
    default boolean event(VehicleDamageEvent event) { return false; }
    default boolean event(VehicleDestroyEvent event) { return false; }
    default boolean event(VehicleEnterEvent event) { return false; }
    default boolean event(VehicleEntityCollisionEvent event) { return false; }
    default boolean event(VehicleExitEvent event) { return false; }
    default boolean event(VehicleMoveEvent event) { return false; }
    default boolean event(VehicleUpdateEvent event) { return false; }

    default boolean event(LightningStrikeEvent event) { return false; }
    default boolean event(ThunderChangeEvent event) { return false; }
    default boolean event(WeatherChangeEvent event) { return false; }

    default boolean event(EntitiesLoadEvent event) { return false; }
    default boolean event(EntitiesUnloadEvent event) { return false; }
    default boolean event(GenericGameEvent event) { return false; }
    default boolean event(ChunkLoadEvent event) { return false; }
    default boolean event(ChunkPopulateEvent event) { return false; }
    default boolean event(ChunkUnloadEvent event) { return false; }
    default boolean event(LootGenerateEvent event) { return false; }
    default boolean event(PortalCreateEvent event) { return false; }
    default boolean event(SpawnChangeEvent event) { return false; }
    default boolean event(StructureGrowEvent event) { return false; }
    default boolean event(TimeSkipEvent event) { return false; }
    default boolean event(WorldInitEvent event) { return false; }
    default boolean event(WorldLoadEvent event) { return false; }
    default boolean event(WorldSaveEvent event) { return false; }
    default boolean event(WorldUnloadEvent event) { return false; }

    // Spigot
    default boolean event(EntityDismountEvent event) { return false; }

    // Paper
    default boolean event(AsyncChatEvent event) { return false; }

    // Karma
    default boolean event(EntityDamageByPlayerEvent event) { return false; }

    default boolean event(KarmaPlayerBlockBreakEvent event) { return false; }
    default boolean event(KarmaPlayerBlockPlaceEvent event) { return false; }
    default boolean event(KarmaPlayerDamageByBlockEvent event) { return false; }
    default boolean event(KarmaPlayerDamageByEntityEvent event) { return false; }
    default boolean event(KarmaPlayerDamageByPlayerEvent event) { return false; }
    default boolean event(KarmaPlayerDamageEvent event) { return false; }
    default boolean event(KarmaPlayerDropItemEvent event) { return false; }
    default boolean event(KarmaPlayerFoodLevelChangeEvent event) { return false; }
    default boolean event(KarmaPlayerInteractEvent event) { return false; }
    default void event(KarmaPlayerJoinEvent event) {}
    default boolean event(KarmaPlayerMoveEvent event) { return false; }
    default void event(KarmaPlayerQuitEvent event) {}
    default boolean event(KarmaPlayerSwapHandItemsEvent event) { return false; }
    default boolean event(KarmaPlayerToggleFlightEvent event) { return false; }
    default boolean event(KarmaPlayerToggleSneakEvent event) { return false; }
    default boolean event(KarmaPlayerToggleSprintEvent event) { return false; }
}
