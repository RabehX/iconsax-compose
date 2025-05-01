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

val Iconsax.Outline.Maximize4: ImageVector
    get() {
        if (_Maximize4 != null) {
            return _Maximize4!!
        }
        _Maximize4 = ImageVector.Builder(
            name = "Outline.Maximize4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 9.75f)
                curveTo(20.59f, 9.75f, 20.25f, 9.41f, 20.25f, 9f)
                verticalLineTo(3.75f)
                horizontalLineTo(15f)
                curveTo(14.59f, 3.75f, 14.25f, 3.41f, 14.25f, 3f)
                curveTo(14.25f, 2.59f, 14.59f, 2.25f, 15f, 2.25f)
                horizontalLineTo(21f)
                curveTo(21.41f, 2.25f, 21.75f, 2.59f, 21.75f, 3f)
                verticalLineTo(9f)
                curveTo(21.75f, 9.41f, 21.41f, 9.75f, 21f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 21.75f)
                horizontalLineTo(3f)
                curveTo(2.59f, 21.75f, 2.25f, 21.41f, 2.25f, 21f)
                verticalLineTo(15f)
                curveTo(2.25f, 14.59f, 2.59f, 14.25f, 3f, 14.25f)
                curveTo(3.41f, 14.25f, 3.75f, 14.59f, 3.75f, 15f)
                verticalLineTo(20.25f)
                horizontalLineTo(9f)
                curveTo(9.41f, 20.25f, 9.75f, 20.59f, 9.75f, 21f)
                curveTo(9.75f, 21.41f, 9.41f, 21.75f, 9f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.5f, 11.25f)
                curveTo(13.309f, 11.25f, 13.12f, 11.18f, 12.969f, 11.03f)
                curveTo(12.679f, 10.74f, 12.679f, 10.26f, 12.969f, 9.97f)
                lineTo(20.469f, 2.47f)
                curveTo(20.76f, 2.18f, 21.24f, 2.18f, 21.529f, 2.47f)
                curveTo(21.819f, 2.76f, 21.819f, 3.24f, 21.529f, 3.53f)
                lineTo(14.03f, 11.03f)
                curveTo(13.88f, 11.18f, 13.689f, 11.25f, 13.5f, 11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.999f, 21.75f)
                curveTo(2.809f, 21.75f, 2.619f, 21.68f, 2.469f, 21.53f)
                curveTo(2.179f, 21.24f, 2.179f, 20.76f, 2.469f, 20.47f)
                lineTo(9.969f, 12.97f)
                curveTo(10.259f, 12.68f, 10.74f, 12.68f, 11.03f, 12.97f)
                curveTo(11.319f, 13.26f, 11.319f, 13.74f, 11.03f, 14.03f)
                lineTo(3.529f, 21.53f)
                curveTo(3.379f, 21.68f, 3.189f, 21.75f, 2.999f, 21.75f)
                close()
            }
        }.build()

        return _Maximize4!!
    }

@Suppress("ObjectPropertyName")
private var _Maximize4: ImageVector? = null
