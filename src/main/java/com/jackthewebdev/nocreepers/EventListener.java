package com.jackthewebdev.nocreepers;

import org.bukkit.entity.Creeper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class EventListener implements Listener {
    @EventHandler
    public void onSpawn(CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Creeper) {
            System.out.println("Kept a creeper from spawning");
            e.setCancelled(true);
        }
    }

}
