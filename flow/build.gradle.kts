plugins {
    id("kotlinx.multiplatform")
    id("kotlinx.maven.publish")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.kotlinx.coroutines.core)
            }
        }
    }
}

mavenPublishing {
    coordinates(
        groupId = "io.github.taetae98coding",
        artifactId = "kotlinx-flow",
        version = Build.LIBRARY_VERSION,
    )

    pom {
        name.set("Kotlinx-Flow")
        description.set("Flow Extension")
        inceptionYear.set("2024")
    }
}
