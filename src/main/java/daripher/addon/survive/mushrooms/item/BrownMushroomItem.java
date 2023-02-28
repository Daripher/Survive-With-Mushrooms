package daripher.addon.survive.mushrooms.item;

import daripher.addon.survive.mushrooms.init.MushroomsBlocks;
import net.minecraft.world.food.FoodProperties.Builder;

public class BrownMushroomItem extends MushroomItem {
	public BrownMushroomItem() {
		super(MushroomsBlocks.BROWN_MUSHROOM, new Builder().alwaysEat());
	}
}
