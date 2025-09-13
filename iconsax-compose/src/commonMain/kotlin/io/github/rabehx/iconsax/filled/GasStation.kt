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


val Iconsax.Filled.GasStation: ImageVector
    get() {
        if (_GasStation != null) {
            return _GasStation!!
        }
        _GasStation = ImageVector.Builder(
            name = "Filled.GasStation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.34f, 9.33f)
                lineTo(20.34f, 8.33f)
                curveTo(19.97f, 8.15f, 19.51f, 8.29f, 19.33f, 8.66f)
                curveTo(19.14f, 9.04f, 19.29f, 9.49f, 19.66f, 9.67f)
                lineTo(21.25f, 10.46f)
                verticalLineTo(15.25f)
                lineTo(17.5f, 15.26f)
                verticalLineTo(5f)
                curveTo(17.5f, 3f, 16.16f, 2f, 14.5f, 2f)
                horizontalLineTo(6.5f)
                curveTo(4.84f, 2f, 3.5f, 3f, 3.5f, 5f)
                verticalLineTo(21.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 21.25f, 1.25f, 21.59f, 1.25f, 22f)
                curveTo(1.25f, 22.41f, 1.59f, 22.75f, 2f, 22.75f)
                horizontalLineTo(19f)
                curveTo(19.41f, 22.75f, 19.75f, 22.41f, 19.75f, 22f)
                curveTo(19.75f, 21.59f, 19.41f, 21.25f, 19f, 21.25f)
                horizontalLineTo(17.5f)
                verticalLineTo(16.76f)
                lineTo(22f, 16.75f)
                curveTo(22.42f, 16.75f, 22.75f, 16.41f, 22.75f, 16f)
                verticalLineTo(10f)
                curveTo(22.75f, 9.72f, 22.59f, 9.46f, 22.34f, 9.33f)
                close()
                moveTo(6f, 6.89f)
                curveTo(6f, 5.5f, 6.85f, 5f, 7.89f, 5f)
                horizontalLineTo(13.12f)
                curveTo(14.15f, 5f, 15f, 5.5f, 15f, 6.89f)
                verticalLineTo(8.12f)
                curveTo(15f, 9.5f, 14.15f, 10f, 13.11f, 10f)
                horizontalLineTo(7.89f)
                curveTo(6.85f, 10f, 6f, 9.5f, 6f, 8.11f)
                verticalLineTo(6.89f)
                close()
                moveTo(6.5f, 12.25f)
                horizontalLineTo(9.5f)
                curveTo(9.91f, 12.25f, 10.25f, 12.59f, 10.25f, 13f)
                curveTo(10.25f, 13.41f, 9.91f, 13.75f, 9.5f, 13.75f)
                horizontalLineTo(6.5f)
                curveTo(6.09f, 13.75f, 5.75f, 13.41f, 5.75f, 13f)
                curveTo(5.75f, 12.59f, 6.09f, 12.25f, 6.5f, 12.25f)
                close()
            }
        }.build()

        return _GasStation!!
    }

@Suppress("ObjectPropertyName")
private var _GasStation: ImageVector? = null
