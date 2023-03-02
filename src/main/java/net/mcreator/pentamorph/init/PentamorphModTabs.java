
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pentamorph.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PentamorphModTabs {
	public static CreativeModeTab TAB_PENTAMORPH;

	public static void load() {
		TAB_PENTAMORPH = new CreativeModeTab("tabpentamorph") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PentamorphModItems.QUINTUS_TOKEN.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
