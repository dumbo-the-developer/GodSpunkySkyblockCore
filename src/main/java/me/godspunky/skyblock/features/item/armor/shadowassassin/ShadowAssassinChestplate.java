package me.godspunky.skyblock.features.item.armor.shadowassassin;

import me.godspunky.skyblock.features.item.GenericItemType;
import me.godspunky.skyblock.features.item.MaterialFunction;
import me.godspunky.skyblock.features.item.Rarity;
import me.godspunky.skyblock.features.item.SpecificItemType;
import me.godspunky.skyblock.features.item.armor.LeatherArmorStatistics;

public class ShadowAssassinChestplate implements LeatherArmorStatistics, MaterialFunction {

    @Override
    public String getDisplayName() {
        return "Shadow Assassin Chestplate";
    }

    @Override
    public double getBaseStrength() {
        return 25;
    }

    @Override
    public double getBaseCritDamage() {
        return 0.25;
    }

    @Override
    public double getBaseHealth() {
        return 240;
    }

    @Override
    public double getBaseDefense() {
        return 110;
    }

    @Override
    public double getBaseSpeed() {
        return 0.07;
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
        return 0x000000;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.CHESTPLATE;
    }
}
