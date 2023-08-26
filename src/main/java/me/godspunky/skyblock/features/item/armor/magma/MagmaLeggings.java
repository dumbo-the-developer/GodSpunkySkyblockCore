package me.godspunky.skyblock.features.item.armor.magma;

import me.godspunky.skyblock.features.item.*;
import me.godspunky.skyblock.features.item.armor.LeatherArmorStatistics;
import me.godspunky.skyblock.util.SUtil;

public class MagmaLeggings implements LeatherArmorStatistics, MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Armor of Magma Leggings";
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
    public double getBaseHealth(){return 75;}

    @Override
    public double getBaseDefense() {
        return 25;
    }

    @Override
    public int getColor() {
        return 0xFF9300;
    }

    @Override
    public void load() {
        SUtil.LeggingsRecipe(SMaterial.MAGMA_LEGGINGS,SMaterial.ENCHANTED_MAGMA_CREAM,12);
    }
}

