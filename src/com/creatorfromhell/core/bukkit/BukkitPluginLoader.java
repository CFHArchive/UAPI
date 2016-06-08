package com.creatorfromhell.core.bukkit;

import org.bukkit.plugin.java.JavaPlugin;

import com.creatorfromhell.core.uapi.UPlugin;
import com.creatorfromhell.core.uapi.UPluginLoader;

public class BukkitPluginLoader extends JavaPlugin implements UPluginLoader {

	UPlugin instance;
	
	@Override
	public void onEnable() {
		BukkitServer server = new BukkitServer(this);
		
		try {
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
}