package daripher.addon.survive.mushrooms.item;

import java.util.List;

import daripher.addon.survive.mushrooms.config.Config;
import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class FoodItem extends Item {
	public FoodItem(ConfigValue<List<? extends List<Object>>> configValue) {
		super(new Item.Properties().food(FoodItem.createFoodProperties(configValue).build()).tab(CreativeModeTab.TAB_FOOD));
	}

	public static Builder createFoodProperties(ConfigValue<List<? extends List<Object>>> configValue) {
		var foodProperties = new Builder().alwaysEat();
		var effects = Config.getEffects(configValue);
		effects.forEach(pair -> foodProperties.effect(pair.getLeft(), pair.getRight()));
		return foodProperties;
	}
}
