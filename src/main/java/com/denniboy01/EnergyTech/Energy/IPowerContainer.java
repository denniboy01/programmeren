package com.denniboy01.EnergyTech.Energy;

import com.denniboy01.EnergyTech.common.util.BlockCoord;

public interface IPowerContainer {
	
	int getEnergyStored();
	
	void setEnergyStored(int storedEnergy);
	
	BlockCoord getLocation();

}
