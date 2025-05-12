<h1 align="center">Iconsax Compose</h1>

<p align="center">
  A Jetpack Compose library that provides easy access to the <a href="https://iconsax.dev/" target="_blank">Iconsax</a> icon set (over 1,000 scalable vector icons created by <a href="https://vuesax.com/" target="_blank">Vuesax</a>) in multiple styles — Linear, Bulk, Outline, TwoTone, and Filled. Designed for easy integration, it enables consistent and modern UI development with minimal implementation effort.
</p>

<p align="center">
  <a href="https://central.sonatype.com/artifact/io.github.rabehx/iconsax-compose"><img src="https://img.shields.io/maven-central/v/io.github.rabehx/iconsax-compose?label=MavenCentral&logo=sonatype" alt="Maven Central Version"></a>
  <a href="https://github.com/RabehX/iconsax-compose/blob/master/LICENSE"><img src="https://img.shields.io/github/license/Rabehx/iconsax-compose?label=License&logo=gnu" alt="GitHub license"></a>
  <a href="https://t.me/RabehX"><img src="https://img.shields.io/badge/Telegram-Channel-blue.svg?logo=telegram" alt="Channel"></a>
  <a href="https://github.com/RabahX"><img src="https://img.shields.io/github/stars/RabehX/iconsax-compose?label=Stars&logo=github" alt="Stars"></a>
</p>

## Installation

Ensure you have `mavenCentral()` in your project's `settings.gradle.kts` file:

```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral() // Add this line if not present
    }
}
```

Then, add the dependency to your app's `build.gradle.kts` file:

```kotlin
dependencies {
    // Replace LATEST_VERSION with the actual latest version number
    implementation("io.github.rabehx:iconsax-compose:LATEST_VERSION")
}
```

## Usage

Import the standard `Icon` composable and the `Iconsax` object. Then, pass the desired Iconsax `ImageVector` to the `Icon` composable.

```kotlin
import androidx.compose.material3.Icon // Or from androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import io.github.rabehx.iconsax.Iconsax // Import the Iconsax object

@Composable
fun IconExample() {
    Icon(
        imageVector = Iconsax.Filled.Notification, // Pass the ImageVector
        contentDescription = "Notification Icon"
    )
}
```
## Icon Styles

The `Iconsax` object provides access to all icons, organized by style. Each style is a nested object containing the `ImageVector` properties for the icons within that style.

You access an icon using the pattern: `Iconsax.<Style>.<IconName>`

**Available Styles:**

*   **`Iconsax.Outline`**: Contains icons defined by their borders without fills.

    ```kotlin
    Icon(imageVector = Iconsax.Outline.Setting, ...)
    ```
    
*   **`Iconsax.Filled`**: Contains icons with a heavier stroke weight for emphasis.

    ```kotlin
    Icon(imageVector = Iconsax.Bold.Notification, ...)
    ```

*   **`Iconsax.AutoMirrored`**: Contains icons that automatically mirror in Right-to-Left (RTL) layouts. This is useful for icons like arrows that should change direction based on text direction.
    ```kotlin
    Icon(imageVector = Iconsax.AutoMirrored.Filled.ArrowLeft, ...)
    ```
    
Remember to replace `<IconName>` with the specific icon you want to use (e.g., `Home`, `Notification`, `Image`, `Setting`).

## License

This library is distributed under the terms of the **GNU General Public License v3.0 (GPLv3)**.

You can find the full license text in the [LICENSE](LICENSE) file included with this repository.
