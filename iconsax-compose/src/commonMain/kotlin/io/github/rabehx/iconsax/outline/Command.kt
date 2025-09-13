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

val Iconsax.Outline.Command: ImageVector
    get() {
        if (_Command != null) {
            return _Command!!
        }
        _Command = ImageVector.Builder(
            name = "Outline.Command",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 16.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 16.75f, 7.25f, 16.41f, 7.25f, 16f)
                verticalLineTo(8f)
                curveTo(7.25f, 7.59f, 7.59f, 7.25f, 8f, 7.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 7.25f, 16.75f, 7.59f, 16.75f, 8f)
                verticalLineTo(16f)
                curveTo(16.75f, 16.41f, 16.41f, 16.75f, 16f, 16.75f)
                close()
                moveTo(8.75f, 15.25f)
                horizontalLineTo(15.25f)
                verticalLineTo(8.75f)
                horizontalLineTo(8.75f)
                verticalLineTo(15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 22.75f)
                curveTo(2.93f, 22.75f, 1.25f, 21.07f, 1.25f, 19f)
                curveTo(1.25f, 16.93f, 2.93f, 15.25f, 5f, 15.25f)
                horizontalLineTo(8f)
                curveTo(8.41f, 15.25f, 8.75f, 15.59f, 8.75f, 16f)
                verticalLineTo(19f)
                curveTo(8.75f, 21.07f, 7.07f, 22.75f, 5f, 22.75f)
                close()
                moveTo(5f, 16.75f)
                curveTo(3.76f, 16.75f, 2.75f, 17.76f, 2.75f, 19f)
                curveTo(2.75f, 20.24f, 3.76f, 21.25f, 5f, 21.25f)
                curveTo(6.24f, 21.25f, 7.25f, 20.24f, 7.25f, 19f)
                verticalLineTo(16.75f)
                horizontalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 8.75f)
                horizontalLineTo(5f)
                curveTo(2.93f, 8.75f, 1.25f, 7.07f, 1.25f, 5f)
                curveTo(1.25f, 2.93f, 2.93f, 1.25f, 5f, 1.25f)
                curveTo(7.07f, 1.25f, 8.75f, 2.93f, 8.75f, 5f)
                verticalLineTo(8f)
                curveTo(8.75f, 8.41f, 8.41f, 8.75f, 8f, 8.75f)
                close()
                moveTo(5f, 2.75f)
                curveTo(3.76f, 2.75f, 2.75f, 3.76f, 2.75f, 5f)
                curveTo(2.75f, 6.24f, 3.76f, 7.25f, 5f, 7.25f)
                horizontalLineTo(7.25f)
                verticalLineTo(5f)
                curveTo(7.25f, 3.76f, 6.24f, 2.75f, 5f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 8.75f)
                horizontalLineTo(16f)
                curveTo(15.59f, 8.75f, 15.25f, 8.41f, 15.25f, 8f)
                verticalLineTo(5f)
                curveTo(15.25f, 2.93f, 16.93f, 1.25f, 19f, 1.25f)
                curveTo(21.07f, 1.25f, 22.75f, 2.93f, 22.75f, 5f)
                curveTo(22.75f, 7.07f, 21.07f, 8.75f, 19f, 8.75f)
                close()
                moveTo(16.75f, 7.25f)
                horizontalLineTo(19f)
                curveTo(20.24f, 7.25f, 21.25f, 6.24f, 21.25f, 5f)
                curveTo(21.25f, 3.76f, 20.24f, 2.75f, 19f, 2.75f)
                curveTo(17.76f, 2.75f, 16.75f, 3.76f, 16.75f, 5f)
                verticalLineTo(7.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 22.75f)
                curveTo(16.93f, 22.75f, 15.25f, 21.07f, 15.25f, 19f)
                verticalLineTo(16f)
                curveTo(15.25f, 15.59f, 15.59f, 15.25f, 16f, 15.25f)
                horizontalLineTo(19f)
                curveTo(21.07f, 15.25f, 22.75f, 16.93f, 22.75f, 19f)
                curveTo(22.75f, 21.07f, 21.07f, 22.75f, 19f, 22.75f)
                close()
                moveTo(16.75f, 16.75f)
                verticalLineTo(19f)
                curveTo(16.75f, 20.24f, 17.76f, 21.25f, 19f, 21.25f)
                curveTo(20.24f, 21.25f, 21.25f, 20.24f, 21.25f, 19f)
                curveTo(21.25f, 17.76f, 20.24f, 16.75f, 19f, 16.75f)
                horizontalLineTo(16.75f)
                close()
            }
        }.build()

        return _Command!!
    }

@Suppress("ObjectPropertyName")
private var _Command: ImageVector? = null
