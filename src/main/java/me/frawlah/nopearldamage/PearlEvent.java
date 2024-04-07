package me.frawlah.nopearldamage;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.entity.Player;

public class PearlEvent implements Listener {

    @EventHandler
    public void onPlayerPearlEvent(PlayerTeleportEvent event) {
        Player p = event.getPlayer();
        if (event.getCause() == PlayerTeleportEvent.TeleportCause.ENDER_PEARL) {
            event.setCancelled(true);
            //p.setNoDamageTicks(1);
            p.teleport(event.getTo());
        }
    }
}
