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


val Iconsax.Filled.Gallery: ImageVector
    get() {
        if (_Gallery != null) {
            return _Gallery!!
        }
        _Gallery = ImageVector.Builder(
            name = "Filled.Gallery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.581f, 19.011f)
                lineTo(2.561f, 19.031f)
                curveTo(2.291f, 18.441f, 2.121f, 17.771f, 2.051f, 17.031f)
                curveTo(2.121f, 17.761f, 2.311f, 18.421f, 2.581f, 19.011f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.001f, 10.381f)
                curveTo(10.316f, 10.381f, 11.381f, 9.316f, 11.381f, 8.001f)
                curveTo(11.381f, 6.687f, 10.316f, 5.621f, 9.001f, 5.621f)
                curveTo(7.687f, 5.621f, 6.621f, 6.687f, 6.621f, 8.001f)
                curveTo(6.621f, 9.316f, 7.687f, 10.381f, 9.001f, 10.381f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2f, 17.28f, 2.19f, 18.23f, 2.56f, 19.03f)
                curveTo(3.42f, 20.93f, 5.26f, 22f, 7.81f, 22f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 22f, 22f, 19.83f, 22f, 16.19f)
                verticalLineTo(13.9f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(20.37f, 12.5f)
                curveTo(19.59f, 11.83f, 18.33f, 11.83f, 17.55f, 12.5f)
                lineTo(13.39f, 16.07f)
                curveTo(12.61f, 16.74f, 11.35f, 16.74f, 10.57f, 16.07f)
                lineTo(10.23f, 15.79f)
                curveTo(9.52f, 15.17f, 8.39f, 15.11f, 7.59f, 15.65f)
                lineTo(3.85f, 18.16f)
                curveTo(3.63f, 17.6f, 3.5f, 16.95f, 3.5f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(3.5f, 4.99f, 4.99f, 3.5f, 7.81f, 3.5f)
                horizontalLineTo(16.19f)
                curveTo(19.01f, 3.5f, 20.5f, 4.99f, 20.5f, 7.81f)
                verticalLineTo(12.61f)
                lineTo(20.37f, 12.5f)
                close()
            }
        }.build()

        return _Gallery!!
    }

@Suppress("ObjectPropertyName")
private var _Gallery: ImageVector? = null
