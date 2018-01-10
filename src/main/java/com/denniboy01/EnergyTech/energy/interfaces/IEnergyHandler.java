package com.denniboy01.EnergyTech.energy.interfaces;

import net.minecraftforge.common.util.ForgeDirection;

public interface IEnergyHandler extends IEnergyProvider, IEnergyReceiver {
	
	@Override
	int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate);
	
	@Override
	int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate);
	
	@Override
	int getEnergyStored(ForgeDirection from);
	
	@Override
	int getMaxEnergyStored(ForgeDirection from);

}
