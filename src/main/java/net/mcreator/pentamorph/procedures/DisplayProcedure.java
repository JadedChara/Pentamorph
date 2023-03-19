package net.mcreator.pentamorph.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.pentamorph.init.PentamorphModEntities;
import net.mcreator.pentamorph.entity.QuintessonJurorEntity;

public class DisplayProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new QuintessonJurorEntity(PentamorphModEntities.QUINTESSON_JUROR.get(), _level) : null;
	}
}
