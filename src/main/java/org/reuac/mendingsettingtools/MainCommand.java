package org.reuac.mendingsettingtools;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getLogger;

public class MainCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        MendingSettingTools.main.reloadConfig();
        MendingSettingTools.main.loadConfig();

        if (commandSender instanceof Player) {
            commandSender.sendMessage("[MendingSettingTools] Reload Complete.");
        }else {
            getLogger().info("Reload Complete.");
        }

        return false;
    }
}
