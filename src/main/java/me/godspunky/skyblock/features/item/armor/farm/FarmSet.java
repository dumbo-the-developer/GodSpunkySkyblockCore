package me.godspunky.skyblock.features.item.armor.farm;

import me.godspunky.skyblock.features.item.GenericItemType;
import me.godspunky.skyblock.features.item.MaterialStatistics;
import me.godspunky.skyblock.features.item.PlayerBoostStatistics;
import me.godspunky.skyblock.features.item.Rarity;
import me.godspunky.skyblock.features.item.armor.ArmorSet;
import me.godspunky.skyblock.features.region.Region;
import me.godspunky.skyblock.features.region.RegionType;
import me.godspunky.skyblock.user.User;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class FarmSet implements ArmorSet {
    @Override
    public String getName() {
        return "Bonus Speed";
    }

    @Override
    public String getDescription() {
        return "Increases your"+ ChatColor.WHITE +" ✦ Speed"+ChatColor.GRAY+" by "+ ChatColor.GREEN +"+20"+ChatColor.GRAY+" near Farming Minions or farming islands.";
    }

    @Override
    public Class<? extends MaterialStatistics> getHelmet() {
        return FarmSuitHelmet.class;
    }

    @Override
    public Class<? extends MaterialStatistics> getChestplate() {
        return FarmSuitChestplate.class;
    }

    @Override
    public Class<? extends MaterialStatistics> getLeggings() {
        return FarmSuitLeggings.class;
    }

    @Override
    public Class<? extends MaterialStatistics> getBoots() {
        return FarmSuitBoots.class;
    }

    @Override
    public PlayerBoostStatistics whileHasFullSet(Player player) {
        User user = User.getUser(player.getUniqueId());
        Region region = Region.getRegionOfEntity(player);
        if (region != null && region.getType().equals(RegionType.FARM)){
            return new PlayerBoostStatistics() {
                @Override
                public double getBaseSpeed(){
                    return 0.2;
                }
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
        return null;
    }
}