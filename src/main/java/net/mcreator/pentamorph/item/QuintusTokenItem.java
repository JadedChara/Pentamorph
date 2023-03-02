
package net.mcreator.pentamorph.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.pentamorph.procedures.DummyTestProcedure;
import net.mcreator.pentamorph.init.PentamorphModTabs;

import java.util.List;

public class QuintusTokenItem extends Item {
	public QuintusTokenItem() {
		super(new Item.Properties().tab(PentamorphModTabs.TAB_PENTAMORPH).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("What does it truly do?"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		DummyTestProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
