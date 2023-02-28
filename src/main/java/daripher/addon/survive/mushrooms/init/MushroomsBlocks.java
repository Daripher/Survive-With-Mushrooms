package daripher.addon.survive.mushrooms.init;

import daripher.addon.survive.mushrooms.SurviveMushroomsAddon;
import daripher.addon.survive.mushrooms.block.MushroomBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MushroomsBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SurviveMushroomsAddon.MOD_ID);

	public static final RegistryObject<Block> BLACK_MUSHROOM = REGISTRY.register("black_mushroom", MushroomBlock::new);
	public static final RegistryObject<Block> BLUE_MUSHROOM = REGISTRY.register("blue_mushroom", MushroomBlock::new);
	public static final RegistryObject<Block> BROWN_MUSHROOM = REGISTRY.register("brown_mushroom", MushroomBlock::new);
	public static final RegistryObject<Block> GREEN_MUSHROOM = REGISTRY.register("green_mushroom", MushroomBlock::new);
	public static final RegistryObject<Block> RED_MUSHROOM = REGISTRY.register("red_mushroom", MushroomBlock::new);
	public static final RegistryObject<Block> WHITE_MUSHROOM = REGISTRY.register("white_mushroom", MushroomBlock::new);
}
