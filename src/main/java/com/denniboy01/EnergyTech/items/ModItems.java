package com.denniboy01.EnergyTech.items;

import com.denniboy01.EnergyTech.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;

public final class ModItems {
	
	public static ToolMaterial TUTORIAL = EnumHelper.addToolMaterial("TUTORIAL", 3, 1000, 15.0F, 4.0F, 30);
	
	public static Item copperIngot;
	public static Item tutorialItem; //2e item
	public static Item silicon;
	public static Item aluminum;
	public static Item steelIngot;
	public static Item lithiumIngot;
	
	public static Item woodenPlate;
	public static Item ironPlate;
	public static Item diamondPlate;
	public static Item copperPlate;
	public static Item aluminumPlate;
	public static Item siliconPlate;
	public static Item steelPlate;
	
	public static Item tutorialAxe;
	public static Item hammer;
	
	public static Item ironGear;
	public static Item steelGear;
	public static Item diamondGear;
	
	public static void createItems() {
		GameRegistry.registerItem(copperIngot = new BasicItem("copper_ingot"), "copper_ingot");
		GameRegistry.registerItem(tutorialItem = new BasicItem("tutorial_item"), "tutorial_item"); //2e item
		GameRegistry.registerItem(silicon = new BasicItem("silicon"), "silicon");
		GameRegistry.registerItem(aluminum = new BasicItem("aluminum"), "aluminum");
		GameRegistry.registerItem(steelIngot = new BasicItem("steel_ingot"), "steel_ingot");
		GameRegistry.registerItem(lithiumIngot = new BasicItem("lithium_ingot"), "lithium_ingot");
		
		GameRegistry.registerItem(woodenPlate = new BasicItem("wooden_plate"), "wooden_plate");
		GameRegistry.registerItem(ironPlate = new BasicItem("iron_plate"), "iron_plate");
		GameRegistry.registerItem(diamondPlate = new BasicItem("diamond_plate"), "diamond_plate");
		GameRegistry.registerItem(copperPlate = new BasicItem("copper_plate"), "copper_plate");
		GameRegistry.registerItem(aluminumPlate = new BasicItem("aluminum_plate"), "aluminum_plate");
		GameRegistry.registerItem(siliconPlate = new BasicItem("silicon_plate"), "silicon_plate");
		GameRegistry.registerItem(steelPlate = new BasicItem("steel_plate"), "steel_plate");
		
		GameRegistry.registerItem(ironGear = new BasicItem("iron_gear"), "iron_gear");
		GameRegistry.registerItem(steelGear = new BasicItem("steel_gear"), "steel_gear");
		GameRegistry.registerItem(diamondGear = new BasicItem("diamond_gear"), "diamond_gear");
		
		//tutorialAxe = register(new ItemAxe(ModItems.TUTORIAL, "tutorialAxe"));
		GameRegistry.registerItem(hammer = new BasicItem("hammer"), "hammer");
		
		
		
		
	}
	
	private static Item register(ItemAxe itemAxe) {
		// TODO Auto-generated method stub
		return null;
	}

	public static final CreativeTabs tabEnergyTech = new CreativeTabs("energyTech") {
		@Override public Item getTabIconItem() {
			return ModItems.copperIngot;
		}
	};
}

