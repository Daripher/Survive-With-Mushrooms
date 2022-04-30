package daripher.addon.survive.mushrooms.effect;

import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class SaturationMobEffect extends InstantenousMobEffect
{
	public SaturationMobEffect()
	{
		super(MobEffectCategory.BENEFICIAL, 0xB96F00);
	}
	
	@Override
	public void applyEffectTick(LivingEntity livingEntity, int effectLevel)
	{
		if (livingEntity instanceof Player)
		{
			((Player) livingEntity).getFoodData().eat(4 * (effectLevel + 1), 2F * (effectLevel + 1));
		}
	}
}
