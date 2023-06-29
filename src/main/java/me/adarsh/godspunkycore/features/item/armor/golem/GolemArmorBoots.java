package me.adarsh.godspunkycore.features.item.armor.golem;

import me.adarsh.godspunkycore.features.item.*;

public class GolemArmorBoots implements ToolStatistics, MaterialFunction {
    @Override
    public double getBaseDefense() {
        return 40;
    }

    @Override
    public double getBaseHealth() {
        return 40;
    }

    @Override
    public String getDisplayName() {
        return "Golem Armor Boots";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ARMOR;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.BOOTS;
    }
}