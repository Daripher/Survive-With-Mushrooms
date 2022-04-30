package daripher.addon.survive.mushrooms.effect;

import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class ThirstQuenchingMobEffect extends InstantenousMobEffect
{
	public ThirstQuenchingMobEffect()
	{
		super(MobEffectCategory.BENEFICIAL, 0x28B3FF);
	}
	
	@Override
	public void applyEffectTick(LivingEntity livingEntity, int effectLevel)
	{
	}
}
