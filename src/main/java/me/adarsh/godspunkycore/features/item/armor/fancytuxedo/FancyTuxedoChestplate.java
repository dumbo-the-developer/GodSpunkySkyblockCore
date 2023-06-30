package me.adarsh.godspunkycore.features.item.armor.fancytuxedo;

import me.adarsh.godspunkycore.features.item.GenericItemType;
import me.adarsh.godspunkycore.features.item.MaterialFunction;
import me.adarsh.godspunkycore.features.item.Rarity;
import me.adarsh.godspunkycore.features.item.SpecificItemType;
import me.adarsh.godspunkycore.features.item.armor.LeatherArmorStatistics;

public class FancyTuxedoChestplate implements MaterialFunction, LeatherArmorStatistics {
    @Override
    public String getDisplayName() {
        return "Fancy Tuxedo Chestplate";
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
        return SpecificItemType.CHESTPLATE;
    }

    @Override
    public double getBaseCritDamage() {
        return 80;
    }

    @Override
    public double getBaseIntelligence() {
        return 150;
    }

    @Override
    public int getColor() {
        return 0x332A2A;
    }
}
