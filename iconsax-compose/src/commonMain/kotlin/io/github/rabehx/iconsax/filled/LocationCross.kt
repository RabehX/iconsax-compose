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


val Iconsax.Filled.LocationCross: ImageVector
    get() {
        if (_LocationCross != null) {
            return _LocationCross!!
        }
        _LocationCross = ImageVector.Builder(
            name = "Filled.LocationCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.619f, 8.7f)
                curveTo(19.579f, 4.07f, 15.539f, 2f, 11.999f, 2f)
                curveTo(11.999f, 2f, 11.999f, 2f, 11.989f, 2f)
                curveTo(8.459f, 2f, 4.429f, 4.07f, 3.379f, 8.69f)
                curveTo(2.199f, 13.85f, 5.359f, 18.22f, 8.219f, 20.98f)
                curveTo(9.279f, 22f, 10.639f, 22.51f, 11.999f, 22.51f)
                curveTo(13.359f, 22.51f, 14.719f, 22f, 15.769f, 20.98f)
                curveTo(18.629f, 18.22f, 21.789f, 13.86f, 20.619f, 8.7f)
                close()
                moveTo(14.529f, 13.49f)
                curveTo(14.379f, 13.64f, 14.189f, 13.71f, 13.999f, 13.71f)
                curveTo(13.809f, 13.71f, 13.619f, 13.64f, 13.469f, 13.49f)
                lineTo(12.019f, 12.04f)
                lineTo(10.529f, 13.53f)
                curveTo(10.379f, 13.68f, 10.189f, 13.75f, 9.999f, 13.75f)
                curveTo(9.809f, 13.75f, 9.619f, 13.68f, 9.469f, 13.53f)
                curveTo(9.179f, 13.24f, 9.179f, 12.76f, 9.469f, 12.47f)
                lineTo(10.959f, 10.98f)
                lineTo(9.509f, 9.53f)
                curveTo(9.219f, 9.24f, 9.219f, 8.76f, 9.509f, 8.47f)
                curveTo(9.799f, 8.18f, 10.279f, 8.18f, 10.569f, 8.47f)
                lineTo(12.019f, 9.92f)
                lineTo(13.419f, 8.52f)
                curveTo(13.709f, 8.23f, 14.189f, 8.23f, 14.479f, 8.52f)
                curveTo(14.769f, 8.81f, 14.769f, 9.29f, 14.479f, 9.58f)
                lineTo(13.079f, 10.98f)
                lineTo(14.529f, 12.43f)
                curveTo(14.819f, 12.72f, 14.819f, 13.19f, 14.529f, 13.49f)
                close()
            }
        }.build()

        return _LocationCross!!
    }

@Suppress("ObjectPropertyName")
private var _LocationCross: ImageVector? = null
