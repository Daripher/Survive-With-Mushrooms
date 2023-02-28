package daripher.addon.survive.mushrooms.item;

import com.stereowalker.survive.world.effect.SMobEffects;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties.Builder;

public class CookedWhiteMushroomItem extends FoodItem {
	public CookedWhiteMushroomItem() {
		super(new Builder().alwaysEat().effect(() -> new MobEffectInstance(SMobEffects.COLD_RESISTANCE, 400), 1F));
	}
}
