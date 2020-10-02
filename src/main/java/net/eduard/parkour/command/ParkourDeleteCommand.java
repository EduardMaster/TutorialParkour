package net.eduard.parkour.command;

import net.eduard.api.lib.manager.CommandManager;
import net.eduard.api.lib.modules.Mine;
import net.eduard.parkour.core.Parkour;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ParkourDeleteCommand extends CommandManager {

    private final Parkour parkour;

    public ParkourDeleteCommand(Parkour parkour) {
        super("delete", "remove","deletar","remover");
        this.parkour = parkour;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command,
                             String label, String[] args) {
        if (Mine.onlyPlayer(sender)) {
            Player p = (Player) sender;


            if (args.length == 1) {
                sender.sendMessage("§c/parkour delete <parkour>");
            } else {
                String name = args[1];

                if (parkour.hasMap(name)) {
                    parkour.removeMap(parkour.getMap(name));
                    parkour.chat("Delete", p);
                } else {
                    parkour.chat("Invalid", p);
                }
            }

        }

        return true;
    }

}


