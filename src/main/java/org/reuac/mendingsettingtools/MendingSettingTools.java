package org.reuac.mendingsettingtools;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.stream.Collectors;

public final class MendingSettingTools extends JavaPlugin {
    public static MendingSettingTools main;

    @Override
    public void onEnable() {
        Bukkit.getPluginCommand("mendingsettingtools").setExecutor(new MainCommand());
        Bukkit.getPluginManager().registerEvents(new MainListener(),this);

        saveDefaultConfig();
        loadConfig();

        main = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void loadConfig(){
        MainListener.tipEnabled = getConfig().getBoolean("tip.enable");
        MainListener.tips = getConfig().getStringList("tip.tips").stream()
                .map(message -> ChatColor.translateAlternateColorCodes('&', message))
                .collect(Collectors.toList());
        MainListener.setRepairAmount = getConfig().getInt("setRepairAmount");
    }
}
