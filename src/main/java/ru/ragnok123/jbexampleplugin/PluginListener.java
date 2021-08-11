package ru.ragnok123.jbexampleplugin;

import net.novatech.jbserver.event.*;
import net.novatech.jbserver.event.player.PlayerLoginEvent;
import net.novatech.jbserver.event.world.WorldLoadEvent;
import net.novatech.jbserver.player.Player;
import net.novatech.jbserver.player.PlayerInfo;
import net.novatech.jbserver.utils.Color;

public class PluginListener implements EventListener {

	private JBExamplePlugin plugin;
	
	public PluginListener(JBExamplePlugin plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler(priority = EventPriority.HIGH, ignoreCancelled = false)
	public void onPlayerLogin(PlayerLoginEvent event) {
		Player player = event.getPlayer();
		PlayerInfo info = event.getPlayerInfo();
		
		player.sendMessage(Color.CYAN + "Welcome on JBServer, " + Color.GREEN + info.getName());
		plugin.getLogger().info(Color.YELLOW + "Player " + Color.GREEN + info.getName() + Color.YELLOW + " connected");
	}
	
	@EventHandler
	public void onWorldLoad(WorldLoadEvent event) {
		plugin.getLogger().info(Color.GREEN + "World §b" + event.getWorld().getName() + Color.GREEN + " has been loaded");
	}

}
