package net.mcreator.pentamorph.entity.spawneggs;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.pentamorph.init.PentamorphModTabs;
import net.mcreator.pentamorph.init.PentamorphModEntities;
import net.mcreator.pentamorph.PentamorphMod;

public class GeckoLibSpawnEggs {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PentamorphMod.MODID);

	public static final RegistryObject<Item> QUINTESSON_JUROR = REGISTRY.register("quintesson_juror_spawn_egg",
			() -> new ForgeSpawnEggItem(PentamorphModEntities.QUINTESSON_JUROR, -13421773, -10092544, new Item.Properties().tab(PentamorphModTabs.TAB_PENTAMORPH)));
}
