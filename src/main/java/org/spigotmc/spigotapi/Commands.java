package org.spigotmc.spigotapi;

import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player)sender;
            if (!player.isOp()) {
                player.sendMessage(Color.LIME + "Для использования данной команды, нужны права администратора.");
                return true;
            }
        }

        return false;
    }
}
