package com.thecrownstudios.template.api;

import com.thecrownstudios.template.api.manager.ManagerTemplate;
import org.jetbrains.annotations.NotNull;

public interface TemplateAPI {

	/**
	 * Lorem ipsum dolor sit amet, consectetur adipisci elit,
	 * sed eiusmod tempor incidunt ut labore et dolore magna aliqua.
	 *
	 * @return						lorem ipsum dolor sit amet
	 * @since						0.1
	 */
	@NotNull ManagerTemplate managerTemplate();

}