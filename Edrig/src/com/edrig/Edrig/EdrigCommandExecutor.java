package com.edrig.Edrig;

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
	    	 else if (cmd.getName().equalsIgnoreCase(""))
	    	{
	    		 		return true; // Tout a bien marché, on retourne vrai
	    	}
			return false;
	    }
}
