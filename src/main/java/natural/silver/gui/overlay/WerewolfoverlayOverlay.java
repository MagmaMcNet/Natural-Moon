
package natural.silver.gui.overlay;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import natural.silver.procedures.WerewolfoverlayDisplayOverlayIngameProcedure;
import natural.silver.NaturalmoonModElements;

import com.mojang.blaze3d.platform.GlStateManager;

import com.google.common.collect.ImmutableMap;

@NaturalmoonModElements.ModElement.Tag
public class WerewolfoverlayOverlay extends NaturalmoonModElements.ModElement {
	public WerewolfoverlayOverlay(NaturalmoonModElements instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.HIGH)
	public void eventHandler(RenderGameOverlayEvent event) {
		if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int posX = (event.getWindow().getScaledWidth()) / 2;
			int posY = (event.getWindow().getScaledHeight()) / 2;
			PlayerEntity entity = Minecraft.getInstance().player;
			World world = entity.world;
			double x = entity.posX;
			double y = entity.posY;
			double z = entity.posZ;
			if (WerewolfoverlayDisplayOverlayIngameProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
				GlStateManager.disableDepthTest();
				GlStateManager.depthMask(false);
				GlStateManager.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
						GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
				GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				GlStateManager.disableAlphaTest();
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("naturalmoon:textures/werewolf_overlay.png"));
				Minecraft.getInstance().ingameGUI.blit(0, 0, 0, 0, event.getWindow().getScaledWidth(), event.getWindow().getScaledHeight(),
						event.getWindow().getScaledWidth(), event.getWindow().getScaledHeight());
				GlStateManager.depthMask(true);
				GlStateManager.enableDepthTest();
				GlStateManager.enableAlphaTest();
				GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
			}
		}
	}
}
