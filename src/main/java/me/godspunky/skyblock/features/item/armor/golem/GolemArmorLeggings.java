package me.godspunky.skyblock.features.item.armor.golem;

import me.godspunky.skyblock.features.item.*;
import me.godspunky.skyblock.util.SUtil;

public class GolemArmorLeggings implements ToolStatistics, MaterialFunction {
    @Override
    public double getBaseDefense() {
        return 75;
    }

    @Override
    public double getBaseHealth() {
        return 55;
    }

    @Override
    public String getDisplayName() {
        return "Golem Armor Leggings";
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
        return SpecificItemType.LEGGINGS;
    }

    @Override
    public void load() {
        SUtil.LeggingsRecipe(SMaterial.GOLEM_LEGGINGS,SMaterial.ENCHANTED_IRON,10);
    }
}

