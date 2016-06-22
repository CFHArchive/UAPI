package com.creatorfromhell.core.uapi.entity;

import java.util.UUID;

import com.creatorfromhell.core.uapi.world.Location;
import com.creatorfromhell.core.uapi.world.Vector;

public class Entity {
	
	private UUID id;
	private Location loc;
	private Vector velocity;
	private int fireTicks;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Location getLoc() {
		return loc;
	}
	public void setLoc(Location loc) {
		this.loc = loc;
	}
	public Vector getVelocity() {
		return velocity;
	}
	public void setVelocity(Vector velocity) {
		this.velocity = velocity;
	}
	public int getFireTicks() {
		return fireTicks;
	}
	public void setFireTicks(int fireTicks) {
		this.fireTicks = fireTicks;
	}
}