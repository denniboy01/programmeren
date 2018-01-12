package com.denniboy01.EnergyTech.energy.conduit;

import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public interface IConduit {

	  
	  Class<? extends IConduit> getBaseConduitType();

	  ItemStack createItem();
	  
	  List<ItemStack> getDrops();

	  int getLightValue();

	  boolean isActive();

	  void setActive(boolean active);

	  void writeToNBT(NBTTagCompound conduitBody);

	  void readFromNBT(NBTTagCompound conduitBody, short nbtVersion);

	  

	  void setBundle(IConduitBundle tileConduitBundle);

	  IConduitBundle getBundle();

	  void onAddedToBundle();

	  void onRemovedFromBundle();

	  BlockCoord getLocation();

	  
	  boolean hasConnections();

	  boolean hasExternalConnections();

	  boolean hasConduitConnections();

	  // Conduit Connections

	  boolean canConnectToConduit(ForgeDirection direction, IConduit conduit);

	  Set<ForgeDirection> getConduitConnections();

	  boolean containsConduitConnection(ForgeDirection dir);

	  void conduitConnectionAdded(ForgeDirection fromDirection);

	  void conduitConnectionRemoved(ForgeDirection fromDirection);

	  void connectionsChanged();

	  AbstractConduitNetwork<?, ?> getNetwork();

	  boolean setNetwork(AbstractConduitNetwork<?, ?> network);

	  

	  boolean canConnectToExternal(ForgeDirection direction, boolean ignoreConnectionMode);

	  Set<ForgeDirection> getExternalConnections();

	  boolean containsExternalConnection(ForgeDirection dir);

	  void externalConnectionAdded(ForgeDirection fromDirection);

	  void externalConnectionRemoved(ForgeDirection fromDirection);

	  boolean isConnectedTo(ForgeDirection dir);

	  ConnectionMode getConnectionMode(ForgeDirection dir);

	  void setConnectionMode(ForgeDirection dir, ConnectionMode mode);

	  boolean hasConnectionMode(ConnectionMode mode);

	  ConnectionMode getNextConnectionMode(ForgeDirection dir);

	  ConnectionMode getPreviousConnectionMode(ForgeDirection dir);

	  

	  IIcon getTextureForState(CollidableComponent component);

	  IIcon getTransmitionTextureForState(CollidableComponent component);

	  float getTransmitionGeometryScale();

	  float getSelfIlluminationForState(CollidableComponent component);

	  

	  boolean haveCollidablesChangedSinceLastCall();

	  Collection<CollidableComponent> getCollidableComponents();

	  Collection<CollidableComponent> createCollidables(CacheKey key);

	  Class<? extends IConduit> getCollidableType();

	  

	  boolean onBlockActivated(EntityPlayer player, RaytraceResult res, List<RaytraceResult> all);

	  void onChunkUnload(World worldObj);

	  void updateEntity(World worldObj);

	  boolean onNeighborBlockChange(Block blockId);
	  
	  boolean onNeighborChange(IBlockAccess world, int x, int y, int z, int tileX, int tileY, int tileZ);

	  
	  boolean writeConnectionSettingsToNBT(ForgeDirection dir, NBTTagCompound nbt);

	  boolean readConduitSettingsFromNBT(ForgeDirection dir, NBTTagCompound nbt);
	  
	  public AbstractConduitNetwork<?, ?> createNetworkForType();

	  
	  boolean shouldMirrorTexture();

	}