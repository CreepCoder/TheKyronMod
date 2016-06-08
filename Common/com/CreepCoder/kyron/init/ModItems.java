package com.CreepCoder.kyron.init;

import com.CreepCoder.kyron.item.ingots.IngotKyron;
import com.CreepCoder.kyron.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    //Declare the items
    public static Item IngotKyron;
    
    public static void init()
    {
        //Add the items
        IngotKyron = new IngotKyron();
        
        //Register the items
        GameRegistry.registerItem(IngotKyron, "IngotKyron");

    }
}
