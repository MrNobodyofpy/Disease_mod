package net.mcreator.deseasemod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.deseasemod.network.DeseaseModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WaterplayertickupdateProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.isSwimming() || entity.isSprinting()) && (entity.getLookAngle().x != 0 || entity.getLookAngle().y != 0 || entity.getLookAngle().z != 0)) {
			if ((entity.getCapability(DeseaseModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DeseaseModModVariables.PlayerVariables())).water_timer > 0) {
				{
					double _setval = (entity.getCapability(DeseaseModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DeseaseModModVariables.PlayerVariables())).water_timer - 1;
					entity.getCapability(DeseaseModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.water_timer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = 800;
					entity.getCapability(DeseaseModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.water_timer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(DeseaseModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DeseaseModModVariables.PlayerVariables())).water_amount > 0) {
					{
						double _setval = (entity.getCapability(DeseaseModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DeseaseModModVariables.PlayerVariables())).water_amount - 1;
						entity.getCapability(DeseaseModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.water_amount = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		} else if (entity.getLookAngle().x != 0 || entity.getLookAngle().y != 0 || entity.getLookAngle().z != 0) {
			if ((entity.getCapability(DeseaseModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DeseaseModModVariables.PlayerVariables())).water_timer > 0) {
				{
					double _setval = (entity.getCapability(DeseaseModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DeseaseModModVariables.PlayerVariables())).water_timer - 0.5;
					entity.getCapability(DeseaseModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.water_timer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = 800;
					entity.getCapability(DeseaseModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.water_timer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(DeseaseModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DeseaseModModVariables.PlayerVariables())).water_amount > 0) {
					{
						double _setval = (entity.getCapability(DeseaseModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DeseaseModModVariables.PlayerVariables())).water_amount - 1;
						entity.getCapability(DeseaseModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.water_amount = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
		if ((entity.getCapability(DeseaseModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DeseaseModModVariables.PlayerVariables())).water_amount == 0) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.STARVE)), 2);
		}
	}
}
