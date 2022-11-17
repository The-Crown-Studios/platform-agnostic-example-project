group = "com.thecrownstudios"
version = "0.1-SNAPSHOT"

plugins {
	id("java")
	id("com.github.johnrengelman.shadow")		version "7.1.2"
	id("org.quiltmc.loom")						version "1.0.6"
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

	maven(url = "https://maven.quiltmc.org/repository/release")
	maven(url = "https://maven.quiltmc.org/repository/snapshot")
	maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
	implementation(project(":api"))
	implementation(project(":common"))

	minecraft("com.mojang:minecraft:1.19.2")
	mappings("org.quiltmc:quilt-mappings:1.19.2+build.21")
	modImplementation("org.quiltmc:quilt-loader:0.17.6")
	modImplementation("org.quiltmc:qsl:3.0.0-beta.20+1.19.2")
}