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

val Iconsax.Outline.Brush: ImageVector
    get() {
        if (_Brush != null) {
            return _Brush!!
        }
        _Brush = ImageVector.Builder(
            name = "Outline.Brush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 16.75f)
                curveTo(9.59f, 16.75f, 9.25f, 16.41f, 9.25f, 16f)
                curveTo(9.25f, 14.33f, 9.25f, 12.25f, 13f, 12.25f)
                horizontalLineTo(17f)
                curveTo(19.25f, 12.25f, 19.25f, 11.95f, 19.25f, 10f)
                verticalLineTo(8f)
                curveTo(19.25f, 6.05f, 19.25f, 5.75f, 17f, 5.75f)
                horizontalLineTo(16f)
                curveTo(15.59f, 5.75f, 15.25f, 5.41f, 15.25f, 5f)
                curveTo(15.25f, 4.59f, 15.59f, 4.25f, 16f, 4.25f)
                horizontalLineTo(17f)
                curveTo(20.5f, 4.25f, 20.75f, 5.67f, 20.75f, 8f)
                verticalLineTo(10f)
                curveTo(20.75f, 12.33f, 20.5f, 13.75f, 17f, 13.75f)
                horizontalLineTo(13f)
                curveTo(10.75f, 13.75f, 10.75f, 14.36f, 10.75f, 16f)
                curveTo(10.75f, 16.41f, 10.41f, 16.75f, 10f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 8.75f)
                horizontalLineTo(8.001f)
                curveTo(7.681f, 8.75f, 7.391f, 8.54f, 7.291f, 8.24f)
                curveTo(6.601f, 6.15f, 6.601f, 3.85f, 7.291f, 1.77f)
                curveTo(7.391f, 1.46f, 7.681f, 1.25f, 8.001f, 1.25f)
                horizontalLineTo(12.001f)
                curveTo(12.321f, 1.25f, 12.611f, 1.46f, 12.711f, 1.76f)
                curveTo(13.411f, 3.85f, 13.411f, 6.15f, 12.711f, 8.23f)
                curveTo(12.611f, 8.54f, 12.331f, 8.75f, 12.001f, 8.75f)
                close()
                moveTo(8.561f, 7.25f)
                horizontalLineTo(11.451f)
                curveTo(11.841f, 5.78f, 11.841f, 4.22f, 11.451f, 2.75f)
                horizontalLineTo(8.561f)
                curveTo(8.171f, 4.22f, 8.171f, 5.78f, 8.561f, 7.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 8.75f)
                horizontalLineTo(7f)
                curveTo(4.58f, 8.75f, 3.25f, 7.42f, 3.25f, 5f)
                curveTo(3.25f, 2.58f, 4.58f, 1.25f, 7f, 1.25f)
                horizontalLineTo(8f)
                curveTo(8.26f, 1.25f, 8.5f, 1.38f, 8.64f, 1.61f)
                curveTo(8.78f, 1.83f, 8.79f, 2.11f, 8.67f, 2.34f)
                curveTo(7.77f, 4.13f, 7.77f, 5.88f, 8.67f, 7.67f)
                curveTo(8.79f, 7.9f, 8.77f, 8.18f, 8.64f, 8.4f)
                curveTo(8.5f, 8.62f, 8.26f, 8.75f, 8f, 8.75f)
                close()
                moveTo(6.88f, 2.75f)
                curveTo(5.39f, 2.79f, 4.75f, 3.46f, 4.75f, 5f)
                curveTo(4.75f, 6.53f, 5.39f, 7.21f, 6.87f, 7.25f)
                curveTo(6.37f, 5.75f, 6.37f, 4.25f, 6.88f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.999f, 8.75f)
                horizontalLineTo(11.999f)
                curveTo(11.739f, 8.75f, 11.499f, 8.62f, 11.359f, 8.39f)
                curveTo(11.219f, 8.17f, 11.209f, 7.89f, 11.329f, 7.66f)
                curveTo(12.219f, 5.87f, 12.219f, 4.12f, 11.329f, 2.33f)
                curveTo(11.209f, 2.1f, 11.229f, 1.82f, 11.359f, 1.6f)
                curveTo(11.499f, 1.38f, 11.739f, 1.25f, 11.999f, 1.25f)
                horizontalLineTo(12.999f)
                curveTo(15.419f, 1.25f, 16.749f, 2.58f, 16.749f, 5f)
                curveTo(16.749f, 7.42f, 15.419f, 8.75f, 12.999f, 8.75f)
                close()
                moveTo(13.119f, 2.75f)
                curveTo(13.619f, 4.25f, 13.619f, 5.75f, 13.119f, 7.25f)
                curveTo(14.609f, 7.21f, 15.239f, 6.54f, 15.239f, 5f)
                curveTo(15.249f, 3.46f, 14.609f, 2.79f, 13.119f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.5f, 22.75f)
                horizontalLineTo(9.5f)
                curveTo(8.47f, 22.75f, 7.25f, 22.36f, 7.25f, 20.5f)
                verticalLineTo(17.5f)
                curveTo(7.25f, 15.64f, 8.47f, 15.25f, 9.5f, 15.25f)
                horizontalLineTo(10.5f)
                curveTo(11.53f, 15.25f, 12.75f, 15.64f, 12.75f, 17.5f)
                verticalLineTo(20.5f)
                curveTo(12.75f, 22.36f, 11.53f, 22.75f, 10.5f, 22.75f)
                close()
                moveTo(9.5f, 16.75f)
                curveTo(8.75f, 16.75f, 8.75f, 16.97f, 8.75f, 17.5f)
                verticalLineTo(20.5f)
                curveTo(8.75f, 21.03f, 8.75f, 21.25f, 9.5f, 21.25f)
                horizontalLineTo(10.5f)
                curveTo(11.25f, 21.25f, 11.25f, 21.03f, 11.25f, 20.5f)
                verticalLineTo(17.5f)
                curveTo(11.25f, 16.97f, 11.25f, 16.75f, 10.5f, 16.75f)
                horizontalLineTo(9.5f)
                close()
            }
        }.build()

        return _Brush!!
    }

@Suppress("ObjectPropertyName")
private var _Brush: ImageVector? = null
