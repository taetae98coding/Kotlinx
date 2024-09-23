plugins {
    `kotlin-dsl`
}

kotlin {
    explicitApi()
    jvmToolchain(17)
}

dependencies {
    implementation(libs.gradle.kotlin)
    implementation(libs.gradle.maven.publish)
}

gradlePlugin {
    plugins {
        register("kotlinx.multiplatform") {
            id = "kotlinx.multiplatform"
            implementationClass = "plugin.KotlinMultiplatformPlugin"
        }

        register("kotlinx.maven.publish") {
            id = "kotlinx.maven.publish"
            implementationClass = "plugin.MavenPublishPlugin"
        }
    }
}