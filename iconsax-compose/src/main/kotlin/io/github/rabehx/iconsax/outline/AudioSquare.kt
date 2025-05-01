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

val Iconsax.Outline.AudioSquare: ImageVector
    get() {
        if (_AudioSquare != null) {
            return _AudioSquare!!
        }
        _AudioSquare = ImageVector.Builder(
            name = "Outline.AudioSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.62f, 18.05f)
                curveTo(8.04f, 18.05f, 6.75f, 16.76f, 6.75f, 15.18f)
                curveTo(6.75f, 13.6f, 8.04f, 12.31f, 9.62f, 12.31f)
                curveTo(11.2f, 12.31f, 12.49f, 13.6f, 12.49f, 15.18f)
                curveTo(12.49f, 16.76f, 11.2f, 18.05f, 9.62f, 18.05f)
                close()
                moveTo(9.62f, 13.82f)
                curveTo(8.87f, 13.82f, 8.25f, 14.43f, 8.25f, 15.19f)
                curveTo(8.25f, 15.94f, 8.86f, 16.56f, 9.62f, 16.56f)
                curveTo(10.37f, 16.56f, 10.99f, 15.95f, 10.99f, 15.19f)
                curveTo(10.99f, 14.43f, 10.37f, 13.82f, 9.62f, 13.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.74f, 15.93f)
                curveTo(11.33f, 15.93f, 10.99f, 15.59f, 10.99f, 15.18f)
                verticalLineTo(7.77f)
                curveTo(10.99f, 7.36f, 11.33f, 7.02f, 11.74f, 7.02f)
                curveTo(12.15f, 7.02f, 12.49f, 7.36f, 12.49f, 7.77f)
                verticalLineTo(15.18f)
                curveTo(12.49f, 15.6f, 12.15f, 15.93f, 11.74f, 15.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.52f, 11.43f)
                curveTo(15.31f, 11.43f, 15.09f, 11.39f, 14.87f, 11.32f)
                lineTo(12.53f, 10.54f)
                curveTo(11.65f, 10.25f, 10.99f, 9.33f, 10.99f, 8.4f)
                verticalLineTo(7.78f)
                curveTo(10.99f, 7.15f, 11.25f, 6.6f, 11.71f, 6.27f)
                curveTo(12.17f, 5.94f, 12.77f, 5.86f, 13.37f, 6.06f)
                lineTo(15.71f, 6.84f)
                curveTo(16.59f, 7.13f, 17.25f, 8.05f, 17.25f, 8.98f)
                verticalLineTo(9.6f)
                curveTo(17.25f, 10.23f, 16.99f, 10.78f, 16.53f, 11.11f)
                curveTo(16.24f, 11.32f, 15.89f, 11.43f, 15.52f, 11.43f)
                close()
                moveTo(12.71f, 7.45f)
                curveTo(12.66f, 7.45f, 12.61f, 7.46f, 12.58f, 7.48f)
                curveTo(12.52f, 7.52f, 12.48f, 7.63f, 12.48f, 7.77f)
                verticalLineTo(8.39f)
                curveTo(12.48f, 8.67f, 12.74f, 9.02f, 13f, 9.11f)
                lineTo(15.34f, 9.89f)
                curveTo(15.47f, 9.93f, 15.59f, 9.93f, 15.65f, 9.89f)
                curveTo(15.71f, 9.85f, 15.75f, 9.74f, 15.75f, 9.6f)
                verticalLineTo(8.98f)
                curveTo(15.75f, 8.7f, 15.49f, 8.35f, 15.23f, 8.26f)
                lineTo(12.89f, 7.48f)
                curveTo(12.83f, 7.46f, 12.76f, 7.45f, 12.71f, 7.45f)
                close()
            }
        }.build()

        return _AudioSquare!!
    }

@Suppress("ObjectPropertyName")
private var _AudioSquare: ImageVector? = null
