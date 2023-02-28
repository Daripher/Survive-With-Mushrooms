package daripher.addon.survive.mushrooms.item;

import net.minecraft.world.food.FoodProperties.Builder;

public class CookedBlackMushroomItem extends FoodItem {
	public CookedBlackMushroomItem() {
		super(new Builder().alwaysEat());
	}
}
