package com.creatorfromhell.core.uapi.entity.living.player;

import com.creatorfromhell.core.uapi.entity.LivingEntity;

/*
 * TODO: Inventories & Items.
 * TODO: Experience.
 * TODO: Gamemode
 */
public class HumanEntity extends LivingEntity {
	private String name;
	private boolean sleeping;
	private int sleepTicks;
	private boolean sneaking;
	private boolean sprinting;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isSleeping() {
		return sleeping;
	}
	
	public void setSleeping(boolean sleeping) {
		this.sleeping = sleeping;
	}
	public int getSleepTicks() {
		return sleepTicks;
	}
	public void setSleepTicks(int sleepTicks) {
		this.sleepTicks = sleepTicks;
	}
	
	public boolean isSneaking() {
		return sneaking;
	}
	
	public void setSneaking(boolean sneaking) {
		this.sneaking = sneaking;
	}
	
	public boolean isSprinting() {
		return sprinting;
	}
	
	public void setSprinting(boolean sprinting) {
		this.sprinting = sprinting;
	}
}