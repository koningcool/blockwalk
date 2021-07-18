package com.koningjoost.blockwalk;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Blockwalk extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        getCommand("blockwalk").setExecutor(this);
        getServer().getPluginManager().registerEvents(new PlayerMove(), this);
        // Plugin startup logic
        System.out.println("Blockwalk is enabled!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Blockwalk is disabled...");
    }



    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
           sender.sendMessage(ChatColor.DARK_RED + "Run this command as a player!");
            return false;
        }
        Player p = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("blockwalk"))
            p.sendMessage(ChatColor.GREEN + "Activated!");
        return false;
    }


}
