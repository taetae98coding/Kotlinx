package plugin

import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

internal class MavenPublishPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply("com.vanniktech.maven.publish")
        with(target.extensions.getByType<MavenPublishBaseExtension>()) {
            pom {
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
    }
}