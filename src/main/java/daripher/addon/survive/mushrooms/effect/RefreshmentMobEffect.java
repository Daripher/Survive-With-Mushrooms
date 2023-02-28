package daripher.addon.survive.mushrooms.effect;

import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class RefreshmentMobEffect extends InstantenousMobEffect {
	public RefreshmentMobEffect() {
		super(MobEffectCategory.BENEFICIAL, 0x353535);
	}

	@Override
	public void applyEffectTick(LivingEntity livingEntity, int effectLevel) {
	}
}
