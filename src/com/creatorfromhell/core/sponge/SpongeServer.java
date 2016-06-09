package com.creatorfromhell.core.sponge;

import java.util.HashMap;
import java.util.Map;

import org.spongepowered.api.Sponge;

import com.creatorfromhell.core.uapi.UPluginLoader;
import com.creatorfromhell.core.uapi.UServer;

public class SpongeServer extends UServer {

	Map<String, Object> supported = new HashMap<String, Object>();
	
	public SpongeServer(UPluginLoader loader) {
		super(loader);
	}
	
	public boolean isSupported(String event) {
		return supported.containsKey(event);
	}

	@Override
	public void registerEvent(String event) {
		if(isSupported(event)) {
			Sponge.getGame().getEventManager().registerListeners((SpongePluginLoader)loader, supported.get(event));
		}
	}
	
}