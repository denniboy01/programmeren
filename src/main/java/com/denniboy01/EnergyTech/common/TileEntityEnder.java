package com.denniboy01.EnergyTech.common;

import com.denniboy01.EnergyTech.common.util.BlockCoord;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Util;

public abstract class TileEntityEnder extends TileEntity {

	  private final int checkOffset = (int) (Math.random() * 20);
	  protected final boolean isProgressTile;

	  protected int lastProgressScaled = -1;
	  protected int ticksSinceLastProgressUpdate;

	  public TileEntityEnder() {
	    isProgressTile = this instanceof IProgressTile;
	  }

	  @Override
	  public final boolean canUpdate() {
	    return shouldUpdate() || isProgressTile;
	  }

	  protected boolean shouldUpdate() {
	    return true;
	  }

	  private long lastUpdate = 0;

	  @Override
	  public final void updateEntity() {
	    if (ConfigHandler.allowExternalTickSpeedup || worldObj.getTotalWorldTime() != lastUpdate) {
	      lastUpdate = worldObj.getTotalWorldTime();
	      doUpdate();
	      if (isProgressTile && !worldObj.isRemote) {
	        int curScaled = getProgressScaled(16);
	        if (++ticksSinceLastProgressUpdate >= getProgressUpdateFreq() || curScaled != lastProgressScaled) {
	          sendTaskProgressPacket();
	          lastProgressScaled = curScaled;
	        }
	      }
	    }
	  }

	  public final int getProgressScaled(int scale) {
	    if (isProgressTile) {
	      return Util.getProgressScaled(scale, (IProgressTile) this);
	    }
	    return 0;
	  }

	  protected void doUpdate() {

	  }

	  protected void sendTaskProgressPacket() {
	    if (isProgressTile) {
	      EnderPacketHandler.sendToAllAround(new PacketProgress((IProgressTile) this), this);
	    }
	    ticksSinceLastProgressUpdate = 0;
	  }

	  
	  protected int getProgressUpdateFreq() {
	    return 20;
	  }

	  @Override
	  public final void readFromNBT(NBTTagCompound root) {
	    super.readFromNBT(root);
	    readCustomNBT(root);
	  }

	  @Override
	  public final void writeToNBT(NBTTagCompound root) {
	    super.writeToNBT(root);
	    writeCustomNBT(root);
	  }

	  @Override
	  public Packet getDescriptionPacket() {
	    NBTTagCompound tag = new NBTTagCompound();
	    writeCustomNBT(tag);
	    return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, tag);
	  }

	  @Override
	  public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
	    readCustomNBT(pkt.func_148857_g());
	  }

	  public boolean canPlayerAccess(EntityPlayer player) {
	    return !isInvalid() && player.getDistanceSq(xCoord + 0.5D, yCoord + 0.5D, zCoord + 0.5D) <= 64D;
	  }

	  protected abstract void writeCustomNBT(NBTTagCompound root);

	  protected abstract void readCustomNBT(NBTTagCompound root);

	  protected void updateBlock() {
	    if (worldObj != null) {
	      worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	    }
	  }

	  protected boolean isPoweredRedstone() {
	    return worldObj.blockExists(xCoord, yCoord, zCoord) ? worldObj.getStrongestIndirectPower(xCoord, yCoord, zCoord) > 0 : false;
	  }

	  public void init() {
	  }

	  private BlockCoord cachedLocation = null;

	  public BlockCoord getLocation() {
	    return cachedLocation == null || !cachedLocation.equals(xCoord, yCoord, zCoord) ? (cachedLocation = new BlockCoord(this)) : cachedLocation;
	  }

	  
	  protected boolean shouldDoWorkThisTick(int interval) {
	    return shouldDoWorkThisTick(interval, 0);
	  }

	  
	  protected boolean shouldDoWorkThisTick(int interval, int offset) {
	    return (worldObj.getTotalWorldTime() + checkOffset + offset) % interval == 0;
	  }

	 
	  public void setGhostSlotContents(int slot, ItemStack stack) {
	  }
	}