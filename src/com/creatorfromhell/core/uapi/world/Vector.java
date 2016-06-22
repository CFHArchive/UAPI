package com.creatorfromhell.core.uapi.world;

public class Vector {
	
	public static Vector zero = new Vector(0.0, 0.0, 0.0);
	
	private double x;
	private double y;
	private double z;
	
	public Vector(double x, double z) {
		this(x, 0, z);
	}
	
	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		
		final Vector compare = (Vector)obj;
		
		if(Double.compare(x, compare.getX()) != 0) return false;
		if(Double.compare(y, compare.getY()) != 0) return false;
		if(Double.compare(z, compare.getZ()) != 0) return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return "x=" + x + "y=" + y + "z=" + z;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
}