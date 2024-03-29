package me.godspunky.skyblock.features.item.armor.flamebreaker;

import me.godspunky.skyblock.features.item.*;
import me.godspunky.skyblock.util.SUtil;

public class FlamebreakerChestplate implements ToolStatistics, MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Flamebreaker Chestplate";
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
        return SpecificItemType.CHESTPLATE;
    }

    @Override
    public double getBaseDefense() {
        return 70;
    }

    @Override
    public double getBaseHealth() {
        return 70;
    }

    @Override
    public void load() {
        SUtil.ChestplateRecipe(SMaterial.FLAMEBREAKER_CHESTPLATE,SMaterial.COAL);
    }
}
