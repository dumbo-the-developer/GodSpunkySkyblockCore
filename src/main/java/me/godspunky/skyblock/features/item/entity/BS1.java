// 
// Decompiled by Procyon v0.5.36
// 

package me.godspunky.skyblock.features.item.entity;


import me.godspunky.skyblock.features.item.GenericItemType;
import me.godspunky.skyblock.features.item.MaterialFunction;
import me.godspunky.skyblock.features.item.Rarity;
import me.godspunky.skyblock.features.item.SkullStatistics;

public class BS1 implements SkullStatistics, MaterialFunction {
    @Override
    public String getURL() {
        return "52dd11da04252f76b6934bc26612f54f264f30eed74df89941209e191bebc0a2";
    }

    @Override
    public String getDisplayName() {
        return "BZB1";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EXCLUSIVE;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ARMOR;
    }
}
