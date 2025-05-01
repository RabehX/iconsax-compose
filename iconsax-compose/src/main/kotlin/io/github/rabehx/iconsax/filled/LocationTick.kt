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


val Iconsax.Filled.LocationTick: ImageVector
    get() {
        if (_LocationTick != null) {
            return _LocationTick!!
        }
        _LocationTick = ImageVector.Builder(
            name = "Filled.LocationTick",
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
                moveTo(15.279f, 9.53f)
                lineTo(11.279f, 13.53f)
                curveTo(11.129f, 13.68f, 10.939f, 13.75f, 10.749f, 13.75f)
                curveTo(10.559f, 13.75f, 10.369f, 13.68f, 10.219f, 13.53f)
                lineTo(8.719f, 12.03f)
                curveTo(8.429f, 11.74f, 8.429f, 11.26f, 8.719f, 10.97f)
                curveTo(9.009f, 10.68f, 9.489f, 10.68f, 9.779f, 10.97f)
                lineTo(10.749f, 11.94f)
                lineTo(14.219f, 8.47f)
                curveTo(14.509f, 8.18f, 14.989f, 8.18f, 15.279f, 8.47f)
                curveTo(15.569f, 8.76f, 15.569f, 9.24f, 15.279f, 9.53f)
                close()
            }
        }.build()

        return _LocationTick!!
    }

@Suppress("ObjectPropertyName")
private var _LocationTick: ImageVector? = null
