
package net.eduard.parkour;

import net.eduard.api.server.EduardPlugin;

public class Main extends EduardPlugin {
	private static Main plugin;
	
	private Parkour parkour;

	
	public static Main getInstance() {
		return plugin;
	}
	@Override
	public void onEnable() {
		plugin = this;

		setParkour(new Parkour(this));
		getConfigs().add("Create", "&bO Parkour $arena foi criado!");
		getConfigs().add("Delete", "&bO Parkour $arena foi deletado!");
		getConfigs().add("SetSpawn", "&bO Spawn do Parkour $arena foi setado!");
		getConfigs().add("SetEnd", "&bO Final do Parkour $arena foi setado!");
		getConfigs().add("AlreadyExists", "&bEste Parkour ja foi criado!");
		getConfigs().add("Invalid", "&cEste Parkour nao foi criado!");
		getConfigs().add("SetLobby", "&bLobby do Parkour foi setado!");
		getConfigs().add("Reload", "&aOs Parkours foram recarregados!");
		getConfigs().add("SetCheck", "&bCheckPoint adicionado!");
		getConfigs().add("Creating", "&6Voce esta criando o Parkour &e$arena");
		getConfigs().add("CheckPoint", "&6Checkpoint encontrado!");
		getConfigs().add("NoLobby", "&cO Lobby do Parkour nao foi setado!");
		getConfigs().add("Lobby", "&6Voce foi para o Lobby do Parkour!");
		getConfigs().add("Join", "&6Voce entrou no Parkour &e$arena");
		getConfigs().add("Quit", "&6Voce desistiu do Parkour $arena");
		getConfigs().add("OnlyAdmin", "&cPrecisa da permissao parkour.admin");
		getConfigs().add("Win", "&6Voce terminou o Parkour &e$player &2(&a$money&2)");
		getConfigs().add("WinBroadcast",
				"&6O jogador &e$player &6venceu o Parkour &e$arena &2(&a$money&2)");
		getConfigs().saveConfig();
	}

	@Override
	public void onDisable() {
	}
	public Parkour getParkour() {
		return parkour;
	}
	public void setParkour(Parkour parkour) {
		this.parkour = parkour;
	}

}
