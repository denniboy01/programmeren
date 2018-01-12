package com.denniboy01.EnergyTech.util;


import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraft.tileentity.TileEntity;


public class WorldCoord
{

	public int x;
	public int y;
	public int z;
	
	public WorldCoord(BlockPos pos) {
		this(pos.getX(), pos.getY(), pos.getZ());
  }
	public WorldCoord(TileEntity e) {
		this(e.getPos());
	}

	public WorldCoord( int _x, int _y, int _z )
	{
		this.x = _x;
		this.y = _y;
		this.z = _z;
	}

	

	public WorldCoord subtract( ForgeDirection direction, int length )
	{
		this.x -= direction.offsetX * length;
		this.y -= direction.offsetY * length;
		this.z -= direction.offsetZ * length;
		return this;
	}

	public WorldCoord add( int _x, int _y, int _z )
	{
		this.x += _x;
		this.y += _y;
		this.z += _z;
		return this;
	}

	public WorldCoord subtract( int _x, int _y, int _z )
	{
		this.x -= _x;
		this.y -= _y;
		this.z -= _z;
		return this;
	}

	public WorldCoord multiple( int _x, int _y, int _z )
	{
		this.x *= _x;
		this.y *= _y;
		this.z *= _z;
		return this;
	}

	public WorldCoord divide( int _x, int _y, int _z )
	{
		this.x /= _x;
		this.y /= _y;
		this.z /= _z;
		return this;
	}

	
	public ForgeDirection directionTo( WorldCoord loc )
	{
		int ox = this.x - loc.x;
		int oy = this.y - loc.y;
		int oz = this.z - loc.z;

		int xlen = Math.abs( ox );
		int ylen = Math.abs( oy );
		int zlen = Math.abs( oz );

		if( loc.isEqual( this.copy().add( ForgeDirection.EAST, xlen ) ) )
		{
			return ForgeDirection.EAST;
		}

		if( loc.isEqual( this.copy().add( ForgeDirection.WEST, xlen ) ) )
		{
			return ForgeDirection.WEST;
		}

		if( loc.isEqual( this.copy().add( ForgeDirection.NORTH, zlen ) ) )
		{
			return ForgeDirection.NORTH;
		}

		if( loc.isEqual( this.copy().add( ForgeDirection.SOUTH, zlen ) ) )
		{
			return ForgeDirection.SOUTH;
		}

		if( loc.isEqual( this.copy().add( ForgeDirection.UP, ylen ) ) )
		{
			return ForgeDirection.UP;
		}

		if( loc.isEqual( this.copy().add( ForgeDirection.DOWN, ylen ) ) )
		{
			return ForgeDirection.DOWN;
		}

		return null;
	}

	public boolean isEqual( WorldCoord c )
	{
		return this.x == c.x && this.y == c.y && this.z == c.z;
	}

	public WorldCoord add( ForgeDirection direction, int length )
	{
		this.x += direction.offsetX * length;
		this.y += direction.offsetY * length;
		this.z += direction.offsetZ * length;
		return this;
	}

	public WorldCoord copy()
	{
		return new WorldCoord( this.x, this.y, this.z );
	}

	@Override
	public int hashCode()
	{
		return ( this.y << 24 ) ^ this.x ^ this.z;
	}

	@Override
	public boolean equals( Object obj )
	{
		return obj instanceof WorldCoord && this.isEqual( (WorldCoord) obj );
	}

	@Override
	public String toString()
	{
		return "x=" + this.x + ", y=" + this.y + ", z=" + this.z;
	}
}
