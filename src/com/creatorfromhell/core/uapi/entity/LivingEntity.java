package com.creatorfromhell.core.uapi.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.creatorfromhell.core.uapi.attribute.Attribute;
import com.creatorfromhell.core.uapi.attribute.AttributeHolder;
import com.creatorfromhell.core.uapi.attribute.AttributeType;

/*
 * TODO: Damage
 * TODO: LOS
 */
public class LivingEntity extends Entity implements AttributeHolder {

	private List<Attribute> attributes = new ArrayList<Attribute>();
	
	@Override
	public List<Attribute> getAttributes() {
		return attributes;
	}

	@Override
	public void addAttribute(Attribute attribute) {
		attributes.add(attribute);
	}

	@Override
	public boolean removeAttribute(Attribute attribute) {
		return removeAttribute(attribute.getType());
	}

	@Override
	public boolean removeAttribute(AttributeType type) {
		Iterator<Attribute> i = attributes.iterator();
		while(i.hasNext()) {
			Attribute att = i.next();
			if(att.getType() == type) {
				i.remove();
				return true;
			}
		}
		return false;
	}

}