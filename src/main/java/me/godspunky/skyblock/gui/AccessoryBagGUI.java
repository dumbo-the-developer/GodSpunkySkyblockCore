package me.godspunky.skyblock.gui;

import me.godspunky.skyblock.features.item.SItem;
import me.godspunky.skyblock.features.item.SMaterial;
import me.godspunky.skyblock.user.User;
import me.godspunky.skyblock.util.SUtil;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class AccessoryBagGUI extends GUI {
    public AccessoryBagGUI() {
        super("Accessory Bag", 18);
        fill(BLACK_STAINED_GLASS_PANE, 9, 17);
        set(GUIClickableItem.getCloseItem(13));
    }

    @Override
    public void onOpen(GUIOpenEvent e) {
        set(GUIClickableItem.createGUIOpenerItem(GUIType.SKYBLOCK_MENU, e.getPlayer(), ChatColor.GREEN + "Go Back", 12, Material.ARROW));
        User user = User.getUser(e.getPlayer().getUniqueId());
        Inventory inventory = e.getInventory();
        for (Map.Entry<SMaterial, Integer> entry : user.getAccessory().entrySet())
            inventory.addItem(SUtil.setStackAmount(SItem.of(entry.getKey()).getStack(), entry.getValue()));
    }

    @Override
    public void onClose(InventoryCloseEvent e) {
        User user = User.getUser(e.getPlayer().getUniqueId());
        Inventory inventory = e.getInventory();
        user.clearAccessory();
        for (int i = 0; i < 9; i++) {
            ItemStack stack = inventory.getItem(i);
            SItem sItem = SItem.find(stack);
            if (sItem == null) {
                sItem = SItem.of(stack);
                if (sItem == null)
                    continue;
            }
            user.setAccessory(sItem.getType(), stack.getAmount());
        }
        user.save();
    }
}
