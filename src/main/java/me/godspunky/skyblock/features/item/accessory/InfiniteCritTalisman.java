package me.godspunky.skyblock.features.item.accessory;

import me.godspunky.skyblock.features.item.GenericItemType;
import me.godspunky.skyblock.features.item.MaterialFunction;
import me.godspunky.skyblock.features.item.Rarity;
import me.godspunky.skyblock.features.item.SpecificItemType;

public class InfiniteCritTalisman implements AccessoryStatistics, MaterialFunction {
    @Override
    public String getURL() {
        return "ddafb23efc57f251878e5328d11cb0eef87b79c87b254a7ec72296f9363ef7c";
    }

    @Override
    public String getDisplayName() {
        return "Infinite Crit Talisman";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EXCLUSIVE;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ACCESSORY;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.ACCESSORY;
    }

    @Override
    public double getBaseCritChance() {
        return 1.0;
    }
}
