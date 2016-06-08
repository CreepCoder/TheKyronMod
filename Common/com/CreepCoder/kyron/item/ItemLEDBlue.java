package com.CreepCoder.kyron.item;

import com.CreepCoder.kyron.lib.reference.ItemNames;
import com.CreepCoder.kyron.lib.utility.ChatMessageHelper;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemLEDBlue extends ItemTKM 
{
    public ItemLEDBlue() 
    {
        super();
        this.setUnlocalizedName(null);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("A blue colored LED.", entityPlayer);
        }
        return ItemStack;

    }
}
