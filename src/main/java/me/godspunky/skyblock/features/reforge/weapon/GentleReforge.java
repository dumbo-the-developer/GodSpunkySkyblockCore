package me.godspunky.skyblock.features.reforge.weapon;

import me.godspunky.skyblock.features.item.GenericItemType;
import me.godspunky.skyblock.features.item.RarityValue;
import me.godspunky.skyblock.features.reforge.Reforge;

import java.util.Collections;
import java.util.List;

public class GentleReforge implements Reforge {
    @Override
    public String getName() {
        return "Gentle";
    }

    @Override
    public RarityValue<Double> getStrength() {
        return new RarityValue<>(3.0, 5.0, 7.0, 10.0, 15.0, 20.0);
    }

    @Override
    public List<GenericItemType> getCompatibleTypes() {
        return Collections.singletonList(GenericItemType.WEAPON);
    }
}
