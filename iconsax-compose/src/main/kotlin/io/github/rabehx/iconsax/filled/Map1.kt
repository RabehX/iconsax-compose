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


val Iconsax.Filled.Map1: ImageVector
    get() {
        if (_Map1 != null) {
            return _Map1!!
        }
        _Map1 = ImageVector.Builder(
            name = "Filled.Map1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.629f, 3.57f)
                curveTo(7.808f, 3.472f, 7.999f, 3.622f, 7.999f, 3.827f)
                verticalLineTo(17.382f)
                curveTo(7.999f, 17.606f, 7.847f, 17.795f, 7.649f, 17.899f)
                curveTo(7.642f, 17.902f, 7.636f, 17.906f, 7.629f, 17.91f)
                lineTo(5.279f, 19.25f)
                curveTo(3.639f, 20.19f, 2.289f, 19.41f, 2.289f, 17.51f)
                verticalLineTo(7.78f)
                curveTo(2.289f, 7.15f, 2.739f, 6.37f, 3.299f, 6.05f)
                lineTo(7.629f, 3.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.722f, 6.103f)
                curveTo(14.892f, 6.187f, 15f, 6.361f, 15f, 6.551f)
                verticalLineTo(19.704f)
                curveTo(15f, 20.073f, 14.615f, 20.315f, 14.283f, 20.155f)
                lineTo(10.033f, 18.107f)
                curveTo(9.86f, 18.024f, 9.75f, 17.848f, 9.75f, 17.656f)
                verticalLineTo(4.446f)
                curveTo(9.75f, 4.075f, 10.14f, 3.834f, 10.472f, 3.998f)
                lineTo(14.722f, 6.103f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 6.49f)
                verticalLineTo(16.22f)
                curveTo(22f, 16.85f, 21.55f, 17.63f, 20.99f, 17.95f)
                lineTo(17.499f, 19.951f)
                curveTo(17.165f, 20.142f, 16.75f, 19.901f, 16.75f, 19.517f)
                verticalLineTo(6.33f)
                curveTo(16.75f, 6.151f, 16.846f, 5.985f, 17.002f, 5.896f)
                lineTo(19.01f, 4.75f)
                curveTo(20.65f, 3.81f, 22f, 4.59f, 22f, 6.49f)
                close()
            }
        }.build()

        return _Map1!!
    }

@Suppress("ObjectPropertyName")
private var _Map1: ImageVector? = null
