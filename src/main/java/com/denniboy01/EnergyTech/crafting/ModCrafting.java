package com.denniboy01.EnergyTech.crafting;

import com.denniboy01.EnergyTech.blocks.ModBlocks;
import com.denniboy01.EnergyTech.items.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModCrafting {

public static void addRecipes() {
	GameRegistry.addRecipe(new ItemStack(ModBlocks.copperBlock, 1), new Object[] {"###", "###", "###", '#', ModItems.copperIngot}); //ingots -> block
	GameRegistry.addRecipe(new ItemStack(ModBlocks.siliconBlock, 1), new Object[] {"###", "###", "###", '#', ModItems.silicon});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.aluminumBlock, 1), new Object[] {"###", "###", "###", '#', ModItems.aluminum});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.steelBlock, 1), new Object[] {"###", "###", "###", '#', ModItems.steelIngot});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.lithiumBlock, 1), new Object[] {"###", "###", "###", '#', ModItems.lithiumIngot});
	
	GameRegistry.addRecipe(new ItemStack(ModItems.ironGear, 1), new Object[] {"# #", " i ", "# #", '#', ModItems.ironPlate, 'i', Items.IRON_INGOT});
	GameRegistry.addRecipe(new ItemStack(ModItems.steelGear, 1), new Object[] {"# #", " i ", "# #", '#', ModItems.steelPlate, 'i', ModItems.ironGear});
	GameRegistry.addRecipe(new ItemStack(ModItems.diamondGear, 1), new Object[] {"# #", " i ", "# #", '#', ModItems.diamondPlate, 'i', ModItems.steelGear});
	
	GameRegistry.addRecipe(new ItemStack(ModItems.hammer, 1), new Object[] {" # ", " i#", "i  ", '#', ModItems.steelIngot, 'i', Items.STICK}); //hammer
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperIngot, 9), new Object[] { ModBlocks.copperBlock}); //block -> ingots
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.silicon, 9), new Object[] { ModBlocks.siliconBlock});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.steelIngot, 1),  new Object[] { Items.IRON_INGOT, Items.COAL});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.steelIngot, 9),  new Object[] { ModBlocks.steelBlock});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.aluminum, 9),  new Object[] { ModBlocks.aluminumBlock});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lithiumIngot, 9),  new Object[] { ModBlocks.lithiumBlock});
	
	GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot, 1), 0.7F); //ore -> ingot
	GameRegistry.addSmelting(ModBlocks.siliconOre, new ItemStack(ModItems.silicon, 1), 0.7F);
	GameRegistry.addSmelting(ModBlocks.lithiumOre, new ItemStack(ModItems.lithiumIngot, 1), 0.7F);
	}

}