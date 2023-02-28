package daripher.addon.survive.mushrooms.init;

import daripher.addon.survive.mushrooms.SurviveMushroomsAddon;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MushroomsPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, SurviveMushroomsAddon.MOD_ID);

	public static final RegistryObject<Potion> SATURATION = register("saturation", MushroomsEffects.SATURATION, 1, 3);
	public static final RegistryObject<Potion> STRONG_SATURATION = register("strong_saturation", MushroomsEffects.SATURATION, 1, 1);
	public static final RegistryObject<Potion> THIRST_QUENCHING = register("thirst_quenching", MushroomsEffects.THIRST_QUENCHING, 1, 0);
	public static final RegistryObject<Potion> STRONG_THIRST_QUENCHING = register("strong_thirst_quenching", MushroomsEffects.THIRST_QUENCHING, 1, 1);
	public static final RegistryObject<Potion> REFRESHMENT = register("refreshment", MushroomsEffects.REFRESHMENT, 1, 0);
	public static final RegistryObject<Potion> STRONG_REFRESHMENT = register("strong_refreshment", MushroomsEffects.REFRESHMENT, 1, 1);

	private static RegistryObject<Potion> register(String name, RegistryObject<MobEffect> effectObject, int duration, int amplifier) {
		return REGISTRY.register(name, () -> new Potion(new MobEffectInstance(effectObject.get(), duration, amplifier)));
	}
}
