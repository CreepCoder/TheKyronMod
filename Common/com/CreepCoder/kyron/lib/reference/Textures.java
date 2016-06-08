package com.CreepCoder.kyron.lib.reference;


import com.CreepCoder.kyron.lib.utility.ResourceLocationHelper;

import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;

public class Textures
{
	public static final String TEXTURE_LOCATION_NAME = "kyron";
    public static final String RESOURCE_PREFIX = TEXTURE_LOCATION_NAME + ":";
    
    // Base file paths
    public static final String LOCATION_SHEET_ARMOR = "textures/armor/";


    // Item/Block sprite sheets
    public static final ResourceLocation VANILLA_BLOCK_TEXTURE_SHEET = TextureMap.locationBlocksTexture;
    public static final ResourceLocation VANILLA_ITEM_TEXTURE_SHEET = TextureMap.locationItemsTexture;
    
    
    // Texture Blocks
    public static final String TEXTURE_BLOCKKYRON       = RESOURCE_PREFIX + BlockNames.BLOCKNAME_BLOCKKYRON;

    // Texture Items
    public static final String TEXTURE_INGOTKYRON		= RESOURCE_PREFIX + ItemNames.ITEMNAME_INGOTKYRON;

    
    // Other Textures
    public static final String ENTITY_HELLFIRE_LAYER1	  = RESOURCE_PREFIX + LOCATION_SHEET_ARMOR + "hellfire_layer_1"			+ ".png";
    public static final String ENTITY_HELLFIRE_LAYER2	  = RESOURCE_PREFIX + LOCATION_SHEET_ARMOR + "hellfire_layer_2" 		+ ".png";

    
}