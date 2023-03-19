package net.mcreator.pentamorph.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pentamorph.entity.QuintessonJurorEntity;

public class QuintessonJurorModel extends AnimatedGeoModel<QuintessonJurorEntity> {
	@Override
	public ResourceLocation getAnimationResource(QuintessonJurorEntity entity) {
		return new ResourceLocation("pentamorph", "animations/quintjuror.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(QuintessonJurorEntity entity) {
		return new ResourceLocation("pentamorph", "geo/quintjuror.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(QuintessonJurorEntity entity) {
		return new ResourceLocation("pentamorph", "textures/entities/" + entity.getTexture() + ".png");
	}

}
