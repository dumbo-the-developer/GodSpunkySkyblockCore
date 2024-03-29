package me.godspunky.skyblock.features.item.weapon;

import me.godspunky.skyblock.features.item.*;
import me.godspunky.skyblock.features.item.weapon.Abilites.bonzo.BonzoStaffProjectile;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class BonzoStaff implements ToolStatistics, MaterialFunction, Ability {

    @Override
    public int getAbilityCooldownTicks() {
        return 0;
    }

    @Override
    public int getManaCost() {
        return 100;
    }

    @Override
    public String getAbilityName() {
        return "Showtime";
    }

    @Override
    public String getAbilityDescription() {
        return "Shoots balloons that create a large explosion on impact, dealing up to"+ ChatColor.RED +" 1000 "+ChatColor.GRAY+"damage.";
    }
    @Override
    public void onAbilityUse(Player player, SItem sItem) {
        BonzoStaffProjectile projectile = new BonzoStaffProjectile(player);
    }


    @Override
    public int getBaseDamage() {
        return 160;
    }

    @Override
    public String getDisplayName() {
        return "Bonzo's Staff";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.WEAPON;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.SWORD;
    }

    @Override
    public String getLore() {
        return null;
    }

    @Override
    public double getBaseIntelligence() {
        return 250;
    }
}
