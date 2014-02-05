package com.edrig.Edrig;

import java.util.logging.Logger;


import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener
{
    public final Logger logger = Logger.getLogger("Minecraft");
        
        public void onEnable() 
    {
    
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
        
        getCommand("yolo").setExecutor(new EdrigCommandExecutor(this));
        getCommand("Gstart").setExecutor(new EdrigCommandExecutor(this));

        ScoreBoard.initScoreBoard();

        this.saveDefaultConfig();
        
        }
        
        public void onDisable()
        {
        	this.reloadConfig();
        }
        
        @EventHandler
        public void onPlayerJoin(PlayerJoinEvent evt)
        {
        	Player player = evt.getPlayer();
        	player.setScoreboard(ScoreBoard.board);
        }
        
        @EventHandler
        public void onPlayerQuit(PlayerQuitEvent evt)
        {
        	Player player = evt.getPlayer();
        	ScoreBoard.board.resetScores(player);
        }

}