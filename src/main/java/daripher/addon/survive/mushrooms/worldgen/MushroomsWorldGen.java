package daripher.addon.survive.mushrooms.worldgen;

import java.util.List;

import daripher.addon.survive.mushrooms.SurviveMushroomsAddon;
import daripher.addon.survive.mushrooms.registries.BlockRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.biome.Biome.BiomeCategory;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SurviveMushroomsAddon.MOD_ID)
public class MushroomsWorldGen
{
	private static Holder<PlacedFeature> black_mushroom_feature;
	private static Holder<PlacedFeature> blue_mushroom_feature;
	private static Holder<PlacedFeature> brown_mushroom_feature;
	private static Holder<PlacedFeature> green_mushroom_feature;
	private static Holder<PlacedFeature> red_mushroom_feature;
	private static Holder<PlacedFeature> white_mushroom_feature;
	
	public static void registerFeatures()
	{
		black_mushroom_feature = registerUndergroundFeature("black_mushroom", BlockRegistry.BLACK_MUSHROOM.get(), List.of(Blocks.BLACKSTONE, Blocks.BASALT));
		blue_mushroom_feature = registerSurfaceFeature("blue_mushroom", BlockRegistry.BLUE_MUSHROOM.get(), List.of(Blocks.GRASS_BLOCK));
		brown_mushroom_feature = registerUndergroundFeature("brown_mushroom", BlockRegistry.BROWN_MUSHROOM.get(), List.of());
		green_mushroom_feature = registerSurfaceFeature("green_mushroom", BlockRegistry.GREEN_MUSHROOM.get(), List.of(Blocks.GRASS_BLOCK));
		red_mushroom_feature = registerUndergroundFeature("red_mushroom", BlockRegistry.RED_MUSHROOM.get(), List.of(Blocks.CRIMSON_NYLIUM));
		white_mushroom_feature = registerSurfaceFeature("white_mushroom", BlockRegistry.WHITE_MUSHROOM.get(), List.of(Blocks.GRASS_BLOCK, Blocks.SNOW_BLOCK));
	}
	
	private static Holder<PlacedFeature> registerUndergroundFeature(String name, Block mushroomBlock, List<Block> baseBlocks)
	{
		RandomPatchConfiguration patch_config = FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(mushroomBlock)), baseBlocks);
		Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> patch = FeatureUtils.register(name, Feature.RANDOM_PATCH, patch_config);
		Holder<PlacedFeature> feature = PlacementUtils.register(name, patch, RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
		return feature;
	}
	
	private static Holder<PlacedFeature> registerSurfaceFeature(String name, Block mushroomBlock, List<Block> baseBlocks)
	{
		BlockPredicate base_predicate = BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.matchesBlocks(baseBlocks, new BlockPos(0, -1, 0)));
		Holder<PlacedFeature> block_config = PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(mushroomBlock)), base_predicate);
		RandomPatchConfiguration patch_config = new RandomPatchConfiguration(64, 7, 3, block_config);
		Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> patch = FeatureUtils.register(name, Feature.RANDOM_PATCH, patch_config);
		Holder<PlacedFeature> feature = PlacementUtils.register(name, patch, RarityFilter.onAverageOnceEvery(6), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
		return feature;
	}
	
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void onBiomeLoadingEvent(BiomeLoadingEvent event)
	{
		if (event.getName().equals(Biomes.JUNGLE.location()) || event.getName().equals(Biomes.BAMBOO_JUNGLE.location()) || event.getName().equals(Biomes.SPARSE_JUNGLE.location()))
		{
			event.getGeneration().addFeature(Decoration.VEGETAL_DECORATION, green_mushroom_feature);
		}
		
		if (event.getName().equals(Biomes.RIVER.location()) || event.getName().equals(Biomes.SWAMP.location()))
		{
			event.getGeneration().addFeature(Decoration.VEGETAL_DECORATION, blue_mushroom_feature);
		}
		
		if (event.getName().equals(Biomes.FROZEN_PEAKS.location()) || event.getName().equals(Biomes.FROZEN_RIVER.location()) || event.getName().equals(Biomes.ICE_SPIKES.location())
				|| event.getName().equals(Biomes.SNOWY_BEACH.location()) || event.getName().equals(Biomes.SNOWY_PLAINS.location()) || event.getName().equals(Biomes.SNOWY_SLOPES.location())
				|| event.getName().equals(Biomes.SNOWY_TAIGA.location()) || event.getName().equals(Biomes.FROZEN_RIVER.location()))
		{
			event.getGeneration().addFeature(Decoration.VEGETAL_DECORATION, white_mushroom_feature);
		}
		
		if (event.getCategory() != BiomeCategory.NETHER && event.getCategory() != BiomeCategory.THEEND)
		{
			event.getGeneration().addFeature(Decoration.UNDERGROUND_DECORATION, brown_mushroom_feature);
		}
		
		if (event.getName().equals(Biomes.CRIMSON_FOREST.location()))
		{
			event.getGeneration().addFeature(Decoration.UNDERGROUND_DECORATION, red_mushroom_feature);
		}
		
		if (event.getName().equals(Biomes.BASALT_DELTAS.location()))
		{
			event.getGeneration().addFeature(Decoration.UNDERGROUND_DECORATION, black_mushroom_feature);
		}
	}
}
