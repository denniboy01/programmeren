package com.denniboy01.EnergyTech;

import com.denniboy01.EnergyTech.client.render.blocks.BlockRenderRegister;
import com.denniboy01.EnergyTech.client.render.items.ItemRenderRegister;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}
	
	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
		
		ItemRenderRegister.registerItemRenderer(); //item
		BlockRenderRegister.registerBlockRenderer(); //block
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}
	
}