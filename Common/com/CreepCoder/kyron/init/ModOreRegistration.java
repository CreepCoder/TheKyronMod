package com.CreepCoder.kyron.init;

import com.CreepCoder.kyron.lib.reference.BlockNames;

import net.minecraftforge.oredict.OreDictionary;

public class ModOreRegistration
{
    public static void init()
    {
        OreDictionary.registerOre("oreKyron", ModBlocks.BlockKyronOre);
    }
}
