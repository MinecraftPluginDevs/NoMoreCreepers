package com.jackthewebdev.nocreepers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Creeper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoCreepers extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Enabled!");
        Bukkit.getServer().getPluginManager().registerEvents(new EventListener(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Disabled");
    }
}

