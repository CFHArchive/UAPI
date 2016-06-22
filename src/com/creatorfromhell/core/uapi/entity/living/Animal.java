package com.creatorfromhell.core.uapi.entity.living;

public class Animal extends MobEntity implements Ageable, Breedable {
	
	private int age;
	private boolean ageLocked;
	private boolean breedable;

	@Override
	public boolean canBreed() {
		return breedable;
	}

	@Override
	public void setBreedable(boolean breedable) {
		this.breedable = breedable;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean isAgeLocked() {
		return ageLocked;
	}

	@Override
	public void lockAge(boolean locked) {
		this.ageLocked = locked;
	}

	@Override
	public void setBaby() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAdult() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isAdult() {
		// TODO Auto-generated method stub
		return false;
	}

}
