package com.creatorfromhell.core.uapi.meta;

import java.util.List;

import com.creatorfromhell.core.uapi.UPlugin;

public interface MetaHolder {
	
	public List<MetaValue> getMeta();
	public void addMeta(MetaValue value);
	public void removeMeta(MetaValue value);
	public void getMeta(String key);
	public void getMeta(UPlugin owner);
}