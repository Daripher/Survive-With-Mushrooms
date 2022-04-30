package daripher.addon.survive.mushrooms.registries;

import daripher.addon.survive.mushrooms.SurviveMushroomsAddon;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.RegistryObject;

public class PotionRegistry
{
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, SurviveMushroomsAddon.MOD_ID);
	
	public static final RegistryObject<Potion> SATURATION = REGISTRY.register("saturation", () -> new Potion(new MobEffectInstance(MobEffectRegistry.SATURATION.get(), 1)));
	public static final RegistryObject<Potion> STRONG_SATURATION = REGISTRY.register("strong_saturation", () -> new Potion(new MobEffectInstance(MobEffectRegistry.SATURATION.get(), 1, 1)));
	public static final RegistryObject<Potion> THIRST_QUENCHING = REGISTRY.register("thirst_quenching", () -> new Potion(new MobEffectInstance(MobEffectRegistry.THIRST_QUENCHING.get(), 1)));
	public static final RegistryObject<Potion> STRONG_THIRST_QUENCHING = REGISTRY.register("strong_thirst_quenching", () -> new Potion(new MobEffectInstance(MobEffectRegistry.THIRST_QUENCHING.get(), 1, 1)));
	public static final RegistryObject<Potion> REFRESHMENT = REGISTRY.register("refreshment", () -> new Potion(new MobEffectInstance(MobEffectRegistry.REFRESHMENT.get(), 1)));
	public static final RegistryObject<Potion> STRONG_REFRESHMENT = REGISTRY.register("strong_refreshment", () -> new Potion(new MobEffectInstance(MobEffectRegistry.REFRESHMENT.get(), 1, 1)));
	
	@ObjectHolder("survive:cold_resistance")
	public static final Potion COLD_RESISTANCE = null;
	@ObjectHolder("survive:heat_resistance")
	public static final Potion HEAT_RESISTANCE = null;
}
