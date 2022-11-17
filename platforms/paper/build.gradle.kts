import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import net.minecrell.pluginyml.bukkit.BukkitPluginDescription;

group = "com.thecrownstudios"
version = "0.1-SNAPSHOT"

plugins {
	id("java")
	id("com.github.johnrengelman.shadow") version "7.1.2"
	id("io.papermc.paperweight.userdev")  version "1.3.9"
	id("net.minecrell.plugin-yml.bukkit") version "0.5.2"
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
		println()
		archiveFileName.set("${rootProject.name}-${archiveBaseName.get()}-${archiveVersion.get()}.${archiveExtension.get()}")
	}
	*/
}

shadow {
	/*
	tasks.withType<ShadowJar> {
		println(message = "SHADOWJAR INFORMATION")
		println(message = "rootname:   ${rootProject.name}")
		println(message = "basename:   ${archiveBaseName.get()}")
		println(message = "version:    ${archiveVersion.get()}")
		println(message = "extension:  ${archiveExtension.get()}")
		println()
		archiveFileName.set("${rootProject.name}-${archiveBaseName.get()}-${archiveVersion.get()}-mojmaps.${archiveExtension.get()}")
	}
	*/
}

repositories {
	mavenCentral()

	maven(url = "https://repo.papermc.io/repository/maven-public/")
	maven(url = "https://maven.quiltmc.org/repository/release")
	maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
	implementation(project(":api"))
	implementation(project(":common"))

	shadow("net.kyori:adventure-text-minimessage:4.11.0")
	shadow("net.kyori:adventure-text-serializer-gson:4.11.0")

	remapper("net.fabricmc:tiny-remapper:0.8.6:fat")
	decompiler("net.minecraftforge:forgeflower:1.5.605.7")
	paperDevBundle("1.19.2-R0.1-SNAPSHOT")
}

bukkit {
	load = BukkitPluginDescription.PluginLoadOrder.STARTUP
	main = "com.thecrownstudios.template.paper.platform.TemplatePaperPlatform"
	apiVersion = "1.19"
	authors = listOf("AncientGodClown")
	description = "Template implementation for PaperMC"
}

tasks {
	reobfJar {
		println(message = "OBFUSCATED SHADOWJAR INFORMATION")
		println(message = "rootname:   ${rootProject.name}")
		println(message = "basename:   ${project.name}")
		println(message = "version:    ${project.version}")
		println(message = "extension:  .jar")
		println()

		outputJar.set(layout.buildDirectory.file("libs/${rootProject.name}-${project.name}-${project.version}-yarn.jar"))
	}
}