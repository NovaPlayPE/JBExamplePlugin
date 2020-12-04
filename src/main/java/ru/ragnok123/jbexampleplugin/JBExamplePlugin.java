package ru.ragnok123.jbexampleplugin;

import net.novatech.jbserver.plugin.java.JavaPlugin;

public class JBExamplePlugin extends JavaPlugin{
	
	public void onEnable() {
		this.getLogger().info("Plugin enabled");
		this.getServer().getEventManager().registerEventListener(this, new PluginListener(this));
	}
	
}