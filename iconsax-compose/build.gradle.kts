/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.maven.publish)
}

kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_20)
        }
    }

    listOf(
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "IconsaxCompose"
            isStatic = true
        }
    }

    jvm()

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
        binaries.executable()
    }

    sourceSets {
        commonMain.dependencies {
            implementation(compose.ui)
        }
    }
}

android {
    namespace = "io.github.rabehx"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_20
        targetCompatibility = JavaVersion.VERSION_20
    }

    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }

    publishing {
        multipleVariants {
            withSourcesJar()
            withJavadocJar()
        }
    }
}

mavenPublishing {
    publishToMavenCentral(automaticRelease = true)
    signAllPublications()

    coordinates("io.github.rabehx", "iconsax-compose", "0.0.4")

    pom {
        name.set("Iconsax Compose")
        description.set("A Compose Multiplatform library that provides easy access to the Iconsax icon set (over 1,000 scalable vector icons created by Vuesax in multiple styles — Linear, Bulk, Outline, TwoTone, and Filled. Designed for easy integration, it enables consistent and modern UI development with minimal implementation effort.")
        url.set("https://github.com/rabehx/iconsax")
        inceptionYear.set("2025")
        licenses {
            license {
                name.set("GNU General Public License v3.0")
                url.set("https://www.gnu.org/licenses/gpl-3.0.en.html")
            }
        }
        developers {
            developer {
                id.set("rabehx")
                name.set("Рабeх Аззам")
                email.set("rabehxofficial@gmail.com")
                url.set("https://github.com/RabehX")
            }
        }
        issueManagement {
            system.set("GitHub Issues")
            url.set("https://github.com/RabehX/iconsax-compose/issues")
        }
        scm {
            connection.set("scm:git:https://github.com/rabehx/iconsax-compose.git")
            developerConnection.set("scm:git:https://github.com/rabehx/iconsax-compose.git")
            url.set("https://github.com/rabehx/iconsax-compose")
        }
    }
}

dependencies {
    debugImplementation(compose.uiTooling)
}