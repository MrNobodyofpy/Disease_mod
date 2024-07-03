package net.mcreator.deseasemod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.deseasemod.network.DeseaseModModVariables;

public class Thirstbardisplaycondition20Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(DeseaseModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DeseaseModModVariables.PlayerVariables())).water_amount >= 20) {
			return true;
		}
		return false;
	}
}
