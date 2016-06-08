package com.CreepCoder.kyron.init;

import com.CreepCoder.kyron.lib.utility.RegisterHelper;
import com.CreepCoder.kyron.worldgeneration.WorldGeneratorHell;
import com.CreepCoder.kyron.worldgeneration.WorldGeneratorOverworld;

import cpw.mods.fml.common.IWorldGenerator;

public class ModWorldGeneration 
{
	//Declare the generator
	//public static IWorldGenerator Hellfire;
	public static IWorldGenerator Ores;
	
	public static void init()
	{
		//Add the generator
		//Hellfire = new WorldGeneratorHell();
		Ores = new WorldGeneratorOverworld();
	
		//Register the generator
		//RegisterHelper.registerIWorldGenerator(Hellfire);
		RegisterHelper.registerIWorldGenerator(Ores);
	}
	
}



