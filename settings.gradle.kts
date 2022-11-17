rootProject.name = "template-project"

include(
	"api",
	"common",
	"platforms:fabric",
	"platforms:minestom",
	"platforms:paper",
	"platforms:quilt"
)

pluginManagement {
	repositories {
		mavenCentral()
		gradlePluginPortal()

		maven {
			name	=	"Paper"
			url		=	java.net.URI.create("https://papermc.io/repo/repository/maven-public/")
		}
		maven {
			name	=	"Fabric"
			url		=	java.net.URI.create("https://maven.fabricmc.net/")
		}
		maven {
			name	=	"Quilt"
			url		=	java.net.URI.create("https://maven.quiltmc.org/repository/release")
		}
		maven {
			name	=	"Quilt Snapshots"
			url		=	java.net.URI.create("https://maven.quiltmc.org/repository/snapshot")
		}
	}
}