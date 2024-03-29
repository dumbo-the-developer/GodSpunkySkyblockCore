package me.godspunky.skyblock.features.item.weapon;

import me.godspunky.skyblock.features.item.*;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class DreadlordSword implements ToolStatistics, MaterialFunction, Ability  {

    @Override
    public int getAbilityCooldownTicks() {
        return 0;
    }

    @Override
    public int getManaCost() {
        return 40;
    }

    @Override
    public String getAbilityName() {
        return "Dreadlord";
    }

    @Override
    public String getAbilityDescription() {
        return ChatColor.GRAY +"Shoots a Skull that deals"+ChatColor.GREEN+" 500-750 "+"damage";
    }

    @Override
    public int getBaseDamage() {
        return 52;
    }

    @Override
    public double getBaseStrength() {
        return 25;
    }

    @Override
    public String getDisplayName() {
        return "Dreadlord Sword";
    }

    @Override
    public void onAbilityUse(Player player, SItem sItem) {
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
        return 350;
    }
}

