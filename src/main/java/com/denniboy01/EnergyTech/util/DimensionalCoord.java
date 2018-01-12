package com.denniboy01.EnergyTech.util;


import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.World;





public class DimensionalCoord extends WorldCoord {

	private final World w;
	private final int dimId;

	public DimensionalCoord( DimensionalCoord s )
	{
		super( s.x, s.y, s.z );
		this.w = s.w;
		this.dimId = s.dimId;
	}

	public DimensionalCoord( TileEntity s )
	{
		super( s );
		this.w = s.getWorldObj();
		this.dimId = this.w.provider.dimensionId;
	}

	public DimensionalCoord( World _w, int _x, int _y, int _z )
	{
		super( _x, _y, _z );
		this.w = _w;
		this.dimId = _w.provider.dimensionId;
	}

	@Override
	public DimensionalCoord copy()
	{
		return new DimensionalCoord( this );
	}

	@Override
	public int hashCode()
	{
		return super.hashCode() ^ this.dimId;
	}

	@Override
	public boolean equals( Object obj )
	{
		return obj instanceof DimensionalCoord && this.isEqual( (DimensionalCoord) obj );
	}

	public boolean isEqual( DimensionalCoord c )
	{
		return this.x == c.x && this.y == c.y && this.z == c.z && c.w == this.w;
	}

	@Override
	public String toString()
	{
		return "dimension=" + this.dimId + ", " + super.toString();
	}

	public boolean isInWorld( World world )
	{
		return this.w == world;
	}

	public World getWorld()
	{
		return this.w;
	}
}
