package com.creatorfromhell.core.uapi.attribute;

import java.util.ArrayList;
import java.util.List;

public class Attribute {
	List<AttributeModifier> modifiers = new ArrayList<AttributeModifier>();
	
	private AttributeType type;
	private double base;
	private double min;
	private double max;
	
	public Attribute(AttributeType type) {
		this.type = type;
	}
	
	public double getValue() {
		//TODO: calculate value.
		return base;
	}
	
	public void addModifier(AttributeModifier modifier) {
		modifiers.add(modifier);
	}
	
	public void removeModifier(AttributeModifier modifier) {
		modifiers.remove(modifier);
	}

	public List<AttributeModifier> getModifiers() {
		return modifiers;
	}

	public void setModifiers(List<AttributeModifier> modifiers) {
		this.modifiers = modifiers;
	}

	public AttributeType getType() {
		return type;
	}

	public void setType(AttributeType type) {
		this.type = type;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}
}