package net.eduard.parkour.command;

import net.eduard.api.lib.manager.CommandManager;
import net.eduard.api.lib.modules.Mine;
import net.eduard.parkour.core.Parkour;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ParkourCreateCommand extends CommandManager {

    private final Parkour parkour;

    public ParkourCreateCommand(Parkour parkour) {
        super("create", "criar");
        this.parkour = parkour;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command,
                             String label, String[] args) {
        if (Mine.onlyPlayer(sender)) {
            Player player = (Player) sender;


            if (args.length < 2) {
                sender.sendMessage("§c/parkour create <parkour>");
            } else {

                String name = args[1];
                if (parkour.hasMap(name)) {
                    parkour.chat("AlreadyExists", player);
                } else {
                    parkour.createNewMap(player, name);
                }
            }

        }

        return true;
    }

}


