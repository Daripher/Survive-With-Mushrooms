package daripher.addon.survive.mushrooms.item;

import daripher.addon.survive.mushrooms.init.MushroomsBlocks;
import net.minecraft.world.food.FoodProperties.Builder;

public class BlueMushroomItem extends MushroomItem {
	public BlueMushroomItem() {
		super(MushroomsBlocks.BLUE_MUSHROOM, new Builder().alwaysEat());
	}
}
