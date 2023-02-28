package daripher.addon.survive.mushrooms.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class FoodItem extends Item {
	public FoodItem(FoodProperties.Builder foodPropertiesBuilder) {
		super(new Item.Properties().food(foodPropertiesBuilder.build()).tab(CreativeModeTab.TAB_FOOD));
	}
}
