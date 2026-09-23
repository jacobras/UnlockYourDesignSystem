plugins {
    kotlin("multiplatform")
    alias(libs.plugins.android.kmp.library)
    alias(libs.plugins.kotlin.compose)
}

kotlin {
    android {
        namespace = "nl.jacobras.design"
        compileSdk {
            version = release(37)
        }
        androidResources {
            enable = true
        }
    }

    sourceSets {
        androidMain.dependencies {
            implementation(project.dependencies.platform(libs.compose.bom))
            implementation(libs.compose.foundation)
            implementation(libs.compose.material3)
            implementation(libs.compose.ui)
            implementation(libs.compose.ui.tooling)
            implementation(libs.compose.ui.tooling.preview)
            implementation(libs.lottie)
        }
    }
}