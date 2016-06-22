package com.creatorfromhell.core.uapi.world;

public class WorldBorder {
	
	private Vector center;
	private int radius;
	
	public WorldBorder() {
		this(29999984, Vector.zero);
	}
	
	public WorldBorder(int radius) {
		this(radius, Vector.zero);
	}
	
	public WorldBorder(int radius, Vector center) {
		this.radius = radius;
		this.center = center;
	}

	public Vector getCenter() {
		return center;
	}

	public void setCenter(Vector center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}