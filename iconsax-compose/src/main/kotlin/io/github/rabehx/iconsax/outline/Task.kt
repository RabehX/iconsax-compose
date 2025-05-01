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

val Iconsax.Outline.Task: ImageVector
    get() {
        if (_Task != null) {
            return _Task!!
        }
        _Task = ImageVector.Builder(
            name = "Outline.Task",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 20.25f)
                horizontalLineTo(11f)
                curveTo(10.59f, 20.25f, 10.25f, 19.91f, 10.25f, 19.5f)
                curveTo(10.25f, 19.09f, 10.59f, 18.75f, 11f, 18.75f)
                horizontalLineTo(21f)
                curveTo(21.41f, 18.75f, 21.75f, 19.09f, 21.75f, 19.5f)
                curveTo(21.75f, 19.91f, 21.41f, 20.25f, 21f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 13.25f)
                horizontalLineTo(11f)
                curveTo(10.59f, 13.25f, 10.25f, 12.91f, 10.25f, 12.5f)
                curveTo(10.25f, 12.09f, 10.59f, 11.75f, 11f, 11.75f)
                horizontalLineTo(21f)
                curveTo(21.41f, 11.75f, 21.75f, 12.09f, 21.75f, 12.5f)
                curveTo(21.75f, 12.91f, 21.41f, 13.25f, 21f, 13.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 6.25f)
                horizontalLineTo(11f)
                curveTo(10.59f, 6.25f, 10.25f, 5.91f, 10.25f, 5.5f)
                curveTo(10.25f, 5.09f, 10.59f, 4.75f, 11f, 4.75f)
                horizontalLineTo(21f)
                curveTo(21.41f, 4.75f, 21.75f, 5.09f, 21.75f, 5.5f)
                curveTo(21.75f, 5.91f, 21.41f, 6.25f, 21f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.999f, 7.25f)
                curveTo(3.809f, 7.25f, 3.619f, 7.18f, 3.469f, 7.03f)
                lineTo(2.469f, 6.03f)
                curveTo(2.179f, 5.74f, 2.179f, 5.26f, 2.469f, 4.97f)
                curveTo(2.759f, 4.68f, 3.239f, 4.68f, 3.529f, 4.97f)
                lineTo(3.999f, 5.44f)
                lineTo(6.469f, 2.97f)
                curveTo(6.759f, 2.68f, 7.239f, 2.68f, 7.529f, 2.97f)
                curveTo(7.819f, 3.26f, 7.819f, 3.74f, 7.529f, 4.03f)
                lineTo(4.529f, 7.03f)
                curveTo(4.379f, 7.18f, 4.189f, 7.25f, 3.999f, 7.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.999f, 14.25f)
                curveTo(3.809f, 14.25f, 3.619f, 14.18f, 3.469f, 14.03f)
                lineTo(2.469f, 13.03f)
                curveTo(2.179f, 12.74f, 2.179f, 12.26f, 2.469f, 11.97f)
                curveTo(2.759f, 11.68f, 3.239f, 11.68f, 3.529f, 11.97f)
                lineTo(3.999f, 12.44f)
                lineTo(6.469f, 9.97f)
                curveTo(6.759f, 9.68f, 7.239f, 9.68f, 7.529f, 9.97f)
                curveTo(7.819f, 10.26f, 7.819f, 10.74f, 7.529f, 11.03f)
                lineTo(4.529f, 14.03f)
                curveTo(4.379f, 14.18f, 4.189f, 14.25f, 3.999f, 14.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.999f, 21.25f)
                curveTo(3.809f, 21.25f, 3.619f, 21.18f, 3.469f, 21.03f)
                lineTo(2.469f, 20.03f)
                curveTo(2.179f, 19.74f, 2.179f, 19.26f, 2.469f, 18.97f)
                curveTo(2.759f, 18.68f, 3.239f, 18.68f, 3.529f, 18.97f)
                lineTo(3.999f, 19.44f)
                lineTo(6.469f, 16.97f)
                curveTo(6.759f, 16.68f, 7.239f, 16.68f, 7.529f, 16.97f)
                curveTo(7.819f, 17.26f, 7.819f, 17.74f, 7.529f, 18.03f)
                lineTo(4.529f, 21.03f)
                curveTo(4.379f, 21.18f, 4.189f, 21.25f, 3.999f, 21.25f)
                close()
            }
        }.build()

        return _Task!!
    }

@Suppress("ObjectPropertyName")
private var _Task: ImageVector? = null
