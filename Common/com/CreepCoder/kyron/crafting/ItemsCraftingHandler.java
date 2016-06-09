package com.CreepCoder.kyron.crafting;

import com.CreepCoder.kyron.init.ModItems;
import com.CreepCoder.kyron.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ItemsCraftingHandler 
{
	public static void init()
	{
		//ItemStack LimeDye 	  = new ItemStack(Items.dye, 1, 10);
		
		//GameRegistry.addRecipe(new ItemStack(ModItems.KyronStick), 		"xy ", "yx ", "   ",
		//'x', ModItems.IngotKyron, 'y', Items.stick);

		//KyronStick
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.KyronStick, 2), "xy ", "yx ", "   ", 'x', ModItems.IngotKyron, 'y', Items.stick);
		
		//KyronArmor
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.KyronHelmet), 		"xxx", "x x", "   ", 'x', ModItems.IngotKyron);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.KyronChestplate), 	"x x", "xxx", "xxx", 'x', ModItems.IngotKyron);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.KyronLeggings), 		"xxx", "x x", "x x", 'x', ModItems.IngotKyron);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.KyronBoots), 		"   ", "x x", "x x", 'x', ModItems.IngotKyron);
		
		//KyronTools
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.KyronSword), 		" x ", " x ", " y ", 'x', ModItems.IngotKyron, 'y', ModItems.KyronStick);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.KyronPickaxe), 		"xxx", " y ", " y ", 'x', ModItems.IngotKyron, 'y', ModItems.KyronStick);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.KyronAxe), 			"xx ", "xy ", " y ", 'x', ModItems.IngotKyron, 'y', ModItems.KyronStick);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.KyronShovel), 		"xy ", "yx ", " y ", 'x', ModItems.IngotKyron, 'y', ModItems.KyronStick);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.KyronHoe), 			"xx ", " y ", " y ", 'x', ModItems.IngotKyron, 'y', ModItems.KyronStick);
	}
}
