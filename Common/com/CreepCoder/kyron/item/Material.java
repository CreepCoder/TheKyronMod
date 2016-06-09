package com.CreepCoder.kyron.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Material 
{
	public static ArmorMaterial KyronArmor = EnumHelper.addArmorMaterial("Kyron", 30, new int[] {3, 7, 6, 3}, 18);
	public static ToolMaterial KyronTools = EnumHelper.addToolMaterial("Kyron", 3, 1000, 5, 5, 18);
}
