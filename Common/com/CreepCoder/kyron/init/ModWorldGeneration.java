package com.CreepCoder.kyron.init;

import com.CreepCoder.kyron.lib.utility.RegisterHelper;
import com.CreepCoder.kyron.worldgeneration.WorldGeneratorHell;
import com.CreepCoder.kyron.worldgeneration.WorldGeneratorOverworld;

import cpw.mods.fml.common.IWorldGenerator;

public class ModWorldGeneration 
{
	//Declare the generator
	public static IWorldGenerator Kyron;
	
	public static void init()
	{
		//Add the generator
		Kyron = new WorldGeneratorOverworld();
	
		//Register the generator
		RegisterHelper.registerIWorldGenerator(Kyron);
	}
	
}



