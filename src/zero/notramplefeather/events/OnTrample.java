package zero.notramplefeather.events;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class OnTrample implements Listener {
   @EventHandler
   public void onPlayerInteract(PlayerInteractEvent event) {
      Player player = event.getPlayer();

      if (event.getAction() == Action.PHYSICAL && event.getClickedBlock().getType().equals(Material.SOIL)) {
         if (player.getEquipment().getBoots() != null
               && player.getEquipment().getBoots().getEnchantments().containsKey(Enchantment.PROTECTION_FALL)) {
            event.setCancelled(true);
         }
      }
   }
}
