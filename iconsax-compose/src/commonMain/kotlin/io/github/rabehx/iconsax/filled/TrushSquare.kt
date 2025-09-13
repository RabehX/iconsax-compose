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


val Iconsax.Filled.TrushSquare: ImageVector
    get() {
        if (_TrushSquare != null) {
            return _TrushSquare!!
        }
        _TrushSquare = ImageVector.Builder(
            name = "Filled.TrushSquare",
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
                moveTo(15.76f, 15.76f)
                curveTo(15.7f, 16.61f, 15.63f, 17.67f, 13.71f, 17.67f)
                horizontalLineTo(10.29f)
                curveTo(8.38f, 17.67f, 8.3f, 16.61f, 8.24f, 15.76f)
                lineTo(7.93f, 11.8f)
                curveTo(7.91f, 11.54f, 8f, 11.29f, 8.17f, 11.1f)
                curveTo(8.34f, 10.91f, 8.59f, 10.81f, 8.84f, 10.81f)
                horizontalLineTo(15.16f)
                curveTo(15.41f, 10.81f, 15.66f, 10.92f, 15.83f, 11.1f)
                curveTo(16f, 11.29f, 16.09f, 11.54f, 16.07f, 11.79f)
                lineTo(15.76f, 15.76f)
                close()
                moveTo(16.8f, 9.82f)
                curveTo(16.78f, 9.82f, 16.76f, 9.82f, 16.74f, 9.82f)
                curveTo(15.7f, 9.72f, 14.75f, 9.65f, 13.84f, 9.61f)
                curveTo(12.62f, 9.55f, 11.4f, 9.53f, 10.17f, 9.58f)
                curveTo(9.57f, 9.61f, 8.96f, 9.65f, 8.36f, 9.71f)
                lineTo(7.27f, 9.82f)
                curveTo(7.25f, 9.82f, 7.22f, 9.82f, 7.2f, 9.82f)
                curveTo(6.85f, 9.82f, 6.55f, 9.56f, 6.52f, 9.2f)
                curveTo(6.48f, 8.83f, 6.76f, 8.49f, 7.13f, 8.46f)
                lineTo(8.22f, 8.35f)
                curveTo(8.65f, 8.31f, 9.07f, 8.28f, 9.5f, 8.26f)
                lineTo(9.58f, 7.79f)
                curveTo(9.66f, 7.29f, 9.81f, 6.33f, 11.31f, 6.33f)
                horizontalLineTo(12.7f)
                curveTo(14.21f, 6.33f, 14.36f, 7.32f, 14.43f, 7.8f)
                lineTo(14.51f, 8.28f)
                curveTo(15.26f, 8.32f, 16.03f, 8.38f, 16.87f, 8.46f)
                curveTo(17.25f, 8.5f, 17.52f, 8.83f, 17.49f, 9.21f)
                curveTo(17.45f, 9.56f, 17.15f, 9.82f, 16.8f, 9.82f)
                close()
            }
        }.build()

        return _TrushSquare!!
    }

@Suppress("ObjectPropertyName")
private var _TrushSquare: ImageVector? = null
