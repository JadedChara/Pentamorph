
package net.mcreator.pentamorph.item;


import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;
import net.mcreator.pentamorph.init.PentamorphModTabs;

import net.mcreator.pentamorph.procedures.QuintusTokenRightclickedOnBlockProcedure;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.RenderPlayerEvent.Pre;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;


public class DummyItemItem extends Item {
	public DummyItemItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		
		return InteractionResult.SUCCESS;
	}
}
