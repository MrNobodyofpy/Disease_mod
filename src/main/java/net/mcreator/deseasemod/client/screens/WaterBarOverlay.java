
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
			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/full_w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/0w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/1w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/2w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/3w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/4w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/5w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/6w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/7w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/8w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/9w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/10w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/11w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/12w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/13w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/14.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/15w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/16w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/17w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/18w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

			event.getGuiGraphics().blit(new ResourceLocation("desease_mod:textures/screens/19w.png"), w / 2 + 10, h / 2 + 70, 0, 0, 79, 9, 79, 9);

		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
