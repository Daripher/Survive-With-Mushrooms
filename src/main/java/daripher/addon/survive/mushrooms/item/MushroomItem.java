package daripher.addon.survive.mushrooms.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class MushroomItem extends BlockItem
{
	public MushroomItem(Block block, FoodProperties foodProperties)
	{
		super(block, new Item.Properties().food(foodProperties).tab(CreativeModeTab.TAB_DECORATIONS));
	}
}
