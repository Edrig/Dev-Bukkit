package com.edrig.Edrig;

import org.bukkit.Bukkit;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class ScoreBoard 
{

	public static ScoreboardManager manager;
    public static Scoreboard board;
    public static Score score;
    public static Objective objective;

	public static void initScoreBoard()
       {
    	   manager = Bukkit.getScoreboardManager();
           board = manager.getNewScoreboard();
           objective = board.registerNewObjective("HP", "health");
           
           objective.setDisplaySlot(DisplaySlot.SIDEBAR);
           objective.setDisplayName("Health");
       }
         
           public static Objective getObjective() {
               if (objective != null) {
                       return objective;
               } else {

                       return objective;
               }
       }
}

