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


val Iconsax.Filled.MusicSquare: ImageVector
    get() {
        if (_MusicSquare != null) {
            return _MusicSquare!!
        }
        _MusicSquare = ImageVector.Builder(
            name = "Filled.MusicSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.541f, 13.672f)
                curveTo(14.181f, 13.672f, 13.891f, 13.962f, 13.891f, 14.322f)
                curveTo(13.891f, 14.682f, 14.181f, 14.972f, 14.541f, 14.972f)
                curveTo(14.901f, 14.972f, 15.191f, 14.682f, 15.191f, 14.322f)
                curveTo(15.181f, 13.962f, 14.891f, 13.672f, 14.541f, 13.672f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.06f, 14.66f)
                curveTo(8.7f, 14.66f, 8.41f, 14.95f, 8.41f, 15.31f)
                curveTo(8.41f, 15.67f, 8.7f, 15.96f, 9.06f, 15.96f)
                curveTo(9.42f, 15.96f, 9.71f, 15.67f, 9.71f, 15.31f)
                curveTo(9.71f, 14.95f, 9.42f, 14.66f, 9.06f, 14.66f)
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
                moveTo(16.88f, 9.55f)
                verticalLineTo(14.31f)
                curveTo(16.88f, 15.6f, 15.83f, 16.65f, 14.54f, 16.65f)
                curveTo(13.25f, 16.65f, 12.2f, 15.6f, 12.2f, 14.31f)
                curveTo(12.2f, 13.02f, 13.25f, 11.97f, 14.54f, 11.97f)
                curveTo(14.77f, 11.97f, 14.98f, 12.01f, 15.19f, 12.07f)
                verticalLineTo(10.65f)
                lineTo(11.41f, 11.68f)
                verticalLineTo(15.3f)
                curveTo(11.41f, 15.31f, 11.4f, 15.32f, 11.4f, 15.33f)
                curveTo(11.39f, 16.61f, 10.34f, 17.64f, 9.06f, 17.64f)
                curveTo(7.77f, 17.64f, 6.72f, 16.59f, 6.72f, 15.3f)
                curveTo(6.72f, 14.01f, 7.77f, 12.96f, 9.06f, 12.96f)
                curveTo(9.29f, 12.96f, 9.5f, 13f, 9.71f, 13.06f)
                verticalLineTo(11.03f)
                verticalLineTo(9.29f)
                curveTo(9.71f, 8.32f, 10.31f, 7.53f, 11.25f, 7.28f)
                lineTo(14.24f, 6.46f)
                curveTo(15.2f, 6.2f, 15.8f, 6.45f, 16.14f, 6.71f)
                curveTo(16.47f, 6.97f, 16.88f, 7.48f, 16.88f, 8.48f)
                verticalLineTo(9.55f)
                close()
            }
        }.build()

        return _MusicSquare!!
    }

@Suppress("ObjectPropertyName")
private var _MusicSquare: ImageVector? = null
