package com.thecrownstudios.template.minestom.platform;

import com.thecrownstudios.template.api.TemplateProvider;
import com.thecrownstudios.template.minestom.implementation.TemplateMinestomProvider;
import net.minestom.server.extensions.Extension;

public class TemplateMinestomPlatform extends Extension {

	@Override
	public void initialize() {
		TemplateProvider.register(new TemplateMinestomProvider());

		getEventNode().addChild(new TemplateMinestomEvents().eventNode());

		getLogger().info("[TEMPLATE] > successfully initialized");
	}

	@Override
	public void terminate() {
		getLogger().info("[TEMPLATE] > successfully terminated");
	}

}