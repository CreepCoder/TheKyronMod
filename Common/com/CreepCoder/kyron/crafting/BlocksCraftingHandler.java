package com.CreepCoder.kyron.crafting;

import com.CreepCoder.kyron.init.ModBlocks;
import com.CreepCoder.kyron.init.ModItems;
import com.CreepCoder.kyron.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class BlocksCraftingHandler 
{
	public static void init()
	{
		ItemStack ChiseledBricks = new ItemStack(Blocks.stonebrick, 1, 3);
		
		//KyronBlock -> Ingots
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IngotKyron, 9), new Object[]
			{ModBlocks.BlockKyron});
		
		//KyronBlock
		GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockKyron), "xxx", "xxx", "xxx",
				'x', ModItems.IngotKyron);
		
		//KyronDecorative
		GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockKyronDecorative, 32), "x x", " y ", "x x",
				'x', ModItems.IngotKyron, 'y', ChiseledBricks);

		//KyronBricks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockKyronBricks, 32), "x x", " y ", "x x",
				'x', ModItems.IngotKyron, 'y', Blocks.stonebrick);
	}
}
