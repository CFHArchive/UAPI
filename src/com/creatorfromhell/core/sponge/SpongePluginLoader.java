package com.creatorfromhell.core.sponge;

import org.spongepowered.api.plugin.Plugin;

import com.creatorfromhell.core.uapi.UPlugin;
import com.creatorfromhell.core.uapi.UPluginLoader;
import com.creatorfromhell.core.uapi.event.UEventFactory;

@Plugin(id = "universal_api", name = "UAPI", version = "0.0.0.1",
description = "An API created to allow plugin authors to write once, support all.",
url = "https://creatorfromhell.com",
authors = {"creatorfromhell"})
public class SpongePluginLoader implements UPluginLoader {

	private UPlugin instance;
	private UEventFactory eventFactory;
	
	@Override
	public void onEnable() {
		SpongeServer server = new SpongeServer(this);
		eventFactory = new UEventFactory(server);
		
		try {
			//TODO: Configuration
			Class<?> main = Class.forName("");
			instance = (UPlugin)main.newInstance();
			instance.onEnable(server);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
		
	}

	@Override
	public UPlugin getPluginInstance() {
		return instance;
	}

	@Override
	public UEventFactory getEventFactory() {
		return eventFactory;
	}

}