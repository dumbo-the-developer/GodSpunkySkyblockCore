package me.godspunky.skyblock.features.entity.end;

import me.godspunky.skyblock.features.entity.EntityFunction;

public class WeakEnderman implements EndermanStatistics, EntityFunction {
    @Override
    public String getEntityName() {
        return "Enderman";
    }

    @Override
    public double getEntityMaxHealth() {
        return 4500.0;
    }

    @Override
    public double getDamageDealt() {
        return 500.0;
    }

    @Override
    public double getXPDropped() {
        return 28.0;
    }
}