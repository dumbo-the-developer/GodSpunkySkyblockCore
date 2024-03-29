package me.godspunky.skyblock.features.item.armor.eleganttuxedo;

import me.godspunky.skyblock.features.item.GenericItemType;
import me.godspunky.skyblock.features.item.MaterialFunction;
import me.godspunky.skyblock.features.item.Rarity;
import me.godspunky.skyblock.features.item.SpecificItemType;
import me.godspunky.skyblock.features.item.armor.LeatherArmorStatistics;

public class ElegantTuxedoLeggings implements LeatherArmorStatistics, MaterialFunction {

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.LEGGINGS;
    }

    @Override
    public double getBaseCritDamage() {
        return 50;
    }

    @Override
    public double getBaseIntelligence() {
        return 100;
    }


    @Override
    public String getDisplayName() {
        return "Elegant Tuxedo Leggings";
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
    public int getColor() {
        return 0x383838;
    }
}
