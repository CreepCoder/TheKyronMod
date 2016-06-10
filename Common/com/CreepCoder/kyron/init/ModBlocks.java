package com.CreepCoder.kyron.init;

import com.CreepCoder.kyron.block.BlockKyron;
import com.CreepCoder.kyron.block.BlockKyronBricks;
import com.CreepCoder.kyron.block.BlockKyronDecorative;
import com.CreepCoder.kyron.block.ores.BlockKyronOre;
import com.CreepCoder.kyron.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    //Declare the blocks
	public static Block BlockKyron;
	public static Block BlockKyronBricks;
	public static Block BlockKyronDecorative;
	
    //Ores
	public static Block BlockKyronOre;
    
    public static void init()
    {
        //Add the blocks
    	BlockKyron = new BlockKyron();
    	BlockKyronBricks = new BlockKyronBricks();
    	BlockKyronDecorative = new BlockKyronDecorative();
        
        //Ores
    	BlockKyronOre = new BlockKyronOre();
        
        //Register the blocks
      	GameRegistry.registerBlock(BlockKyron, "BlockKyron");
      	GameRegistry.registerBlock(BlockKyronBricks, "BlockKyronBricks");
      	GameRegistry.registerBlock(BlockKyronDecorative, "BlockKyronDecorative");
        //Ores
        //RegisterHelper.registerBlock(BlockKyron);
    	GameRegistry.registerBlock(BlockKyronOre, "BlockKyronOre");
    }
}

