package plugin

import Build
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

internal class KotlinMultiplatformPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.pluginManager.apply("org.jetbrains.kotlin.multiplatform")
        with(target.extensions.getByType<KotlinMultiplatformExtension>()) {
            jvmToolchain(Build.JDK_VERSION)
            explicitApi()

            jvm()
            iosSimulatorArm64()
            iosArm64()
            applyDefaultHierarchyTemplate()
        }
    }
}