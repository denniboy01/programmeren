package com.denniboy01.EnergyTech.networking;


import net.minecraftforge.common.util.ForgeDirection;


public interface IGridConnection
{

	
	IGridNode getOtherSide( IGridNode gridNode );

	
	ForgeDirection getDirection( IGridNode gridNode );

	
	void destroy();

	
	IGridNode a();

	
	IGridNode b();

	
	boolean hasDirection();

	
	int getUsedChannels();
}