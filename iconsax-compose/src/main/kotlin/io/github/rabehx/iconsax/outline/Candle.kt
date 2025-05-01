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

val Iconsax.Outline.Candle: ImageVector
    get() {
        if (_Candle != null) {
            return _Candle!!
        }
        _Candle = ImageVector.Builder(
            name = "Outline.Candle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.5f, 22.75f)
                curveTo(6.09f, 22.75f, 5.75f, 22.41f, 5.75f, 22f)
                verticalLineTo(15f)
                curveTo(5.75f, 14.59f, 6.09f, 14.25f, 6.5f, 14.25f)
                curveTo(6.91f, 14.25f, 7.25f, 14.59f, 7.25f, 15f)
                verticalLineTo(22f)
                curveTo(7.25f, 22.41f, 6.91f, 22.75f, 6.5f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.5f, 5.75f)
                curveTo(6.09f, 5.75f, 5.75f, 5.41f, 5.75f, 5f)
                verticalLineTo(2f)
                curveTo(5.75f, 1.59f, 6.09f, 1.25f, 6.5f, 1.25f)
                curveTo(6.91f, 1.25f, 7.25f, 1.59f, 7.25f, 2f)
                verticalLineTo(5f)
                curveTo(7.25f, 5.41f, 6.91f, 5.75f, 6.5f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.5f, 22.75f)
                curveTo(17.09f, 22.75f, 16.75f, 22.41f, 16.75f, 22f)
                verticalLineTo(19f)
                curveTo(16.75f, 18.59f, 17.09f, 18.25f, 17.5f, 18.25f)
                curveTo(17.91f, 18.25f, 18.25f, 18.59f, 18.25f, 19f)
                verticalLineTo(22f)
                curveTo(18.25f, 22.41f, 17.91f, 22.75f, 17.5f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.5f, 9.75f)
                curveTo(17.09f, 9.75f, 16.75f, 9.41f, 16.75f, 9f)
                verticalLineTo(2f)
                curveTo(16.75f, 1.59f, 17.09f, 1.25f, 17.5f, 1.25f)
                curveTo(17.91f, 1.25f, 18.25f, 1.59f, 18.25f, 2f)
                verticalLineTo(9f)
                curveTo(18.25f, 9.41f, 17.91f, 9.75f, 17.5f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.5f, 15.75f)
                horizontalLineTo(5.5f)
                curveTo(3.78f, 15.75f, 2.75f, 14.72f, 2.75f, 13f)
                verticalLineTo(7f)
                curveTo(2.75f, 5.28f, 3.78f, 4.25f, 5.5f, 4.25f)
                horizontalLineTo(7.5f)
                curveTo(9.22f, 4.25f, 10.25f, 5.28f, 10.25f, 7f)
                verticalLineTo(13f)
                curveTo(10.25f, 14.72f, 9.22f, 15.75f, 7.5f, 15.75f)
                close()
                moveTo(5.5f, 5.75f)
                curveTo(4.61f, 5.75f, 4.25f, 6.11f, 4.25f, 7f)
                verticalLineTo(13f)
                curveTo(4.25f, 13.89f, 4.61f, 14.25f, 5.5f, 14.25f)
                horizontalLineTo(7.5f)
                curveTo(8.39f, 14.25f, 8.75f, 13.89f, 8.75f, 13f)
                verticalLineTo(7f)
                curveTo(8.75f, 6.11f, 8.39f, 5.75f, 7.5f, 5.75f)
                horizontalLineTo(5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 19.75f)
                horizontalLineTo(16.5f)
                curveTo(14.78f, 19.75f, 13.75f, 18.72f, 13.75f, 17f)
                verticalLineTo(11f)
                curveTo(13.75f, 9.28f, 14.78f, 8.25f, 16.5f, 8.25f)
                horizontalLineTo(18.5f)
                curveTo(20.22f, 8.25f, 21.25f, 9.28f, 21.25f, 11f)
                verticalLineTo(17f)
                curveTo(21.25f, 18.72f, 20.22f, 19.75f, 18.5f, 19.75f)
                close()
                moveTo(16.5f, 9.75f)
                curveTo(15.61f, 9.75f, 15.25f, 10.11f, 15.25f, 11f)
                verticalLineTo(17f)
                curveTo(15.25f, 17.89f, 15.61f, 18.25f, 16.5f, 18.25f)
                horizontalLineTo(18.5f)
                curveTo(19.39f, 18.25f, 19.75f, 17.89f, 19.75f, 17f)
                verticalLineTo(11f)
                curveTo(19.75f, 10.11f, 19.39f, 9.75f, 18.5f, 9.75f)
                horizontalLineTo(16.5f)
                close()
            }
        }.build()

        return _Candle!!
    }

@Suppress("ObjectPropertyName")
private var _Candle: ImageVector? = null
