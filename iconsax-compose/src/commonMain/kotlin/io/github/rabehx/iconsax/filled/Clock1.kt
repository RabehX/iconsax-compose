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


val Iconsax.Filled.Clock1: ImageVector
    get() {
        if (_Clock1 != null) {
            return _Clock1!!
        }
        _Clock1 = ImageVector.Builder(
            name = "Filled.Clock1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.718f, 18.997f)
                curveTo(15.116f, 18.842f, 15.576f, 19.181f, 15.491f, 19.6f)
                curveTo(15f, 21.5f, 13.901f, 22f, 12.55f, 22f)
                horizontalLineTo(11.46f)
                curveTo(10.111f, 22f, 9.001f, 21.5f, 8.521f, 19.59f)
                curveTo(8.438f, 19.17f, 8.896f, 18.834f, 9.293f, 18.99f)
                curveTo(10.148f, 19.325f, 11.061f, 19.5f, 12f, 19.5f)
                curveTo(12.944f, 19.5f, 13.862f, 19.331f, 14.718f, 18.997f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.491f, 4.4f)
                curveTo(15.579f, 4.823f, 15.113f, 5.167f, 14.711f, 5.009f)
                curveTo(13.874f, 4.679f, 12.96f, 4.5f, 12.001f, 4.5f)
                curveTo(11.043f, 4.5f, 10.131f, 4.681f, 9.292f, 5.011f)
                curveTo(8.895f, 5.168f, 8.435f, 4.829f, 8.521f, 4.41f)
                curveTo(9.001f, 2.5f, 10.111f, 2f, 11.461f, 2f)
                horizontalLineTo(12.551f)
                curveTo(13.901f, 2f, 15.001f, 2.5f, 15.491f, 4.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 5.5f)
                curveTo(8.41f, 5.5f, 5.5f, 8.41f, 5.5f, 12f)
                curveTo(5.5f, 14.1f, 6.49f, 15.96f, 8.03f, 17.15f)
                horizontalLineTo(8.04f)
                curveTo(9.14f, 18f, 10.51f, 18.5f, 12f, 18.5f)
                curveTo(13.51f, 18.5f, 14.89f, 17.99f, 15.99f, 17.13f)
                horizontalLineTo(16f)
                curveTo(17.52f, 15.94f, 18.5f, 14.08f, 18.5f, 12f)
                curveTo(18.5f, 8.41f, 15.59f, 5.5f, 12f, 5.5f)
                close()
                moveTo(13.93f, 14.38f)
                curveTo(13.78f, 14.53f, 13.59f, 14.6f, 13.4f, 14.6f)
                curveTo(13.21f, 14.6f, 13.02f, 14.53f, 12.87f, 14.38f)
                lineTo(11.47f, 12.98f)
                curveTo(11.33f, 12.84f, 11.25f, 12.65f, 11.25f, 12.45f)
                verticalLineTo(9.66f)
                curveTo(11.25f, 9.25f, 11.59f, 8.91f, 12f, 8.91f)
                curveTo(12.41f, 8.91f, 12.75f, 9.25f, 12.75f, 9.66f)
                verticalLineTo(12.14f)
                lineTo(13.93f, 13.32f)
                curveTo(14.22f, 13.61f, 14.22f, 14.09f, 13.93f, 14.38f)
                close()
            }
        }.build()

        return _Clock1!!
    }

@Suppress("ObjectPropertyName")
private var _Clock1: ImageVector? = null
