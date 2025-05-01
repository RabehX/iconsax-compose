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

val Iconsax.Outline.CalendarCircle: ImageVector
    get() {
        if (_CalendarCircle != null) {
            return _CalendarCircle!!
        }
        _CalendarCircle = ImageVector.Builder(
            name = "Outline.CalendarCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.891f, 8.58f)
                curveTo(9.481f, 8.58f, 9.141f, 8.24f, 9.141f, 7.83f)
                verticalLineTo(5.83f)
                curveTo(9.141f, 5.42f, 9.481f, 5.08f, 9.891f, 5.08f)
                curveTo(10.301f, 5.08f, 10.641f, 5.42f, 10.641f, 5.83f)
                verticalLineTo(7.83f)
                curveTo(10.641f, 8.24f, 10.311f, 8.58f, 9.891f, 8.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.109f, 8.58f)
                curveTo(13.699f, 8.58f, 13.359f, 8.24f, 13.359f, 7.83f)
                verticalLineTo(5.83f)
                curveTo(13.359f, 5.42f, 13.699f, 5.08f, 14.109f, 5.08f)
                curveTo(14.519f, 5.08f, 14.859f, 5.42f, 14.859f, 5.83f)
                verticalLineTo(7.83f)
                curveTo(14.859f, 8.24f, 14.519f, 8.58f, 14.109f, 8.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.469f, 10.89f)
                horizontalLineTo(7.52f)
                curveTo(7.11f, 10.89f, 6.77f, 10.55f, 6.77f, 10.14f)
                curveTo(6.77f, 9.73f, 7.11f, 9.39f, 7.52f, 9.39f)
                horizontalLineTo(16.469f)
                curveTo(16.879f, 9.39f, 17.219f, 9.73f, 17.219f, 10.14f)
                curveTo(17.219f, 10.55f, 16.889f, 10.89f, 16.469f, 10.89f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.5f, 18.42f)
                horizontalLineTo(10.5f)
                curveTo(7.75f, 18.42f, 5.75f, 16.42f, 5.75f, 13.67f)
                verticalLineTo(10.67f)
                curveTo(5.75f, 7.92f, 7.75f, 5.92f, 10.5f, 5.92f)
                horizontalLineTo(13.5f)
                curveTo(16.25f, 5.92f, 18.25f, 7.92f, 18.25f, 10.67f)
                verticalLineTo(13.67f)
                curveTo(18.25f, 16.42f, 16.25f, 18.42f, 13.5f, 18.42f)
                close()
                moveTo(10.5f, 7.42f)
                curveTo(8.25f, 7.42f, 7.25f, 9.05f, 7.25f, 10.67f)
                verticalLineTo(13.67f)
                curveTo(7.25f, 15.29f, 8.25f, 16.92f, 10.5f, 16.92f)
                horizontalLineTo(13.5f)
                curveTo(15.75f, 16.92f, 16.75f, 15.29f, 16.75f, 13.67f)
                verticalLineTo(10.67f)
                curveTo(16.75f, 9.05f, 15.75f, 7.42f, 13.5f, 7.42f)
                horizontalLineTo(10.5f)
                close()
            }
        }.build()

        return _CalendarCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarCircle: ImageVector? = null
