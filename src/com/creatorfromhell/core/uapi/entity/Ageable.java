package com.creatorfromhell.core.uapi.entity;

/**
 * Created by Daniel "creatorfromhell" on 3/26/2017.
 */
public interface Ageable extends Creature {
    public int getAge();
    public void setAge(int age);
    public boolean isAdult();
    public void setAdult(boolean adult);
    public boolean canBreed();
    public void setBreed(boolean breed);
}