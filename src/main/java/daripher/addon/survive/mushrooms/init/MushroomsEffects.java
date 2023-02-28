package daripher.addon.survive.mushrooms.init;

import daripher.addon.survive.mushrooms.SurviveMushroomsAddon;
import daripher.addon.survive.mushrooms.effect.LesserHealingMobEffect;
import daripher.addon.survive.mushrooms.effect.RefreshmentMobEffect;
import daripher.addon.survive.mushrooms.effect.SaturationMobEffect;
import daripher.addon.survive.mushrooms.effect.ThirstQuenchingMobEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MushroomsEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SurviveMushroomsAddon.MOD_ID);

	public static final RegistryObject<MobEffect> LESSER_HEALING = REGISTRY.register("lesser_healing", LesserHealingMobEffect::new);
	public static final RegistryObject<MobEffect> SATURATION = REGISTRY.register("saturation", SaturationMobEffect::new);
	public static final RegistryObject<MobEffect> THIRST_QUENCHING = REGISTRY.register("thirst_quenching", ThirstQuenchingMobEffect::new);
	public static final RegistryObject<MobEffect> REFRESHMENT = REGISTRY.register("refreshment", RefreshmentMobEffect::new);
}
