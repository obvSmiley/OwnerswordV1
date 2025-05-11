package de.Smiley.ownerSwordV1;

import de.Smiley.ownerSwordV1.Commands.Info;
import de.Smiley.ownerSwordV1.Commands.Ownersword;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class OwnerSwordV1 extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("Ownersword").setExecutor(new Ownersword());
        getCommand("Info").setExecutor(new Info());
        getLogger().info( "Plugin ist gestartet");


    }

    @Override
    public void onDisable() {
        getLogger().info( "Plugin ist gestoppt");

    }
}
