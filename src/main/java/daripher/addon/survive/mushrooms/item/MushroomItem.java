package daripher.addon.survive.mushrooms.item;

import java.util.List;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.registries.RegistryObject;

public class MushroomItem extends BlockItem {
	public MushroomItem(RegistryObject<Block> blockObject, ConfigValue<List<? extends List<Object>>> configValue) {
		super(blockObject.get(), new Properties().food(FoodItem.createFoodProperties(configValue).build()).tab(CreativeModeTab.TAB_DECORATIONS));
	}
}
