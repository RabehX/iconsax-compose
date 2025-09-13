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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Login: ImageVector
    get() {
        if (_Login != null) {
            return _Login!!
        }
        _Login = ImageVector.Builder(
            name = "Outline.Login",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.241f, 22.27f)
                horizontalLineTo(15.111f)
                curveTo(10.67f, 22.27f, 8.531f, 20.52f, 8.16f, 16.6f)
                curveTo(8.12f, 16.19f, 8.42f, 15.82f, 8.84f, 15.78f)
                curveTo(9.25f, 15.74f, 9.62f, 16.05f, 9.66f, 16.46f)
                curveTo(9.95f, 19.6f, 11.431f, 20.77f, 15.12f, 20.77f)
                horizontalLineTo(15.25f)
                curveTo(19.32f, 20.77f, 20.76f, 19.33f, 20.76f, 15.26f)
                verticalLineTo(8.74f)
                curveTo(20.76f, 4.67f, 19.32f, 3.23f, 15.25f, 3.23f)
                horizontalLineTo(15.12f)
                curveTo(11.41f, 3.23f, 9.931f, 4.42f, 9.66f, 7.62f)
                curveTo(9.611f, 8.03f, 9.271f, 8.34f, 8.84f, 8.3f)
                curveTo(8.42f, 8.27f, 8.12f, 7.9f, 8.151f, 7.49f)
                curveTo(8.491f, 3.51f, 10.641f, 1.73f, 15.111f, 1.73f)
                horizontalLineTo(15.241f)
                curveTo(20.15f, 1.73f, 22.25f, 3.83f, 22.25f, 8.74f)
                verticalLineTo(15.26f)
                curveTo(22.25f, 20.17f, 20.15f, 22.27f, 15.241f, 22.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.88f, 12.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2f, 11.25f)
                horizontalLineTo(14.88f)
                curveTo(15.29f, 11.25f, 15.63f, 11.59f, 15.63f, 12f)
                curveTo(15.63f, 12.41f, 15.3f, 12.75f, 14.88f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.65f, 16.1f)
                curveTo(12.46f, 16.1f, 12.27f, 16.03f, 12.12f, 15.88f)
                curveTo(11.83f, 15.59f, 11.83f, 15.11f, 12.12f, 14.82f)
                lineTo(14.94f, 12f)
                lineTo(12.12f, 9.18f)
                curveTo(11.83f, 8.89f, 11.83f, 8.41f, 12.12f, 8.12f)
                curveTo(12.41f, 7.83f, 12.89f, 7.83f, 13.18f, 8.12f)
                lineTo(16.53f, 11.47f)
                curveTo(16.82f, 11.76f, 16.82f, 12.24f, 16.53f, 12.53f)
                lineTo(13.18f, 15.88f)
                curveTo(13.03f, 16.03f, 12.84f, 16.1f, 12.65f, 16.1f)
                close()
            }
        }.build()

        return _Login!!
    }

@Suppress("ObjectPropertyName")
private var _Login: ImageVector? = null
