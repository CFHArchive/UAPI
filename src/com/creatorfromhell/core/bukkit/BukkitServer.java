package com.creatorfromhell.core.bukkit;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

import com.creatorfromhell.core.uapi.UPluginLoader;
import com.creatorfromhell.core.uapi.UServer;

public class BukkitServer extends UServer {
	
	Map<String, Listener> supported = new HashMap<String, Listener>();

	public BukkitServer(UPluginLoader loader) {
		super(loader);
	}
	
	public boolean isSupported(String event) {
		return supported.containsKey(event);
	}

	@Override
	public void registerEvent(String event) {
		if(isSupported(event)) {
			Bukkit.getServer().getPluginManager().registerEvents(supported.get(event), (BukkitPluginLoader)loader);
		}
	}
}