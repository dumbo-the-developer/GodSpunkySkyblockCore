package me.godspunky.skyblock.features.entity.dungeon.bosses;

import me.godspunky.skyblock.features.entity.EntityFunction;
import me.godspunky.skyblock.features.entity.EntityStatistics;

public class Thorn implements EntityStatistics, EntityFunction {
    @Override
    public String getEntityName() {
        return "✪ Thorn ✪";
    }

    @Override
    public double getEntityMaxHealth() {
        return 4000000.0;
    }

    @Override
    public double getDamageDealt() {
        return 8840.0;
    }


    @Override
    public double getXPDropped() {
        return 200.0;
    }
}


