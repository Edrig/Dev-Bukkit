package com.edrig.Edrig;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class main extends JavaPlugin implements Listener
{
    public final Logger logger = Logger.getLogger("Minecraft");
    
    ScoreboardManager manager = Bukkit.getScoreboardManager();
    Scoreboard board = manager.getNewScoreboard();
    Objective objective = board.registerNewObjective("HP", "health");
    
    
	@Override
    public void onEnable() 
    {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
        getCommand("yolo").setExecutor(new EdrigCommandExecutor(this));


        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName("HP");
        
       
        
        /*for(Player online : Bukkit.getOnlinePlayers()){
          Score score = objective.getScore(online);
          score.setScore(5); //Example
        }
         
        for(Player online : Bukkit.getOnlinePlayers()){
         online.setScoreboard(board);
        }*/
    }

	public void onDisable()
	{
        /*for(Player online : Bukkit.getOnlinePlayers()){
        	online.setScoreboard(manager.getNewScoreboard());
        }*/
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent evt)
	{
	Player player = evt.getPlayer();
	player.setScoreboard(board);
    /*Score score = objective.getScore(player);
    score.setScore(5); //Example*/
	}
	
	@EventHandler
	 public void onPlayerQuit(PlayerQuitEvent evt)
	{
	Player player = evt.getPlayer();
	board.resetScores(player);
	}
}