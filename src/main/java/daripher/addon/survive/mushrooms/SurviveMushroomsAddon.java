package daripher.addon.survive.mushrooms;

import daripher.addon.survive.mushrooms.alchemy.MushroomsBrewingRecipes;
import daripher.addon.survive.mushrooms.registries.BlockRegistry;
import daripher.addon.survive.mushrooms.registries.ItemRegistry;
import daripher.addon.survive.mushrooms.registries.MobEffectRegistry;
import daripher.addon.survive.mushrooms.registries.PotionRegistry;
import daripher.addon.survive.mushrooms.worldgen.MushroomsWorldGen;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(bus = Bus.MOD)
@Mod(SurviveMushroomsAddon.MOD_ID)
public class SurviveMushroomsAddon
{
	public static final String MOD_ID = "survivemushrooms";
	
	public SurviveMushroomsAddon()
	{
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		BlockRegistry.REGISTRY.register(modEventBus);
		ItemRegistry.REGISTRY.register(modEventBus);
		MobEffectRegistry.REGISTRY.register(modEventBus);
		PotionRegistry.REGISTRY.register(modEventBus);
	}
	
	@SubscribeEvent
	public static void onCommonSetup(FMLCommonSetupEvent event)
	{
		MushroomsBrewingRecipes.addBrewingRecipes();
		MushroomsWorldGen.registerFeatures();
	}
	
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event)
	{
		BlockRegistry.REGISTRY.getEntries().forEach(blockRegistryObject -> ItemBlockRenderTypes.setRenderLayer(blockRegistryObject.get(), RenderType.cutout()));
	}
}
