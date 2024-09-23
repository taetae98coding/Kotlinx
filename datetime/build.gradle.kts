plugins {
    id("kotlinx.multiplatform")
    id("kotlinx.maven.publish")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.kotlinx.datetime)
            }
        }
    }
}

mavenPublishing {
    coordinates(
        groupId = "io.github.taetae98coding",
        artifactId = "kotlinx-datetime",
        version = Build.LIBRARY_VERSION,
    )

    pom {
        name.set("Kotlinx-Datetime")
        description.set("Datetime Extension")
        inceptionYear.set("2024")
    }
}
