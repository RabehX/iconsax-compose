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


val Iconsax.Filled.CalendarCircle: ImageVector
    get() {
        if (_CalendarCircle != null) {
            return _CalendarCircle!!
        }
        _CalendarCircle = ImageVector.Builder(
            name = "Filled.CalendarCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(6.85f, 9.44f)
                curveTo(7.27f, 8.47f, 8.06f, 7.72f, 9.15f, 7.38f)
                verticalLineTo(6.58f)
                curveTo(9.15f, 6.17f, 9.49f, 5.83f, 9.9f, 5.83f)
                curveTo(10.31f, 5.83f, 10.65f, 6.17f, 10.65f, 6.58f)
                verticalLineTo(7.17f)
                horizontalLineTo(13.36f)
                verticalLineTo(6.58f)
                curveTo(13.36f, 6.17f, 13.7f, 5.83f, 14.11f, 5.83f)
                curveTo(14.52f, 5.83f, 14.86f, 6.17f, 14.86f, 6.58f)
                verticalLineTo(7.37f)
                curveTo(15.95f, 7.71f, 16.74f, 8.46f, 17.16f, 9.43f)
                curveTo(17.3f, 9.76f, 17.06f, 10.14f, 16.7f, 10.14f)
                horizontalLineTo(7.31f)
                curveTo(6.95f, 10.14f, 6.71f, 9.77f, 6.85f, 9.44f)
                close()
                moveTo(17.5f, 14.17f)
                curveTo(17.5f, 16.37f, 16f, 18.17f, 13.5f, 18.17f)
                horizontalLineTo(10.5f)
                curveTo(8f, 18.17f, 6.5f, 16.37f, 6.5f, 14.17f)
                verticalLineTo(11.64f)
                curveTo(6.5f, 11.36f, 6.72f, 11.14f, 7f, 11.14f)
                horizontalLineTo(17f)
                curveTo(17.28f, 11.14f, 17.5f, 11.36f, 17.5f, 11.64f)
                verticalLineTo(14.17f)
                close()
            }
        }.build()

        return _CalendarCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarCircle: ImageVector? = null
