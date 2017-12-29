package com.denniboy01.EnergyTech.Energy;

import net.minecraftforge.common.util.ForgeDirection;

public class EnergyReceiverPI implements IPowerInterface {
	
	private IEnergyReceiver vPower;
	
	public EnergyReceiverPI(IEnergyReceiver powerReceptor) {
		vPower = powerReceptor;
	}
	
	@Override
	public Object getDelegate() {
		return vPower;
	}
	
	@Override
	public boolean canConduitConnect(ForgeDirection direction) {
		if(vPower != null && direction != null) {
			return vPower.canConnectEnergy(direction.getOpposite());
		}
		return false;
	}
	
	@Override
	public int getEnergyStored(ForgeDirection dir) {
		if(vPower != null && dir != null) {
			return vPower.getEnergyStored(dir);
		}
		return 0;
	}
	
	@Override
	public int getMaxEnergyStored(ForgeDirection dir) {
		if(vPower != null && dir != null) {
			return vPower.getMaxEnergyStored(dir);
		}
		return 0;
	}
	
	@Override
	  public int getPowerRequest(ForgeDirection dir) {
	    if(vPower != null && dir != null && vPower.canConnectEnergy(dir)) {
	      return vPower.receiveEnergy(dir, 99999999, true);
	    }
	    return 0;
	  }
	
	public static int getPowerRequest(ForgeDirection dir, IEnergyReceiver handler) {
		if(handler != null && dir != null && handler.canConnectEnergy(dir)) {
			return handler.receiveEnergy(dir, 99999999, true);
		}
		return 0;
	}
	
	@Override
	  public int getMinEnergyReceived(ForgeDirection dir) {
	    return 0;
	  }

	  @Override
	  public int recieveEnergy(ForgeDirection opposite, int canOffer) {
	    if(vPower != null && opposite != null) {
	      return vPower.receiveEnergy(opposite, canOffer, false);
	    }
	    return 0;
	  }

	  @Override
	  public boolean isOutputOnly() {
	    return false;
	  }

	  @Override
	  public boolean isInputOnly() {
	    return true;
	  }

}
