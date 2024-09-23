# Extension Library for Kotlin

[![GitHub license](https://img.shields.io/github/license/kotlin/kotlinx.collections.immutable)](LICENSE.txt) 
[![Maven Central](https://img.shields.io/maven-central/v/io.github.taetae98coding/kotlinx-flow.svg?label=Maven%20Central)](https://central.sonatype.com/artifact/io.github.taetae98coding/kotlinx-flow)

- Kotlin Extension.
- Support Kotlin Multiplatform

## Gradle
Add Maven Central Repository.
```groovy
repositories {
    mavenCentral()
}
```
For Single Platform
```groovy
 dependencies {
     implementation("io.github.taetae98coding:kotlinx-datetime:latest-version")
     implementation("io.github.taetae98coding:kotlinx-flow:latest-version")
 }
```

For Multiplatform
```groovy
kotlin {
    sourceSets {
        commonMain {
             dependencies {
                 implementation("io.github.taetae98coding:kotlinx-datetime:latest-version")
                 implementation("io.github.taetae98coding:kotlinx-flow:latest-version")
             }
        }
    }
}
```
