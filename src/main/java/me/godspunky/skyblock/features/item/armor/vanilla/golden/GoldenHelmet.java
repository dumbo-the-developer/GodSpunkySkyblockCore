package me.godspunky.skyblock.features.item.armor.vanilla.golden;

import me.godspunky.skyblock.features.item.*;

public class GoldenHelmet implements ToolStatistics, MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Golden Helmet";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ARMOR;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.HELMET;
    }

    @Override
    public double getBaseDefense() {
        return 10;
    }
}
