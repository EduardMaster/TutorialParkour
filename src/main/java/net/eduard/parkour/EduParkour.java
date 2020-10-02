
package net.eduard.parkour;

import net.eduard.api.server.EduardPlugin;
import net.eduard.parkour.command.ParkourCommand;
import net.eduard.parkour.core.Parkour;

public class EduParkour extends EduardPlugin {
	private static EduParkour plugin;
	
	private Parkour parkour;

	
	public static EduParkour getInstance() {
		return plugin;
	}
	@Override
	public void onEnable() {
		plugin = this;
		super.onEnable();

		setParkour(new Parkour(this));
		getMessages().add("Create", "&bO Parkour $arena foi criado!");
		getMessages().add("Creating", "&bVocê esta no modo de criação de parkour, defina tudo e confirme.");
		getMessages().add("Delete", "&bO Parkour $arena foi deletado!");
		getMessages().add("SetSpawn", "&bO Spawn do Parkour $arena foi setado!");
		getMessages().add("SetEnd", "&bO Final do Parkour $arena foi setado!");
		getMessages().add("AlreadyExists", "&bEste Parkour ja foi criado!");
		getMessages().add("Invalid", "&cEste Parkour nao foi criado!");
		getMessages().add("SetLobby", "&bLobby do Parkour foi setado!");
		getMessages().add("Reload", "&aOs Parkours foram recarregados!");
		getMessages().add("SetCheck", "&bCheckPoint adicionado!");
		getMessages().add("Creating", "&6Voce esta criando o Parkour &e$arena");
		getMessages().add("CheckPoint", "&6Checkpoint encontrado!");
		getMessages().add("NoLobby", "&cO Lobby do Parkour nao foi setado!");
		getMessages().add("Lobby", "&6Voce foi para o Lobby do Parkour!");
		getMessages().add("Join", "&6Voce entrou no Parkour &e$arena");
		getMessages().add("Quit", "&6Voce desistiu do Parkour $arena");
		getMessages().add("OnlyAdmin", "&cPrecisa da permissao parkour.admin");
		getMessages().add("Win", "&6Voce terminou o Parkour &e$player &2(&a$money&2)");
		getMessages().add("WinBroadcast",
				"&6O jogador &e$player &6venceu o Parkour &e$arena &2(&a$money&2)");
		getMessages().saveConfig();

		new ParkourCommand(parkour).register();
		parkour.register(this);
	}

	@Override
	public void onDisable() {
		super.onDisable();
	}
	public Parkour getParkour() {
		return parkour;
	}
	public void setParkour(Parkour parkour) {
		this.parkour = parkour;
	}

}
