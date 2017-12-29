package com.denniboy01.EnergyTech.Energy;

public class Energy implements ICapacitor {
	
	private int maxEnergyReceived = 40;
	private int maxEnergyStored = 1000000;
	private int maxEnergyExtracted = 20;
	
	public Energy() {
	}
	
	public Energy(int maxEnergyIO, int maxEnergyStored) {
		this(maxEnergyIO, maxEnergyStored, maxEnergyIO);
	}
	
	public Energy(int maxEnergyIn, int maxEnergyStored, int maxEnergyOut) {
		configure(maxEnergyIn, maxEnergyStored, maxEnergyOut);
	}
	
	protected void configure(int maxEnergyReceived, int maxEnergyStored, int maxEnergyExtracted) {
		this.maxEnergyReceived = maxEnergyReceived;
		this.maxEnergyStored = maxEnergyStored;
		this.maxEnergyExtracted = maxEnergyExtracted;
		
	}
	
	@Override
	public int getMaxEnergyReceived() {
		return maxEnergyReceived;
	}
	
	protected void setMaxEnergyReceived(int maxEnergyReceived) {
		this.maxEnergyReceived = maxEnergyReceived;
	}
	
	@Override
	public int getMaxEnergyStored() {
		return maxEnergyStored;
	}
	
	protected void setMaxEnergyStored(int maxEnergyStored) {
		this.maxEnergyStored = maxEnergyStored;
	}
	
	@Override
	public int getMaxEnergyExtracted() {
		return maxEnergyExtracted;
	}
}