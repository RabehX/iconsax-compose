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

val Iconsax.Outline.Arrow: ImageVector
    get() {
        if (_Arrow != null) {
            return _Arrow!!
        }
        _Arrow = ImageVector.Builder(
            name = "Outline.Arrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(20f)
                curveTo(11.25f, 19.59f, 11.59f, 19.25f, 12f, 19.25f)
                curveTo(12.41f, 19.25f, 12.75f, 19.59f, 12.75f, 20f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18f)
                verticalLineTo(16f)
                curveTo(11.25f, 15.59f, 11.59f, 15.25f, 12f, 15.25f)
                curveTo(12.41f, 15.25f, 12.75f, 15.59f, 12.75f, 16f)
                verticalLineTo(18f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.75f)
                curveTo(11.59f, 14.75f, 11.25f, 14.41f, 11.25f, 14f)
                verticalLineTo(11f)
                curveTo(11.25f, 6.73f, 14.73f, 3.25f, 19f, 3.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 3.25f, 22.75f, 3.59f, 22.75f, 4f)
                curveTo(22.75f, 4.41f, 22.41f, 4.75f, 22f, 4.75f)
                horizontalLineTo(19f)
                curveTo(15.55f, 4.75f, 12.75f, 7.55f, 12.75f, 11f)
                verticalLineTo(14f)
                curveTo(12.75f, 14.41f, 12.41f, 14.75f, 12f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.75f)
                curveTo(11.59f, 14.75f, 11.25f, 14.41f, 11.25f, 14f)
                verticalLineTo(11f)
                curveTo(11.25f, 7.55f, 8.45f, 4.75f, 5f, 4.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 4.75f, 1.25f, 4.41f, 1.25f, 4f)
                curveTo(1.25f, 3.59f, 1.59f, 3.25f, 2f, 3.25f)
                horizontalLineTo(5f)
                curveTo(9.27f, 3.25f, 12.75f, 6.73f, 12.75f, 11f)
                verticalLineTo(14f)
                curveTo(12.75f, 14.41f, 12.41f, 14.75f, 12f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.999f, 6.75f)
                curveTo(3.809f, 6.75f, 3.619f, 6.68f, 3.469f, 6.53f)
                lineTo(1.469f, 4.53f)
                curveTo(1.179f, 4.24f, 1.179f, 3.76f, 1.469f, 3.47f)
                lineTo(3.469f, 1.47f)
                curveTo(3.759f, 1.18f, 4.24f, 1.18f, 4.53f, 1.47f)
                curveTo(4.82f, 1.76f, 4.82f, 2.24f, 4.53f, 2.53f)
                lineTo(3.059f, 4f)
                lineTo(4.53f, 5.47f)
                curveTo(4.82f, 5.76f, 4.82f, 6.24f, 4.53f, 6.53f)
                curveTo(4.38f, 6.68f, 4.189f, 6.75f, 3.999f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 6.75f)
                curveTo(19.809f, 6.75f, 19.619f, 6.68f, 19.469f, 6.53f)
                curveTo(19.18f, 6.24f, 19.18f, 5.76f, 19.469f, 5.47f)
                lineTo(20.94f, 4f)
                lineTo(19.469f, 2.53f)
                curveTo(19.18f, 2.24f, 19.18f, 1.76f, 19.469f, 1.47f)
                curveTo(19.76f, 1.18f, 20.24f, 1.18f, 20.529f, 1.47f)
                lineTo(22.529f, 3.47f)
                curveTo(22.819f, 3.76f, 22.819f, 4.24f, 22.529f, 4.53f)
                lineTo(20.529f, 6.53f)
                curveTo(20.379f, 6.68f, 20.19f, 6.75f, 20f, 6.75f)
                close()
            }
        }.build()

        return _Arrow!!
    }

@Suppress("ObjectPropertyName")
private var _Arrow: ImageVector? = null
