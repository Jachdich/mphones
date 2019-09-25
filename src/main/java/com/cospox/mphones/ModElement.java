package com.cospox.mphones;

import java.util.Random;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class ModElement {

	public static Main instance;

	public ModElement(Main instance) {
		ModElement.instance = instance;
	}

	public void init(FMLInitializationEvent event) {
	}

	public void preInit(FMLPreInitializationEvent event) {
	}

	public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
	}

	public void serverLoad(FMLServerStartingEvent event) {
	}

	public void registerModels(ModelRegistryEvent event) {
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}
}