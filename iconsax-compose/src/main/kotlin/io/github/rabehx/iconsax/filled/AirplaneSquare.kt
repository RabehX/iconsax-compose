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

val Iconsax.Filled.AirplaneSquare: ImageVector
    get() {
        if (_AirplaneSquare != null) {
            return _AirplaneSquare!!
        }
        _AirplaneSquare = ImageVector.Builder(
            name = "Filled.AirplaneSquare",
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
                moveTo(18.51f, 13.19f)
                curveTo(18.51f, 13.79f, 18.05f, 14.09f, 17.5f, 13.85f)
                lineTo(14.15f, 12.41f)
                curveTo(13.76f, 12.25f, 13.45f, 12.45f, 13.45f, 12.87f)
                verticalLineTo(14.72f)
                curveTo(13.45f, 14.88f, 13.54f, 15.11f, 13.66f, 15.23f)
                lineTo(15.3f, 16.88f)
                curveTo(15.47f, 17.05f, 15.55f, 17.39f, 15.47f, 17.62f)
                lineTo(15.15f, 18.58f)
                curveTo(15.01f, 19f, 14.53f, 19.2f, 14.14f, 19f)
                lineTo(12.47f, 17.58f)
                curveTo(12.21f, 17.37f, 11.79f, 17.37f, 11.54f, 17.58f)
                lineTo(9.86f, 19f)
                curveTo(9.46f, 19.2f, 8.99f, 19f, 8.85f, 18.57f)
                lineTo(8.53f, 17.61f)
                curveTo(8.45f, 17.38f, 8.53f, 17.04f, 8.7f, 16.87f)
                lineTo(10.37f, 15.23f)
                curveTo(10.48f, 15.12f, 10.58f, 14.89f, 10.58f, 14.72f)
                verticalLineTo(12.87f)
                curveTo(10.58f, 12.45f, 10.26f, 12.24f, 9.88f, 12.41f)
                lineTo(6.53f, 13.85f)
                curveTo(5.97f, 14.09f, 5.52f, 13.79f, 5.52f, 13.19f)
                verticalLineTo(12.26f)
                curveTo(5.52f, 11.78f, 5.89f, 11.22f, 6.33f, 11.03f)
                lineTo(10.27f, 9.33f)
                curveTo(10.43f, 9.26f, 10.57f, 9.05f, 10.57f, 8.87f)
                verticalLineTo(6.8f)
                curveTo(10.57f, 6.12f, 11.06f, 5.31f, 11.67f, 5.01f)
                curveTo(11.89f, 4.9f, 12.14f, 4.9f, 12.36f, 5.01f)
                curveTo(12.96f, 5.32f, 13.46f, 6.12f, 13.46f, 6.8f)
                verticalLineTo(8.87f)
                curveTo(13.46f, 9.05f, 13.59f, 9.26f, 13.76f, 9.33f)
                lineTo(17.7f, 11.03f)
                curveTo(18.15f, 11.22f, 18.51f, 11.78f, 18.51f, 12.26f)
                verticalLineTo(13.19f)
                close()
            }
        }.build()

        return _AirplaneSquare!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneSquare: ImageVector? = null
