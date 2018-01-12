package com.denniboy01.EnergyTech.energy.conduit;

public enum ConnectionMode {

	  IN_OUT("gui.conduit.ioMode.inOut"),
	  INPUT("gui.conduit.ioMode.input"),
	  OUTPUT("gui.conduit.ioMode.output"),
	  DISABLED("gui.conduit.ioMode.disabled"),
	  NOT_SET("gui.conduit.ioMode.notSet");

	  private final String unlocalizedName;

	  ConnectionMode(String unlocalisedName) {
	    this.unlocalizedName = unlocalisedName;
	  }

	  public String getUnlocalisedName() {
	    return unlocalizedName;
	  }

	  public static ConnectionMode getNext(ConnectionMode mode) {
	    int ord = mode.ordinal() + 1;
	    if(ord >= ConnectionMode.values().length) {
	      ord = 0;
	    }
	    return ConnectionMode.values()[ord];
	  }

	  public static ConnectionMode getPrevious(ConnectionMode mode) {

	    int ord = mode.ordinal() - 1;
	    if(ord < 0) {
	      ord = ConnectionMode.values().length - 1;
	    }
	    return ConnectionMode.values()[ord];
	  }

	  public boolean acceptsInput() {
	    return this == IN_OUT || this == INPUT;
	  }

	  public boolean acceptsOutput() {
	    return this == IN_OUT || this == OUTPUT;
	  }

	  /*public String getLocalizedName() {
	    return lang.localize(unlocalizedName);
	  }*/
	}

