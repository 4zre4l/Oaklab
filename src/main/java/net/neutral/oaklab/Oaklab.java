package net.neutral.oaklab;

import net.fabricmc.api.ModInitializer;

import net.neutral.oaklab.block.ModBlocks;
import net.neutral.oaklab.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Oaklab implements ModInitializer {
	public static final String MOD_ID = "oaklab";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlock();
	}
}