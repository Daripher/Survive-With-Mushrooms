package daripher.addon.survive.mushrooms.effect;

import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class LesserHealingMobEffect extends InstantenousMobEffect {
	public LesserHealingMobEffect() {
		super(MobEffectCategory.BENEFICIAL, 16262179);
	}

	@Override
	public void applyEffectTick(LivingEntity livingEntity, int effectLevel) {
		livingEntity.heal(effectLevel + 1);
	}
}
