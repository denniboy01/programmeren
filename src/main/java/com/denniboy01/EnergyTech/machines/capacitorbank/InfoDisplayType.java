package com.denniboy01.EnergyTech.machines.capacitorbank;

public enum InfoDisplayType {

	  NONE,
	  LEVEL_BAR,
	  IO;

	  public InfoDisplayType next() {
	    int ord = ordinal();
	    ++ord;
	    if(ord >= values().length) {
	      ord = 0;
	    }
	    return values()[ord];
	  }

	}