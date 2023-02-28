package daripher.addon.survive.mushrooms.item;

import com.stereowalker.survive.world.effect.SMobEffects;

import daripher.addon.survive.mushrooms.init.MushroomsBlocks;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties.Builder;

public class RedMushroomItem extends MushroomItem {
	public RedMushroomItem() {
		super(MushroomsBlocks.RED_MUSHROOM, new Builder().alwaysEat().effect(() -> new MobEffectInstance(SMobEffects.HEAT_RESISTANCE, 100), 1F));
	}
}
