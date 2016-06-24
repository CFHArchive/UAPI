package com.creatorfromhell.core.uapi.world;

public class Location {

  private World world;
  private Vector coordinates;
  private float pitch;
  private float yaw;

  public Location(World world, Vector coordinates) {
    this(world, coordinates, 0.0f, 0.0f);
  }

  public Location(World world, Vector coordinates, float yaw, float pitch) {
    this.world = world;
    this.coordinates = coordinates;
    this.pitch = pitch;
    this.yaw = yaw;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;

    final Location compare = (Location) obj;

    if (!world.equals(compare.getWorld())) return false;
    if (!coordinates.equals(compare.getCoordinates())) return false;
    if (Float.compare(pitch, compare.getPitch()) != 0) return false;
    if (Float.compare(yaw, compare.getYaw()) != 0) return false;

    return true;
  }

  @Override
  public String toString() {
    return "world=" + world.getName() + "x=" + coordinates.getX() + "y="
            + coordinates.getY() + "z=" + coordinates.getZ() + "pitch=" + pitch
            + "yaw=" + yaw;
  }

  public World getWorld() {
    return world;
  }

  public void setWorld(World world) {
    this.world = world;
  }

  public Vector getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(Vector coordinates) {
    this.coordinates = coordinates;
  }

  public float getPitch() {
    return pitch;
  }

  public void setPitch(float pitch) {
    this.pitch = pitch;
  }

  public float getYaw() {
    return yaw;
  }

  public void setYaw(float yaw) {
    this.yaw = yaw;
  }
}