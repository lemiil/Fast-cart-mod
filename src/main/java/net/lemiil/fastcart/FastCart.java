package net.lemiil.fastcart;

import net.fabricmc.api.ModInitializer;

import net.lemiil.fastcart.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Change
public class FastCart implements ModInitializer {
	public static final String MOD_ID = "fast-cart";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}