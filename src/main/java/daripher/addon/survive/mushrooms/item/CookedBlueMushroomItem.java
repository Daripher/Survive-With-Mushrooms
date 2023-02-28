package daripher.addon.survive.mushrooms.item;

import net.minecraft.world.food.FoodProperties.Builder;

public class CookedBlueMushroomItem extends FoodItem {
	public CookedBlueMushroomItem() {
		super(new Builder().alwaysEat());
	}
}
