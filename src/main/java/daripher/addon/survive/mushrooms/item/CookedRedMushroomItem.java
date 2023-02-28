package daripher.addon.survive.mushrooms.item;

import com.stereowalker.survive.world.effect.SMobEffects;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties.Builder;

public class CookedRedMushroomItem extends FoodItem {
	public CookedRedMushroomItem() {
		super(new Builder().alwaysEat().effect(() -> new MobEffectInstance(SMobEffects.HEAT_RESISTANCE, 400), 1F));
	}
}
