package net.minecraft.world;

import net.minecraft.world.chunk.IChunkProvider;

public abstract class WorldProvider {
	public int dimensionId;
	public World worldObj;
	
	public void setDimension(int dim) {
		this.dimensionId = dim;
	}
	
	public String getSaveFolder() {
		return (dimensionId == 0 ? null : "DIM" + dimensionId);
	}
	
	public boolean shouldMapspin(String entity, double x, double y, double z) {
		return dimensionId < 0;
	}
}