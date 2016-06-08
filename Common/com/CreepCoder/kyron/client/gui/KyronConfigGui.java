package com.CreepCoder.kyron.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import com.CreepCoder.kyron.handler.ConfigurationHandler;
import com.CreepCoder.kyron.lib.reference.Reference;

import cpw.mods.fml.client.config.GuiConfig;

public class KyronConfigGui extends GuiConfig
{
    public KyronConfigGui(GuiScreen guiScreen)
    {
        super(guiScreen, 
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID, 
                false, 
                false, 
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
       
    }
}
                
        