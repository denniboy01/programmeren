package com.denniboy01.EnergyTech.energy.interfaces;

import net.minecraftforge.common.util.ForgeDirection;

public interface IEnergyProvider extends IEnergyConnection {
	
	int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate);
	
	int getEnergyStored(ForgeDirection from);
	
	int getMaxEnergyStored(ForgeDirection from);

}
