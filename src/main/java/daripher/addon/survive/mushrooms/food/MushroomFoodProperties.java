package daripher.addon.survive.mushrooms.food;

import daripher.addon.survive.mushrooms.registries.MobEffectRegistry;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;

public class MushroomFoodProperties
{
	public static final FoodProperties BLACK_MUSHROOM = new FoodProperties.Builder().alwaysEat().build();
	public static final FoodProperties BLUE_MUSHROOM = new FoodProperties.Builder().alwaysEat().build();
	public static final FoodProperties BROWN_MUSHROOM = new FoodProperties.Builder().alwaysEat().build();
	public static final FoodProperties GREEN_MUSHROOM = new FoodProperties.Builder().alwaysEat().effect(() -> new MobEffectInstance(MobEffectRegistry.LESSER_HEALING.get(), 1), 1F).build();
	public static final FoodProperties RED_MUSHROOM = new FoodProperties.Builder().alwaysEat().effect(() -> new MobEffectInstance(MobEffectRegistry.HEAT_RESISTANCE, 100), 1F).build();
	public static final FoodProperties WHITE_MUSHROOM = new FoodProperties.Builder().alwaysEat().effect(() -> new MobEffectInstance(MobEffectRegistry.COLD_RESISTANCE, 100), 1F).build();
	public static final FoodProperties COOKED_BLACK_MUSHROOM = new FoodProperties.Builder().alwaysEat().build();
	public static final FoodProperties COOKED_BLUE_MUSHROOM = new FoodProperties.Builder().alwaysEat().build();
	public static final FoodProperties COOKED_BROWN_MUSHROOM = new FoodProperties.Builder().alwaysEat().build();
	public static final FoodProperties COOKED_GREEN_MUSHROOM = new FoodProperties.Builder().alwaysEat().effect(() -> new MobEffectInstance(MobEffectRegistry.LESSER_HEALING.get(), 1, 1), 1F).build();
	public static final FoodProperties COOKED_RED_MUSHROOM = new FoodProperties.Builder().alwaysEat().effect(() -> new MobEffectInstance(MobEffectRegistry.HEAT_RESISTANCE, 400), 1F).build();
	public static final FoodProperties COOKED_WHITE_MUSHROOM = new FoodProperties.Builder().alwaysEat().effect(() -> new MobEffectInstance(MobEffectRegistry.COLD_RESISTANCE, 400), 1F).build();
}
