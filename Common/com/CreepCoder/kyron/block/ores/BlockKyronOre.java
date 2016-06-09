package com.CreepCoder.kyron.block.ores;

import com.CreepCoder.kyron.block.BlockTKM;
import com.CreepCoder.kyron.lib.reference.BlockNames;

import net.minecraft.block.material.Material;

public class BlockKyronOre extends BlockTKM
{
    public BlockKyronOre()
    {
        super(Material.rock);
        this.setBlockName(BlockNames.BLOCKNAME_BLOCKKYRONORE);
        this.setHardness(4.0F);
        this.setResistance(2.0F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 3);
    }
}
