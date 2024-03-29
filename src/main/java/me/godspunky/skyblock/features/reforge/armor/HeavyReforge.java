package me.godspunky.skyblock.features.reforge.armor;

import me.godspunky.skyblock.features.item.GenericItemType;
import me.godspunky.skyblock.features.item.RarityValue;
import me.godspunky.skyblock.features.reforge.Reforge;

import java.util.Collections;
import java.util.List;

public class HeavyReforge implements Reforge {
    @Override
    public String getName() {
        return "Heavy";
    }

    @Override
    public RarityValue<Double> getCritDamage() {
        return new RarityValue<>(-0.01, -0.02, -0.02, -0.03, -0.05, -0.07);
    }

    @Override
    public RarityValue<Double> getDefence() {
        return new RarityValue<>(25.0, 35.0, 50.0, 65.0, 80.0, 110.0);
    }

    @Override
    public RarityValue<Double> getSpeed() {
        return new RarityValue<>(-0.01, -0.01, -0.01, -0.01, -0.01, -0.01);
    }

    @Override
    public List<GenericItemType> getCompatibleTypes() {
        return Collections.singletonList(GenericItemType.ARMOR);
    }
}
