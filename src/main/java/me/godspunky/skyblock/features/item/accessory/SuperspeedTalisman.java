package me.godspunky.skyblock.features.item.accessory;

import me.godspunky.skyblock.features.item.GenericItemType;
import me.godspunky.skyblock.features.item.MaterialFunction;
import me.godspunky.skyblock.features.item.Rarity;
import me.godspunky.skyblock.features.item.SpecificItemType;

public class SuperspeedTalisman implements AccessoryStatistics, MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Superspeed Talisman";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EXCLUSIVE;
    }

    @Override
    public String getLore() {
        return null;
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
    public double getBaseSpeed() {
        return 4.00;
    }

    @Override
    public String getURL() {
        return "bb884d61f235235047483ac4ba4ce528691e6424bac13814159272d9673ac";
    }
}
