
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pentamorph.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.pentamorph.item.QuintusTokenItem;
import net.mcreator.pentamorph.item.DummyItemItem;
import net.mcreator.pentamorph.PentamorphMod;

public class PentamorphModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PentamorphMod.MODID);
	public static final RegistryObject<Item> DUMMY_ITEM = REGISTRY.register("dummy_item", () -> new DummyItemItem());
	public static final RegistryObject<Item> QUINTUS_TOKEN = REGISTRY.register("quintus_token", () -> new QuintusTokenItem());
}
