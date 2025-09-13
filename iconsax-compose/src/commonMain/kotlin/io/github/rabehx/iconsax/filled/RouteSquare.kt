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


val Iconsax.Filled.RouteSquare: ImageVector
    get() {
        if (_RouteSquare != null) {
            return _RouteSquare!!
        }
        _RouteSquare = ImageVector.Builder(
            name = "Filled.RouteSquare",
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
                moveTo(17.35f, 9.05f)
                lineTo(15.01f, 16.59f)
                curveTo(14.45f, 18.38f, 11.94f, 18.41f, 11.35f, 16.63f)
                lineTo(10.65f, 14.56f)
                curveTo(10.46f, 13.99f, 10.01f, 13.53f, 9.44f, 13.35f)
                lineTo(7.36f, 12.65f)
                curveTo(5.6f, 12.06f, 5.62f, 9.53f, 7.41f, 8.99f)
                lineTo(14.95f, 6.64f)
                curveTo(16.43f, 6.19f, 17.82f, 7.58f, 17.35f, 9.05f)
                close()
            }
        }.build()

        return _RouteSquare!!
    }

@Suppress("ObjectPropertyName")
private var _RouteSquare: ImageVector? = null
