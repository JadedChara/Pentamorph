package net.mcreator.pentamorph.network;

import net.mcreator.pentamorph.PentamorphMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry.ChannelBuilder;

 

//Handles Data Transmission, registering, and encoding
public class Networking {
	/*private static final String DNAVI = "1.0.0";
	private static final SimpleChannel AXIOMNEXUS = NetworkRegistry.ChannelBuilder
		.named(new ResourceLocation(PentamorphMod.MODID, "network"))
		.clientAcceptedVersions(DNAVI::equals)
        .serverAcceptedVersions(DNAVI::equals)
        .networkProtocolVersion(() -> DNAVI)
        .simpleChannel();
	public static void init() {
		int verID = 0;
		Networking.AXIOMNEXUS.registerMessage(verID++, SyncData.class, SyncData::encode, SyncData::new, SyncData::handle);
	}*/
}
