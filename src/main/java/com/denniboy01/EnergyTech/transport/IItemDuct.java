package com.denniboy01.EnergyTech.transport;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.ForgeDirection;

public interface IItemDuct {
	
	public ItemStack insertItem(ForgeDirection from, ItemStack item);

}
