package com.CreepCoder.kyron.block;

import com.CreepCoder.kyron.creativetab.CreativeTabKyron;
import com.CreepCoder.kyron.lib.reference.BlockNames;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockKyron extends BlockTKM
{
    public BlockKyron()
    {
        super(Material.iron);
        this.setBlockName(BlockNames.BLOCKNAME_BLOCKKYRON);
        this.setHardness(2.5F);
        this.setResistance(2.0F);
        this.setStepSound(soundTypeMetal);
        this.setHarvestLevel("pickaxe", 2);
    }
}