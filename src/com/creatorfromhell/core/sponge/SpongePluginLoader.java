package com.creatorfromhell.core.sponge;

import org.spongepowered.api.plugin.Plugin;

import com.creatorfromhell.core.uapi.UPlugin;
import com.creatorfromhell.core.uapi.UPluginLoader;

@Plugin(id = "universal_api", name = "UAPI", version = "0.0.0.1",
description = "An API created to allow plugin authors to write once, support all.",
url = "https://creatorfromhell.com",
authors = {"creatorfromhell"})
public class SpongePluginLoader implements UPluginLoader {

	UPlugin instance;
	
	@Override
	public void onEnable() {
		
	}

	@Override
	public void onDisable() {
		
	}

	@Override
	public UPlugin getPluginInstance() {
		return instance;
	}

}