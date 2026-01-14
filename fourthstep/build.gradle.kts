plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt.android)
}

android {
    namespace = "fr.hamtec.fourthstep"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "fr.hamtec.fourthstep"
        minSdk = 29
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    configurations.all {
        resolutionStrategy {
            exclude("com.intellij", "annotations")
        }
    }

    packaging {
        resources {
//            excludes += "META-INF/gradle/incremental.annotation.processors"
//            excludes += "META-INF/androidx/room/room-compiler-processing/LICENSE.txt"
            excludes += setOf(
                "META-INF/gradle/incremental.annotation.processors",
                "META-INF/androidx/room/room-compiler-processing/LICENSE.txt"
            )
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)

    implementation(libs.bundles.room)
    ksp(libs.room.compiler) // <-- remplace kapt par ksp
    implementation(libs.bundles.hilt)
    ksp(libs.hilt.compiler) // <-- remplace kapt par ksp
    implementation(libs.bundles.lifecycle)
    implementation(libs.bundles.coroutines)
}