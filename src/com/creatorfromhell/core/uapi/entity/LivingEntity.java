package com.creatorfromhell.core.uapi.entity;

import com.creatorfromhell.core.uapi.world.Location;

/**
 * Created by Daniel "creatorfromhell" on 3/26/2017.
 */
public interface LivingEntity extends Entity {
    public Entity getDamager();
    public Entity getKiller();
    public int getHealth();
    public void setHealth(int health);
    //TODO: Attributes, Potions
    public void teleport(int x, int y, int z);
    public void teleport(Location location);
    public void setRotation(float yaw, float pitch);
}
