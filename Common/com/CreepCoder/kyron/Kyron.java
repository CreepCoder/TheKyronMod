package com.CreepCoder.kyron;

import com.CreepCoder.kyron.crafting.BlocksCraftingHandler;
import com.CreepCoder.kyron.crafting.CraftingHandler;
import com.CreepCoder.kyron.crafting.ItemsCraftingHandler;
import com.CreepCoder.kyron.crafting.SmeltingHandler;
import com.CreepCoder.kyron.handler.ConfigurationHandler;
import com.CreepCoder.kyron.init.ModBlocks;
import com.CreepCoder.kyron.init.ModItems;
import com.CreepCoder.kyron.init.ModOreRegistration;
import com.CreepCoder.kyron.init.ModWorldGeneration;
import com.CreepCoder.kyron.lib.reference.Reference;
import com.CreepCoder.kyron.lib.utility.LogHelper;
import com.CreepCoder.kyron.proxy.CommonProxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER, guiFactory = Reference.GUI_FACTORY_CLASS)

public class Kyron {
	
	@Instance(Reference.MOD_ID)
	public static Kyron instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;


		@EventHandler
		public void preInit(FMLPreInitializationEvent event) 
		{
		    ConfigurationHandler.init(event.getSuggestedConfigurationFile()); 
		    FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		    ModBlocks.init();
            ModItems.init();
            ModWorldGeneration.init();
            
            CraftingHandler.init();
            BlocksCraftingHandler.init();
            ItemsCraftingHandler.init();
            SmeltingHandler.init();
            ModOreRegistration.init();
            
            LogHelper.info("Pre Initialization Finished");	
		}

		@EventHandler
		public void load(FMLInitializationEvent event) 
		{
		    proxy.loadRenderers();
		    LogHelper.info("Initialization Finished");	
		}

		@EventHandler
		public void postInit(FMLPostInitializationEvent event) 
		{
		    LogHelper.info("Post Initialization Finished");
		}
	}


