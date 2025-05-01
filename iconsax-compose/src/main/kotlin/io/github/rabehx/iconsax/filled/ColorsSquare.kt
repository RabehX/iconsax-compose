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


val Iconsax.Filled.ColorsSquare: ImageVector
    get() {
        if (_ColorsSquare != null) {
            return _ColorsSquare!!
        }
        _ColorsSquare = ImageVector.Builder(
            name = "Filled.ColorsSquare",
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
                moveTo(12f, 6f)
                curveTo(13.99f, 6f, 15.6f, 7.61f, 15.6f, 9.6f)
                curveTo(15.6f, 10.07f, 15.51f, 10.52f, 15.35f, 10.93f)
                curveTo(14.94f, 11.97f, 14.05f, 12.78f, 12.95f, 13.08f)
                curveTo(12.65f, 13.16f, 12.33f, 13.21f, 12f, 13.21f)
                curveTo(11.67f, 13.21f, 11.35f, 13.17f, 11.05f, 13.08f)
                curveTo(9.95f, 12.78f, 9.06f, 11.98f, 8.65f, 10.93f)
                curveTo(8.49f, 10.52f, 8.4f, 10.07f, 8.4f, 9.6f)
                curveTo(8.4f, 7.61f, 10.01f, 6f, 12f, 6f)
                close()
                moveTo(9.6f, 18f)
                curveTo(7.61f, 18f, 6f, 16.39f, 6f, 14.4f)
                curveTo(6f, 13.267f, 6.529f, 12.256f, 7.344f, 11.596f)
                curveTo(7.581f, 11.405f, 7.919f, 11.525f, 8.067f, 11.791f)
                curveTo(8.652f, 12.84f, 9.646f, 13.62f, 10.81f, 13.93f)
                curveTo(11.19f, 14.04f, 11.58f, 14.09f, 12f, 14.09f)
                curveTo(12.249f, 14.09f, 12.487f, 14.072f, 12.718f, 14.035f)
                curveTo(12.955f, 13.997f, 13.2f, 14.15f, 13.2f, 14.39f)
                curveTo(13.2f, 15.45f, 12.74f, 16.41f, 12f, 17.07f)
                curveTo(11.36f, 17.65f, 10.52f, 18f, 9.6f, 18f)
                close()
                moveTo(14.4f, 18f)
                curveTo(14.052f, 18f, 13.71f, 17.951f, 13.388f, 17.858f)
                curveTo(13.061f, 17.763f, 13.002f, 17.356f, 13.206f, 17.084f)
                curveTo(13.781f, 16.32f, 14.1f, 15.376f, 14.1f, 14.4f)
                curveTo(14.1f, 14.2f, 14.08f, 13.99f, 14.05f, 13.8f)
                curveTo(14.032f, 13.687f, 14.09f, 13.576f, 14.19f, 13.52f)
                curveTo(14.914f, 13.116f, 15.521f, 12.522f, 15.924f, 11.794f)
                curveTo(16.072f, 11.527f, 16.411f, 11.404f, 16.649f, 11.595f)
                curveTo(17.471f, 12.255f, 18f, 13.267f, 18f, 14.4f)
                curveTo(18f, 16.39f, 16.39f, 18f, 14.4f, 18f)
                close()
            }
        }.build()

        return _ColorsSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ColorsSquare: ImageVector? = null
