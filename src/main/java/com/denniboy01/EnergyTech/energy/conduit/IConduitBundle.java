package com.denniboy01.EnergyTech.energy.conduit;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.denniboy01.EnergyTech.common.util.BlockCoord;
import com.denniboy01.EnergyTech.energy.interfaces.IInternalPowerHandler;
import com.denniboy01.EnergyTech.transport.IItemDuct;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.IFluidHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface IConduitBundle extends IInternalPowerHandler, IFluidHandler, IItemDuct, IGridHost,
    IMicroblockSupporterTile, Environment, SidedEnvironment {

  TileEntity getEntity();

  @Override
  BlockCoord getLocation();

  
  boolean hasType(Class<? extends IConduit> type);

  <T extends IConduit> T getConduit(Class<T> type);

  void addConduit(IConduit conduit);

  void removeConduit(IConduit conduit);

  Collection<IConduit> getConduits();

  Offset getOffset(Class<? extends IConduit> type, ForgeDirection dir);

  

  Set<ForgeDirection> getConnections(Class<? extends IConduit> type);

  boolean containsConnection(Class<? extends IConduit> type, ForgeDirection west);

  Set<ForgeDirection> getAllConnections();

  boolean containsConnection(ForgeDirection dir);

  

  List<CollidableComponent> getCollidableComponents();

  List<CollidableComponent> getConnectors();

  

  void onNeighborBlockChange(Block blockId);
  
  void onNeighborChange(IBlockAccess world, int x, int y, int z, int tileX, int tileY, int tileZ);

  void onBlockRemoved();

  void dirty();

  // Facade

  enum FacadeRenderState {
    NONE,
    FULL,
    WIRE_FRAME
  }

  @SideOnly(Side.CLIENT)
  FacadeRenderState getFacadeRenderedAs();

  @SideOnly(Side.CLIENT)
  void setFacadeRenderAs(FacadeRenderState state);

  int getLightOpacity();

  void setLightOpacity(int opacity);

  boolean hasFacade();

  void setFacadeId(Block block);

  void setFacadeId(Block block, boolean triggerUpdate);

  void setFacadeMetadata(int meta);

  void setFacadeType(FacadeType type);

  Block getFacadeId();

  int getFacadeMetadata();

  FacadeType getFacadeType();

  World getWorld();

  void setGridNode(Object node);
}
