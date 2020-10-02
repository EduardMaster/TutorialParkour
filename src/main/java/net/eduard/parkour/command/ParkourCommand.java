package net.eduard.parkour.command;

import net.eduard.api.lib.manager.CommandManager;
import net.eduard.parkour.core.Parkour;
public class ParkourCommand extends CommandManager {

	private final Parkour parkour;

	public ParkourCommand(Parkour parkour) {
		super("parkour");
		this.parkour = parkour;
		register(new ParkourCreateCommand(parkour));
		register(new ParkourDeleteCommand(parkour));
		register(new ParkourHelpCommand(parkour));
		register(new ParkourSetSpawnCommand(parkour));
		register(new ParkourSetEndCommand(parkour));
		register(new ParkourSetLobbyCommand(parkour));

	}



}
