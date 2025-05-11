package de.Smiley.ownerSwordV1.Commands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Info implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] arg) {
        sender.sendMessage("§6§lOwnerSwordV1 | §fPlugin von obvSmiley");


        return true;


    }
}
