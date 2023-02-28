package daripher.addon.survive.mushrooms.item;

import daripher.addon.survive.mushrooms.config.Config;
import daripher.addon.survive.mushrooms.init.MushroomsBlocks;

public class BrownMushroomItem extends MushroomItem {
	public BrownMushroomItem() {
		super(MushroomsBlocks.BROWN_MUSHROOM, Config.COMMON.brownMushroomEffects);
	}
}
