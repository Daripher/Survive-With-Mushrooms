package daripher.addon.survive.mushrooms.item;

import daripher.addon.survive.mushrooms.init.MushroomsEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties.Builder;

public class CookedGreenMushroomItem extends FoodItem {
	public CookedGreenMushroomItem() {
		super(new Builder().alwaysEat().effect(() -> new MobEffectInstance(MushroomsEffects.LESSER_HEALING.get(), 1, 1), 1F));
	}
}
