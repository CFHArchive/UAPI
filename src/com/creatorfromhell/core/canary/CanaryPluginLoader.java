package com.creatorfromhell.core.canary;

import net.canarymod.plugin.Plugin;

import com.creatorfromhell.core.uapi.UPlugin;
import com.creatorfromhell.core.uapi.UPluginLoader;

public class CanaryPluginLoader extends Plugin implements UPluginLoader {

	UPlugin instance;
	
	@Override
	public void onEnable() {
		CanaryServer server = new CanaryServer(this);
		
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
		instance.onDisable();
	}

	@Override
	public UPlugin getPluginInstance() {
		return instance;
	}

	@Override
	public void disable() {
		onDisable();
	}

	@Override
	public boolean enable() {
		onEnable();
		return true;
	}

}