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
		/*
		GameRegistry.addRecipe(new ItemStack(Blocks.bedrock), 		" x ", "y y", " x ",
		'x', Blocks.dirt, 'y', Blocks.cobblestone);
		*/
		
		//ItemStack LimeDye 	  = new ItemStack(Items.dye, 1, 10);
		
		/*
		GameRegistry.addRecipe(new ItemStack(ModItems.BasicCircuit), 		"czc", "a a", "byb",
		'x', ModItems.CircuitBoard, 'y', ModItems.Resistor, 'z', 'a', ModItems.Capacitor, 'b', ModItems.Transistor, 'c', ModItems.LEDGreen);
		*/

	}
}
