package com.creatorfromhell.core.uapi.world;

public class World {
	private String name;
	
	public World(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		
		final World compare = (World)obj;
		if(!name.equals(compare.getName())) return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return "name=" + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}