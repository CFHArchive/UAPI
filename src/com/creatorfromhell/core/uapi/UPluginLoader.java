package com.creatorfromhell.core.uapi;

public interface UPluginLoader {
	void onEnable();
	void onDisable();
	UPlugin getPluginInstance();
}