package com.creatorfromhell.core.uapi.entity;

import com.creatorfromhell.core.uapi.world.Location;

import java.util.List;
import java.util.UUID;

/**
 * Created by Daniel "creatorfromhell" on 3/26/2017.
 */
public interface Entity {
    public int getEntityId();
    public EntityType getType();
    public UUID getUniqueId();
    public String getName();
    public Location getLocation();
    public Location getVelocity();
    public int getAir();
    public void setAir(int air);
    public int getFireTicks();
    public void setFireTicks(int ticks);
    public int getPortalCooldown();
    public void setPortalCooldown(int cooldown);
    public int getFallDistance();
    public boolean isOnFire();
    public boolean isOnGround();
    public boolean isGlowing();
    public void setGlowing(boolean glowing);
    public boolean hasGravity();
    public List<Entity> getPassengers();
    public void setVelocity(Location velocity);
}
