package com.CreepCoder.kyron.crafting;

import com.CreepCoder.kyron.init.ModBlocks;
import com.CreepCoder.kyron.init.ModItems;
import com.CreepCoder.kyron.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class BlocksCraftingHandler 
{
	public static void init()
	{
		//KyronBlock -> Ingots
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IngotKyron, 9), new Object[]
			{
				ModBlocks.BlockKyron
			});
		
		//KyronBlock
		GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockKyron), "xxx", "xxx", "xxx",
				'x', ModItems.IngotKyron);
	}
}
