package daripher.addon.survive.mushrooms;

import daripher.addon.survive.mushrooms.config.Config;
import daripher.addon.survive.mushrooms.init.MushroomsBlocks;
import daripher.addon.survive.mushrooms.init.MushroomsEffects;
import daripher.addon.survive.mushrooms.init.MushroomsItems;
import daripher.addon.survive.mushrooms.init.MushroomsPotions;
import daripher.addon.survive.mushrooms.recipe.MushroomsBrewingRecipes;
import daripher.addon.survive.mushrooms.worldgen.MushroomsWorldGen;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@EventBusSubscriber(modid = SurviveMushroomsAddon.MOD_ID, bus = Bus.MOD)
@Mod(SurviveMushroomsAddon.MOD_ID)
public class SurviveMushroomsAddon {
	public static final String MOD_ID = "survivemushrooms";

	public SurviveMushroomsAddon() {
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_SPEC);
		var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		MushroomsBlocks.REGISTRY.register(modEventBus);
		MushroomsItems.REGISTRY.register(modEventBus);
		MushroomsEffects.REGISTRY.register(modEventBus);
		MushroomsPotions.REGISTRY.register(modEventBus);
	}

	@SubscribeEvent
	public static void setup(FMLCommonSetupEvent event) {
		MushroomsBrewingRecipes.addBrewingRecipes();
		MushroomsWorldGen.registerFeatures();
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void setBlockRenderTypes(FMLClientSetupEvent event) {
		MushroomsBlocks.REGISTRY.getEntries().forEach(blockRegistryObject -> ItemBlockRenderTypes.setRenderLayer(blockRegistryObject.get(), RenderType.cutout()));
	}
}
