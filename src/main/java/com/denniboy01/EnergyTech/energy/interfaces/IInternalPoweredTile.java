package com.denniboy01.EnergyTech.energy.interfaces;

import net.minecraftforge.common.util.ForgeDirection;

public interface IInternalPoweredTile extends IPowerContainer, IEnergyConnection {
	
	int getMaxEnergyRecieved(ForgeDirection dir);
	
	int getMaxEnergyStored();
	
	boolean displayPower();

}
