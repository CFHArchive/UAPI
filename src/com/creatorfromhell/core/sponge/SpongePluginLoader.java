package com.creatorfromhell.core.sponge;

import org.spongepowered.api.plugin.Plugin;

import com.creatorfromhell.core.uapi.UPlugin;
import com.creatorfromhell.core.uapi.UPluginLoader;

@Plugin(id = "the_new_economy", name = "The New Economy", version = "0.0.1.0",
description = "A port of the feature-packed Bukkit economy plugin, The New Economy.",
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