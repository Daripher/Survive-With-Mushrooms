package daripher.addon.survive.mushrooms.effect;

import com.stereowalker.survive.core.SurviveEntityStats;
import com.stereowalker.survive.world.entity.ai.attributes.SAttributes;

import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class LesserRefreshmentMobEffect extends InstantenousMobEffect {
	public LesserRefreshmentMobEffect() {
		super(MobEffectCategory.BENEFICIAL, 0x353535);
	}

	@Override
	public void applyEffectTick(LivingEntity livingEntity, int effectLevel) {
		var energyStats = SurviveEntityStats.getEnergyStats(livingEntity);
		energyStats.relax(effectLevel + 1, livingEntity.getAttributeValue(SAttributes.MAX_STAMINA));
		energyStats.save(livingEntity);
	}
}
