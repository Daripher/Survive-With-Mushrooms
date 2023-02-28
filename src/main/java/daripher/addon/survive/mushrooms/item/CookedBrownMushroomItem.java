package daripher.addon.survive.mushrooms.item;

import net.minecraft.world.food.FoodProperties.Builder;

public class CookedBrownMushroomItem extends FoodItem {
	public CookedBrownMushroomItem() {
		super(new Builder().alwaysEat());
	}
}
