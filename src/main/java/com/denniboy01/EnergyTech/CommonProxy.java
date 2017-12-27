package com.denniboy01.EnergyTech;

import com.denniboy01.EnergyTech.blocks.ModBlocks;
//import com.denniboy01.EnergyTech.blocks.copperOre;
import com.denniboy01.EnergyTech.crafting.ModCrafting;
import com.denniboy01.EnergyTech.items.ModItems;
import com.denniboy01.EnergyTech.world.TutorialWorldGen;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	ModItems.createItems();
    	ModBlocks.createBlocks(); //block

    }

    public void init(FMLInitializationEvent e) {
    	
    	ModCrafting.addRecipes();
    	
    	GameRegistry.registerWorldGenerator(new TutorialWorldGen(), 0);

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}