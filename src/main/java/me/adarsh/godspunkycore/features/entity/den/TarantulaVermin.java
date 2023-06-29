package me.adarsh.godspunkycore.features.entity.den;

import me.adarsh.godspunkycore.features.entity.EntityDrop;
import me.adarsh.godspunkycore.features.entity.EntityDropType;
import me.adarsh.godspunkycore.features.item.SMaterial;

import java.util.Collections;
import java.util.List;

public class TarantulaVermin extends BaseSpider {
    @Override
    public String getEntityName() {
        return "Tarantula Vermin";
    }

    @Override
    public double getEntityMaxHealth() {
        return 54000;
    }

    @Override
    public double getDamageDealt() {
        return 900.0;
    }

    @Override
    public double getXPDropped() {
        return 150.0;
    }

    @Override
    public List<EntityDrop> drops() {
        return Collections.singletonList(new EntityDrop(SMaterial.TARANTULA_WEB, EntityDropType.GUARANTEED, 1.0));
    }
}