package net.minecraft.world;

import net.minecraft.block.Block;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.init.Blocks;
import net.minecraft.util.ReportedException;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.IBlockAccess;

public class World {
	protected IChunkProvider chunkProvider;



	public Block getTopBlock(int p_147474_1_, int p_147474_2_)
    {
        int k;

        for (k = 63; !this.isAirBlock(p_147474_1_, k + 1, p_147474_2_); ++k)
        {
            ;
        }

        return this.getBlock(p_147474_1_, k, p_147474_2_);
    }
    

    private boolean isAirBlock(int p_147474_1_, int i, int p_147474_2_) {
		// TODO Auto-generated method stub
		return false;
	}


	public Block getBlock(int p_147439_1_, int p_147439_2_, int p_147439_3_)
    {
        if (p_147439_1_ >= -30000000 && p_147439_3_ >= -30000000 && p_147439_1_ < 30000000 && p_147439_3_ < 30000000 && p_147439_2_ >= 0 && p_147439_2_ < 256)
        {
        	
        	Chunk chunk = null;

            try
            {
            	chunk = this.getChunkFromChunkCoords(p_147439_1_ >> 4, p_147439_3_ >> 4);
                return chunk.getBlock(p_147439_1_ & 15, p_147439_2_, p_147439_3_ & 15);
            }
            catch (Throwable throwable)
            {
                CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Exception getting block type in world");
                CrashReportCategory crashreportcategory = crashreport.makeCategory("Requested block coordinates");
                crashreportcategory.addCrashSection("Found chunk", Boolean.valueOf(chunk == null));
                throw new ReportedException(crashreport);
            }
        }
        else
        {
            return Blocks.AIR;
        }
    }



    public Chunk getChunkFromChunkCoords(int p_72964_1_, int p_72964_2_)
    {
        return this.chunkProvider.provideChunk(p_72964_1_, p_72964_2_);
    }

}
