package com.CreepCoder.kyron.crafting;

import com.CreepCoder.kyron.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class CraftingHandler 
{
	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(Blocks.bedrock),
			    " x ",
			    "y y",
			    " x ",
			    'x', Blocks.dirt, 'y', Blocks.cobblestone);
		
		/*
		GameRegistry.addRecipe(
    	new ItemStack(Block.stone),
    	"xyx",
    	"y y",
    	"xyx",
    	'x', dirtStack, 'y', gravelStack);
			
			     GameRegistry.addShapelessRecipe(diamondsStack, dirtStack, dirtStack,
                dirtStack, dirtStack, dirtStack, dirtStack, new ItemStack(
                        Block.sand), gravelStack, cobbleStack);
		 */
	}
}
