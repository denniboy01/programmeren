package com.denniboy01.EnergyTech.blocks;

import com.denniboy01.EnergyTech.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block tutorialBlock;
	public static Block copperBlock; //2e blok
	public static Block siliconBlock;
	public static Block aluminumBlock;
	public static Block steelBlock;
	public static Block lithiumBlock;
	
	public static Block lithiumOre;
	public static Block siliconOre;
	public static Block aluminumOre;
	public static Block copperOre;
	public static Block tutorialMultiOre;
	
	
	public static void createBlocks() {
		
		GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorial_block").setLightLevel(1.0f), "tutorial_block");
		GameRegistry.registerBlock(copperBlock = new BasicBlock("copper_block"), "copper_block"); //2e blok
		GameRegistry.registerBlock(siliconBlock = new BasicBlock("silicon_block"), "silicon_block");
		GameRegistry.registerBlock(aluminumBlock = new BasicBlock("aluminum_block"), "aluminum_block");
		GameRegistry.registerBlock(steelBlock = new BasicBlock("steel_block"), "steel_block");
		GameRegistry.registerBlock(lithiumBlock = new BasicBlock("lithium_block"), "lithium_block");
		
		GameRegistry.registerBlock(tutorialMultiOre = new ModBlockMultiOre("tutorial_multi_ore", Material.IRON), "tutorial_multi_ore");
		GameRegistry.registerBlock(siliconOre = new BasicBlock("silicon_ore"), "silicon_ore");
		GameRegistry.registerBlock(aluminumOre = new ModBlockAluminumOre("aluminum_ore", Material.IRON), "aluminum_ore");
		GameRegistry.registerBlock(copperOre = new ModBlockCopperOre("copper_ore", Material.IRON), "copper_ore");
		GameRegistry.registerBlock(lithiumOre = new ModBlockLithiumOre("lithium_ore", Material.IRON), "lithium_ore");
		
	}
	

}

