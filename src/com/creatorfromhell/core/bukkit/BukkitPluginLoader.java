package com.creatorfromhell.core.bukkit;

import org.bukkit.plugin.java.JavaPlugin;

import com.creatorfromhell.core.uapi.UPlugin;
import com.creatorfromhell.core.uapi.UPluginLoader;
import com.creatorfromhell.core.uapi.event.UEventFactory;

public class BukkitPluginLoader extends JavaPlugin implements UPluginLoader {

	UPlugin instance;
	UEventFactory eventFactory;
	
	@Override
	public void onEnable() {
		BukkitServer server = new BukkitServer(this);
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
		instance.onDisable();
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