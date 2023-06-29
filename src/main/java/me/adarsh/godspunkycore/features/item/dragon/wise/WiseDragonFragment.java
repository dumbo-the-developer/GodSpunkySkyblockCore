package me.adarsh.godspunkycore.features.item.dragon.wise;

import me.adarsh.godspunkycore.features.item.GenericItemType;
import me.adarsh.godspunkycore.features.item.MaterialFunction;
import me.adarsh.godspunkycore.features.item.Rarity;
import me.adarsh.godspunkycore.features.item.SkullStatistics;

public class WiseDragonFragment implements SkullStatistics, MaterialFunction {
    @Override
    public String getURL() {
        return "1d7620b2e4934963bb12508310d05494c067dc33e008cecf2cd7b4549654fab3";
    }

    @Override
    public String getDisplayName() {
        return "Wise Dragon Fragment";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ITEM;
    }
}