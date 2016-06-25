package com.creatorfromhell.core.uapi.world;

public class WorldBorder {

  private Vector center;
  private double radius;

  public WorldBorder() {
    this(29999984, Vector.zero);
  }

  public WorldBorder(double radius) {
    this(radius, Vector.zero);
  }

  public WorldBorder(double radius, Vector center) {
    this.radius = radius;
    this.center = center;
  }

  public Vector getCenter() {
    return center;
  }

  public void setCenter(Vector center) {
    this.center = center;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}