package daripher.addon.survive.mushrooms.effect;

import com.stereowalker.survive.core.SurviveEntityStats;

import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class ThirstQuenchingMobEffect extends InstantenousMobEffect {
	public ThirstQuenchingMobEffect() {
		super(MobEffectCategory.BENEFICIAL, 0x28B3FF);
	}

	@Override
	public void applyEffectTick(LivingEntity livingEntity, int effectLevel) {
		var waterStats = SurviveEntityStats.getWaterStats(livingEntity);
		waterStats.drink(4 * (effectLevel + 1), 2F * (effectLevel + 1), false);
		waterStats.save(livingEntity);
	}
}
