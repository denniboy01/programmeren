package com.denniboy01.EnergyTech.energy.interfaces;

import net.minecraftforge.common.util.ForgeDirection;

public interface IPowerStorage {
	
	IPowerStorage getController();
	
	long getEnergyStoredL();
	
	long getMaxEnergyStoredL();
	
	boolean isNetworkControlledIo(ForgeDirection direction);
	
	boolean isOutputEnabled(ForgeDirection direction);
	
	boolean isInputEnabled(ForgeDirection direction);
	
	int getMaxOutput();
	
	int getMaxInput();
	
	void addEnergy(int amount);
	
	boolean isCreative();

}
