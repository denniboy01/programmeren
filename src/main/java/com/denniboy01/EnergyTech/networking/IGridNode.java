package com.denniboy01.EnergyTech.networking;

import java.util.EnumSet;

import com.denniboy01.EnergyTech.util.IReadOnlyCollection;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public interface IGridNode {
	
	void beginVisit(IGridVisitor visitor);
	
	void updateState();
	
	IGridHost getMachine();
	
	IGrid getGrid();
	
	void destory();
	
	World getWorld();
	
	EnumSet<ForgeDirection> getConnectedSides();
	
	IReadOnlyCollection<IGridConnection> getConnections();
	
	IGridBlock getGridBlock();
	
	boolean isActive();
	
	void loadFromNBT(String name, NBTTagCompound nodeData);
	
	void saveToNBT(String name, NBTTagCompound nodeData);
	
	boolean meetsChannelRequirements();
	
	boolean hasFlag(GridFlags flag);
	
	int getPlayerID();
	
	void setPlayerID(int playerID);

}
