package daripher.addon.survive.mushrooms.item;

import daripher.addon.survive.mushrooms.config.Config;
import daripher.addon.survive.mushrooms.init.MushroomsBlocks;

public class RedMushroomItem extends MushroomItem {
	public RedMushroomItem() {
		super(MushroomsBlocks.RED_MUSHROOM, Config.COMMON.redMushroomEffects);
	}
}
