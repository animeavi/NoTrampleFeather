package zero.notramplefeather;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import zero.notramplefeather.events.OnTrample;

public class NoTrampleFeather extends JavaPlugin {
   PluginDescriptionFile pdffile = this.getDescription();
   public String version;
   public String name;
   public Logger log;

   public NoTrampleFeather() {
      this.version = this.pdffile.getVersion();
      this.name = this.pdffile.getName();
      this.log = getLogger();
   }

   public void onEnable() {
      log.info("plugin enabled");
      this.registerEvents();
   }

   public void onDisable() {
      log.info("plugin disabled");
   }

   public void registerEvents() {
      PluginManager pm = this.getServer().getPluginManager();
      pm.registerEvents(new OnTrample(), this);
   }
}
