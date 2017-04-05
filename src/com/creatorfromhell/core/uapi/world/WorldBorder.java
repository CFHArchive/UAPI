package com.creatorfromhell.core.uapi.world;

public interface WorldBorder {
  public Vector getCenter();
  public void setCenter(Vector center);
  public void setCenter(double x, double z);
  //defaults to 29999984
  public double getRadius();
  public boolean isInside(Location location);
  public boolean isInside(double x, double z);
  public int getWarningTime();
  public void setWarningTime(int time);
  public double getDamageBuffer();
  public void setDamageBuffer(double damageBuffer);
  public double getDamageDealt();
  public void setDamageDealt(double damageDealt);
}