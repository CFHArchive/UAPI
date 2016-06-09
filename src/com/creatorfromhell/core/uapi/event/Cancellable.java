package com.creatorfromhell.core.uapi.event;

public interface Cancellable {

	public void setCancelled(boolean cancelled);
	
	public boolean isCancelled();
}