package com.denniboy01.EnergyTech.client.render.items;

import com.denniboy01.EnergyTech.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public final class ItemRenderRegister {
	
	public static void registerItemRenderer() {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.copperIngot, 0, new ModelResourceLocation("det:copper_ingot", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.tutorialItem, 0, new ModelResourceLocation("det:tutorial_item", "inventory")); //2e item
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.silicon, 0, new ModelResourceLocation("det:silicon", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.aluminum, 0, new ModelResourceLocation("det:aluminum", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.steelIngot, 0, new ModelResourceLocation("det:steel_ingot", "inventory"));
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.woodenPlate, 0, new ModelResourceLocation("det:wooden_plate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.ironPlate, 0, new ModelResourceLocation("det:iron_plate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.diamondPlate, 0, new ModelResourceLocation("det:diamond_plate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.copperPlate, 0, new ModelResourceLocation("det:copper_plate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.aluminumPlate, 0, new ModelResourceLocation("det:aluminum_plate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.siliconPlate, 0, new ModelResourceLocation("det:silicon_plate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.steelPlate, 0, new ModelResourceLocation("det:steel_plate", "inventory"));
	}
}
	
	

