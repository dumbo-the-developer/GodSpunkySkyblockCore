package me.adarsh.godspunkycore.entity.den;

import me.adarsh.godspunkycore.entity.SEntity;
import me.adarsh.godspunkycore.entity.SEntityType;
import me.adarsh.godspunkycore.util.SUtil;
import org.bukkit.entity.Entity;

public class BroodMother extends BaseSpider {
    @Override
    public String getEntityName() {
        return "Brood Mother";
    }

    @Override
    public double getEntityMaxHealth() {
        return 6000.0;
    }

    @Override
    public double getDamageDealt() {
        return 100.0;
    }

    @Override
    public void onDeath(SEntity sEntity, Entity killed, Entity damager) {
        int am = SUtil.random(4, 5);
        for (int i = 0; i < am; i++)
            new SEntity(sEntity.getEntity(), SEntityType.CAVE_SPIDER);
    }

    @Override
    public double getXPDropped() {
        return 17.0;
    }
}