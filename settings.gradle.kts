pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

// settings.gradle.kts

dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://maven-central.storage.apis.com")
        }
        ivy {
            url = uri("https://github.com/ivy-rep/")
        }
    }




    rootProject.name = "music player"
    include(":app")
}
