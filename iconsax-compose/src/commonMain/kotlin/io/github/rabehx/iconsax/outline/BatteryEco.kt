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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.BatteryEco: ImageVector
    get() {
        if (_BatteryEco != null) {
            return _BatteryEco!!
        }
        _BatteryEco = ImageVector.Builder(
            name = "Outline.BatteryEco",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 19f)
                horizontalLineTo(13f)
                curveTo(15.828f, 19f, 17.243f, 19f, 18.121f, 18.121f)
                curveTo(19f, 17.243f, 19f, 15.828f, 19f, 13f)
                curveTo(19f, 11.137f, 19f, 9.887f, 18.749f, 9f)
                moveTo(5.5f, 7.038f)
                curveTo(4.242f, 7.109f, 3.448f, 7.309f, 2.879f, 7.879f)
                curveTo(2f, 8.757f, 2f, 10.172f, 2f, 13f)
                curveTo(2f, 15.244f, 2f, 16.597f, 2.439f, 17.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 10.5f)
                lineTo(20.027f, 10.671f)
                curveTo(20.708f, 10.785f, 21.049f, 10.842f, 21.308f, 11.007f)
                curveTo(21.562f, 11.169f, 21.761f, 11.404f, 21.88f, 11.682f)
                curveTo(22f, 11.964f, 22f, 12.309f, 22f, 13f)
                curveTo(22f, 13.691f, 22f, 14.036f, 21.88f, 14.318f)
                curveTo(21.761f, 14.595f, 21.562f, 14.831f, 21.308f, 14.993f)
                curveTo(21.049f, 15.158f, 20.708f, 15.215f, 20.027f, 15.329f)
                lineTo(19f, 15.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.033f, 20f)
                curveTo(4.545f, 14.6f, 9f, 13.5f, 11f, 11f)
                moveTo(11.034f, 15.835f)
                curveTo(13.579f, 15.124f, 15.211f, 13.422f, 15.816f, 10.848f)
                curveTo(16.502f, 7.933f, 15.273f, 3.963f, 12.103f, 4f)
                curveTo(12.103f, 4f, 12.425f, 5.26f, 12.143f, 5.876f)
                curveTo(11.102f, 8.151f, 7.5f, 7.993f, 6.332f, 10.877f)
                curveTo(5.637f, 12.491f, 6.058f, 14.294f, 7.366f, 15.328f)
                curveTo(8.188f, 15.978f, 9.812f, 16.177f, 11.034f, 15.835f)
                close()
            }
        }.build()

        return _BatteryEco!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryEco: ImageVector? = null
