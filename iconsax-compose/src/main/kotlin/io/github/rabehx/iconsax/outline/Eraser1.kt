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

val Iconsax.Outline.Eraser1: ImageVector
    get() {
        if (_Eraser1 != null) {
            return _Eraser1!!
        }
        _Eraser1 = ImageVector.Builder(
            name = "Outline.Eraser1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 22.75f)
                horizontalLineTo(9f)
                curveTo(8.59f, 22.75f, 8.25f, 22.41f, 8.25f, 22f)
                curveTo(8.25f, 21.59f, 8.59f, 21.25f, 9f, 21.25f)
                horizontalLineTo(21f)
                curveTo(21.41f, 21.25f, 21.75f, 21.59f, 21.75f, 22f)
                curveTo(21.75f, 22.41f, 21.41f, 22.75f, 21f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.54f, 22.71f)
                curveTo(7.54f, 22.71f, 6.59f, 22.32f, 5.89f, 21.61f)
                lineTo(2.38f, 18.1f)
                curveTo(0.92f, 16.64f, 0.92f, 14.26f, 2.38f, 12.8f)
                lineTo(12.81f, 2.37f)
                curveTo(14.22f, 0.96f, 16.7f, 0.96f, 18.11f, 2.37f)
                lineTo(21.62f, 5.88f)
                curveTo(23.08f, 7.34f, 23.08f, 9.72f, 21.62f, 11.18f)
                lineTo(11.19f, 21.61f)
                curveTo(10.49f, 22.33f, 9.55f, 22.71f, 8.54f, 22.71f)
                close()
                moveTo(3.44f, 17.05f)
                lineTo(6.95f, 20.56f)
                curveTo(7.8f, 21.41f, 9.29f, 21.41f, 10.13f, 20.56f)
                lineTo(20.56f, 10.13f)
                curveTo(21.44f, 9.25f, 21.44f, 7.83f, 20.56f, 6.95f)
                lineTo(17.05f, 3.44f)
                curveTo(16.21f, 2.6f, 14.72f, 2.59f, 13.87f, 3.44f)
                lineTo(3.44f, 13.87f)
                curveTo(2.56f, 14.74f, 2.56f, 16.17f, 3.44f, 17.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.87f, 17.63f)
                curveTo(14.681f, 17.63f, 14.491f, 17.56f, 14.34f, 17.41f)
                lineTo(6.591f, 9.66f)
                curveTo(6.301f, 9.37f, 6.301f, 8.89f, 6.591f, 8.6f)
                curveTo(6.881f, 8.31f, 7.361f, 8.31f, 7.651f, 8.6f)
                lineTo(15.401f, 16.35f)
                curveTo(15.691f, 16.64f, 15.691f, 17.12f, 15.401f, 17.41f)
                curveTo(15.25f, 17.56f, 15.061f, 17.63f, 14.87f, 17.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.521f, 18.41f)
                curveTo(3.331f, 18.41f, 3.141f, 18.34f, 2.991f, 18.19f)
                curveTo(2.701f, 17.9f, 2.701f, 17.42f, 2.991f, 17.13f)
                lineTo(8.651f, 11.47f)
                curveTo(8.941f, 11.18f, 9.421f, 11.18f, 9.711f, 11.47f)
                curveTo(10.001f, 11.76f, 10.001f, 12.24f, 9.711f, 12.53f)
                lineTo(4.051f, 18.19f)
                curveTo(3.901f, 18.34f, 3.711f, 18.41f, 3.521f, 18.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.339f, 21.24f)
                curveTo(6.149f, 21.24f, 5.959f, 21.17f, 5.809f, 21.02f)
                curveTo(5.519f, 20.73f, 5.519f, 20.25f, 5.809f, 19.96f)
                lineTo(11.469f, 14.3f)
                curveTo(11.759f, 14.01f, 12.239f, 14.01f, 12.529f, 14.3f)
                curveTo(12.819f, 14.59f, 12.819f, 15.07f, 12.529f, 15.36f)
                lineTo(6.869f, 21.02f)
                curveTo(6.729f, 21.16f, 6.539f, 21.24f, 6.339f, 21.24f)
                close()
            }
        }.build()

        return _Eraser1!!
    }

@Suppress("ObjectPropertyName")
private var _Eraser1: ImageVector? = null
