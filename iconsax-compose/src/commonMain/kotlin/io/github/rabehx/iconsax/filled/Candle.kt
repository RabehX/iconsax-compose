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


val Iconsax.Filled.Candle: ImageVector
    get() {
        if (_Candle != null) {
            return _Candle!!
        }
        _Candle = ImageVector.Builder(
            name = "Filled.Candle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.5f, 4.5f)
                horizontalLineTo(7.25f)
                verticalLineTo(2f)
                curveTo(7.25f, 1.59f, 6.91f, 1.25f, 6.5f, 1.25f)
                curveTo(6.09f, 1.25f, 5.75f, 1.59f, 5.75f, 2f)
                verticalLineTo(4.5f)
                horizontalLineTo(5.5f)
                curveTo(3.91f, 4.5f, 3f, 5.41f, 3f, 7f)
                verticalLineTo(13f)
                curveTo(3f, 14.59f, 3.91f, 15.5f, 5.5f, 15.5f)
                horizontalLineTo(5.75f)
                verticalLineTo(22f)
                curveTo(5.75f, 22.41f, 6.09f, 22.75f, 6.5f, 22.75f)
                curveTo(6.91f, 22.75f, 7.25f, 22.41f, 7.25f, 22f)
                verticalLineTo(15.5f)
                horizontalLineTo(7.5f)
                curveTo(9.09f, 15.5f, 10f, 14.59f, 10f, 13f)
                verticalLineTo(7f)
                curveTo(10f, 5.41f, 9.09f, 4.5f, 7.5f, 4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 8.5f)
                horizontalLineTo(18.25f)
                verticalLineTo(2f)
                curveTo(18.25f, 1.59f, 17.91f, 1.25f, 17.5f, 1.25f)
                curveTo(17.09f, 1.25f, 16.75f, 1.59f, 16.75f, 2f)
                verticalLineTo(8.5f)
                horizontalLineTo(16.5f)
                curveTo(14.91f, 8.5f, 14f, 9.41f, 14f, 11f)
                verticalLineTo(17f)
                curveTo(14f, 18.59f, 14.91f, 19.5f, 16.5f, 19.5f)
                horizontalLineTo(16.75f)
                verticalLineTo(22f)
                curveTo(16.75f, 22.41f, 17.09f, 22.75f, 17.5f, 22.75f)
                curveTo(17.91f, 22.75f, 18.25f, 22.41f, 18.25f, 22f)
                verticalLineTo(19.5f)
                horizontalLineTo(18.5f)
                curveTo(20.09f, 19.5f, 21f, 18.59f, 21f, 17f)
                verticalLineTo(11f)
                curveTo(21f, 9.41f, 20.09f, 8.5f, 18.5f, 8.5f)
                close()
            }
        }.build()

        return _Candle!!
    }

@Suppress("ObjectPropertyName")
private var _Candle: ImageVector? = null
