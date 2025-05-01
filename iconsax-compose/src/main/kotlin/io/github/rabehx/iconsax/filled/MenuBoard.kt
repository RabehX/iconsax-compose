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


val Iconsax.Filled.MenuBoard: ImageVector
    get() {
        if (_MenuBoard != null) {
            return _MenuBoard!!
        }
        _MenuBoard = ImageVector.Builder(
            name = "Filled.MenuBoard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.901f, 9.85f)
                lineTo(21.491f, 19.74f)
                curveTo(21.511f, 20.01f, 21.381f, 20.19f, 21.311f, 20.27f)
                curveTo(21.231f, 20.36f, 21.061f, 20.5f, 20.781f, 20.5f)
                horizontalLineTo(18.051f)
                lineTo(20.211f, 9.85f)
                horizontalLineTo(20.901f)
                close()
                moveTo(22.001f, 6f)
                lineTo(21.991f, 6.02f)
                curveTo(22.011f, 6.26f, 21.991f, 6.51f, 21.931f, 6.76f)
                lineTo(14.561f, 20.29f)
                curveTo(14.321f, 21.3f, 13.421f, 22f, 12.381f, 22f)
                horizontalLineTo(20.781f)
                curveTo(22.071f, 22f, 23.091f, 20.91f, 22.991f, 19.62f)
                lineTo(22.001f, 6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.45f, 2.241f)
                curveTo(11.55f, 1.841f, 11.3f, 1.431f, 10.9f, 1.331f)
                curveTo(10.5f, 1.241f, 10.09f, 1.481f, 9.99f, 1.881f)
                lineTo(9.49f, 3.951f)
                horizontalLineTo(11.03f)
                lineTo(11.45f, 2.241f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.051f, 2.209f)
                curveTo(18.141f, 1.799f, 17.881f, 1.409f, 17.471f, 1.319f)
                curveTo(17.071f, 1.229f, 16.671f, 1.489f, 16.581f, 1.899f)
                lineTo(16.131f, 3.969f)
                horizontalLineTo(17.671f)
                lineTo(18.051f, 2.209f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.82f, 5.331f)
                curveTo(21.49f, 4.531f, 20.71f, 3.961f, 19.75f, 3.961f)
                horizontalLineTo(17.67f)
                lineTo(17.11f, 6.551f)
                curveTo(17.03f, 6.901f, 16.72f, 7.141f, 16.38f, 7.141f)
                curveTo(16.33f, 7.141f, 16.27f, 7.141f, 16.22f, 7.121f)
                curveTo(15.82f, 7.031f, 15.56f, 6.631f, 15.64f, 6.231f)
                lineTo(16.13f, 3.951f)
                horizontalLineTo(11.03f)
                lineTo(10.4f, 6.551f)
                curveTo(10.32f, 6.891f, 10.01f, 7.121f, 9.67f, 7.121f)
                curveTo(9.61f, 7.121f, 9.55f, 7.111f, 9.49f, 7.101f)
                curveTo(9.09f, 7.001f, 8.84f, 6.601f, 8.94f, 6.191f)
                lineTo(9.48f, 3.941f)
                horizontalLineTo(7.45f)
                curveTo(6.47f, 3.941f, 5.6f, 4.581f, 5.31f, 5.521f)
                lineTo(1.1f, 19.071f)
                curveTo(0.66f, 20.521f, 1.73f, 22.001f, 3.24f, 22.001f)
                horizontalLineTo(16.38f)
                curveTo(17.42f, 22.001f, 18.32f, 21.301f, 18.56f, 20.291f)
                lineTo(21.93f, 6.761f)
                curveTo(21.99f, 6.511f, 22.01f, 6.261f, 21.99f, 6.021f)
                curveTo(21.97f, 5.781f, 21.92f, 5.541f, 21.82f, 5.331f)
                close()
                moveTo(14.7f, 16.751f)
                horizontalLineTo(6.7f)
                curveTo(6.29f, 16.751f, 5.95f, 16.411f, 5.95f, 16.001f)
                curveTo(5.95f, 15.591f, 6.29f, 15.251f, 6.7f, 15.251f)
                horizontalLineTo(14.7f)
                curveTo(15.11f, 15.251f, 15.45f, 15.591f, 15.45f, 16.001f)
                curveTo(15.45f, 16.411f, 15.11f, 16.751f, 14.7f, 16.751f)
                close()
                moveTo(15.7f, 12.751f)
                horizontalLineTo(7.7f)
                curveTo(7.29f, 12.751f, 6.95f, 12.411f, 6.95f, 12.001f)
                curveTo(6.95f, 11.591f, 7.29f, 11.251f, 7.7f, 11.251f)
                horizontalLineTo(15.7f)
                curveTo(16.11f, 11.251f, 16.45f, 11.591f, 16.45f, 12.001f)
                curveTo(16.45f, 12.411f, 16.11f, 12.751f, 15.7f, 12.751f)
                close()
            }
        }.build()

        return _MenuBoard!!
    }

@Suppress("ObjectPropertyName")
private var _MenuBoard: ImageVector? = null
