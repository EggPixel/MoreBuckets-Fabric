package cn.eggpixel;

import net.fabricmc.api.ModInitializer;

/**
 * This is Main class
 * */
public class Main implements ModInitializer {
	@Override
	public void onInitialize() {
		new ItemRegistry();
	}
}
