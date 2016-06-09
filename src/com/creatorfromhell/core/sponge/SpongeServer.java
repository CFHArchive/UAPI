package com.creatorfromhell.core.sponge;

import com.creatorfromhell.core.uapi.UPluginLoader;
import com.creatorfromhell.core.uapi.UServer;

public class SpongeServer extends UServer {

	public SpongeServer(UPluginLoader loader) {
		super(loader);
	}

	@Override
	public void registerEvent(String event) {
		//TODO: Register events with sponge.
	}
	
}