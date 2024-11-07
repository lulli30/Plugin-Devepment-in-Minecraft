package me.lulli.eventListeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


public final class EventListeners extends JavaPlugin implements Listener{

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("The plugin has started");

        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.setJoinMessage("Mukha kang burat pandesal");
    }

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){
        Player player = event.getPlayer();
        player.setLevel(999999);
        player.sendMessage("Goodmorning batugan! bumangon ka na jan");
    }
}
