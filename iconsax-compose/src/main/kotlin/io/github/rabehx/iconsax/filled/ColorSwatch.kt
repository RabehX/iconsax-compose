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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.ColorSwatch: ImageVector
    get() {
        if (_ColorSwatch != null) {
            return _ColorSwatch!!
        }
        _ColorSwatch = ImageVector.Builder(
            name = "Filled.ColorSwatch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.001f, 16.5f)
                verticalLineTo(19.5f)
                curveTo(22.001f, 20.88f, 20.881f, 22f, 19.501f, 22f)
                horizontalLineTo(12.361f)
                curveTo(11.471f, 22f, 11.031f, 20.93f, 11.651f, 20.3f)
                lineTo(17.521f, 14.3f)
                curveTo(17.711f, 14.11f, 17.971f, 14f, 18.231f, 14f)
                horizontalLineTo(19.501f)
                curveTo(20.881f, 14f, 22.001f, 15.12f, 22.001f, 16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.37f, 11.29f)
                lineTo(15.66f, 14f)
                lineTo(13.2f, 16.449f)
                curveTo(12.57f, 17.08f, 11.49f, 16.639f, 11.49f, 15.75f)
                curveTo(11.49f, 12.54f, 11.49f, 7.26f, 11.49f, 7.26f)
                curveTo(11.49f, 6.99f, 11.6f, 6.74f, 11.78f, 6.55f)
                lineTo(12.7f, 5.63f)
                curveTo(13.68f, 4.65f, 15.26f, 4.65f, 16.24f, 5.63f)
                lineTo(18.36f, 7.75f)
                curveTo(19.35f, 8.73f, 19.35f, 10.309f, 18.37f, 11.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.5f, 2f)
                horizontalLineTo(4.5f)
                curveTo(3f, 2f, 2f, 3f, 2f, 4.5f)
                verticalLineTo(18f)
                curveTo(2f, 18.27f, 2.03f, 18.54f, 2.08f, 18.8f)
                curveTo(2.11f, 18.93f, 2.14f, 19.06f, 2.18f, 19.19f)
                curveTo(2.23f, 19.34f, 2.28f, 19.49f, 2.34f, 19.63f)
                curveTo(2.35f, 19.64f, 2.35f, 19.65f, 2.35f, 19.65f)
                curveTo(2.36f, 19.65f, 2.36f, 19.65f, 2.35f, 19.66f)
                curveTo(2.49f, 19.94f, 2.65f, 20.21f, 2.84f, 20.46f)
                curveTo(2.95f, 20.59f, 3.06f, 20.71f, 3.17f, 20.83f)
                curveTo(3.28f, 20.95f, 3.4f, 21.05f, 3.53f, 21.15f)
                lineTo(3.54f, 21.16f)
                curveTo(3.79f, 21.35f, 4.06f, 21.51f, 4.34f, 21.65f)
                curveTo(4.35f, 21.64f, 4.35f, 21.64f, 4.35f, 21.65f)
                curveTo(4.5f, 21.72f, 4.65f, 21.77f, 4.81f, 21.82f)
                curveTo(4.94f, 21.86f, 5.07f, 21.89f, 5.2f, 21.92f)
                curveTo(5.46f, 21.97f, 5.73f, 22f, 6f, 22f)
                curveTo(6.41f, 22f, 6.83f, 21.94f, 7.22f, 21.81f)
                curveTo(7.33f, 21.77f, 7.44f, 21.73f, 7.55f, 21.68f)
                curveTo(7.9f, 21.54f, 8.24f, 21.34f, 8.54f, 21.08f)
                curveTo(8.63f, 21.01f, 8.73f, 20.92f, 8.82f, 20.83f)
                lineTo(8.86f, 20.79f)
                curveTo(9.56f, 20.07f, 10f, 19.08f, 10f, 18f)
                verticalLineTo(4.5f)
                curveTo(10f, 3f, 9f, 2f, 7.5f, 2f)
                close()
                moveTo(6f, 19.5f)
                curveTo(5.17f, 19.5f, 4.5f, 18.83f, 4.5f, 18f)
                curveTo(4.5f, 17.17f, 5.17f, 16.5f, 6f, 16.5f)
                curveTo(6.83f, 16.5f, 7.5f, 17.17f, 7.5f, 18f)
                curveTo(7.5f, 18.83f, 6.83f, 19.5f, 6f, 19.5f)
                close()
            }
        }.build()

        return _ColorSwatch!!
    }

@Suppress("ObjectPropertyName")
private var _ColorSwatch: ImageVector? = null
