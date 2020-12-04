package ru.ragnok123.jbexampleplugin;

import net.novatech.jbserver.event.EventListener;
import net.novatech.jbserver.event.player.PlayerLoginEvent;

public class PluginListener extends EventListener {

	private JBExamplePlugin plugin;
	
	public PluginListener(JBExamplePlugin plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public void registerEventHandlers() {
		registerEventHandler(PlayerLoginEvent.class, ev -> {
			PlayerLoginEvent e = (PlayerLoginEvent)ev;
			plugin.getLogger().info(e.getPlayerInfo().getAddress() + " session joined the game");
		});
		
	}

}
