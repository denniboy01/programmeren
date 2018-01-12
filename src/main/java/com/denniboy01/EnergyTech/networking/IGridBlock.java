package com.denniboy01.EnergyTech.networking;


import java.util.EnumSet;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.ForgeDirection;





public interface IGridBlock
{

	
	double getIdlePowerUsage();

	
	EnumSet<GridFlags> getFlags();

	
	boolean isWorldAccessible();

	
	DimensionalCoord getLocation();

	
	void onGridNotification( GridNotification notification );

	void setNetworkStatus( IGrid grid, int channelsInUse );

	EnumSet<ForgeDirection> getConnectableSides();

	IGridHost getMachine();

	void gridChanged();

	ItemStack getMachineRepresentation();
}
