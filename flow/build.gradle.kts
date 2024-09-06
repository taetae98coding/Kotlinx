import com.vanniktech.maven.publish.KotlinMultiplatform
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.maven.publish)
}

kotlin {
    jvm()
    iosSimulatorArm64()
    iosArm64()
    applyDefaultHierarchyTemplate()

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
        version = "1.0.0"
    )

    pom {
        name.set("Kotlinx-Flow")
        description.set("Flow Extension")
        inceptionYear.set("2024")
        url.set("https://github.com/taetae98coding/Kotlinx")

        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }

        developers {
            developer {
                id.set("taetrae98coding")
                name.set("taetae98coding")
                email.set("taetae98coding@gmail.com")
                url.set("https://github.com/taetae98coding")
            }
        }

        scm {
            url.set("https://github.com/taetae98coding/Kotlinx")
            connection.set("scm:git:git://github.com/taetae98coding/Kotlinx.git")
            developerConnection.set("scm:git:ssh://git@github.com:taetae98coding/Kotlinx.git")
        }
    }

    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
}