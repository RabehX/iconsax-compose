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


val Iconsax.Filled.Discover: ImageVector
    get() {
        if (_Discover != null) {
            return _Discover!!
        }
        _Discover = ImageVector.Builder(
            name = "Filled.Discover",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.981f, 3.021f)
                curveTo(20.111f, 2.151f, 18.881f, 1.811f, 17.691f, 2.111f)
                lineTo(7.891f, 4.561f)
                curveTo(6.241f, 4.971f, 4.971f, 6.251f, 4.561f, 7.891f)
                lineTo(2.111f, 17.701f)
                curveTo(1.811f, 18.891f, 2.151f, 20.121f, 3.021f, 20.991f)
                curveTo(3.681f, 21.641f, 4.551f, 22.001f, 5.451f, 22.001f)
                curveTo(5.731f, 22.001f, 6.021f, 21.971f, 6.301f, 21.891f)
                lineTo(16.111f, 19.441f)
                curveTo(17.751f, 19.031f, 19.031f, 17.761f, 19.441f, 16.111f)
                lineTo(21.891f, 6.301f)
                curveTo(22.191f, 5.111f, 21.851f, 3.881f, 20.981f, 3.021f)
                close()
                moveTo(12.001f, 15.881f)
                curveTo(9.861f, 15.881f, 8.121f, 14.141f, 8.121f, 12.001f)
                curveTo(8.121f, 9.861f, 9.861f, 8.121f, 12.001f, 8.121f)
                curveTo(14.141f, 8.121f, 15.881f, 9.861f, 15.881f, 12.001f)
                curveTo(15.881f, 14.141f, 14.141f, 15.881f, 12.001f, 15.881f)
                close()
            }
        }.build()

        return _Discover!!
    }

@Suppress("ObjectPropertyName")
private var _Discover: ImageVector? = null
