package com.CreepCoder.kyron.lib.reference;


import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;

public class Textures
{
	public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";
    
    // Base file paths
    public static final String LOCATION_SHEET_ARMOR = "textures/armor/";

    // Item/Block sprite sheets
    public static final ResourceLocation VANILLA_BLOCK_TEXTURE_SHEET = TextureMap.locationBlocksTexture;
    public static final ResourceLocation VANILLA_ITEM_TEXTURE_SHEET = TextureMap.locationItemsTexture;
    
    // Texture Blocks
    public static final String TEXTURE_BLOCKKYRON       = RESOURCE_PREFIX + BlockNames.BLOCKNAME_BLOCKKYRON;

    // Texture Items
    public static final String TEXTURE_INGOTKYRON		= RESOURCE_PREFIX + ItemNames.ITEMNAME_INGOTKYRON;
    public static final String TEXTURE_KYRONSTICK		= RESOURCE_PREFIX + ItemNames.ITEMNAME_KYRONSTICK;
    
    public static final String TEXTURE_KYRONHELMET		= RESOURCE_PREFIX + ItemNames.ITEMNAME_KYRONHELMET;
	public static final String TEXTURE_KYRONCHESTPLATE	= RESOURCE_PREFIX + ItemNames.ITEMNAME_KYRONCHESTPLATE;
	public static final String TEXTURE_KYRONLEGGINGS	= RESOURCE_PREFIX + ItemNames.ITEMNAME_KYRONLEGGINGS;
	public static final String TEXTURE_KYRONBOOTS		= RESOURCE_PREFIX + ItemNames.ITEMNAME_KYRONBOOTS;
	
	public static final String TEXTURE_KYRONSWORD		= RESOURCE_PREFIX + ItemNames.ITEMNAME_KYRONSWORD;
	public static final String TEXTURE_KYRONPICKAXE		= RESOURCE_PREFIX + ItemNames.ITEMNAME_KYRONPICKAXE;
	public static final String TEXTURE_KYRONAXE			= RESOURCE_PREFIX + ItemNames.ITEMNAME_KYRONAXE;
	public static final String TEXTURE_KYRONSHOVEL		= RESOURCE_PREFIX + ItemNames.ITEMNAME_KYRONSHOVEL;
	public static final String TEXTURE_KYRONHOE			= RESOURCE_PREFIX + ItemNames.ITEMNAME_KYRONHOE;
	
    
    // Other Textures
    public static final String ENTITY_KYRON_LAYER1	  = RESOURCE_PREFIX + LOCATION_SHEET_ARMOR + "kyron_layer_1"	+ ".png";
    public static final String ENTITY_KYRON_LAYER2	  = RESOURCE_PREFIX + LOCATION_SHEET_ARMOR + "kyron_layer_2" 	+ ".png";

    
}