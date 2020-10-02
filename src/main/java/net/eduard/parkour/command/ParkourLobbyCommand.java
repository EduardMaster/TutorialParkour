package net.eduard.parkour.command;

import net.eduard.api.lib.manager.CommandManager;
import net.eduard.api.lib.modules.Mine;
import net.eduard.parkour.core.Parkour;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ParkourLobbyCommand extends CommandManager {

    private final Parkour parkour;

    public ParkourLobbyCommand(Parkour parkour) {
        super("lobby", "spawn");
        this.parkour = parkour;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command,
                             String label, String[] args) {
        if (Mine.onlyPlayer(sender)) {
            Player p = (Player) sender;


            if (parkour.hasLobby()) {
                p.teleport(parkour.getLobby());
                parkour.chat("Lobby", p);
            } else {
                parkour.chat("NoLobby", p);
            }

        }

        return true;
    }

}


