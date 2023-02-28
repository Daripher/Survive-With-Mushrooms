package daripher.addon.survive.mushrooms.item;

import daripher.addon.survive.mushrooms.init.MushroomsBlocks;
import net.minecraft.world.food.FoodProperties.Builder;

public class BlackMushroomItem extends MushroomItem {
	public BlackMushroomItem() {
		super(MushroomsBlocks.BLACK_MUSHROOM, new Builder().alwaysEat());
	}
}
