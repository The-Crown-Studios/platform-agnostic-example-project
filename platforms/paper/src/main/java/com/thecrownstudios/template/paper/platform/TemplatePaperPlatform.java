package com.thecrownstudios.template.paper.platform;

import org.bukkit.plugin.java.JavaPlugin;

public class TemplatePaperPlatform extends JavaPlugin {

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new TemplatePaperListener(), this);

		getLogger().info("[TEMPLATE] > successfully initialized");
	}

	@Override
	public void onDisable() {
		getLogger().info("[TEMPLATE] > successfully terminated");
	}

}