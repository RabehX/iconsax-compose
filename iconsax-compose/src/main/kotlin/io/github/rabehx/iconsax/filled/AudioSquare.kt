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

val Iconsax.Filled.AudioSquare: ImageVector
    get() {
        if (_AudioSquare != null) {
            return _AudioSquare!!
        }
        _AudioSquare = ImageVector.Builder(
            name = "Filled.AudioSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.67f, 13.922f)
                curveTo(8.93f, 13.922f, 8.34f, 14.522f, 8.34f, 15.262f)
                curveTo(8.34f, 16.002f, 8.94f, 16.592f, 9.67f, 16.592f)
                curveTo(10.41f, 16.592f, 11.01f, 15.992f, 11.01f, 15.262f)
                curveTo(11.01f, 14.522f, 10.41f, 13.922f, 9.67f, 13.922f)
                close()
            }
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
                moveTo(17.12f, 9.8f)
                curveTo(17.12f, 10.41f, 16.86f, 10.95f, 16.42f, 11.27f)
                curveTo(16.14f, 11.47f, 15.8f, 11.58f, 15.44f, 11.58f)
                curveTo(15.23f, 11.58f, 15.02f, 11.54f, 14.8f, 11.47f)
                lineTo(12.51f, 10.71f)
                curveTo(12.5f, 10.71f, 12.48f, 10.7f, 12.47f, 10.69f)
                verticalLineTo(15.25f)
                curveTo(12.47f, 16.79f, 11.21f, 18.05f, 9.67f, 18.05f)
                curveTo(8.13f, 18.05f, 6.87f, 16.79f, 6.87f, 15.25f)
                curveTo(6.87f, 13.71f, 8.13f, 12.45f, 9.67f, 12.45f)
                curveTo(10.16f, 12.45f, 10.61f, 12.59f, 11.01f, 12.8f)
                verticalLineTo(8.63f)
                verticalLineTo(8.02f)
                curveTo(11.01f, 7.41f, 11.27f, 6.87f, 11.71f, 6.55f)
                curveTo(12.16f, 6.23f, 12.75f, 6.15f, 13.33f, 6.35f)
                lineTo(15.62f, 7.11f)
                curveTo(16.48f, 7.4f, 17.13f, 8.3f, 17.13f, 9.2f)
                verticalLineTo(9.8f)
                horizontalLineTo(17.12f)
                close()
            }
        }.build()

        return _AudioSquare!!
    }

@Suppress("ObjectPropertyName")
private var _AudioSquare: ImageVector? = null
