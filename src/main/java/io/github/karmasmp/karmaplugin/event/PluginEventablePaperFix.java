package io.github.karmasmp.karmaplugin.event;

import io.github.karmasmp.karmaplugin.event.player.*;
import io.papermc.paper.event.player.AsyncChatEvent;
import org.bukkit.event.block.*;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.entity.*;
import org.bukkit.event.inventory.*;
import org.bukkit.event.player.*;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
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
public interface PluginEventablePaperFix {

    // Bukkit
    default void event(BlockBreakEvent event) {}
    default void event(BlockBurnEvent event) {}
    default void event(BlockCanBuildEvent event) {}
    default void event(BlockCookEvent event) {}
    default void event(BlockDamageEvent event) {}
    default void event(BlockDispenseArmorEvent event) {}
    default void event(BlockDispenseEvent event) {}
    default void event(BlockDropItemEvent event) {}
    default void event(BlockExpEvent event) {}
    default void event(BlockExplodeEvent event) {}
    default void event(BlockFadeEvent event) {}
    default void event(BlockFertilizeEvent event) {}
    default void event(BlockFormEvent event) {}
    default void event(BlockFromToEvent event) {}
    default void event(BlockGrowEvent event) {}
    default void event(BlockIgniteEvent event) {}
    default void event(BlockMultiPlaceEvent event) {}
    default void event(BlockPhysicsEvent event) {}
    default void event(BlockPistonExtendEvent event) {}
    default void event(BlockPistonRetractEvent event) {}
    default void event(BlockPlaceEvent event) {}
    default void event(BlockReceiveGameEvent event) {}
    default void event(BlockRedstoneEvent event) {}
    default void event(BlockShearEntityEvent event) {}
    default void event(BlockSpreadEvent event) {}
    default void event(CauldronLevelChangeEvent event) {}
    default void event(EntityBlockFormEvent event) {}
    default void event(FluidLevelChangeEvent event) {}
    default void event(LeavesDecayEvent event) {}
    default void event(MoistureChangeEvent event) {}
    default void event(NotePlayEvent event) {}
    default void event(SignChangeEvent event) {}
    default void event(SpongeAbsorbEvent event) {}

    default void event(EnchantItemEvent event) {}
    default void event(PrepareItemEnchantEvent event) {}

    default void event(AreaEffectCloudApplyEvent event) {}
    default void event(ArrowBodyCountChangeEvent event) {}
    default void event(BatToggleSleepEvent event) {}
    default void event(CreatureSpawnEvent event) {}
    default void event(CreeperPowerEvent event) {}
    default void event(EnderDragonChangePhaseEvent event) {}
    default void event(EntityAirChangeEvent event) {}
    default void event(EntityBreakDoorEvent event) {}
    default void event(EntityBreedEvent event) {}
    default void event(EntityCombustByBlockEvent event) {}
    default void event(EntityCombustByEntityEvent event) {}
    default void event(EntityCombustEvent event) {}
    default void event(EntityDamageEvent event) {}
    default void event(EntityDamageByBlockEvent event) {}
    default void event(EntityDamageByEntityEvent event) {}
    default void event(EntityDeathEvent event) {}
    default void event(EntityDropItemEvent event) {}
    default void event(EntityEnterBlockEvent event) {}
    default void event(EntityEnterLoveModeEvent event) {}
    default void event(EntityExhaustionEvent event) {}
    default void event(EntityExplodeEvent event) {}
    default void event(EntityChangeBlockEvent event) {}
    default void event(EntityPickupItemEvent event) {}
    default void event(EntityPlaceEvent event) {}
    default void event(EntityPortalEnterEvent event) {}
    default void event(EntityPortalEvent event) {}
    default void event(EntityPortalExitEvent event) {}
    default void event(EntityPoseChangeEvent event) {}
    default void event(EntityPotionEffectEvent event) {}
    default void event(EntityRegainHealthEvent event) {}
    default void event(EntityResurrectEvent event) {}
    default void event(EntityShootBowEvent event) {}
    default void event(EntitySpawnEvent event) {}
    default void event(EntitySpellCastEvent event) {}
    default void event(EntityTameEvent event) {}
    default void event(EntityTargetEvent event) {}
    default void event(EntityTargetLivingEntityEvent event) {}
    default void event(EntityTeleportEvent event) {}
    default void event(EntityToggleGlideEvent event) {}
    default void event(EntityToggleSwimEvent event) {}
    default void event(EntityTransformEvent event) {}
    default void event(EntityUnleashEvent event) {}
    default void event(ExpBottleEvent event) {}
    default void event(ExplosionPrimeEvent event) {}
    default void event(FireworkExplodeEvent event) {}
    default void event(FoodLevelChangeEvent event) {}
    default void event(HorseJumpEvent event) {}
    default void event(ItemDespawnEvent event) {}
    default void event(ItemMergeEvent event) {}
    default void event(ItemSpawnEvent event) {}
    default void event(LingeringPotionSplashEvent event) {}
    default void event(PiglinBarterEvent event) {}
    default void event(PigZapEvent event) {}
    default void event(PigZombieAngerEvent event) {}
    default void event(PlayerLeashEntityEvent event) {}
    default void event(PotionSplashEvent event) {}
    default void event(ProjectileHitEvent event) {}
    default void event(ProjectileLaunchEvent event) {}
    default void event(SheepDyeWoolEvent event) {}
    default void event(SheepRegrowWoolEvent event) {}
    default void event(SlimeSplitEvent event) {}
    default void event(SpawnerSpawnEvent event) {}
    default void event(StriderTemperatureChangeEvent event) {}
    default void event(VillagerAcquireTradeEvent event) {}
    default void event(VillagerCareerChangeEvent event) {}
    default void event(VillagerReplenishTradeEvent event) {}

