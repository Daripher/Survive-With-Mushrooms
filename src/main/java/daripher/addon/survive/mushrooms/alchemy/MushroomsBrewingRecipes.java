package daripher.addon.survive.mushrooms.alchemy;

import daripher.addon.survive.mushrooms.registries.ItemRegistry;
import daripher.addon.survive.mushrooms.registries.PotionRegistry;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;

public class MushroomsBrewingRecipes
{
	public static void addBrewingRecipes()
	{
		PotionBrewing.addMix(Potions.AWKWARD, ItemRegistry.COOKED_GREEN_MUSHROOM.get(), Potions.HEALING);
		
		if (PotionRegistry.HEAT_RESISTANCE != null)
		{
			PotionBrewing.addMix(Potions.AWKWARD, ItemRegistry.COOKED_RED_MUSHROOM.get(), PotionRegistry.HEAT_RESISTANCE);
		}
		
		if (PotionRegistry.COLD_RESISTANCE != null)
		{
			PotionBrewing.addMix(Potions.AWKWARD, ItemRegistry.COOKED_WHITE_MUSHROOM.get(), PotionRegistry.COLD_RESISTANCE);
		}
		
		PotionBrewing.addMix(Potions.AWKWARD, ItemRegistry.COOKED_BROWN_MUSHROOM.get(), PotionRegistry.SATURATION.get());
		PotionBrewing.addMix(PotionRegistry.SATURATION.get(), Items.GLOWSTONE_DUST, PotionRegistry.STRONG_SATURATION.get());
		PotionBrewing.addMix(Potions.AWKWARD, ItemRegistry.COOKED_BLUE_MUSHROOM.get(), PotionRegistry.THIRST_QUENCHING.get());
		PotionBrewing.addMix(PotionRegistry.THIRST_QUENCHING.get(), Items.GLOWSTONE_DUST, PotionRegistry.STRONG_THIRST_QUENCHING.get());
		PotionBrewing.addMix(Potions.AWKWARD, ItemRegistry.COOKED_BLACK_MUSHROOM.get(), PotionRegistry.REFRESHMENT.get());
		PotionBrewing.addMix(PotionRegistry.REFRESHMENT.get(), Items.GLOWSTONE_DUST, PotionRegistry.STRONG_REFRESHMENT.get());
	}
}