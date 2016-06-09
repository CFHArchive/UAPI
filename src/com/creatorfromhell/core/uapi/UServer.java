package com.creatorfromhell.core.uapi;

public abstract class UServer {
	
	protected UPluginLoader loader;
	
	public UServer(UPluginLoader loader) {
		this.loader = loader;
	}
	
	public abstract void registerEvent(String event);
}