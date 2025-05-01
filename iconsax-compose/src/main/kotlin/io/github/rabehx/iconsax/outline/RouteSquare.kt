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

val Iconsax.Outline.RouteSquare: ImageVector
    get() {
        if (_RouteSquare != null) {
            return _RouteSquare!!
        }
        _RouteSquare = ImageVector.Builder(
            name = "Outline.RouteSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.181f, 18.7f)
                curveTo(12.011f, 18.7f, 11.021f, 17.98f, 10.651f, 16.87f)
                lineTo(9.951f, 14.8f)
                curveTo(9.841f, 14.44f, 9.561f, 14.17f, 9.221f, 14.06f)
                lineTo(7.141f, 13.36f)
                curveTo(6.021f, 12.98f, 5.301f, 11.97f, 5.321f, 10.79f)
                curveTo(5.341f, 9.61f, 6.081f, 8.62f, 7.211f, 8.27f)
                lineTo(14.741f, 5.93f)
                curveTo(15.691f, 5.64f, 16.721f, 5.89f, 17.421f, 6.6f)
                curveTo(18.121f, 7.31f, 18.371f, 8.33f, 18.081f, 9.28f)
                lineTo(15.741f, 16.82f)
                curveTo(15.391f, 17.95f, 14.401f, 18.69f, 13.211f, 18.71f)
                curveTo(13.201f, 18.7f, 13.191f, 18.7f, 13.181f, 18.7f)
                close()
                moveTo(15.521f, 7.3f)
                curveTo(15.401f, 7.3f, 15.291f, 7.32f, 15.171f, 7.35f)
                lineTo(7.631f, 9.7f)
                curveTo(7.021f, 9.89f, 6.801f, 10.39f, 6.801f, 10.81f)
                curveTo(6.791f, 11.22f, 7.001f, 11.74f, 7.601f, 11.94f)
                lineTo(9.681f, 12.63f)
                curveTo(10.481f, 12.89f, 11.111f, 13.52f, 11.371f, 14.33f)
                lineTo(12.061f, 16.39f)
                curveTo(12.261f, 16.99f, 12.731f, 17.18f, 13.191f, 17.2f)
                curveTo(13.601f, 17.2f, 14.111f, 16.98f, 14.301f, 16.37f)
                lineTo(16.641f, 8.83f)
                curveTo(16.771f, 8.41f, 16.661f, 7.97f, 16.351f, 7.66f)
                curveTo(16.121f, 7.42f, 15.831f, 7.3f, 15.521f, 7.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _RouteSquare!!
    }

@Suppress("ObjectPropertyName")
private var _RouteSquare: ImageVector? = null
