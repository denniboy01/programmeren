package com.denniboy01.EnergyTech.crafting;

import com.denniboy01.EnergyTech.blocks.ModBlocks;
import com.denniboy01.EnergyTech.items.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModCrafting {

public static void addRecipes() {
	GameRegistry.addRecipe(new ItemStack(ModBlocks.copperBlock, 1), new Object[] {"###", "###", "###", '#', ModItems.copperIngot}); //ingots -> block
	GameRegistry.addRecipe(new ItemStack(ModBlocks.siliciumBlock, 1), new Object[] {"###", "###", "###", '#', ModItems.silicon});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperIngot, 9), new Object[] { ModBlocks.copperBlock}); //block -> ingots
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.silicon, 9), new Object[] { ModBlocks.siliciumBlock});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.steelIngot, 1),  new Object[] { Items.IRON_INGOT, Items.COAL});
	
	GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot, 1), 0.7F); //ore -> ingot
	GameRegistry.addSmelting(ModBlocks.siliciumOre, new ItemStack(ModItems.silicon, 1), 0.7F);
	}

}