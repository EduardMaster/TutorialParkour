package net.eduard.parkour.command;

import net.eduard.api.lib.manager.CommandManager;
import net.eduard.api.lib.modules.Mine;
import net.eduard.parkour.core.Parkour;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ParkourSetLobbyCommand extends CommandManager {

    private final Parkour parkour;

    public ParkourSetLobbyCommand(Parkour parkour) {
        super("setlobby", "definirlobby");
        this.parkour = parkour;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command,
                             String label, String[] args) {
        if (Mine.onlyPlayer(sender)) {
            Player p = (Player) sender;


            parkour.setLobby(p.getLocation());
            parkour.chat("SetLobby", p);

        }

        return true;
    }

}


