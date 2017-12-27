package com.denniboy01.EnergyTech.blocks;

import com.denniboy01.EnergyTech.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block tutorialBlock;
	public static Block copperBlock; //2e blok
	public static Block copperOre;
	public static Block tutorialMultiOre;
	public static Block siliciumBlock;
	public static Block siliciumOre;
	public static Block aluminumOre;
	
	public static void createBlocks() {
		
		GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorial_block").setLightLevel(1.0f), "tutorial_block");
		GameRegistry.registerBlock(copperBlock = new BasicBlock("copper_block"), "copper_block"); //2e blok
		GameRegistry.registerBlock(copperOre = new ModBlockCopperOre("copper_ore", Material.IRON), "copper_ore");
		GameRegistry.registerBlock(tutorialMultiOre = new ModBlockMultiOre("tutorial_multi_ore", Material.IRON), "tutorial_multi_ore");
		GameRegistry.registerBlock(siliciumBlock = new BasicBlock("silicium_block"), "silicium_block");
		GameRegistry.registerBlock(siliciumOre = new BasicBlock("silicium_ore"), "silicium_ore");
		GameRegistry.registerBlock(aluminumOre = new ModBlockAluminumOre("aluminum_ore", Material.IRON), "aluminum_ore"); 
		
	}
	

}

