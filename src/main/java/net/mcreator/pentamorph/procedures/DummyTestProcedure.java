package net.mcreator.pentamorph.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.pentamorph.network.PentamorphModVariables;

public class DummyTestProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(PentamorphModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PentamorphModVariables.PlayerVariables())).formFinal == false) {
			{
				boolean _setval = true;
				entity.getCapability(PentamorphModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.formFinal = _setval;
					capability.syncPlayerVariables(entity);
				});
			} /*code*/
			{
				String _setval = "blep";
				entity.getCapability(PentamorphModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.characterType = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
