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

val Iconsax.Outline.Wifi: ImageVector
    get() {
        if (_Wifi != null) {
            return _Wifi!!
        }
        _Wifi = ImageVector.Builder(
            name = "Outline.Wifi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.091f, 12.59f)
                curveTo(18.931f, 12.59f, 18.771f, 12.54f, 18.631f, 12.43f)
                curveTo(14.601f, 9.32f, 9.391f, 9.32f, 5.361f, 12.43f)
                curveTo(5.031f, 12.68f, 4.561f, 12.62f, 4.311f, 12.3f)
                curveTo(4.061f, 11.97f, 4.121f, 11.5f, 4.441f, 11.25f)
                curveTo(9.031f, 7.7f, 14.961f, 7.7f, 19.541f, 11.25f)
                curveTo(19.871f, 11.5f, 19.931f, 11.97f, 19.671f, 12.3f)
                curveTo(19.541f, 12.49f, 19.321f, 12.59f, 19.091f, 12.59f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 9.11f)
                curveTo(21.84f, 9.11f, 21.681f, 9.06f, 21.541f, 8.95f)
                curveTo(15.741f, 4.47f, 8.251f, 4.47f, 2.461f, 8.95f)
                curveTo(2.131f, 9.2f, 1.661f, 9.14f, 1.411f, 8.82f)
                curveTo(1.161f, 8.49f, 1.221f, 8.02f, 1.541f, 7.77f)
                curveTo(7.891f, 2.86f, 16.101f, 2.86f, 22.461f, 7.77f)
                curveTo(22.791f, 8.02f, 22.851f, 8.49f, 22.59f, 8.82f)
                curveTo(22.451f, 9.01f, 22.221f, 9.11f, 22f, 9.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.21f, 16.24f)
                curveTo(17.05f, 16.24f, 16.89f, 16.19f, 16.75f, 16.08f)
                curveTo(13.87f, 13.85f, 10.14f, 13.85f, 7.25f, 16.08f)
                curveTo(6.92f, 16.33f, 6.45f, 16.27f, 6.2f, 15.95f)
                curveTo(5.95f, 15.62f, 6.01f, 15.15f, 6.33f, 14.9f)
                curveTo(9.77f, 12.24f, 14.22f, 12.24f, 17.66f, 14.9f)
                curveTo(17.99f, 15.15f, 18.05f, 15.62f, 17.79f, 15.95f)
                curveTo(17.65f, 16.14f, 17.43f, 16.24f, 17.21f, 16.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.599f, 19.9f)
                curveTo(14.439f, 19.9f, 14.279f, 19.85f, 14.139f, 19.74f)
                curveTo(12.839f, 18.73f, 11.149f, 18.73f, 9.849f, 19.74f)
                curveTo(9.519f, 19.99f, 9.049f, 19.93f, 8.799f, 19.61f)
                curveTo(8.549f, 19.28f, 8.609f, 18.81f, 8.929f, 18.56f)
                curveTo(10.789f, 17.12f, 13.189f, 17.12f, 15.049f, 18.56f)
                curveTo(15.379f, 18.81f, 15.439f, 19.28f, 15.179f, 19.61f)
                curveTo(15.049f, 19.79f, 14.829f, 19.9f, 14.599f, 19.9f)
                close()
            }
        }.build()

        return _Wifi!!
    }

@Suppress("ObjectPropertyName")
private var _Wifi: ImageVector? = null
