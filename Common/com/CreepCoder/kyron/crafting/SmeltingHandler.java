package com.CreepCoder.kyron.crafting;

import com.CreepCoder.kyron.init.ModBlocks;
import com.CreepCoder.kyron.init.ModItems;
import com.CreepCoder.kyron.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class SmeltingHandler 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.BlockKyronOre, 	new ItemStack(ModItems.IngotKyron), 0.5f);
	}
}
