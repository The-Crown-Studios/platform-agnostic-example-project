package com.thecrownstudios.template.api;

import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.NotNull;

public final class TemplateProvider {

	private static TemplateAPI instance = null;

	public static @NotNull TemplateAPI get() {
		TemplateAPI instance = TemplateProvider.instance;

		if (instance == null) {
			throw new NotLoadedException();
		}

		return instance;
	}

	@Internal
	public static void register(TemplateAPI instance) {
		TemplateProvider.instance = instance;
	}

	@Internal
	public static void unregister() {
		TemplateProvider.instance = null;
	}

	@Internal
	private TemplateProvider() {
		throw new UnsupportedOperationException("This class cannot be instantiated.");
	}

	private static final class NotLoadedException extends IllegalStateException {
		NotLoadedException() {
			super("TemplateAPI has not been initialized yet");
		}
	}

}