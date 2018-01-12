package com.denniboy01.EnergyTech.networking;

import com.denniboy01.EnergyTech.util.IReadOnlyCollection;

public interface IGrid {
	
	<C extends IGridCache> C getCache(Class<? extends IGridCache> iface);
	
	IReadOnlyCollection<Class<? extends IGridHost>> getMachinesClasses();
	
	IMachineSet getMachines( Class<? extends IGridHost> gridHostClass );

	
	IReadOnlyCollection<IGridNode> getNodes();

	
	boolean isEmpty();

	
	IGridNode getPivot();

}
