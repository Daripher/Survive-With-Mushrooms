package daripher.addon.survive.mushrooms.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class MushroomItem extends BlockItem {
	public MushroomItem(RegistryObject<Block> blockObject, FoodProperties.Builder foodPropertiesBuilder) {
		super(blockObject.get(), new Properties().food(foodPropertiesBuilder.build()).tab(CreativeModeTab.TAB_DECORATIONS));
	}
}
