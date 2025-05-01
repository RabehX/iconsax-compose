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


val Iconsax.Filled.Crop: ImageVector
    get() {
        if (_Crop != null) {
            return _Crop!!
        }
        _Crop = ImageVector.Builder(
            name = "Filled.Crop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.53f, 2f)
                curveTo(5.11f, 2f, 4.78f, 2.34f, 4.78f, 2.75f)
                verticalLineTo(4.78f)
                horizontalLineTo(2.75f)
                curveTo(2.34f, 4.78f, 2f, 5.11f, 2f, 5.53f)
                curveTo(2f, 5.95f, 2.34f, 6.28f, 2.75f, 6.28f)
                horizontalLineTo(5.53f)
                curveTo(5.94f, 6.28f, 6.28f, 5.94f, 6.28f, 5.53f)
                verticalLineTo(2.75f)
                curveTo(6.28f, 2.34f, 5.94f, 2f, 5.53f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.251f, 17.719f)
                horizontalLineTo(18.471f)
                curveTo(18.061f, 17.719f, 17.721f, 18.059f, 17.721f, 18.469f)
                verticalLineTo(21.249f)
                curveTo(17.721f, 21.659f, 18.061f, 21.999f, 18.471f, 21.999f)
                curveTo(18.881f, 21.999f, 19.221f, 21.659f, 19.221f, 21.249f)
                verticalLineTo(19.219f)
                horizontalLineTo(21.251f)
                curveTo(21.661f, 19.219f, 22.001f, 18.879f, 22.001f, 18.469f)
                curveTo(22.001f, 18.059f, 21.661f, 17.719f, 21.251f, 17.719f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.72f, 18.47f)
                curveTo(16.72f, 17.51f, 17.51f, 16.72f, 18.47f, 16.72f)
                horizontalLineTo(19.16f)
                verticalLineTo(10.05f)
                curveTo(19.16f, 7.16f, 16.82f, 4.82f, 13.93f, 4.82f)
                horizontalLineTo(7.28f)
                verticalLineTo(5.51f)
                curveTo(7.28f, 6.47f, 6.49f, 7.26f, 5.53f, 7.26f)
                horizontalLineTo(4.83f)
                verticalLineTo(13.93f)
                curveTo(4.83f, 16.82f, 7.17f, 19.16f, 10.06f, 19.16f)
                horizontalLineTo(16.73f)
                verticalLineTo(18.47f)
                horizontalLineTo(16.72f)
                close()
            }
        }.build()

        return _Crop!!
    }

@Suppress("ObjectPropertyName")
private var _Crop: ImageVector? = null
