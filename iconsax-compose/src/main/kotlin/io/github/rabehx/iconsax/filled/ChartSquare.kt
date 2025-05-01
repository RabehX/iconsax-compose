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


val Iconsax.Filled.ChartSquare: ImageVector
    get() {
        if (_ChartSquare != null) {
            return _ChartSquare!!
        }
        _ChartSquare = ImageVector.Builder(
            name = "Filled.ChartSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(9.11f, 16.9f)
                curveTo(9.11f, 17.18f, 8.89f, 17.4f, 8.61f, 17.4f)
                horizontalLineTo(5.82f)
                curveTo(5.54f, 17.4f, 5.32f, 17.18f, 5.32f, 16.9f)
                verticalLineTo(12.28f)
                curveTo(5.32f, 11.65f, 5.83f, 11.14f, 6.46f, 11.14f)
                horizontalLineTo(8.61f)
                curveTo(8.89f, 11.14f, 9.11f, 11.36f, 9.11f, 11.64f)
                verticalLineTo(16.9f)
                close()
                moveTo(13.89f, 16.9f)
                curveTo(13.89f, 17.18f, 13.67f, 17.4f, 13.39f, 17.4f)
                horizontalLineTo(10.6f)
                curveTo(10.32f, 17.4f, 10.1f, 17.18f, 10.1f, 16.9f)
                verticalLineTo(7.74f)
                curveTo(10.1f, 7.11f, 10.61f, 6.6f, 11.24f, 6.6f)
                horizontalLineTo(12.76f)
                curveTo(13.39f, 6.6f, 13.9f, 7.11f, 13.9f, 7.74f)
                verticalLineTo(16.9f)
                horizontalLineTo(13.89f)
                close()
                moveTo(18.68f, 16.9f)
                curveTo(18.68f, 17.18f, 18.46f, 17.4f, 18.18f, 17.4f)
                horizontalLineTo(15.39f)
                curveTo(15.11f, 17.4f, 14.89f, 17.18f, 14.89f, 16.9f)
                verticalLineTo(13.35f)
                curveTo(14.89f, 13.07f, 15.11f, 12.85f, 15.39f, 12.85f)
                horizontalLineTo(17.54f)
                curveTo(18.17f, 12.85f, 18.68f, 13.36f, 18.68f, 13.99f)
                verticalLineTo(16.9f)
                close()
            }
        }.build()

        return _ChartSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ChartSquare: ImageVector? = null
