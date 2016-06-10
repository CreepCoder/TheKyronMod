package com.CreepCoder.kyron.block;

import com.CreepCoder.kyron.lib.reference.BlockNames;

import net.minecraft.block.material.Material;

public class BlockKyronBricks extends BlockTKM
	{
    public BlockKyronBricks()
    {
        super(Material.rock);
        this.setBlockName(BlockNames.BLOCKNAME_BLOCKKYRONBRICKS);
        this.setHardness(2.5F);
        this.setResistance(2.0F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 2);
    }
}
