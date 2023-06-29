package me.adarsh.godspunkycore.features.item.armor.rosetta;

import me.adarsh.godspunkycore.features.item.*;
import me.adarsh.godspunkycore.features.item.armor.LeatherArmorStatistics;

public class RosettaChestplate implements ToolStatistics, MaterialFunction {
    @Override
    public double getBaseDefense() {
        return 40;
    }

    @Override
    public String getDisplayName() {
        return "Rosetta's Chestplate";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ARMOR;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.CHESTPLATE;
    }
}