package me.godspunky.skyblock.features.item.armor.magma;

import me.godspunky.skyblock.features.item.GenericItemType;
import me.godspunky.skyblock.features.item.MaterialStatistics;
import me.godspunky.skyblock.features.item.PlayerBoostStatistics;
import me.godspunky.skyblock.features.item.Rarity;
import me.godspunky.skyblock.features.item.armor.ArmorSet;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MagmaSet implements ArmorSet {
    @Override
    public String getName() {
        return "Absorb";
    }

    @Override
    public String getDescription() {
        return "Every"+ ChatColor.BLUE +" 10 Magma Cubes killed"+ChatColor.GRAY+" gives the wearer"+ChatColor.RED+" +1 ❤ Health"+ChatColor.GRAY+" and "+ChatColor.AQUA+"+1 ✎ Intelligence "+ChatColor.GRAY+"while wearing the set. Max 200 each.";
    }

    @Override
    public Class<? extends MaterialStatistics> getHelmet() {
        return MagmaHelmet.class;
    }

    @Override
    public Class<? extends MaterialStatistics> getChestplate() {
        return MagmaChestplate.class;
    }

    @Override
    public Class<? extends MaterialStatistics> getLeggings() {
        return MagmaLeggings.class;
    }

    @Override
    public Class<? extends MaterialStatistics> getBoots() {
        return MagmaBoots.class;
    }

    @Override
    public PlayerBoostStatistics whileHasFullSet(Player player) {
        return new PlayerBoostStatistics() {
            @Override
            public String getDisplayName() {
                return null;
            }

            @Override
            public Rarity getRarity() {
                return null;
            }

            @Override
            public GenericItemType getType() {
                return null;
            }
        };
    }
}


