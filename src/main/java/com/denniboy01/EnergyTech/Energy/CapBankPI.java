package com.denniboy01.EnergyTech.energy;

public class CapBankPI extends EnergyReceiverPI {
	
	public CapBankPI(TileCapBank powerReceptor) {
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
