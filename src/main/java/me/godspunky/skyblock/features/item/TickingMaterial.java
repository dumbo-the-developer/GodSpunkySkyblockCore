package me.godspunky.skyblock.features.item;

import org.bukkit.entity.Player;

public interface TickingMaterial extends MaterialFunction {
    default void tick(SItem item, Player owner) {
    }

    default long getInterval() {
        return 2;
    }
}