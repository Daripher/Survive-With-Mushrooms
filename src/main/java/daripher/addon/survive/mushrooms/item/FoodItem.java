package daripher.addon.survive.mushrooms.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class FoodItem extends Item
{
	public FoodItem(FoodProperties foodProperties)
	{
		super(new Item.Properties().food(foodProperties).tab(CreativeModeTab.TAB_FOOD));
	}
}
