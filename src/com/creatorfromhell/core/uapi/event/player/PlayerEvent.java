package com.creatorfromhell.core.uapi.event.player;

import com.creatorfromhell.core.uapi.entity.living.player.Player;
import com.creatorfromhell.core.uapi.event.UEvent;

public class PlayerEvent extends UEvent {
	protected Player involved;
	
	public PlayerEvent(Player involved) {
		this.involved = involved;
	}
	
	public final Player getPlayer() {
		return involved;
	}
}