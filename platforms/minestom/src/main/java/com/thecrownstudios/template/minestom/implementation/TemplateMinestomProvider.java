package com.thecrownstudios.template.minestom.implementation;

import com.thecrownstudios.template.api.TemplateAPI;
import com.thecrownstudios.template.api.manager.ManagerTemplate;
import com.thecrownstudios.template.minestom.implementation.manager.MinestomManagerTemplate;
import org.jetbrains.annotations.NotNull;

public record TemplateMinestomProvider(
		@NotNull ManagerTemplate managerTemplate
		// @NotNull Boilerplate boilerplate,
		// @NotNull Boilerplate boilerplate,
		// @NotNull Boilerplate boilerplate,
) implements TemplateAPI {

	public TemplateMinestomProvider() {
		this(
				new MinestomManagerTemplate()
		);
	}

}