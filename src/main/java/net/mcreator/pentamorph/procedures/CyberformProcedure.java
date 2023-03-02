package net.mcreator.pentamorph.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.pentamorph.entity.QuintessonJurorEntity;

public class CyberformProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof QuintessonJurorEntity) {
			((QuintessonJurorEntity) entity).setAnimation("animation");
		}
	}

	@SubscribeEvent
	public static void skip() {
	}
}
