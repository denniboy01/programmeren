package com.denniboy01.EnergyTech.networking;

import net.minecraftforge.common.util.ForgeDirection;

public interface IGridHost {
	
	IGridNode getGridNode(ForgeDirection dir);
	
	void securtityBreak();

}
