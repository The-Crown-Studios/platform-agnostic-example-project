import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

group = "com.thecrownstudios"
version = "0.1-SNAPSHOT"

plugins {
	id("java")
	id("com.github.johnrengelman.shadow") version "7.1.2"
}

java {
	sourceCompatibility = JavaVersion.VERSION_17
	targetCompatibility = JavaVersion.VERSION_17

	tasks.withType<JavaCompile> {
		options.encoding = "UTF-8"
	}

	/*
	tasks.withType<Jar> {
		println(message = "ARCHIVE INFORMATION")
		println(message = "rootname:   ${rootProject.name}")
		println(message = "basename:   ${archiveBaseName.get()}")
		println(message = "version:    ${archiveVersion.get()}")
		println(message = "extension:  ${archiveExtension.get()}")
		println();

		archiveFileName.set("${rootProject.name}-${archiveBaseName.get()}-${archiveVersion.get()}.${archiveExtension.get()}")
	}
	*/
}

shadow {
	tasks.withType<ShadowJar> {
		println(message = "SHADOWJAR INFORMATION")
		println(message = "rootname:   ${rootProject.name}")
		println(message = "basename:   ${archiveBaseName.get()}")
		println(message = "version:    ${archiveVersion.get()}")
		println(message = "extension:  ${archiveExtension.get()}")
		println()

		archiveFileName.set("${rootProject.name}-${archiveBaseName.get()}-${archiveVersion.get()}.${archiveExtension.get()}")
	}
}

repositories {
	mavenCentral()

	maven(url = "https://jitpack.io")
	maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
	implementation(project(":api"))
	implementation(project(":common"))

	shadow("com.github.Minestom:Minestom:42195c536b")
	shadow("net.kyori:adventure-text-minimessage:4.11.0")
}