package daripher.addon.survive.mushrooms.item;

import com.stereowalker.survive.world.effect.SMobEffects;

import daripher.addon.survive.mushrooms.init.MushroomsBlocks;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties.Builder;

public class WhiteMushroomItem extends MushroomItem {
	public WhiteMushroomItem() {
		super(MushroomsBlocks.WHITE_MUSHROOM, new Builder().alwaysEat().effect(() -> new MobEffectInstance(SMobEffects.COLD_RESISTANCE, 100), 1F));
	}
}
