package me.godspunky.skyblock.features.item.armor.werewolf;

import me.godspunky.skyblock.features.item.GenericItemType;
import me.godspunky.skyblock.features.item.MaterialFunction;
import me.godspunky.skyblock.features.item.Rarity;
import me.godspunky.skyblock.features.item.SpecificItemType;
import me.godspunky.skyblock.features.item.armor.LeatherArmorStatistics;

public class WerewolfBoots implements MaterialFunction, LeatherArmorStatistics {
    @Override
    public String getDisplayName() {
        return "Werewolf Boots";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ARMOR;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.BOOTS;
    }

    @Override
    public double getBaseDefense() {
        return 125;
    }

    @Override
    public double getBaseIntelligence() {
        return 50;
    }

    @Override
    public int getColor() {
        return 0x1D1105;
    }
}