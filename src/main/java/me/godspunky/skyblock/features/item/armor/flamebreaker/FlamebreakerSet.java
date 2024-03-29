package me.godspunky.skyblock.features.item.armor.flamebreaker;

import me.godspunky.skyblock.features.item.GenericItemType;
import me.godspunky.skyblock.features.item.MaterialStatistics;
import me.godspunky.skyblock.features.item.PlayerBoostStatistics;
import me.godspunky.skyblock.features.item.Rarity;
import me.godspunky.skyblock.features.item.armor.ArmorSet;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FlamebreakerSet implements ArmorSet {
    @Override
    public String getName() {
        return "Heat Resistance";
    }

    @Override
    public String getDescription() {
        return "Grants"+ ChatColor.GREEN +" 5x"+ChatColor.GRAY+" reduced heat in Magma Fields.";
    }

    @Override
    public Class<? extends MaterialStatistics> getHelmet() {
        return FlamebreakerHelmet.class;
    }

    @Override
    public Class<? extends MaterialStatistics> getChestplate() {
        return FlamebreakerChestplate.class;
    }

    @Override
    public Class<? extends MaterialStatistics> getLeggings() {
        return FlamebreakerLeggings.class;
    }

    @Override
    public Class<? extends MaterialStatistics> getBoots() {
        return Flamebreakerboots.class;
    }

    @Override
    public PlayerBoostStatistics whileHasFullSet(Player player) {
        player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE,Integer.MAX_VALUE,1));
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
            public String getLore() {
                return null;
            }

            @Override
            public GenericItemType getType() {
                return GenericItemType.ARMOR;
            }
        };
    }
}