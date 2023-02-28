package daripher.addon.survive.mushrooms.item;

import daripher.addon.survive.mushrooms.init.MushroomsBlocks;
import daripher.addon.survive.mushrooms.init.MushroomsEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties.Builder;

public class GreenMushroomItem extends MushroomItem {
	public GreenMushroomItem() {
		super(MushroomsBlocks.GREEN_MUSHROOM, new Builder().alwaysEat().effect(() -> new MobEffectInstance(MushroomsEffects.LESSER_HEALING.get(), 1), 1F));
	}
}
