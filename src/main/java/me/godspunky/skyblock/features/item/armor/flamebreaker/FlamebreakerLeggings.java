package me.godspunky.skyblock.features.item.armor.flamebreaker;

import me.godspunky.skyblock.features.item.*;
import me.godspunky.skyblock.util.SUtil;

public class FlamebreakerLeggings implements ToolStatistics, MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Flamebreaker Leggings";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ARMOR;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.LEGGINGS;
    }

    @Override
    public double getBaseDefense() {
        return 60;
    }

    @Override
    public double getBaseHealth() {
        return 60;
    }

    @Override
    public void load() {
        SUtil.LeggingsRecipe(SMaterial.FLAMEBREAKER_CHESTPLATE,SMaterial.COAL);
    }
}
