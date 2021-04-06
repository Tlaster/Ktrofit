plugins {
    kotlin("multiplatform") version "1.4.32"
}

group = "moe.tlaster"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
}

kotlin {
    jvm()
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("com.google.devtools.ksp:symbol-processing-api:1.4.31-1.0.0-alpha06")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
    }
}
