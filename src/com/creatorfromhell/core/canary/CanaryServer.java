package com.creatorfromhell.core.canary;

import java.util.HashMap;
import java.util.Map;

import net.canarymod.Canary;
import net.canarymod.plugin.PluginListener;

import com.creatorfromhell.core.uapi.UPluginLoader;
import com.creatorfromhell.core.uapi.UServer;

public class CanaryServer extends UServer {
	
	Map<String, PluginListener> supported = new HashMap<String, PluginListener>();
	
	public CanaryServer(UPluginLoader loader) {
		super(loader);
		//TODO: Add supported events.
	}
	
	public boolean isSupported(String event) {
		return supported.containsKey(event);
	}

	@Override
	public void registerEvent(String event) {
		if(isSupported(event)) {
			Canary.hooks().registerListener(supported.get(event), (CanaryPluginLoader)loader);
		}
	}

}