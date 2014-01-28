package com.edrig.Edrig;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EdrigCommandExecutor implements CommandExecutor 
{

	public EdrigCommandExecutor(main main)
		{
		}
	
		public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	    {
	    	 if (cmd.getName().equalsIgnoreCase("yolo"))
	    	{

	    				sender.sendMessage("Tu a le Swagg " + sender.getName() + " !"); // On envoie un message au joueur qui a tapée la commande, pour vous prouver que ca marche!
	    				
	    				return true; // Tout a bien marché, on retourne vrai
	    	}
	    	 else if (cmd.getName().equalsIgnoreCase("Gstart"))
	    	{
	    		 startGame();
	    		 return true; // Tout a bien marché, on retourne vrai
	    	}
			return false;
	    }

		public void startGame()
		{
			int timer = 10;
			
			while (timer != 0)
        			{
        				Bukkit.broadcastMessage(ChatColor.RED +""+timer);
        				
        				timer--;
        				
        			}
			Bukkit.broadcastMessage(ChatColor.RED +"Edrig-Game Starting !"); // On envoie un message au joueur qui a tapée la commande, pour vous prouver que ca marche!
		}
}
