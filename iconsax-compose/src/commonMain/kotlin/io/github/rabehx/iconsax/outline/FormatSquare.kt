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

val Iconsax.Outline.FormatSquare: ImageVector
    get() {
        if (_FormatSquare != null) {
            return _FormatSquare!!
        }
        _FormatSquare = ImageVector.Builder(
            name = "Outline.FormatSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.05f, 20.75f)
                horizontalLineTo(6.95f)
                curveTo(6.73f, 20.75f, 6.52f, 20.65f, 6.37f, 20.48f)
                curveTo(6.22f, 20.31f, 6.17f, 20.08f, 6.21f, 19.86f)
                curveTo(6.23f, 19.74f, 6.25f, 19.62f, 6.25f, 19.5f)
                curveTo(6.25f, 18.54f, 5.46f, 17.75f, 4.5f, 17.75f)
                curveTo(4.38f, 17.75f, 4.25f, 17.76f, 4.14f, 17.79f)
                curveTo(3.92f, 17.83f, 3.69f, 17.77f, 3.52f, 17.63f)
                curveTo(3.35f, 17.49f, 3.25f, 17.28f, 3.25f, 17.05f)
                verticalLineTo(6.95f)
                curveTo(3.25f, 6.73f, 3.35f, 6.52f, 3.52f, 6.37f)
                curveTo(3.69f, 6.22f, 3.91f, 6.17f, 4.14f, 6.21f)
                curveTo(4.25f, 6.24f, 4.38f, 6.25f, 4.5f, 6.25f)
                curveTo(5.46f, 6.25f, 6.25f, 5.46f, 6.25f, 4.5f)
                curveTo(6.25f, 4.38f, 6.24f, 4.25f, 6.21f, 4.14f)
                curveTo(6.17f, 3.92f, 6.23f, 3.69f, 6.37f, 3.52f)
                curveTo(6.51f, 3.35f, 6.72f, 3.25f, 6.95f, 3.25f)
                horizontalLineTo(17.05f)
                curveTo(17.27f, 3.25f, 17.48f, 3.35f, 17.63f, 3.52f)
                curveTo(17.78f, 3.69f, 17.83f, 3.92f, 17.79f, 4.14f)
                curveTo(17.77f, 4.26f, 17.75f, 4.38f, 17.75f, 4.5f)
                curveTo(17.75f, 5.46f, 18.54f, 6.25f, 19.5f, 6.25f)
                curveTo(19.62f, 6.25f, 19.75f, 6.24f, 19.86f, 6.21f)
                curveTo(20.08f, 6.17f, 20.31f, 6.23f, 20.48f, 6.37f)
                curveTo(20.65f, 6.51f, 20.75f, 6.72f, 20.75f, 6.95f)
                verticalLineTo(17.05f)
                curveTo(20.75f, 17.27f, 20.65f, 17.48f, 20.48f, 17.63f)
                curveTo(20.31f, 17.78f, 20.08f, 17.83f, 19.86f, 17.79f)
                curveTo(19.74f, 17.77f, 19.62f, 17.75f, 19.5f, 17.75f)
                curveTo(18.54f, 17.75f, 17.75f, 18.54f, 17.75f, 19.5f)
                curveTo(17.75f, 19.62f, 17.76f, 19.75f, 17.79f, 19.86f)
                curveTo(17.83f, 20.08f, 17.77f, 20.31f, 17.63f, 20.48f)
                curveTo(17.49f, 20.65f, 17.27f, 20.75f, 17.05f, 20.75f)
                close()
                moveTo(7.74f, 19.25f)
                horizontalLineTo(16.26f)
                curveTo(16.38f, 17.66f, 17.66f, 16.38f, 19.25f, 16.26f)
                verticalLineTo(7.74f)
                curveTo(17.66f, 7.62f, 16.38f, 6.34f, 16.26f, 4.75f)
                horizontalLineTo(7.74f)
                curveTo(7.62f, 6.34f, 6.34f, 7.62f, 4.75f, 7.74f)
                verticalLineTo(16.26f)
                curveTo(6.34f, 16.38f, 7.62f, 17.66f, 7.74f, 19.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.5f, 7.75f)
                curveTo(4.28f, 7.75f, 4.07f, 7.73f, 3.86f, 7.69f)
                curveTo(2.34f, 7.38f, 1.25f, 6.04f, 1.25f, 4.5f)
                curveTo(1.25f, 2.71f, 2.71f, 1.25f, 4.5f, 1.25f)
                curveTo(6.04f, 1.25f, 7.38f, 2.34f, 7.69f, 3.85f)
                curveTo(7.73f, 4.07f, 7.75f, 4.28f, 7.75f, 4.5f)
                curveTo(7.75f, 6.29f, 6.29f, 7.75f, 4.5f, 7.75f)
                close()
                moveTo(4.5f, 2.75f)
                curveTo(3.54f, 2.75f, 2.75f, 3.54f, 2.75f, 4.5f)
                curveTo(2.75f, 5.33f, 3.34f, 6.05f, 4.15f, 6.21f)
                curveTo(4.25f, 6.24f, 4.38f, 6.25f, 4.5f, 6.25f)
                curveTo(5.46f, 6.25f, 6.25f, 5.46f, 6.25f, 4.5f)
                curveTo(6.25f, 4.38f, 6.24f, 4.25f, 6.21f, 4.14f)
                curveTo(6.05f, 3.34f, 5.33f, 2.75f, 4.5f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.5f, 7.75f)
                curveTo(17.71f, 7.75f, 16.25f, 6.29f, 16.25f, 4.5f)
                curveTo(16.25f, 4.28f, 16.27f, 4.07f, 16.31f, 3.86f)
                curveTo(16.62f, 2.34f, 17.96f, 1.25f, 19.5f, 1.25f)
                curveTo(21.29f, 1.25f, 22.75f, 2.71f, 22.75f, 4.5f)
                curveTo(22.75f, 6.04f, 21.66f, 7.38f, 20.15f, 7.69f)
                curveTo(19.93f, 7.73f, 19.72f, 7.75f, 19.5f, 7.75f)
                close()
                moveTo(19.5f, 2.75f)
                curveTo(18.67f, 2.75f, 17.95f, 3.34f, 17.79f, 4.15f)
                curveTo(17.77f, 4.26f, 17.75f, 4.38f, 17.75f, 4.5f)
                curveTo(17.75f, 5.46f, 18.54f, 6.25f, 19.5f, 6.25f)
                curveTo(19.62f, 6.25f, 19.75f, 6.24f, 19.86f, 6.21f)
                curveTo(20.66f, 6.05f, 21.25f, 5.33f, 21.25f, 4.5f)
                curveTo(21.25f, 3.54f, 20.46f, 2.75f, 19.5f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.5f, 22.75f)
                curveTo(2.71f, 22.75f, 1.25f, 21.29f, 1.25f, 19.5f)
                curveTo(1.25f, 17.96f, 2.34f, 16.62f, 3.85f, 16.31f)
                curveTo(4.06f, 16.27f, 4.28f, 16.25f, 4.5f, 16.25f)
                curveTo(6.29f, 16.25f, 7.75f, 17.71f, 7.75f, 19.5f)
                curveTo(7.75f, 19.72f, 7.73f, 19.93f, 7.69f, 20.14f)
                curveTo(7.38f, 21.66f, 6.04f, 22.75f, 4.5f, 22.75f)
                close()
                moveTo(4.5f, 17.75f)
                curveTo(4.38f, 17.75f, 4.25f, 17.76f, 4.14f, 17.79f)
                curveTo(3.34f, 17.95f, 2.75f, 18.67f, 2.75f, 19.5f)
                curveTo(2.75f, 20.46f, 3.54f, 21.25f, 4.5f, 21.25f)
                curveTo(5.33f, 21.25f, 6.05f, 20.66f, 6.21f, 19.85f)
                curveTo(6.23f, 19.74f, 6.25f, 19.62f, 6.25f, 19.5f)
                curveTo(6.25f, 18.54f, 5.46f, 17.75f, 4.5f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.5f, 22.75f)
                curveTo(17.96f, 22.75f, 16.62f, 21.66f, 16.31f, 20.15f)
                curveTo(16.27f, 19.94f, 16.25f, 19.72f, 16.25f, 19.5f)
                curveTo(16.25f, 17.71f, 17.71f, 16.25f, 19.5f, 16.25f)
                curveTo(19.72f, 16.25f, 19.93f, 16.27f, 20.14f, 16.31f)
                curveTo(21.66f, 16.62f, 22.75f, 17.96f, 22.75f, 19.5f)
                curveTo(22.75f, 21.29f, 21.29f, 22.75f, 19.5f, 22.75f)
                close()
                moveTo(19.5f, 17.75f)
                curveTo(18.54f, 17.75f, 17.75f, 18.54f, 17.75f, 19.5f)
                curveTo(17.75f, 19.62f, 17.76f, 19.75f, 17.79f, 19.86f)
                curveTo(17.95f, 20.66f, 18.67f, 21.25f, 19.5f, 21.25f)
                curveTo(20.46f, 21.25f, 21.25f, 20.46f, 21.25f, 19.5f)
                curveTo(21.25f, 18.67f, 20.66f, 17.95f, 19.85f, 17.79f)
                curveTo(19.75f, 17.76f, 19.62f, 17.75f, 19.5f, 17.75f)
                close()
            }
        }.build()

        return _FormatSquare!!
    }

@Suppress("ObjectPropertyName")
private var _FormatSquare: ImageVector? = null
