package daripher.addon.survive.mushrooms.item;

import daripher.addon.survive.mushrooms.config.Config;
import daripher.addon.survive.mushrooms.init.MushroomsBlocks;

public class WhiteMushroomItem extends MushroomItem {
	public WhiteMushroomItem() {
		super(MushroomsBlocks.WHITE_MUSHROOM, Config.COMMON.whiteMushroomEffects);
	}
}
