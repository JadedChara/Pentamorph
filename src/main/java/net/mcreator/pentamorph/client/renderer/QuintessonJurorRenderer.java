
package net.mcreator.pentamorph.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pentamorph.entity.model.QuintessonJurorModel;
import net.mcreator.pentamorph.entity.QuintessonJurorEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class QuintessonJurorRenderer extends GeoEntityRenderer<QuintessonJurorEntity> {
	public QuintessonJurorRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new QuintessonJurorModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(QuintessonJurorEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
