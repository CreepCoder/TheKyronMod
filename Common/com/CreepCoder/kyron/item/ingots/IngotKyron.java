package com.CreepCoder.kyron.item.ingots;

import com.CreepCoder.kyron.item.ItemTKM;
import com.CreepCoder.kyron.lib.reference.ItemNames;
import com.CreepCoder.kyron.lib.utility.ChatMessageHelper;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class IngotKyron extends ItemTKM
{
    public IngotKyron() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_INGOTKYRON);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("A piece of strange blue metal.", entityPlayer);
        }
        return ItemStack;

    }
}
