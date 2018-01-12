package com.denniboy01.EnergyTech.networking;

import com.denniboy01.EnergyTech.util.IReadOnlyCollection;

public interface IMachineSet extends IReadOnlyCollection<IGridNode>
{

	Class<? extends IGridHost> getMachineClass();
}
