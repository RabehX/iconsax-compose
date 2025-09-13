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

val Iconsax.Outline.MusicSquare: ImageVector
    get() {
        if (_MusicSquare != null) {
            return _MusicSquare!!
        }
        _MusicSquare = ImageVector.Builder(
            name = "Outline.MusicSquare",
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
                moveTo(8.42f, 17.86f)
                curveTo(7.14f, 17.86f, 6.1f, 16.82f, 6.1f, 15.54f)
                curveTo(6.1f, 14.26f, 7.14f, 13.22f, 8.42f, 13.22f)
                curveTo(9.7f, 13.22f, 10.74f, 14.26f, 10.74f, 15.54f)
                curveTo(10.74f, 16.82f, 9.7f, 17.86f, 8.42f, 17.86f)
                close()
                moveTo(8.42f, 14.72f)
                curveTo(7.97f, 14.72f, 7.6f, 15.09f, 7.6f, 15.54f)
                curveTo(7.6f, 15.99f, 7.97f, 16.36f, 8.42f, 16.36f)
                curveTo(8.87f, 16.36f, 9.24f, 15.99f, 9.24f, 15.54f)
                curveTo(9.24f, 15.09f, 8.87f, 14.72f, 8.42f, 14.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.99f, 16.29f)
                curveTo(9.58f, 16.29f, 9.24f, 15.95f, 9.24f, 15.54f)
                verticalLineTo(9.21f)
                curveTo(9.24f, 8.25f, 9.84f, 7.47f, 10.76f, 7.22f)
                lineTo(13.9f, 6.36f)
                curveTo(14.85f, 6.1f, 15.45f, 6.35f, 15.78f, 6.6f)
                curveTo(16.26f, 6.97f, 16.5f, 7.55f, 16.5f, 8.34f)
                verticalLineTo(14.48f)
                curveTo(16.5f, 14.89f, 16.16f, 15.23f, 15.75f, 15.23f)
                curveTo(15.34f, 15.23f, 15f, 14.89f, 15f, 14.48f)
                verticalLineTo(8.34f)
                curveTo(15f, 8.01f, 14.93f, 7.83f, 14.87f, 7.79f)
                curveTo(14.82f, 7.75f, 14.64f, 7.71f, 14.29f, 7.8f)
                lineTo(11.15f, 8.66f)
                curveTo(10.87f, 8.74f, 10.74f, 8.91f, 10.74f, 9.2f)
                verticalLineTo(15.53f)
                curveTo(10.74f, 15.95f, 10.4f, 16.29f, 9.99f, 16.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.179f, 16.81f)
                curveTo(12.899f, 16.81f, 11.859f, 15.77f, 11.859f, 14.49f)
                curveTo(11.859f, 13.21f, 12.899f, 12.17f, 14.179f, 12.17f)
                curveTo(15.459f, 12.17f, 16.499f, 13.21f, 16.499f, 14.49f)
                curveTo(16.499f, 15.77f, 15.459f, 16.81f, 14.179f, 16.81f)
                close()
                moveTo(14.179f, 13.67f)
                curveTo(13.729f, 13.67f, 13.359f, 14.04f, 13.359f, 14.49f)
                curveTo(13.359f, 14.94f, 13.729f, 15.31f, 14.179f, 15.31f)
                curveTo(14.629f, 15.31f, 14.999f, 14.94f, 14.999f, 14.49f)
                curveTo(14.999f, 14.04f, 14.629f, 13.67f, 14.179f, 13.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.989f, 11.79f)
                curveTo(9.659f, 11.79f, 9.359f, 11.57f, 9.269f, 11.24f)
                curveTo(9.159f, 10.84f, 9.399f, 10.43f, 9.799f, 10.32f)
                lineTo(15.559f, 8.75f)
                curveTo(15.969f, 8.64f, 16.369f, 8.88f, 16.479f, 9.28f)
                curveTo(16.589f, 9.68f, 16.349f, 10.09f, 15.949f, 10.2f)
                lineTo(10.189f, 11.77f)
                curveTo(10.119f, 11.78f, 10.049f, 11.79f, 9.989f, 11.79f)
                close()
            }
        }.build()

        return _MusicSquare!!
    }

@Suppress("ObjectPropertyName")
private var _MusicSquare: ImageVector? = null
