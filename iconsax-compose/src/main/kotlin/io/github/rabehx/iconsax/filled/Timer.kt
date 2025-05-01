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


val Iconsax.Filled.Timer: ImageVector
    get() {
        if (_Timer != null) {
            return _Timer!!
        }
        _Timer = ImageVector.Builder(
            name = "Filled.Timer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.389f, 15.67f)
                lineTo(13.349f, 12f)
                horizontalLineTo(10.639f)
                lineTo(6.599f, 15.67f)
                curveTo(5.469f, 16.69f, 5.099f, 18.26f, 5.649f, 19.68f)
                curveTo(6.199f, 21.09f, 7.539f, 22f, 9.049f, 22f)
                horizontalLineTo(14.939f)
                curveTo(16.459f, 22f, 17.789f, 21.09f, 18.34f, 19.68f)
                curveTo(18.889f, 18.26f, 18.52f, 16.69f, 17.389f, 15.67f)
                close()
                moveTo(13.819f, 18.14f)
                horizontalLineTo(10.179f)
                curveTo(9.799f, 18.14f, 9.499f, 17.83f, 9.499f, 17.46f)
                curveTo(9.499f, 17.09f, 9.809f, 16.78f, 10.179f, 16.78f)
                horizontalLineTo(13.819f)
                curveTo(14.2f, 16.78f, 14.5f, 17.09f, 14.5f, 17.46f)
                curveTo(14.5f, 17.83f, 14.189f, 18.14f, 13.819f, 18.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.351f, 4.32f)
                curveTo(17.801f, 2.91f, 16.461f, 2f, 14.951f, 2f)
                horizontalLineTo(9.051f)
                curveTo(7.541f, 2f, 6.201f, 2.91f, 5.651f, 4.32f)
                curveTo(5.111f, 5.74f, 5.481f, 7.31f, 6.611f, 8.33f)
                lineTo(10.651f, 12f)
                horizontalLineTo(13.361f)
                lineTo(17.401f, 8.33f)
                curveTo(18.521f, 7.31f, 18.891f, 5.74f, 18.351f, 4.32f)
                close()
                moveTo(13.821f, 7.23f)
                horizontalLineTo(10.181f)
                curveTo(9.801f, 7.23f, 9.501f, 6.92f, 9.501f, 6.55f)
                curveTo(9.501f, 6.18f, 9.811f, 5.87f, 10.181f, 5.87f)
                horizontalLineTo(13.821f)
                curveTo(14.201f, 5.87f, 14.501f, 6.18f, 14.501f, 6.55f)
                curveTo(14.501f, 6.92f, 14.191f, 7.23f, 13.821f, 7.23f)
                close()
            }
        }.build()

        return _Timer!!
    }

@Suppress("ObjectPropertyName")
private var _Timer: ImageVector? = null
