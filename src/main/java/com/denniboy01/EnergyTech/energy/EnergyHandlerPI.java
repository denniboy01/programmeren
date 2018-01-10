package com.denniboy01.EnergyTech.energy;

import com.denniboy01.EnergyTech.energy.interfaces.IEnergyHandler;

public class EnergyHandlerPI extends EnergyReceiverPI {

	  private IEnergyHandler rfPower;

	  public EnergyHandlerPI(IEnergyHandler powerReceptor) {
	    super(powerReceptor);
	  }

	  @Override
	  public boolean isInputOnly() {
	    return false;
	  }

	  @Override
	  public boolean isOutputOnly() {
	    return false;
	  }

	}
