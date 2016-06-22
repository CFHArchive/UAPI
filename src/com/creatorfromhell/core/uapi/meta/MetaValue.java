package com.creatorfromhell.core.uapi.meta;

import com.creatorfromhell.core.uapi.UPlugin;

public class MetaValue {
	
	private String key;
	private Object value;
	private UPlugin owner;
	
	public MetaValue(String key) {
		this(key, null, null);
	}
	
	public MetaValue(String key, UPlugin owner) {
		this(key, null, owner);
	}
	
	public MetaValue(String key, Object value) {
		this(key, value, null);
	}
	
	public MetaValue(String key, Object value, UPlugin owner) {
		this.key = key;
		this.value = value;
		this.owner = owner;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public UPlugin getOwner() {
		return owner;
	}

	public void setOwner(UPlugin owner) {
		this.owner = owner;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		
		final MetaValue compare = (MetaValue)obj;
		
		if(key != compare.getKey()) return false;
		if(owner != compare.getOwner()) return false;
		
		return true;
	}
}