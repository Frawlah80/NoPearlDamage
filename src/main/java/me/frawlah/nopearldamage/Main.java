package me.frawlah.nopearldamage;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("NoPearlDamage enabled!");
        getServer().getPluginManager().registerEvents(new PearlEvent(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("NoPearlDamage disabled!");
    }
}
