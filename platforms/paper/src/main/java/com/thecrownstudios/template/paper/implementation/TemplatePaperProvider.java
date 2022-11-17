package com.thecrownstudios.template.paper.implementation;

import com.thecrownstudios.template.api.TemplateAPI;
import com.thecrownstudios.template.api.manager.ManagerTemplate;
import com.thecrownstudios.template.paper.implementation.manager.PaperManagerTemplate;
import org.jetbrains.annotations.NotNull;

public record TemplatePaperProvider(
		@NotNull ManagerTemplate managerTemplate
		// @NotNull Boilerplate boilerplate,
		// @NotNull Boilerplate boilerplate,
		// @NotNull Boilerplate boilerplate,
) implements TemplateAPI {

	public TemplatePaperProvider() {
		this(
				new PaperManagerTemplate()
		);
	}

}