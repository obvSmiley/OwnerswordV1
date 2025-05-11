package de.Smiley.ownerSwordV1.Commands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Ownersword implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] arg) {
        if(sender instanceof Player) {
            if (sender.hasPermission("Owner")) {
                Player player = (Player) sender;
                player.getInventory().addItem(de.Smiley.ownerSwordV1.Items.Ownersword.get());
                player.sendMessage("§6§lOwnerswordV1 |§f Du hast das §4OwnerSword §f erhalten");
                return true;
            }

        }
        sender.sendMessage("§6§lOwnerswordV1 | §4Dies ist dir nicht erlaubt");
        return true;
    }
}
