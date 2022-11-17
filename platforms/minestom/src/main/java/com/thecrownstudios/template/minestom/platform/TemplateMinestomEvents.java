package com.thecrownstudios.template.minestom.platform;

import com.thecrownstudios.template.api.TemplateAPI;
import com.thecrownstudios.template.api.TemplateProvider;
import com.thecrownstudios.template.api.manager.ManagerTemplate;
import net.kyori.adventure.text.format.NamedTextColor;
import net.minestom.server.event.EventFilter;
import net.minestom.server.event.EventNode;
import net.minestom.server.event.player.PlayerSpawnEvent;
import net.minestom.server.event.trait.PlayerEvent;
import org.jetbrains.annotations.NotNull;

import static net.kyori.adventure.identity.Identity.nil;
import static net.kyori.adventure.text.Component.text;

public final class TemplateMinestomEvents {

	private final TemplateAPI templateAPI;
	private final ManagerTemplate managerTemplate;
	private final EventNode<PlayerEvent> eventNode;

	public TemplateMinestomEvents() {
		this.templateAPI		=	TemplateProvider.get();
		this.managerTemplate	=	templateAPI.managerTemplate();
		this.eventNode = EventNode.type("persona", EventFilter.PLAYER)
				.addListener(PlayerSpawnEvent.class, event -> {
					var player = event.getPlayer();

					player.sendMessage(nil(), text("I see... you are maidenless", NamedTextColor.AQUA));
				});
	}

	public @NotNull EventNode<PlayerEvent> eventNode() {
		return this.eventNode;
	}

}