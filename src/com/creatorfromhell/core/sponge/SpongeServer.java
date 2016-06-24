package com.creatorfromhell.core.sponge;

import java.util.HashMap;
import java.util.Map;

import org.spongepowered.api.Sponge;

import com.creatorfromhell.core.uapi.ServerType;
import com.creatorfromhell.core.uapi.UPluginLoader;
import com.creatorfromhell.core.uapi.UServer;

public class SpongeServer extends UServer {

	Map<String, Object> supported = new HashMap<String, Object>();
	
	public SpongeServer(UPluginLoader loader) {
		super(loader);
		//TODO: Add supported events.
	}
	
	public boolean isSupported(String event) {
		return supported.containsKey(event);
	}

	@Override
	public ServerType getServerType() {
		return ServerType.SERVER_SPONGE;
	}

	@Override
	public void registerListener(String event) {
		if(isSupported(event)) {
			Sponge.getGame().getEventManager().registerListeners((SpongePluginLoader)loader, supported.get(event));
		}
	}
	
}