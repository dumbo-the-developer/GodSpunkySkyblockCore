package me.godspunky.skyblock.command;

import me.godspunky.skyblock.features.ranks.PlayerRank;
import me.godspunky.skyblock.gui.GUI;
import me.godspunky.skyblock.gui.GUIType;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

@CommandParameters(description = "Opens a GUI.", permission = PlayerRank.BT)
public class GUICommand extends SCommand {
    @Override
    public void run(CommandSource sender, String[] args) {
        if (args.length != 1) throw new CommandArgumentException();
        if (sender instanceof ConsoleCommandSender)
            throw new CommandFailException("Console senders cannot use this command!");
        Player player = sender.getPlayer();
        GUI gui = GUIType.valueOf(args[0].toUpperCase()).getGUI();
        gui.open(player);
    }
}
