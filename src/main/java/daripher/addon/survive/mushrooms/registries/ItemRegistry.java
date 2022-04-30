package daripher.addon.survive.mushrooms.registries;

import daripher.addon.survive.mushrooms.SurviveMushroomsAddon;
import daripher.addon.survive.mushrooms.food.MushroomFoodProperties;
import daripher.addon.survive.mushrooms.item.FoodItem;
import daripher.addon.survive.mushrooms.item.MushroomItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry
{
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SurviveMushroomsAddon.MOD_ID);
	
	public static final RegistryObject<Item> BLACK_MUSHROOM = REGISTRY.register("black_mushroom", () -> new MushroomItem(BlockRegistry.BLACK_MUSHROOM.get(), MushroomFoodProperties.BLACK_MUSHROOM));
	public static final RegistryObject<Item> BLUE_MUSHROOM = REGISTRY.register("blue_mushroom", () -> new MushroomItem(BlockRegistry.BLUE_MUSHROOM.get(), MushroomFoodProperties.BLUE_MUSHROOM));
	public static final RegistryObject<Item> BROWN_MUSHROOM = REGISTRY.register("brown_mushroom", () -> new MushroomItem(BlockRegistry.BROWN_MUSHROOM.get(), MushroomFoodProperties.BROWN_MUSHROOM));
	public static final RegistryObject<Item> GREEN_MUSHROOM = REGISTRY.register("green_mushroom", () -> new MushroomItem(BlockRegistry.GREEN_MUSHROOM.get(), MushroomFoodProperties.GREEN_MUSHROOM));
	public static final RegistryObject<Item> RED_MUSHROOM = REGISTRY.register("red_mushroom", () -> new MushroomItem(BlockRegistry.RED_MUSHROOM.get(), MushroomFoodProperties.RED_MUSHROOM));
	public static final RegistryObject<Item> WHITE_MUSHROOM = REGISTRY.register("white_mushroom", () -> new MushroomItem(BlockRegistry.WHITE_MUSHROOM.get(), MushroomFoodProperties.WHITE_MUSHROOM));
	public static final RegistryObject<Item> COOKED_BLACK_MUSHROOM = REGISTRY.register("cooked_black_mushroom", () -> new FoodItem(MushroomFoodProperties.COOKED_BLACK_MUSHROOM));
	public static final RegistryObject<Item> COOKED_BLUE_MUSHROOM = REGISTRY.register("cooked_blue_mushroom", () -> new FoodItem(MushroomFoodProperties.COOKED_BLUE_MUSHROOM));
	public static final RegistryObject<Item> COOKED_BROWN_MUSHROOM = REGISTRY.register("cooked_brown_mushroom", () -> new FoodItem(MushroomFoodProperties.COOKED_BROWN_MUSHROOM));
	public static final RegistryObject<Item> COOKED_GREEN_MUSHROOM = REGISTRY.register("cooked_green_mushroom", () -> new FoodItem(MushroomFoodProperties.COOKED_GREEN_MUSHROOM));
	public static final RegistryObject<Item> COOKED_RED_MUSHROOM = REGISTRY.register("cooked_red_mushroom", () -> new FoodItem(MushroomFoodProperties.COOKED_RED_MUSHROOM));
	public static final RegistryObject<Item> COOKED_WHITE_MUSHROOM = REGISTRY.register("cooked_white_mushroom", () -> new FoodItem(MushroomFoodProperties.COOKED_WHITE_MUSHROOM));
}
