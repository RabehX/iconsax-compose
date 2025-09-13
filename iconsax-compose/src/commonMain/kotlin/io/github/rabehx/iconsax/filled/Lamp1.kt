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


val Iconsax.Filled.Lamp1: ImageVector
    get() {
        if (_Lamp1 != null) {
            return _Lamp1!!
        }
        _Lamp1 = ImageVector.Builder(
            name = "Filled.Lamp1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.501f, 5.481f)
                curveTo(12.581f, 5.481f, 12.661f, 5.481f, 12.751f, 5.491f)
                verticalLineTo(2.531f)
                curveTo(12.751f, 2.121f, 12.411f, 1.781f, 12.001f, 1.781f)
                curveTo(11.591f, 1.781f, 11.251f, 2.121f, 11.251f, 2.531f)
                verticalLineTo(5.491f)
                curveTo(11.331f, 5.481f, 11.411f, 5.481f, 11.501f, 5.481f)
                curveTo(6.891f, 5.711f, 3.221f, 9.511f, 3.221f, 14.181f)
                verticalLineTo(16.121f)
                curveTo(3.221f, 17.221f, 4.121f, 18.121f, 5.221f, 18.121f)
                horizontalLineTo(18.781f)
                curveTo(19.881f, 18.121f, 20.781f, 17.221f, 20.781f, 16.121f)
                verticalLineTo(14.181f)
                curveTo(20.781f, 9.511f, 17.111f, 5.711f, 12.501f, 5.481f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.729f, 19.109f)
                curveTo(15.059f, 19.109f, 15.299f, 19.419f, 15.219f, 19.739f)
                curveTo(14.839f, 21.169f, 13.539f, 22.219f, 11.999f, 22.219f)
                curveTo(10.459f, 22.219f, 9.159f, 21.169f, 8.779f, 19.739f)
                curveTo(8.699f, 19.419f, 8.939f, 19.109f, 9.269f, 19.109f)
                horizontalLineTo(14.729f)
                close()
            }
        }.build()

        return _Lamp1!!
    }

@Suppress("ObjectPropertyName")
private var _Lamp1: ImageVector? = null
