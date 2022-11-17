package com.thecrownstudios.template.paper.platform;

import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static net.kyori.adventure.identity.Identity.nil;
import static net.kyori.adventure.text.Component.text;

public class TemplatePaperListener implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		var player = event.getPlayer();

		player.sendMessage(nil(), text("I see... you are maidenless", NamedTextColor.AQUA));
	}

}
