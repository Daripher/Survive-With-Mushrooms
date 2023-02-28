package daripher.addon.survive.mushrooms.effect;

import com.stereowalker.survive.core.SurviveEntityStats;

import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class LesserThirstQuenchingMobEffect extends InstantenousMobEffect {
	public LesserThirstQuenchingMobEffect() {
		super(MobEffectCategory.BENEFICIAL, 0x28B3FF);
	}

	@Override
	public void applyEffectTick(LivingEntity livingEntity, int effectLevel) {
		var waterStats = SurviveEntityStats.getWaterStats(livingEntity);
		waterStats.drink(effectLevel + 1, 0.5F * (effectLevel + 1), false);
		waterStats.save(livingEntity);
	}
}
