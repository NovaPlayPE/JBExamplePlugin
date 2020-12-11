package ru.ragnok123.jbexampleplugin;

import net.novatech.jbserver.event.EventListener;
import net.novatech.jbserver.event.player.PlayerLoginEvent;
import net.novatech.jbserver.player.Player;
import net.novatech.jbserver.player.PlayerInfo;
import net.novatech.jbserver.utils.Color;

public class PluginListener extends EventListener {

	private JBExamplePlugin plugin;
	
	public PluginListener(JBExamplePlugin plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public void registerEventHandlers() {
		registerEventHandler(PlayerLoginEvent.class, ev -> {
			onPlayerLogin((PlayerLoginEvent)ev);
		});
		
	}
	
	private void onPlayerLogin(PlayerLoginEvent event) {
		Player player = event.getPlayer();
		PlayerInfo info = event.getPlayerInfo();
		
		player.sendMessage(Color.CYAN + "Welcome on JBServer, " + Color.GREEN + info.getName());
		plugin.getLogger().info(Color.YELLOW + "Player " + Color.GREEN + info.getName() + Color.YELLOW + " connected");
	}

}
