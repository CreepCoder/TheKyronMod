package com.CreepCoder.kyron.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.CreepCoder.kyron.creativetab.CreativeTabKyron;
import com.CreepCoder.kyron.lib.reference.ItemNames;
import com.CreepCoder.kyron.lib.reference.Reference;
import com.CreepCoder.kyron.lib.reference.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemKyronBoots extends ItemArmor
{
    public ItemKyronBoots()
    {
    	/** Stores the armor type: 0 is helmet, 1 is plate, 2 is legs and 3 is boots */
        super(Material.KyronArmor, 0, 3);
        this.setUnlocalizedName(ItemNames.ITEMNAME_KYRONBOOTS);
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabKyron.KYRON_TAB);
    }
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        return Textures.ENTITY_KYRON_LAYER1;
    }
    
    //ItemTKM Copy, omdat ik niet extends ItemRC en ItemArmor tegelijk kan doen. Ik heb geprobeerd om ItemArmorRC aan te maken, zonder succes.
    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        //item.modid:item.name
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
