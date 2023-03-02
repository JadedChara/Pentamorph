package net.mcreator.pentamorph.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.pentamorph.network.PentamorphModVariables;

public class DummyTestProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(PentamorphModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PentamorphModVariables.PlayerVariables())).characterType).equals("Juror")) {/*code*/
		}
	}
}
