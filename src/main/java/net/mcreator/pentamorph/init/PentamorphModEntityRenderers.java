
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pentamorph.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.pentamorph.client.renderer.QuintessonJurorRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PentamorphModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PentamorphModEntities.QUINTESSON_JUROR.get(), QuintessonJurorRenderer::new);
	}
}
