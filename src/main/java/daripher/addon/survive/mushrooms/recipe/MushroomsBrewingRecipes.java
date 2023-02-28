package daripher.addon.survive.mushrooms.recipe;

import com.stereowalker.survive.world.item.alchemy.SPotions;

import daripher.addon.survive.mushrooms.init.MushroomsItems;
import daripher.addon.survive.mushrooms.init.MushroomsPotions;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;

public class MushroomsBrewingRecipes {
	public static void addBrewingRecipes() {
		PotionBrewing.addMix(Potions.AWKWARD, MushroomsItems.COOKED_GREEN_MUSHROOM.get(), Potions.HEALING);
		PotionBrewing.addMix(Potions.AWKWARD, MushroomsItems.COOKED_RED_MUSHROOM.get(), SPotions.HEAT_RESISTANCE);
		PotionBrewing.addMix(Potions.AWKWARD, MushroomsItems.COOKED_WHITE_MUSHROOM.get(), SPotions.COLD_RESISTANCE);
		PotionBrewing.addMix(Potions.AWKWARD, MushroomsItems.COOKED_BROWN_MUSHROOM.get(), MushroomsPotions.SATURATION.get());
		PotionBrewing.addMix(MushroomsPotions.SATURATION.get(), Items.GLOWSTONE_DUST, MushroomsPotions.STRONG_SATURATION.get());
		PotionBrewing.addMix(Potions.AWKWARD, MushroomsItems.COOKED_BLUE_MUSHROOM.get(), MushroomsPotions.THIRST_QUENCHING.get());
		PotionBrewing.addMix(MushroomsPotions.THIRST_QUENCHING.get(), Items.GLOWSTONE_DUST, MushroomsPotions.STRONG_THIRST_QUENCHING.get());
		PotionBrewing.addMix(Potions.AWKWARD, MushroomsItems.COOKED_BLACK_MUSHROOM.get(), MushroomsPotions.REFRESHMENT.get());
		PotionBrewing.addMix(MushroomsPotions.REFRESHMENT.get(), Items.GLOWSTONE_DUST, MushroomsPotions.STRONG_REFRESHMENT.get());
	}
}