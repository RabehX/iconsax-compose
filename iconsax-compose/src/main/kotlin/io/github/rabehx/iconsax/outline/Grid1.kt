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

val Iconsax.Outline.Grid1: ImageVector
    get() {
        if (_Grid1 != null) {
            return _Grid1!!
        }
        _Grid1 = ImageVector.Builder(
            name = "Outline.Grid1",
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
                moveTo(21.999f, 9.25f)
                horizontalLineTo(2.029f)
                curveTo(1.619f, 9.25f, 1.279f, 8.91f, 1.279f, 8.5f)
                curveTo(1.279f, 8.09f, 1.619f, 7.75f, 2.029f, 7.75f)
                horizontalLineTo(21.999f)
                curveTo(22.409f, 7.75f, 22.749f, 8.09f, 22.749f, 8.5f)
                curveTo(22.749f, 8.91f, 22.409f, 9.25f, 21.999f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.999f, 16.25f)
                horizontalLineTo(2.029f)
                curveTo(1.619f, 16.25f, 1.279f, 15.91f, 1.279f, 15.5f)
                curveTo(1.279f, 15.09f, 1.619f, 14.75f, 2.029f, 14.75f)
                horizontalLineTo(21.999f)
                curveTo(22.409f, 14.75f, 22.749f, 15.09f, 22.749f, 15.5f)
                curveTo(22.749f, 15.91f, 22.409f, 16.25f, 21.999f, 16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.51f, 22.74f)
                curveTo(8.1f, 22.74f, 7.76f, 22.4f, 7.76f, 21.99f)
                verticalLineTo(2.01f)
                curveTo(7.76f, 1.6f, 8.1f, 1.26f, 8.51f, 1.26f)
                curveTo(8.92f, 1.26f, 9.26f, 1.6f, 9.26f, 2.01f)
                verticalLineTo(21.98f)
                curveTo(9.26f, 22.4f, 8.93f, 22.74f, 8.51f, 22.74f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.51f, 22.74f)
                curveTo(15.1f, 22.74f, 14.76f, 22.4f, 14.76f, 21.99f)
                verticalLineTo(2.01f)
                curveTo(14.76f, 1.6f, 15.1f, 1.26f, 15.51f, 1.26f)
                curveTo(15.92f, 1.26f, 16.26f, 1.6f, 16.26f, 2.01f)
                verticalLineTo(21.98f)
                curveTo(16.26f, 22.4f, 15.93f, 22.74f, 15.51f, 22.74f)
                close()
            }
        }.build()

        return _Grid1!!
    }

@Suppress("ObjectPropertyName")
private var _Grid1: ImageVector? = null
