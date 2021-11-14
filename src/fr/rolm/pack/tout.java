package fr.rolm.pack;

import fr.rolm.pack.command.bruit;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

public class tout extends JavaPlugin {
    private Logger logger = Logger.getLogger("Minecraft");
    private PluginManager pluginManager;
    @Override
    public void onEnable() {
        pluginManager= Bukkit.getServer().getPluginManager();
        logger.info("Allumer");
        getCommand("rdmbruit").setExecutor(new bruit());
    }

    @Override
    public void onDisable() {
        logger.info("Eteind");
    }


}
