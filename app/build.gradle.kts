plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    kotlin("kapt")
}

android {
    namespace = "com.example.musicplayer"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.musicplayer"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        buildConfigField("String", "VERSION_NAME", "\"$versionName\"")
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
        buildConfig = true
    }

    allprojects {
        repositories {
            mavenCentral()
            maven {
                url = uri("https://company/com/maven2")
            }
            mavenLocal()
            flatDir {
                dirs("libs")
            }
        }
        android {
            dataBinding {
                isEnabled = true // Enable Data Binding
            }
        }
    }

    dependencies {
        implementation(libs.androidx.core.ktx)
        implementation(libs.androidx.appcompat)
        implementation(libs.material)
        implementation(libs.androidx.activity)
        implementation(libs.androidx.constraintlayout)
        implementation(libs.androidx.swiperefreshlayout)
        implementation(libs.firebase.crashlytics.buildtools)
        testImplementation(libs.junit)
        androidTestImplementation(libs.androidx.junit)
        androidTestImplementation(libs.androidx.espresso.core)

        // Glide for image loading
        implementation(libs.glide) // Use the latest version
        kapt("com.github.bumptech.glide:compiler:4.14.2")
        implementation(libs.material.v160)

        // For storing objects in shared preferences
        implementation(libs.gson)

        // Notification
        implementation(libs.androidx.media)

        // Add the correct VerticalSeekBar library from JitPack
        implementation("com.github.andrealesi:VerticalSeekBar:1.0.0") // Replace with correct version if needed
    }
}

