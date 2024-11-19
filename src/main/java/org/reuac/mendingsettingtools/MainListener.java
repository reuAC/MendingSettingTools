package org.reuac.mendingsettingtools;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemMendEvent;

import java.util.List;

import static org.bukkit.Bukkit.getLogger;

public class MainListener implements Listener {
    public static int setRepairAmount;
    public static boolean tipEnabled;
    public static List<String> tips;

    @EventHandler
    public void onPlayerItemMendEvent(PlayerItemMendEvent event) {
        if (setRepairAmount > 0){
            event.setRepairAmount(setRepairAmount);

            if (tipEnabled) {
                Player player = event.getPlayer();
                for (String tip : tips) {
                    player.sendMessage(tip);
                }
            }
        }else {
            getLogger().warning("setRepairAmount Value must be positive.");
        }

    }
}
