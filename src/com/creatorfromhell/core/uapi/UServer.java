package com.creatorfromhell.core.uapi;

public abstract class UServer {
	
	UPluginLoader loader;
	
	public UServer(UPluginLoader loader) {
		this.loader = loader;
	}
}