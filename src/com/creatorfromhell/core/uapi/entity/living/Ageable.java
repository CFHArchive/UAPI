package com.creatorfromhell.core.uapi.entity.living;

public interface Ageable {

  public int getAge();

  public void setAge(int age);

  public boolean isAgeLocked();

  public void lockAge(boolean locked);

  public void setBaby();

  public void setAdult();

  public boolean isAdult();
}