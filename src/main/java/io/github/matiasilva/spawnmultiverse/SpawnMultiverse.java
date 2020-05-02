package io.github.matiasilva.spawnmultiverse;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnMultiverse extends JavaPlugin {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("spawn")) {
			if (sender instanceof Player) {
				Player p = (Player) sender;
				ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
				String sendToConsole = String.format("mvtp %s ninja_spawn", p.getName());
				Bukkit.dispatchCommand(console, sendToConsole);
				p.sendMessage("Este comando foi escrito por um ninja como tu! Queres saber como? Pergunte no Slack!");
				return true;
			} else {
				sender.sendMessage("You cannot run this command from the console!");
			}
		}
		return false;
	}

}
