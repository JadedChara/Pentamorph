
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pentamorph.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.pentamorph.item.QuintusTokenItem;
import net.mcreator.pentamorph.item.DummyItemItem;
import net.mcreator.pentamorph.PentamorphMod;

public class PentamorphModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PentamorphMod.MODID);
	public static final RegistryObject<Item> QUINTESSON_JUROR_SPAWN_EGG = REGISTRY.register("quintesson_juror_spawn_egg",
			() -> new ForgeSpawnEggItem(PentamorphModEntities.QUINTESSON_JUROR, -13421773, -10092544, new Item.Properties().tab(PentamorphModTabs.TAB_PENTAMORPH)));
	public static final RegistryObject<Item> DUMMY_ITEM = REGISTRY.register("dummy_item", () -> new DummyItemItem());
	public static final RegistryObject<Item> QUINTUS_TOKEN = REGISTRY.register("quintus_token", () -> new QuintusTokenItem());
}
