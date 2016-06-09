package com.CreepCoder.kyron.init;

import com.CreepCoder.kyron.item.ItemKyronAxe;
import com.CreepCoder.kyron.item.ItemKyronBoots;
import com.CreepCoder.kyron.item.ItemKyronChestplate;
import com.CreepCoder.kyron.item.ItemKyronHelmet;
import com.CreepCoder.kyron.item.ItemKyronHoe;
import com.CreepCoder.kyron.item.ItemKyronPickaxe;
import com.CreepCoder.kyron.item.ItemKyronShovel;
import com.CreepCoder.kyron.item.ItemKyronStick;
import com.CreepCoder.kyron.item.ItemKyronSword;
import com.CreepCoder.kyron.item.ingots.IngotKyron;
import com.CreepCoder.kyron.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    //Declare the items
	public static Item IngotKyron;
    public static Item KyronStick;
    
    public static Item KyronHelmet;
    public static Item KyronChestplate;
    public static Item KyronLeggings;
    public static Item KyronBoots;
    
    public static Item KyronSword;
    public static Item KyronPickaxe;
    public static Item KyronAxe;
    public static Item KyronShovel;
    public static Item KyronHoe;
    
    public static void init()
    {
        //Add the items
    	IngotKyron = new IngotKyron();
    	KyronStick = new ItemKyronStick();
        
    	KyronHelmet = new ItemKyronHelmet();
    	KyronChestplate = new ItemKyronChestplate();
    	KyronLeggings = new ItemKyronChestplate();
    	KyronBoots = new ItemKyronBoots();
        
    	KyronSword = new ItemKyronSword();
    	KyronPickaxe = new ItemKyronPickaxe();
    	KyronAxe = new ItemKyronAxe();
    	KyronShovel = new ItemKyronShovel();
    	KyronHoe = new ItemKyronHoe();
        
        
        //Register the items
        GameRegistry.registerItem(IngotKyron, "IngotKyron");
        GameRegistry.registerItem(KyronStick, "KyronStick");
        
        GameRegistry.registerItem(KyronHelmet, "KyronHelmet");
        GameRegistry.registerItem(KyronChestplate, "KyronChestplate");
        GameRegistry.registerItem(KyronLeggings, "KyronLeggings");
        GameRegistry.registerItem(KyronBoots, "KyronBoots");
        
        GameRegistry.registerItem(KyronSword, "KyronSword");
        GameRegistry.registerItem(KyronPickaxe, "KyronPickaxe");
        GameRegistry.registerItem(KyronAxe, "KyronAxe");
        GameRegistry.registerItem(KyronShovel, "KyronShovel");
        GameRegistry.registerItem(KyronHoe, "KyronHoe");

    }
}
