package com.creatorfromhell.core.bukkit.conversion;

import org.bukkit.Bukkit;

import com.creatorfromhell.core.uapi.conversion.Converter;
import com.creatorfromhell.core.uapi.entity.living.player.Player;
import com.creatorfromhell.core.uapi.world.Location;
import com.creatorfromhell.core.uapi.world.Vector;
import com.creatorfromhell.core.uapi.world.World;
import com.creatorfromhell.core.uapi.world.WorldBorder;


public class BukkitConverter implements Converter {

  @Override
  public Player convertPlayer(Object playerClass) {
    if(!(playerClass instanceof org.bukkit.entity.Player)) return null;
    org.bukkit.entity.Player bukkitPlayer = (org.bukkit.entity.Player)playerClass;
    Player p = new Player();
    p.setAddress(bukkitPlayer.getAddress().getAddress());
    p.setId(bukkitPlayer.getUniqueId());
    p.setName(bukkitPlayer.getName());
    p.setDisplayName(bukkitPlayer.getDisplayName());
    p.setFireTicks(bukkitPlayer.getFireTicks());
    p.setFlightAllowed(bukkitPlayer.getAllowFlight());
    p.setFlying(bukkitPlayer.isFlying());
    p.setFood(bukkitPlayer.getFoodLevel());
    p.setSaturation(bukkitPlayer.getSaturation());
    p.setLoc(convertLocation(bukkitPlayer.getLocation()));
    p.setSneaking(bukkitPlayer.isSneaking());
    p.setSprinting(bukkitPlayer.isSprinting());
    p.setSleeping(bukkitPlayer.isSleeping());
    
    return p;
  }

  @Override
  public Vector convertVector(Object vectorClass) {
    if(!(vectorClass instanceof org.bukkit.util.Vector)) return null;
    org.bukkit.util.Vector bukkitVector = (org.bukkit.util.Vector)vectorClass;
    Vector coords = new Vector(bukkitVector.getX(),
                               bukkitVector.getY(),
                               bukkitVector.getZ());
    
    return coords;
  }

  @Override
  public Location convertLocation(Object locationClass) {
    if(!(locationClass instanceof org.bukkit.Location)) return null;
    org.bukkit.Location bukkitLocation = (org.bukkit.Location)locationClass;
    Location location = new Location(convertWorld(bukkitLocation.getWorld()),
                                     new Vector(bukkitLocation.getX(),
                                                bukkitLocation.getY(),
                                                bukkitLocation.getZ()));
    location.setPitch(bukkitLocation.getPitch());
    location.setYaw(bukkitLocation.getYaw());
    return location;
  }

  @Override
  public World convertWorld(Object worldClass) {
    if(!(worldClass instanceof org.bukkit.World)) return null;
    org.bukkit.World bukkitWorld = (org.bukkit.World)worldClass;
    World world = new World(bukkitWorld.getName());
    Vector worldCenter = new Vector(bukkitWorld.getWorldBorder().getCenter().getX(),
                                    bukkitWorld.getWorldBorder().getCenter().getY(),
                                    bukkitWorld.getWorldBorder().getCenter().getZ());
    
    world.setBorder(new WorldBorder(bukkitWorld.getWorldBorder().getSize(),
                                    worldCenter));
    
    return world;
  }

  @Override
  public Object fromUAPIPlayer(Player playerClass) {
    org.bukkit.entity.Player bukkitPlayer = Bukkit.getPlayer(playerClass.getId());
    bukkitPlayer.setDisplayName(playerClass.getDisplayName());
    bukkitPlayer.setFireTicks(playerClass.getFireTicks());
    bukkitPlayer.setAllowFlight(playerClass.isFlightAllowed());
    bukkitPlayer.setFlying(playerClass.isFlying());
    bukkitPlayer.setFoodLevel(playerClass.getFood());
    bukkitPlayer.setSaturation(playerClass.getSaturation());
    bukkitPlayer.setSneaking(playerClass.isSneaking());
    bukkitPlayer.setSprinting(playerClass.isSprinting());
    bukkitPlayer.teleport((org.bukkit.Location)fromUAPILocation(playerClass.getLoc()));
    return bukkitPlayer;
  }

  @Override
  public Object fromUAPILocation(Location locationClass) {
    org.bukkit.Location bukkitLocation = new org.bukkit.Location(
            (org.bukkit.World) fromUAPIWorld(locationClass.getWorld()),
            locationClass.getX(),
            locationClass.getY(),
            locationClass.getZ());
    
    return bukkitLocation;
  }

  @Override
  public Object fromUAPIWorld(World worldClass) {
    if(Bukkit.getWorld(worldClass.getName()) != null) {
      org.bukkit.World bukkitWorld = Bukkit.getWorld(worldClass.getName());
      
      return bukkitWorld;
    }
    return null;
  }
  
}