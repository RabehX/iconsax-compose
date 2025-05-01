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


val Iconsax.Filled.Camera: ImageVector
    get() {
        if (_Camera != null) {
            return _Camera!!
        }
        _Camera = ImageVector.Builder(
            name = "Filled.Camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 6f)
                curveTo(17.39f, 6f, 16.83f, 5.65f, 16.55f, 5.11f)
                lineTo(15.83f, 3.66f)
                curveTo(15.37f, 2.75f, 14.17f, 2f, 13.15f, 2f)
                horizontalLineTo(10.86f)
                curveTo(9.83f, 2f, 8.63f, 2.75f, 8.17f, 3.66f)
                lineTo(7.45f, 5.11f)
                curveTo(7.17f, 5.65f, 6.61f, 6f, 6f, 6f)
                curveTo(3.83f, 6f, 2.11f, 7.83f, 2.25f, 9.99f)
                lineTo(2.77f, 18.25f)
                curveTo(2.89f, 20.31f, 4f, 22f, 6.76f, 22f)
                horizontalLineTo(17.24f)
                curveTo(20f, 22f, 21.1f, 20.31f, 21.23f, 18.25f)
                lineTo(21.75f, 9.99f)
                curveTo(21.89f, 7.83f, 20.17f, 6f, 18f, 6f)
                close()
                moveTo(10.5f, 7.25f)
                horizontalLineTo(13.5f)
                curveTo(13.91f, 7.25f, 14.25f, 7.59f, 14.25f, 8f)
                curveTo(14.25f, 8.41f, 13.91f, 8.75f, 13.5f, 8.75f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 8.75f, 9.75f, 8.41f, 9.75f, 8f)
                curveTo(9.75f, 7.59f, 10.09f, 7.25f, 10.5f, 7.25f)
                close()
                moveTo(12f, 18.12f)
                curveTo(10.14f, 18.12f, 8.62f, 16.61f, 8.62f, 14.74f)
                curveTo(8.62f, 12.87f, 10.13f, 11.36f, 12f, 11.36f)
                curveTo(13.87f, 11.36f, 15.38f, 12.87f, 15.38f, 14.74f)
                curveTo(15.38f, 16.61f, 13.86f, 18.12f, 12f, 18.12f)
                close()
            }
        }.build()

        return _Camera!!
    }

@Suppress("ObjectPropertyName")
private var _Camera: ImageVector? = null
