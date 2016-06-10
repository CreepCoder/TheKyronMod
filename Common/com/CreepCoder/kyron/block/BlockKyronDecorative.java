package com.CreepCoder.kyron.block;

import com.CreepCoder.kyron.lib.reference.BlockNames;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockKyronDecorative extends BlockTKM
	{
    public BlockKyronDecorative()
    {
        super(Material.rock);
        this.setBlockName(BlockNames.BLOCKNAME_BLOCKKYRONDECORATIVE);
        this.setHardness(2.5F);
        this.setResistance(2.0F);
        this.setStepSound(soundTypeMetal);
        this.setHarvestLevel("pickaxe", 2);
    }
	}
