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


val Iconsax.Filled.LocationSlash: ImageVector
    get() {
        if (_LocationSlash != null) {
            return _LocationSlash!!
        }
        _LocationSlash = ImageVector.Builder(
            name = "Filled.LocationSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.781f, 20.981f)
                curveTo(14.721f, 22.001f, 13.361f, 22.511f, 12.001f, 22.511f)
                curveTo(10.641f, 22.511f, 9.281f, 21.991f, 8.221f, 20.971f)
                curveTo(7.861f, 20.631f, 7.501f, 20.251f, 7.141f, 19.861f)
                lineTo(20.041f, 6.961f)
                curveTo(20.291f, 7.501f, 20.481f, 8.071f, 20.621f, 8.701f)
                curveTo(21.791f, 13.861f, 18.631f, 18.221f, 15.781f, 20.981f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.769f, 2.229f)
                curveTo(21.469f, 1.929f, 20.979f, 1.929f, 20.679f, 2.229f)
                lineTo(2.229f, 20.689f)
                curveTo(1.929f, 20.989f, 1.929f, 21.479f, 2.229f, 21.779f)
                curveTo(2.379f, 21.919f, 2.569f, 21.999f, 2.769f, 21.999f)
                curveTo(2.969f, 21.999f, 3.159f, 21.919f, 3.309f, 21.769f)
                lineTo(21.769f, 3.309f)
                curveTo(22.079f, 3.009f, 22.079f, 2.529f, 21.769f, 2.229f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.849f, 10.31f)
                curveTo(8.849f, 8.57f, 10.259f, 7.16f, 11.999f, 7.16f)
                curveTo(13.309f, 7.16f, 14.429f, 7.96f, 14.909f, 9.1f)
                lineTo(18.889f, 5.12f)
                curveTo(17.119f, 2.98f, 14.439f, 2f, 11.999f, 2f)
                curveTo(10.229f, 2f, 8.339f, 2.52f, 6.759f, 3.61f)
                curveTo(5.179f, 4.71f, 3.899f, 6.38f, 3.379f, 8.69f)
                curveTo(2.539f, 12.36f, 3.899f, 15.64f, 5.789f, 18.21f)
                lineTo(10.789f, 13.21f)
                curveTo(9.649f, 12.74f, 8.849f, 11.61f, 8.849f, 10.31f)
                close()
            }
        }.build()

        return _LocationSlash!!
    }

@Suppress("ObjectPropertyName")
private var _LocationSlash: ImageVector? = null
