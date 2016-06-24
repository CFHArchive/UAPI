package com.creatorfromhell.core.uapi.event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.creatorfromhell.core.uapi.UServer;

public class UEventFactory {
	
	//Format<EventName, Map<ListenerClass, EventHandler>>
	public Map<String, Map<UListener, Method>> listeners = new HashMap<String, Map<UListener, Method>>();
	
	private static UEventFactory instance;
	UServer server;
	
	public UEventFactory(UServer server) {
		this.server = server;
		instance = this;
	}
	
	public static UEventFactory getInstance() {
		return instance;
	}
	
	public void registerListener(UListener listener) {
		System.out.println("[UAPI]Registering \"" + listener.getClass().getName() + "\" as an event listener.");
		localRegister(listener);
	}
	
	public void callEvent(UEvent event) {
		System.out.println("[UAPI]Calling " + event.getName() + ".");
		if(isListenedTo(event)) {
			for(Map.Entry<UListener, Method> entry : listeners.get(event.getName()).entrySet()) {
				try {
					entry.getValue().invoke(entry.getKey(), event);
				} catch (IllegalAccessException
						| IllegalArgumentException
						| InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public boolean isListenedTo(UEvent event) {
		return listeners.containsKey(event.getName());
	}
	
	private void addListener(String event, UListener listener, Method method) {
		if(listeners.containsKey(event)) {
			listeners.get(event).put(listener, method);
			return;
		}
		HashMap<UListener, Method> temp = new HashMap<UListener, Method>();
		temp.put(listener, method);
		listeners.put(event, temp);
	}
	
	private void localRegister(UListener listener) {
		for(Method m : listener.getClass().getMethods()) {
			if(m.isAnnotationPresent(EventHandler.class)) {
				if(m.getParameterCount() == 1) {
					for(Class<?> parameter : m.getParameterTypes()) {
						if(UEvent.class.isAssignableFrom(parameter)) {
							String event = parameter.getSimpleName();
							server.registerListener(event);
							addListener(event, listener, m);
						}
					}
				}
			}
		}
	}
}