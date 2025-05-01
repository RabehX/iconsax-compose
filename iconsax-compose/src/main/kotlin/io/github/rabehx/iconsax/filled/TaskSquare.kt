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


val Iconsax.Filled.TaskSquare: ImageVector
    get() {
        if (_TaskSquare != null) {
            return _TaskSquare!!
        }
        _TaskSquare = ImageVector.Builder(
            name = "Filled.TaskSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 22f, 22f, 19.83f, 22f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(9.97f, 14.9f)
                lineTo(7.72f, 17.15f)
                curveTo(7.57f, 17.3f, 7.38f, 17.37f, 7.19f, 17.37f)
                curveTo(7f, 17.37f, 6.8f, 17.3f, 6.66f, 17.15f)
                lineTo(5.91f, 16.4f)
                curveTo(5.61f, 16.11f, 5.61f, 15.63f, 5.91f, 15.34f)
                curveTo(6.2f, 15.05f, 6.67f, 15.05f, 6.97f, 15.34f)
                lineTo(7.19f, 15.56f)
                lineTo(8.91f, 13.84f)
                curveTo(9.2f, 13.55f, 9.67f, 13.55f, 9.97f, 13.84f)
                curveTo(10.26f, 14.13f, 10.26f, 14.61f, 9.97f, 14.9f)
                close()
                moveTo(9.97f, 7.9f)
                lineTo(7.72f, 10.15f)
                curveTo(7.57f, 10.3f, 7.38f, 10.37f, 7.19f, 10.37f)
                curveTo(7f, 10.37f, 6.8f, 10.3f, 6.66f, 10.15f)
                lineTo(5.91f, 9.4f)
                curveTo(5.61f, 9.11f, 5.61f, 8.63f, 5.91f, 8.34f)
                curveTo(6.2f, 8.05f, 6.67f, 8.05f, 6.97f, 8.34f)
                lineTo(7.19f, 8.56f)
                lineTo(8.91f, 6.84f)
                curveTo(9.2f, 6.55f, 9.67f, 6.55f, 9.97f, 6.84f)
                curveTo(10.26f, 7.13f, 10.26f, 7.61f, 9.97f, 7.9f)
                close()
                moveTo(17.56f, 16.62f)
                horizontalLineTo(12.31f)
                curveTo(11.9f, 16.62f, 11.56f, 16.28f, 11.56f, 15.87f)
                curveTo(11.56f, 15.46f, 11.9f, 15.12f, 12.31f, 15.12f)
                horizontalLineTo(17.56f)
                curveTo(17.98f, 15.12f, 18.31f, 15.46f, 18.31f, 15.87f)
                curveTo(18.31f, 16.28f, 17.98f, 16.62f, 17.56f, 16.62f)
                close()
                moveTo(17.56f, 9.62f)
                horizontalLineTo(12.31f)
                curveTo(11.9f, 9.62f, 11.56f, 9.28f, 11.56f, 8.87f)
                curveTo(11.56f, 8.46f, 11.9f, 8.12f, 12.31f, 8.12f)
                horizontalLineTo(17.56f)
                curveTo(17.98f, 8.12f, 18.31f, 8.46f, 18.31f, 8.87f)
                curveTo(18.31f, 9.28f, 17.98f, 9.62f, 17.56f, 9.62f)
                close()
            }
        }.build()

        return _TaskSquare!!
    }

@Suppress("ObjectPropertyName")
private var _TaskSquare: ImageVector? = null
