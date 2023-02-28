package daripher.addon.survive.mushrooms.item;

import daripher.addon.survive.mushrooms.config.Config;
import daripher.addon.survive.mushrooms.init.MushroomsBlocks;

public class BlueMushroomItem extends MushroomItem {
	public BlueMushroomItem() {
		super(MushroomsBlocks.BLUE_MUSHROOM, Config.COMMON.blueMushroomEffects);
	}
}
