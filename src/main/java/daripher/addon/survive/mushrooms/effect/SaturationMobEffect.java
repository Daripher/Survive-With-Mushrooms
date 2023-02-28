package daripher.addon.survive.mushrooms.effect;

import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class SaturationMobEffect extends InstantenousMobEffect {
	public SaturationMobEffect() {
		super(MobEffectCategory.BENEFICIAL, 0xB96F00);
	}

	@Override
	public void applyEffectTick(LivingEntity livingEntity, int effectLevel) {
		if (livingEntity instanceof Player player) {
			player.getFoodData().eat(effectLevel + 1, 0.5F * (effectLevel + 1));
		}
	}
}
