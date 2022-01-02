package ru.ragnok123.jbexampleplugin;

import net.novatech.jbserver.command.Command;
import net.novatech.jbserver.command.CommandSender;
import net.novatech.jbserver.player.Player;
import net.novatech.jbserver.world.Location;
import net.novatech.library.math.Vector3d;

public class ExampleCommand extends Command {

	public ExampleCommand(String name) {
		super(name);
	}

	@Override
	public boolean execute(CommandSender sender, String label, String[] args) {
		Player player = (Player)sender;
		player.setLocation(new Location(player.getServer().getFactoryManager().getWorldFactory().getDefaultWorld(),
				new Vector3d(0,0,0)));
		return false;
	}

}
