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


val Iconsax.Filled.Speedometer: ImageVector
    get() {
        if (_Speedometer != null) {
            return _Speedometer!!
        }
        _Speedometer = ImageVector.Builder(
            name = "Filled.Speedometer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.14f, 20.25f)
                curveTo(18.95f, 20.25f, 18.76f, 20.18f, 18.61f, 20.04f)
                curveTo(18.31f, 19.75f, 18.31f, 19.28f, 18.6f, 18.98f)
                curveTo(20.31f, 17.24f, 21.25f, 14.94f, 21.25f, 12.5f)
                curveTo(21.25f, 7.4f, 17.1f, 3.25f, 12f, 3.25f)
                curveTo(6.9f, 3.25f, 2.75f, 7.4f, 2.75f, 12.5f)
                curveTo(2.75f, 14.93f, 3.68f, 17.22f, 5.38f, 18.96f)
                curveTo(5.67f, 19.26f, 5.66f, 19.73f, 5.37f, 20.02f)
                curveTo(5.07f, 20.31f, 4.6f, 20.3f, 4.31f, 20.01f)
                curveTo(2.34f, 17.99f, 1.25f, 15.32f, 1.25f, 12.5f)
                curveTo(1.25f, 6.57f, 6.07f, 1.75f, 12f, 1.75f)
                curveTo(17.93f, 1.75f, 22.75f, 6.57f, 22.75f, 12.5f)
                curveTo(22.75f, 15.33f, 21.66f, 18.01f, 19.67f, 20.03f)
                curveTo(19.53f, 20.18f, 19.33f, 20.25f, 19.14f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.999f, 21.998f)
                curveTo(14.142f, 21.998f, 15.879f, 20.261f, 15.879f, 18.118f)
                curveTo(15.879f, 15.975f, 14.142f, 14.238f, 11.999f, 14.238f)
                curveTo(9.856f, 14.238f, 8.119f, 15.975f, 8.119f, 18.118f)
                curveTo(8.119f, 20.261f, 9.856f, 21.998f, 11.999f, 21.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 8.5f)
                curveTo(14.9f, 8.5f, 14f, 9.4f, 14f, 10.5f)
                verticalLineTo(11.25f)
                curveTo(14f, 11.94f, 14.56f, 12.5f, 15.25f, 12.5f)
                horizontalLineTo(16f)
                curveTo(17.1f, 12.5f, 18f, 11.6f, 18f, 10.5f)
                curveTo(18f, 9.4f, 17.1f, 8.5f, 16f, 8.5f)
                close()
            }
        }.build()

        return _Speedometer!!
    }

@Suppress("ObjectPropertyName")
private var _Speedometer: ImageVector? = null
