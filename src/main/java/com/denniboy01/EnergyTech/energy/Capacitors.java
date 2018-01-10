package com.denniboy01.EnergyTech.energy;


import net.minecraft.item.ItemStack;
import com.denniboy01.EnergyTech.energy.interfaces.ICapacitor;

public enum Capacitors {

  BASIC_CAPACITOR(
      new BasicCapacitor(80, 100000, 20),
      "basicCapacitor"),

  public final ICapacitor capacitor;
  public final String unlocalisedName;
  public final String iconKey;

  private Capacitors(ICapacitor capacitor, String unlocalisedName) {
    this.capacitor = capacitor;
    this.unlocalisedName = "enderio." + unlocalisedName;
    this.iconKey = "enderio:" + unlocalisedName;
  }

  public ItemStack getItemStack() {
    return new ItemStack(EnergyTech.itemBasicCapacitor, 1, ordinal());
  }

}

