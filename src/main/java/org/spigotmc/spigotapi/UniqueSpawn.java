package org.spigotmc.spigotapi;

import org.bukkit.plugin.java.JavaPlugin;

public final class UniqueSpawn extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin Enabled");

        getCommand("uniquespawn").setExecutor(new Commands());

    }

    @Override
    public void onDisable() {
        System.out.println("Plugin Disabled");
    }
}
