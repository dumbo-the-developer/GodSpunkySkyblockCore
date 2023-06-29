package me.adarsh.godspunkycore.features.item.exclusive;

import me.adarsh.godspunkycore.features.entity.SEntity;
import me.adarsh.godspunkycore.features.entity.SEntityType;
import me.adarsh.godspunkycore.features.item.GenericItemType;
import me.adarsh.godspunkycore.features.item.MaterialFunction;
import me.adarsh.godspunkycore.features.item.Rarity;
import me.adarsh.godspunkycore.features.item.SkullStatistics;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public abstract class FloatingCrystal implements SkullStatistics, MaterialFunction {
    @Override
    public GenericItemType getType() {
        return GenericItemType.ITEM;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EXCLUSIVE;
    }

    @Override
    public void onInteraction(PlayerInteractEvent e) {
        if (e.getAction() == Action.LEFT_CLICK_AIR ||
                e.getAction() == Action.LEFT_CLICK_BLOCK) return;
        Player player = e.getPlayer();
        SEntity sEntity = new SEntity(player.getLocation().clone().add(player.getLocation().getDirection().multiply(1.5)), getCrystalType());
    }

    protected abstract SEntityType getCrystalType();
}