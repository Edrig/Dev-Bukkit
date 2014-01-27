package com.edrig.Edrig;

import java.util.logging.Logger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener
{
    public final Logger logger = Logger.getLogger("Minecraft");
   
    @Override
    public void onEnable() 
    {
        getCommand("yolo").setExecutor(new EdrigCommandExecutor(this));
    }

	@Override
    public void onDisable() 
	{
		
    }
       


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) 
    {
    	
    }
    
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) 
    {

    }
}