package com.creatorfromhell.core.uapi.meta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.creatorfromhell.core.uapi.UPlugin;

public class MetaHolder {
	
	List<MetaValue> metadata = new ArrayList<MetaValue>();
	
	public void addValue(MetaValue value) {
		metadata.add(value);
	}
	
	public boolean removeValue(MetaValue value) {
		Iterator<MetaValue> i = metadata.iterator();
		while(i.hasNext()) {
			MetaValue v = i.next();
			if(v.equals(value)) {
				i.remove();
				return true;
			}
		}
		
		return false;
	}
	
	public MetaValue getValue(String key) {
		for(MetaValue v : metadata) {
			if(v.getKey().equals(key)) {
				return v;
			}
		}
		
		return null;
	}
	
	public boolean contains(String key) {
		for(MetaValue v : metadata) {
			if(v.getKey().equals(key)) {
				return true;
			}
		}
		
		return false;
	}
	
	public List<MetaValue> getValues(UPlugin owner) {
		if(owner == null) {
			return metadata;
		}
		
		List<MetaValue> owned = new ArrayList<MetaValue>();
		
		for(MetaValue v : metadata) {
			if(v.getOwner().equals(owner)) {
				owned.add(v);
			}
		}
		
		return owned;
	}
}