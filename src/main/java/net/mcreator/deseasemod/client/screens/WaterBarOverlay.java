
package net.mcreator.deseasemod.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition9Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition8Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition7Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition6Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition5Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition4Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition3Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition2Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition20Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition1Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition19Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition18Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition17Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition16Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition15Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition14Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition13Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition12Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition11Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition10Procedure;
import net.mcreator.deseasemod.procedures.Thirstbardisplaycondition0Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class WaterBarOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			if (Thirstbardisplaycondition20Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/full_w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition0Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/0w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/1w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/2w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/3w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/4w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/5w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/6w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/7w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/8w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/9w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/10w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition11Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/11w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition12Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/12w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition13Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/13w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition14Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/14.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition15Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/15w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition16Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/16w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition17Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/17w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition18Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/18w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
			if (Thirstbardisplaycondition19Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/19w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
