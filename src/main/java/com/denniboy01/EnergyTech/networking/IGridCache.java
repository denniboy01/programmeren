package com.denniboy01.EnergyTech.networking;



public interface IGridCache
{

	
	void onUpdateTick();

	
	void removeNode( IGridNode gridNode, IGridHost machine );

	
	void addNode( IGridNode gridNode, IGridHost machine );

	
	void onSplit( IGridStorage destinationStorage );

	
	void onJoin( IGridStorage sourceStorage );

	
	void populateGridStorage( IGridStorage destinationStorage );
}
