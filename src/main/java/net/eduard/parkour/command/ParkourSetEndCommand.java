package net.eduard.parkour.command;

import net.eduard.api.lib.manager.CommandManager;
import net.eduard.api.lib.modules.Mine;
import net.eduard.api.server.minigame.MinigameMap;
import net.eduard.parkour.core.Parkour;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ParkourSetEndCommand extends CommandManager {

    private final Parkour parkour;

    public ParkourSetEndCommand(Parkour parkour) {
        super("setend", "definirfim");
        this.parkour = parkour;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command,
                             String label, String[] args) {
        if (Mine.onlyPlayer(sender)) {
            Player player = (Player) sender;
            if (args.length == 1) {
                player.sendMessage("§c/parkour setend <parkour>");
            } else {
                String name = args[1];
                if (parkour.hasMap(name)) {
                    MinigameMap map = parkour.getMap(name);
                    map.getLocations().put("end", player.getLocation());
                    parkour.chat("SetEnd", player);
                } else {
                    parkour.chat("Invalid", player);
                }
            }
        }

        return true;
    }

}


