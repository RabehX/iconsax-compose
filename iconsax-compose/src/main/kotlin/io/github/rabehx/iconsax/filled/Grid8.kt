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


val Iconsax.Filled.Grid8: ImageVector
    get() {
        if (_Grid8 != null) {
            return _Grid8!!
        }
        _Grid8 = ImageVector.Builder(
            name = "Filled.Grid8",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 7.811f)
                verticalLineTo(11.251f)
                horizontalLineTo(16.75f)
                verticalLineTo(2.031f)
                curveTo(20.05f, 2.231f, 22f, 4.361f, 22f, 7.811f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 12.75f)
                verticalLineTo(16.19f)
                curveTo(22f, 19.64f, 20.05f, 21.77f, 16.75f, 21.97f)
                verticalLineTo(12.75f)
                horizontalLineTo(22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.25f, 12.75f)
                verticalLineTo(21.97f)
                curveTo(3.95f, 21.77f, 2f, 19.64f, 2f, 16.19f)
                verticalLineTo(12.75f)
                horizontalLineTo(7.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.25f, 2.031f)
                verticalLineTo(11.251f)
                horizontalLineTo(2f)
                verticalLineTo(7.811f)
                curveTo(2f, 4.361f, 3.95f, 2.231f, 7.25f, 2.031f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.25f, 2f)
                horizontalLineTo(8.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(15.25f)
                verticalLineTo(2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.25f, 12.75f)
                horizontalLineTo(8.75f)
                verticalLineTo(22f)
                horizontalLineTo(15.25f)
                verticalLineTo(12.75f)
                close()
            }
        }.build()

        return _Grid8!!
    }

@Suppress("ObjectPropertyName")
private var _Grid8: ImageVector? = null
