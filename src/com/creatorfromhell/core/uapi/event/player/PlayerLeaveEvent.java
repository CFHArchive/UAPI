package com.creatorfromhell.core.uapi.event.player;

import com.creatorfromhell.core.uapi.entity.living.player.Player;

public class PlayerLeaveEvent extends PlayerEvent {
	
	private String message;

	public PlayerLeaveEvent(Player left, String message) {
		super(left);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
