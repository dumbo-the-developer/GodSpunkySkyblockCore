package me.godspunky.skyblock.features.item.armor.crystal;

import me.godspunky.skyblock.features.item.*;
import me.godspunky.skyblock.features.item.armor.LeatherArmorStatistics;
import me.godspunky.skyblock.util.SUtil;

public class CrystalBoots implements LeatherArmorStatistics, MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Crystal Boots";
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
        return SpecificItemType.BOOTS;
    }

    @Override
    public double getBaseIntelligence(){return 0.60;}

    @Override
    public double getBaseDefense() {
        return 15;
    }

    @Override
    public int getColor() {
        return 0xFFFFFF;
    }

    @Override
    public void load() {
        SUtil.BootsRecipe(SMaterial.CRYSTAL_BOOTS,SMaterial.CRYSTAL_FRAGMENT);
    }
}
