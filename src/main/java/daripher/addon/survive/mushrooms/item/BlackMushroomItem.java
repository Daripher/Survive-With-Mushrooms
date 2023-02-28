package daripher.addon.survive.mushrooms.item;

import daripher.addon.survive.mushrooms.config.Config;
import daripher.addon.survive.mushrooms.init.MushroomsBlocks;

public class BlackMushroomItem extends MushroomItem {
	public BlackMushroomItem() {
		super(MushroomsBlocks.BLACK_MUSHROOM, Config.COMMON.blackMushroomEffects);
	}
}
