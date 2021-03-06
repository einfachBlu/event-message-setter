package de.blu.eventmessagesetter;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class EventMessageSetter extends JavaPlugin implements Listener {

  @Override
  public void onEnable() {
    Bukkit.getPluginManager().registerEvents(this, this);
  }

  @EventHandler
  public void onJoin(PlayerJoinEvent e) {
    e.joinMessage(null);
  }

  @EventHandler
  public void onQuit(PlayerQuitEvent e) {
    e.quitMessage(null);
  }

  @EventHandler
  public void onDeath(PlayerDeathEvent e) {
    e.deathMessage(null);
  }
}
