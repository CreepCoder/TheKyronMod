package com.CreepCoder.kyron.creativetab;

import com.CreepCoder.kyron.init.ModBlocks;
import com.CreepCoder.kyron.lib.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabKyron
{
    public static final CreativeTabs KYRON_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return Items.apple;
        	//return Item.getItemFromBlock(Blocks.anvil);
        }
    };

}
