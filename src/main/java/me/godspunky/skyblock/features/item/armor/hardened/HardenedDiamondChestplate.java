package me.godspunky.skyblock.features.item.armor.hardened;

import me.godspunky.skyblock.features.item.*;
import me.godspunky.skyblock.util.SUtil;


public class HardenedDiamondChestplate implements ToolStatistics, MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Hardened Diamond Chestplate";
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
        return SpecificItemType.CHESTPLATE;
    }

    @Override
    public double getBaseDefense() {
        return 120;
    }

    @Override
    public void load() {
        SUtil.ChestplateRecipe(SMaterial.HARDENED_DIAMOND_CHESTPLATE,SMaterial.ENCHANTED_DIAMOND);
    }

}