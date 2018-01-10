package com.denniboy01.EnergyTech.energy.interfaces;

public interface IEnergyStorage {
	
	int receiveEnergy(int maxReceive, boolean simulate);
	
	int extractEnergy(int maxExtract, boolean simulate);
	
	int getEnergyStored();
	
	int getMaxEnergyStored();

}
