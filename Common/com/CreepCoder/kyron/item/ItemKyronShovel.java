package com.CreepCoder.kyron.item;

import com.CreepCoder.kyron.creativetab.CreativeTabKyron;
import com.CreepCoder.kyron.lib.reference.ItemNames;
import com.CreepCoder.kyron.lib.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemKyronShovel extends ItemTool
{
	public ItemKyronShovel()
	{
		super(8, Material.KyronTools, null);
		this.setUnlocalizedName(ItemNames.ITEMNAME_KYRONSHOVEL);
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabKyron.KYRON_TAB);
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