    default void event(BrewEvent event) {}
    default void event(BrewingStandFuelEvent event) {}
    default void event(CraftItemEvent event) {}
    default void event(FurnaceBurnEvent event) {}
    default void event(FurnaceExtractEvent event) {}
    default void event(FurnaceSmeltEvent event) {}
    default void event(FurnaceStartSmeltEvent event) {}
    default void event(InventoryClickEvent event) {}
    default void event(InventoryCloseEvent event) {}
    default void event(InventoryCreativeEvent event) {}
    default void event(InventoryDragEvent event) {}
    default void event(InventoryMoveItemEvent event) {}
    default void event(InventoryOpenEvent event) {}
    default void event(InventoryPickupItemEvent event) {}
    default void event(PrepareAnvilEvent event) {}
    default void event(PrepareItemCraftEvent event) {}
    default void event(PrepareSmithingEvent event) {}
    default void event(SmithItemEvent event) {}
    default void event(TradeSelectEvent event) {}

    default void event(AsyncPlayerPreLoginEvent event) {}
    default void event(PlayerAdvancementDoneEvent event) {}
    default void event(PlayerAnimationEvent event) {}
    default void event(PlayerArmorStandManipulateEvent event) {}
    default void event(PlayerBedEnterEvent event) {}
    default void event(PlayerBedLeaveEvent event) {}
    default void event(PlayerBucketEmptyEvent event) {}
    default void event(PlayerBucketEntityEvent event) {}
    default void event(PlayerBucketFillEvent event) {}
    default void event(PlayerCommandPreprocessEvent event) {}
    default void event(PlayerCommandSendEvent event) {}
    default void event(PlayerDropItemEvent event) {}
    default void event(PlayerEditBookEvent event) {}
    default void event(PlayerEggThrowEvent event) {}
    default void event(PlayerExpChangeEvent event) {}
    default void event(PlayerFishEvent event) {}
    default void event(PlayerGameModeChangeEvent event) {}
    default void event(PlayerHarvestBlockEvent event) {}
    default void event(PlayerChangedMainHandEvent event) {}
    default void event(PlayerChangedWorldEvent event) {}
    default void event(PlayerInteractAtEntityEvent event) {}
    default void event(PlayerInteractEvent event) {}
    default void event(PlayerItemBreakEvent event) {}
    default void event(PlayerItemConsumeEvent event) {}
    default void event(PlayerItemDamageEvent event) {}
    default void event(PlayerItemHeldEvent event) {}
    default void event(PlayerItemMendEvent event) {}
    default void event(PlayerJoinEvent event) {}
    default void event(PlayerKickEvent event) {}
    default void event(PlayerLevelChangeEvent event) {}
    default void event(PlayerLocaleChangeEvent event) {}
    default void event(PlayerLoginEvent event) {}
    default void event(PlayerMoveEvent event) {}
    default void event(PlayerPortalEvent event) {}
    default void event(PlayerQuitEvent event) {}
    default void event(PlayerRecipeDiscoverEvent event) {}
    default void event(PlayerRegisterChannelEvent event) {}
    default void event(PlayerResourcePackStatusEvent event) {}
    default void event(PlayerRespawnEvent event) {}
    default void event(PlayerRiptideEvent event) {}
    default void event(PlayerShearEntityEvent event) {}
    default void event(PlayerStatisticIncrementEvent event) {}
    default void event(PlayerSwapHandItemsEvent event) {}
    default void event(PlayerTakeLecternBookEvent event) {}
    default void event(PlayerTeleportEvent event) {}
    default void event(PlayerToggleFlightEvent event) {}
    default void event(PlayerToggleSneakEvent event) {}
    default void event(PlayerToggleSprintEvent event) {}
    default void event(PlayerUnleashEntityEvent event) {}
    default void event(PlayerUnregisterChannelEvent event) {}
    default void event(PlayerVelocityEvent event) {}

