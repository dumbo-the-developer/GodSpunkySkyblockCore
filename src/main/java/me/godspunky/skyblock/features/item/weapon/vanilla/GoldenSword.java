package me.godspunky.skyblock.features.item.weapon.vanilla;

import me.godspunky.skyblock.features.item.*;

public class GoldenSword implements ToolStatistics, MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Golden Sword";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getBaseDamage() {
        return 20;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.WEAPON;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.SWORD;
    }
}