package net.mcreator.pentamorph.init;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.mcreator.pentamorph.entity.spawneggs.GeckoLibSpawnEggs;
import net.mcreator.pentamorph.entity.QuintessonJurorEntity;
import net.mcreator.pentamorph.PentamorphMod;

@Mod.EventBusSubscriber(modid = PentamorphMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PentamorphModGeckoLibEntities {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			GeckoLibSpawnEggs.REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
		});
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			QuintessonJurorEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PentamorphModEntities.QUINTESSON_JUROR.get(), QuintessonJurorEntity.createAttributes().build());
	}
}
