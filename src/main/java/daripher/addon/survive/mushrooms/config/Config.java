package daripher.addon.survive.mushrooms.config;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.registries.ForgeRegistries;

public class Config {
	public static final Common COMMON;
	public static final ForgeConfigSpec COMMON_SPEC;

	public static class Common {
		public final ConfigValue<List<? extends List<Object>>> blackMushroomEffects;
		public final ConfigValue<List<? extends List<Object>>> blueMushroomEffects;
		public final ConfigValue<List<? extends List<Object>>> brownMushroomEffects;
		public final ConfigValue<List<? extends List<Object>>> greenMushroomEffects;
		public final ConfigValue<List<? extends List<Object>>> redMushroomEffects;
		public final ConfigValue<List<? extends List<Object>>> whiteMushroomEffects;
		public final ConfigValue<List<? extends List<Object>>> cookedBlackMushroomEffects;
		public final ConfigValue<List<? extends List<Object>>> cookedBlueMushroomEffects;
		public final ConfigValue<List<? extends List<Object>>> cookedBrownMushroomEffects;
		public final ConfigValue<List<? extends List<Object>>> cookedGreenMushroomEffects;
		public final ConfigValue<List<? extends List<Object>>> cookedRedMushroomEffects;
		public final ConfigValue<List<? extends List<Object>>> cookedWhiteMushroomEffects;

		public Common(ForgeConfigSpec.Builder builder) {
			builder.push("effects");
			blackMushroomEffects = builder.defineList("black_mushroom", List.of(List.of("survivemushrooms:lesser_refreshment", 1, 0, 1F)), Config::isEffectConfig);
			blueMushroomEffects = builder.defineList("blue_mushroom", List.of(List.of("survivemushrooms:lesser_thirst_quenching", 1, 0, 1F)), Config::isEffectConfig);
			brownMushroomEffects = builder.defineList("brown_mushroom", List.of(List.of("survivemushrooms:lesser_saturation", 1, 0, 1F)), Config::isEffectConfig);
			greenMushroomEffects = builder.defineList("green_mushroom", List.of(List.of("survivemushrooms:lesser_healing", 1, 0, 1F)), Config::isEffectConfig);
			redMushroomEffects = builder.defineList("red_mushroom", List.of(List.of("survive:heat_resistance", 100, 0, 1F)), Config::isEffectConfig);
			whiteMushroomEffects = builder.defineList("white_mushroom", List.of(List.of("survive:cold_resistance", 100, 0, 1F)), Config::isEffectConfig);
			cookedBlackMushroomEffects = builder.defineList("cooked_black_mushroom", List.of(List.of("survivemushrooms:lesser_refreshment", 1, 1, 1F)), Config::isEffectConfig);
			cookedBlueMushroomEffects = builder.defineList("cooked_blue_mushroom", List.of(List.of("survivemushrooms:lesser_thirst_quenching", 1, 1, 1F)), Config::isEffectConfig);
			cookedBrownMushroomEffects = builder.defineList("cooked_brown_mushroom", List.of(List.of("survivemushrooms:lesser_saturation", 1, 1, 1F)), Config::isEffectConfig);
			cookedGreenMushroomEffects = builder.defineList("cooked_green_mushroom", List.of(List.of("survivemushrooms:lesser_healing", 1, 1, 1F)), Config::isEffectConfig);
			cookedRedMushroomEffects = builder.defineList("cooked_red_mushroom", List.of(List.of("survive:heat_resistance", 400, 0, 1F)), Config::isEffectConfig);
			cookedWhiteMushroomEffects = builder.defineList("cooked_white_mushroom", List.of(List.of("survive:cold_resistance", 400, 0, 1F)), Config::isEffectConfig);
			builder.pop();
		}
	}

	private static boolean isEffectConfig(Object object) {
		if (object instanceof List<?> list) {
			if (list.size() != 4) {
				return false;
			}

			if (!(list.get(0) instanceof String)) {
				return false;
			}

			if (!(list.get(1) instanceof Integer)) {
				return false;
			}

			if (!(list.get(2) instanceof Integer)) {
				return false;
			}

			if (!(list.get(3) instanceof Float)) {
				return false;
			}

			return true;
		}

		return false;
	}

	public static List<Pair<Supplier<MobEffectInstance>, Float>> getEffects(ConfigValue<List<? extends List<Object>>> configValue) {
		var list = new ArrayList<Pair<Supplier<MobEffectInstance>, Float>>();

		configValue.get().forEach(effectConfig -> {
			var effectId = (String) effectConfig.get(0);
			var duration = (Integer) effectConfig.get(1);
			var amplifier = (Integer) effectConfig.get(2);
			var chance = (Float) effectConfig.get(3);

			Supplier<MobEffectInstance> effectSupplier = () -> {
				var mobEffect = ForgeRegistries.MOB_EFFECTS.getValue(new ResourceLocation(effectId));
				return new MobEffectInstance(mobEffect, duration, amplifier);
			};

			list.add(Pair.of(effectSupplier, chance));
		});

		return list;
	}

	static {
		Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
		COMMON_SPEC = specPair.getRight();
		COMMON = specPair.getLeft();
	}
}