    default void event(RaidFinishEvent event) {}
    default void event(RaidSpawnWaveEvent event) {}
    default void event(RaidStopEvent event) {}
    default void event(RaidTriggerEvent event) {}

    default void event(BroadcastMessageEvent event) {}
    default void event(MapInitializeEvent event) {}
    default void event(PluginDisableEvent event) {}
    default void event(PluginEnableEvent event) {}
    default void event(RemoteServerCommandEvent event) {}
    default void event(ServerCommandEvent event) {}
    default void event(ServerListPingEvent event) {}
    default void event(ServerLoadEvent event) {}
    default void event(ServiceRegisterEvent event) {}
    default void event(ServiceUnregisterEvent event) {}
    default void event(TabCompleteEvent event) {}

    default void event(VehicleBlockCollisionEvent event) {}
    default void event(VehicleCreateEvent event) {}
    default void event(VehicleDamageEvent event) {}
    default void event(VehicleDestroyEvent event) {}
    default void event(VehicleEnterEvent event) {}
    default void event(VehicleEntityCollisionEvent event) {}
    default void event(VehicleExitEvent event) {}
    default void event(VehicleMoveEvent event) {}
    default void event(VehicleUpdateEvent event) {}

    default void event(LightningStrikeEvent event) {}
    default void event(ThunderChangeEvent event) {}
    default void event(WeatherChangeEvent event) {}

    default void event(EntitiesLoadEvent event) {}
    default void event(EntitiesUnloadEvent event) {}
    default void event(GenericGameEvent event) {}
    default void event(ChunkLoadEvent event) {}
    default void event(ChunkPopulateEvent event) {}
    default void event(ChunkUnloadEvent event) {}
    default void event(LootGenerateEvent event) {}
    default void event(PortalCreateEvent event) {}
    default void event(SpawnChangeEvent event) {}
    default void event(StructureGrowEvent event) {}
    default void event(TimeSkipEvent event) {}
    default void event(WorldInitEvent event) {}
    default void event(WorldLoadEvent event) {}
    default void event(WorldSaveEvent event) {}
    default void event(WorldUnloadEvent event) {}

    // Spigot
    default void event(EntityDismountEvent event) {}

    // Paper
    default void event(AsyncChatEvent event) {}

    // Karma
    default void event(io.github.karmasmp.karmaplugin.event.entity.EntityDamageByPlayerEvent event) {}

    default void event(KarmaPlayerBlockBreakEvent event) {}
    default void event(KarmaPlayerBlockPlaceEvent event) {}
    default void event(KarmaPlayerDamageByBlockEvent event) {}
    default void event(KarmaPlayerDamageByEntityEvent event) {}
    default void event(KarmaPlayerDamageByPlayerEvent event) {}
    default void event(KarmaPlayerDamageEvent event) {}
    default void event(KarmaPlayerDropItemEvent event) {}
    default void event(KarmaPlayerFoodLevelChangeEvent event) {}
    default void event(KarmaPlayerInteractEvent event) {}
    default void event(KarmaPlayerJoinEvent event) {}
    default void event(KarmaPlayerMoveEvent event) {}
    default void event(KarmaPlayerQuitEvent event) {}
    default void event(KarmaPlayerSwapHandItemsEvent event) {}
    default void event(KarmaPlayerToggleFlightEvent event) {}
    default void event(KarmaPlayerToggleSneakEvent event) {}
    default void event(KarmaPlayerToggleSprintEvent event) {}
}
