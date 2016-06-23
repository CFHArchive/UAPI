package com.creatorfromhell.core.uapi;

import com.creatorfromhell.core.uapi.event.UEventFactory;

public interface UPluginLoader {
	void onEnable();
	void onDisable();
	UPlugin getPluginInstance();
	UEventFactory getEventFactory();
}