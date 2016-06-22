package com.creatorfromhell.core.uapi.attribute;

import java.util.List;

public interface AttributeHolder {
	public List<Attribute> getAttributes();
	public void addAttribute(Attribute attribute);
	public boolean removeAttribute(Attribute attribute);
	public boolean removeAttribute(AttributeType type);
}