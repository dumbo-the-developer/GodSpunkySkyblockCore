package me.godspunky.skyblock.features.reforge.armor;

import me.godspunky.skyblock.features.item.GenericItemType;
import me.godspunky.skyblock.features.item.RarityValue;
import me.godspunky.skyblock.features.reforge.Reforge;

import java.util.Collections;
import java.util.List;

public class TitanicReforge implements Reforge {
    @Override
    public String getName() {
        return "Titanic";
    }

    @Override
    public RarityValue<Double> getDefence() {
        return new RarityValue<>(10.0, 15.0, 20.0, 25.0, 35.0, 50.0);
    }

    @Override
    public RarityValue<Double> getHealth() {
        return new RarityValue<>(10.0, 15.0, 20.0, 25.0, 35.0, 50.0);
    }

    @Override
    public List<GenericItemType> getCompatibleTypes() {
        return Collections.singletonList(GenericItemType.ARMOR);
    }
}
