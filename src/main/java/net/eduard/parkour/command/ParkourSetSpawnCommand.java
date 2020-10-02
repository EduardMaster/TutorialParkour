package net.eduard.parkour.command;

import net.eduard.api.lib.manager.CommandManager;
import net.eduard.api.lib.modules.Mine;
import net.eduard.api.server.minigame.MinigameMap;
import net.eduard.parkour.core.Parkour;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ParkourSetSpawnCommand extends CommandManager {

    private final Parkour parkour;

    public ParkourSetSpawnCommand(Parkour parkour) {
        super("setspawn", "definirspawn");
        this.parkour = parkour;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command,
                             String label, String[] args) {
        if (Mine.onlyPlayer(sender)) {
            Player p = (Player) sender;
            if (args.length == 1) {
                p.sendMessage("§c/parkour setspawn <parkour>");
            } else {
                String name = args[1];
                if (parkour.hasMap(name)) {
                    MinigameMap map = parkour.getMap(name);
                    map.setSpawn(p.getLocation());
                    parkour.chat("SetSpawn", p);
                } else {
                    parkour.chat("Invalid", p);
                }
            }
        }

        return true;
    }

}


