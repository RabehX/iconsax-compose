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


val Iconsax.Filled.Candle2: ImageVector
    get() {
        if (_Candle2 != null) {
            return _Candle2!!
        }
        _Candle2 = ImageVector.Builder(
            name = "Filled.Candle2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.75f, 17.5f)
                curveTo(22.75f, 17.91f, 22.41f, 18.25f, 22f, 18.25f)
                horizontalLineTo(15f)
                verticalLineTo(18.5f)
                curveTo(15f, 20f, 14.1f, 20.5f, 13f, 20.5f)
                horizontalLineTo(7f)
                curveTo(5.9f, 20.5f, 5f, 20f, 5f, 18.5f)
                verticalLineTo(18.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 18.25f, 1.25f, 17.91f, 1.25f, 17.5f)
                curveTo(1.25f, 17.09f, 1.59f, 16.75f, 2f, 16.75f)
                horizontalLineTo(5f)
                verticalLineTo(16.5f)
                curveTo(5f, 15f, 5.9f, 14.5f, 7f, 14.5f)
                horizontalLineTo(13f)
                curveTo(14.1f, 14.5f, 15f, 15f, 15f, 16.5f)
                verticalLineTo(16.75f)
                horizontalLineTo(22f)
                curveTo(22.41f, 16.75f, 22.75f, 17.09f, 22.75f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.75f, 6.5f)
                curveTo(22.75f, 6.91f, 22.41f, 7.25f, 22f, 7.25f)
                horizontalLineTo(19f)
                verticalLineTo(7.5f)
                curveTo(19f, 9f, 18.1f, 9.5f, 17f, 9.5f)
                horizontalLineTo(11f)
                curveTo(9.9f, 9.5f, 9f, 9f, 9f, 7.5f)
                verticalLineTo(7.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 7.25f, 1.25f, 6.91f, 1.25f, 6.5f)
                curveTo(1.25f, 6.09f, 1.59f, 5.75f, 2f, 5.75f)
                horizontalLineTo(9f)
                verticalLineTo(5.5f)
                curveTo(9f, 4f, 9.9f, 3.5f, 11f, 3.5f)
                horizontalLineTo(17f)
                curveTo(18.1f, 3.5f, 19f, 4f, 19f, 5.5f)
                verticalLineTo(5.75f)
                horizontalLineTo(22f)
                curveTo(22.41f, 5.75f, 22.75f, 6.09f, 22.75f, 6.5f)
                close()
            }
        }.build()

        return _Candle2!!
    }

@Suppress("ObjectPropertyName")
private var _Candle2: ImageVector? = null
