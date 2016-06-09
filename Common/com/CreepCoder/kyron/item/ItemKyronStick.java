package com.CreepCoder.kyron.item;

import com.CreepCoder.kyron.lib.reference.ItemNames;
import com.CreepCoder.kyron.lib.utility.ChatMessageHelper;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemKyronStick extends ItemTKM 
{
    public ItemKyronStick() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_KYRONSTICK);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("A stick made from Kyron, maybe this is strong enough to create Kyron tools with.", entityPlayer);
        }
        return ItemStack;
    }
}
