package me.adarsh.godspunkycore.entity.nms;

import net.minecraft.server.v1_8_R3.World;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;

public class YoungDragon extends Dragon {
    public YoungDragon(World world) {
        super(world, 1.8, Dragon.DEFAULT_DAMAGE_DEGREE_RANGE, Dragon.DEFAULT_ATTACK_COOLDOWN);
    }

    public YoungDragon() {
        this(((CraftWorld) Bukkit.getWorlds().get(0)).getHandle());
    }

    @Override
    public String getEntityName() {
        return "Young Dragon";
    }

    @Override
    public double getEntityMaxHealth() {
        return 7500000.0;
    }

    @Override
    public double getDamageDealt() {
        return 1600.0;
    }
}