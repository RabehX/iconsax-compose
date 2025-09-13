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


val Iconsax.Filled.HeartSlash: ImageVector
    get() {
        if (_HeartSlash != null) {
            return _HeartSlash!!
        }
        _HeartSlash = ImageVector.Builder(
            name = "Filled.HeartSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.001f, 8.691f)
                curveTo(22.001f, 9.881f, 21.811f, 10.981f, 21.481f, 12.001f)
                curveTo(19.901f, 17.001f, 15.031f, 19.991f, 12.621f, 20.811f)
                curveTo(12.281f, 20.931f, 11.721f, 20.931f, 11.381f, 20.811f)
                curveTo(10.741f, 20.591f, 9.931f, 20.221f, 9.061f, 19.701f)
                curveTo(8.501f, 19.371f, 8.411f, 18.591f, 8.871f, 18.131f)
                lineTo(20.151f, 6.851f)
                curveTo(20.691f, 6.311f, 21.641f, 6.541f, 21.831f, 7.281f)
                curveTo(21.941f, 7.731f, 22.001f, 8.201f, 22.001f, 8.691f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.529f, 1.471f)
                curveTo(22.24f, 1.181f, 21.76f, 1.181f, 21.469f, 1.471f)
                lineTo(19.129f, 3.811f)
                curveTo(18.34f, 3.361f, 17.42f, 3.101f, 16.44f, 3.101f)
                curveTo(14.63f, 3.101f, 13.009f, 3.981f, 12f, 5.331f)
                curveTo(10.99f, 3.981f, 9.369f, 3.101f, 7.559f, 3.101f)
                curveTo(4.489f, 3.101f, 1.999f, 5.601f, 1.999f, 8.691f)
                curveTo(1.999f, 9.881f, 2.189f, 10.981f, 2.519f, 12.001f)
                curveTo(3.169f, 14.071f, 4.389f, 15.801f, 5.769f, 17.171f)
                lineTo(1.469f, 21.471f)
                curveTo(1.179f, 21.761f, 1.179f, 22.241f, 1.469f, 22.531f)
                curveTo(1.619f, 22.681f, 1.809f, 22.751f, 1.999f, 22.751f)
                curveTo(2.189f, 22.751f, 2.379f, 22.681f, 2.529f, 22.531f)
                lineTo(22.529f, 2.531f)
                curveTo(22.819f, 2.241f, 22.819f, 1.761f, 22.529f, 1.471f)
                close()
            }
        }.build()

        return _HeartSlash!!
    }

@Suppress("ObjectPropertyName")
private var _HeartSlash: ImageVector? = null
