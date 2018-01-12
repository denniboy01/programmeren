package com.denniboy01.EnergyTech.energy.interfaces;

import com.denniboy01.EnergyTech.common.util.BlockCoord;
import com.denniboy01.EnergyTech.machines.IoMode;

import net.minecraftforge.common.util.ForgeDirection;

public interface IIoConfigurable {
	
	public IoMode toggleIoModeForFace(ForgeDirection faceHit);
	public boolean supportsMode(ForgeDirection faceHit, IoMode mode);
	public void setIoMode(ForgeDirection faceHit, IoMode mode);
	public IoMode getIoMode(ForgeDirection face);
	public void clearAllIoModes();
	BlockCoord getLocation();
	

}
