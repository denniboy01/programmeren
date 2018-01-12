package com.denniboy01.EnergyTech.energy.conduit.power;

import com.denniboy01.EnergyTech.energy.interfaces.ICapacitor;
import com.denniboy01.EnergyTech.energy.interfaces.IPowerInterface;

import net.minecraftforge.common.util.ForgeDirection;

public interface IPowerConduit extends IConduit, IInternalPowerHandler, IExtractor {

	  public static final String ICON_KEY = "enderio:powerConduit";
	  public static final String ICON_KEY_INPUT = "enderio:powerConduitInput";
	  public static final String ICON_KEY_OUTPUT = "enderio:powerConduitOutput";
	  public static final String ICON_CORE_KEY = "enderio:powerConduitCore";
	  public static final String ICON_TRANSMISSION_KEY = "enderio:powerConduitTransmission";

	  public static final String COLOR_CONTROLLER_ID = "ColorController";

	  IPowerInterface getExternalPowerReceptor(ForgeDirection direction);

	  ICapacitor getCapacitor();

	  int getMaxEnergyExtracted(ForgeDirection dir);

	  @Override
	  int getMaxEnergyRecieved(ForgeDirection dir);

	  IIcon getTextureForInputMode();

	  IIcon getTextureForOutputMode();

	  
	  void onTick();
	  
	  boolean getConnectionsDirty();


	}
