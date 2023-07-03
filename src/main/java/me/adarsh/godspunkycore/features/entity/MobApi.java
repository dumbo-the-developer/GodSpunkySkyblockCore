package me.adarsh.godspunkycore.features.entity;

import com.comphenix.protocol.wrappers.WrappedGameProfile;
import com.comphenix.protocol.wrappers.WrappedSignedProperty;
import com.mojang.authlib.GameProfile;
import me.libraryaddict.disguise.disguisetypes.PlayerDisguise;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.minecraft.server.v1_8_R3.PacketPlayOutPlayerInfo;
import net.minecraft.server.v1_8_R3.PlayerInteractManager;
import net.minecraft.server.v1_8_R3.WorldServer;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.CraftServer;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.entity.Entity;

import java.util.UUID;

public class MobApi {

    public static void createEntity(Entity entity, Location loc, String name, String texture, String signature) {
        WrappedGameProfile wrappedGameProfile = new WrappedGameProfile(UUID.randomUUID() , name);
        wrappedGameProfile.getProperties().removeAll("textures");
        wrappedGameProfile.getProperties().put("textures", new WrappedSignedProperty("textures", texture, signature));
        WorldServer worldServer = ((CraftWorld) loc.getWorld()).getHandle();
        PlayerInteractManager interactManager = new PlayerInteractManager(worldServer);
        EntityPlayer entityPlayer = new EntityPlayer(((CraftServer) Bukkit.getServer()).getServer(), worldServer,(GameProfile) wrappedGameProfile.getHandle(), interactManager);
        PlayerDisguise mobDisguise = new PlayerDisguise(entityPlayer.getBukkitEntity().getPlayer().getName());
        mobDisguise.setEntity(entity);
        mobDisguise.setSkin(wrappedGameProfile);
        mobDisguise.startDisguise();
        }
    }
