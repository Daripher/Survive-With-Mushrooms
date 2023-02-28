package daripher.addon.survive.mushrooms.item;

import daripher.addon.survive.mushrooms.config.Config;
import daripher.addon.survive.mushrooms.init.MushroomsBlocks;

public class GreenMushroomItem extends MushroomItem {
	public GreenMushroomItem() {
		super(MushroomsBlocks.GREEN_MUSHROOM, Config.COMMON.greenMushroomEffects);
	}
}
