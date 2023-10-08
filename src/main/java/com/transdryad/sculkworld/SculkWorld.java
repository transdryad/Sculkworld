package com.transdryad.sculkworld;

import com.transdryad.sculkworld.block.ModBlocks;
import com.transdryad.sculkworld.item.ModItemGroups;
import com.transdryad.sculkworld.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SculkWorld implements ModInitializer {
	public static final String MOD_ID = "sculkworld";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}