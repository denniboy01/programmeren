package com.denniboy01.EnergyTech.client.render.blocks;

import com.denniboy01.EnergyTech.blocks.ModBlockMultiOre;
import com.denniboy01.EnergyTech.blocks.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	public static void registerBlockRenderer() {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.tutorialBlock), 0, new ModelResourceLocation("det:tutorial_block", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.copperBlock), 0, new ModelResourceLocation("det:copper_block", "inventory")); //2e blok
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.siliconBlock), 0, new ModelResourceLocation("det:silicon_block", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.aluminumBlock), 0, new ModelResourceLocation("det:aluminum_block", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.steelBlock), 0, new ModelResourceLocation("det:steel_block", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.lithiumBlock), 0, new ModelResourceLocation("det:lithium_block", "inventory"));
				
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.siliconOre), 0, new ModelResourceLocation("det:silicon_ore", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.aluminumOre), 0, new ModelResourceLocation("det:aluminum_ore", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.copperOre), 0, new ModelResourceLocation("det:copper_ore", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.tutorialMultiOre), 0, new ModelResourceLocation("det:tutorial_multi_ore", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.lithiumOre), 0, new ModelResourceLocation("det:lithium_ore", "inventory"));
	
	}
	
}
