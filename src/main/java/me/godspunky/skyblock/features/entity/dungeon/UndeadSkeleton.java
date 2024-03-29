package me.godspunky.skyblock.features.entity.dungeon;

import me.godspunky.skyblock.Skyblock;
import me.godspunky.skyblock.features.entity.*;
import me.godspunky.skyblock.features.item.SMaterial;
import me.godspunky.skyblock.util.EntityManager;
import me.godspunky.skyblock.util.SUtil;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

import java.util.Arrays;
import java.util.List;

public class UndeadSkeleton implements EntityFunction, EntityStatistics {
    public String getEntityName() {
        return "Undead Skeleton";
    }

    public double getEntityMaxHealth() {
        return 50000.0;
    }

    public double getDamageDealt() {
        return 1280.0;
    }

    public double getXPDropped() {
        return 40.0D;
    }

    public void onSpawn(LivingEntity entity, SEntity sEntity) {
        entity.setMetadata("DungeonMobs", (MetadataValue)new FixedMetadataValue((Plugin) Skyblock.getPlugin(), Boolean.valueOf(true)));
        entity.setMetadata("SlayerBoss", (MetadataValue)new FixedMetadataValue((Plugin)Skyblock.getPlugin(), Boolean.valueOf(true)));
        EntityManager.DEFENSE_PERCENTAGE.put(entity, Integer.valueOf(65));
    }

    public List<EntityDrop> drops() {
        return Arrays.asList(new EntityDrop(new ItemStack(Material.ARROW,
                SUtil.random(2, 4)), EntityDropType.GUARANTEED, 1.0D), new EntityDrop(SMaterial.ENCHANTED_BONE, EntityDropType.RARE, 0.05D));
    }

    public SEntityEquipment getEntityEquipment() {
        return new SEntityEquipment(new ItemStack(Material.BOW), null, null, null, null);
    }
}
