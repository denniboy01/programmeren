package com.denniboy01.EnergyTech.Energy;

import net.minecraftforge.common.util.ForgeDirection;

public interface IEnergyReceiver extends IEnergyConnection {
	
	int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate);
	
	int getEnergyStored(ForgeDirection from);
	
	int getMaxEnergyStored(ForgeDirection from);

}
