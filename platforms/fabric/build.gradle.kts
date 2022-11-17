group = "com.thecrownstudios"
version = "0.1-SNAPSHOT"

plugins {
	id("java")
	id("com.github.johnrengelman.shadow")		version "7.1.2"
	id("fabric-loom")							version "1.0-SNAPSHOT"
	id("io.github.juuxel.loom-quiltflower")		version "1.7.1"
}

java {
	sourceCompatibility = JavaVersion.VERSION_17
	targetCompatibility = JavaVersion.VERSION_17

	tasks.withType<JavaCompile> {
		options.encoding = "UTF-8"
	}

	tasks.withType<Jar> {
		println(message = "ARCHIVE INFORMATION")
		println(message = "rootname:   ${rootProject.name}")
		println(message = "basename:   ${archiveBaseName.get()}")
		println(message = "version:    ${archiveVersion.get()}")
		println(message = "extension:  ${archiveExtension.get()}")
		println()

		archiveFileName.set("${rootProject.name}-${archiveBaseName.get()}-${archiveVersion.get()}.${archiveExtension.get()}")
	}
}

quiltflower {
	quiltflowerVersion.set("1.9.0")
}

repositories {
	mavenCentral()
	gradlePluginPortal()

	maven(url = "https://maven.fabricmc.net/")
}

dependencies {
	implementation(project(":api"))
	implementation(project(":common"))

	minecraft("com.mojang:minecraft:1.19.2")
	mappings("net.fabricmc:yarn:1.19.2+build.28")
	modImplementation("net.fabricmc:fabric-loader:0.14.10")
}