package daripher.addon.survive.mushrooms.init;

import daripher.addon.survive.mushrooms.SurviveMushroomsAddon;
import daripher.addon.survive.mushrooms.item.BlackMushroomItem;
import daripher.addon.survive.mushrooms.item.BlueMushroomItem;
import daripher.addon.survive.mushrooms.item.BrownMushroomItem;
import daripher.addon.survive.mushrooms.item.CookedBlackMushroomItem;
import daripher.addon.survive.mushrooms.item.CookedBlueMushroomItem;
import daripher.addon.survive.mushrooms.item.CookedBrownMushroomItem;
import daripher.addon.survive.mushrooms.item.CookedGreenMushroomItem;
import daripher.addon.survive.mushrooms.item.CookedRedMushroomItem;
import daripher.addon.survive.mushrooms.item.CookedWhiteMushroomItem;
import daripher.addon.survive.mushrooms.item.GreenMushroomItem;
import daripher.addon.survive.mushrooms.item.RedMushroomItem;
import daripher.addon.survive.mushrooms.item.WhiteMushroomItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MushroomsItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SurviveMushroomsAddon.MOD_ID);

	public static final RegistryObject<Item> BLACK_MUSHROOM = REGISTRY.register("black_mushroom", BlackMushroomItem::new);
	public static final RegistryObject<Item> BLUE_MUSHROOM = REGISTRY.register("blue_mushroom", BlueMushroomItem::new);
	public static final RegistryObject<Item> BROWN_MUSHROOM = REGISTRY.register("brown_mushroom", BrownMushroomItem::new);
	public static final RegistryObject<Item> GREEN_MUSHROOM = REGISTRY.register("green_mushroom", GreenMushroomItem::new);
	public static final RegistryObject<Item> RED_MUSHROOM = REGISTRY.register("red_mushroom", RedMushroomItem::new);
	public static final RegistryObject<Item> WHITE_MUSHROOM = REGISTRY.register("white_mushroom", WhiteMushroomItem::new);
	public static final RegistryObject<Item> COOKED_BLACK_MUSHROOM = REGISTRY.register("cooked_black_mushroom", CookedBlackMushroomItem::new);
	public static final RegistryObject<Item> COOKED_BLUE_MUSHROOM = REGISTRY.register("cooked_blue_mushroom", CookedBlueMushroomItem::new);
	public static final RegistryObject<Item> COOKED_BROWN_MUSHROOM = REGISTRY.register("cooked_brown_mushroom", CookedBrownMushroomItem::new);
	public static final RegistryObject<Item> COOKED_GREEN_MUSHROOM = REGISTRY.register("cooked_green_mushroom", CookedGreenMushroomItem::new);
	public static final RegistryObject<Item> COOKED_RED_MUSHROOM = REGISTRY.register("cooked_red_mushroom", CookedRedMushroomItem::new);
	public static final RegistryObject<Item> COOKED_WHITE_MUSHROOM = REGISTRY.register("cooked_white_mushroom", CookedWhiteMushroomItem::new);
}
