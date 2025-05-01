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

val Iconsax.Outline.Alarm: ImageVector
    get() {
        if (_Alarm != null) {
            return _Alarm!!
        }
        _Alarm = ImageVector.Builder(
            name = "Outline.Alarm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 22.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 22.75f, 1.25f, 22.41f, 1.25f, 22f)
                curveTo(1.25f, 21.59f, 1.59f, 21.25f, 2f, 21.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 21.25f, 22.75f, 21.59f, 22.75f, 22f)
                curveTo(22.75f, 22.41f, 22.41f, 22.75f, 22f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 22.75f)
                horizontalLineTo(3f)
                curveTo(2.59f, 22.75f, 2.25f, 22.41f, 2.25f, 22f)
                verticalLineTo(15f)
                curveTo(2.25f, 9.62f, 6.62f, 5.25f, 12f, 5.25f)
                curveTo(17.38f, 5.25f, 21.75f, 9.62f, 21.75f, 15f)
                verticalLineTo(22f)
                curveTo(21.75f, 22.41f, 21.41f, 22.75f, 21f, 22.75f)
                close()
                moveTo(3.75f, 21.25f)
                horizontalLineTo(20.25f)
                verticalLineTo(15f)
                curveTo(20.25f, 10.45f, 16.55f, 6.75f, 12f, 6.75f)
                curveTo(7.45f, 6.75f, 3.75f, 10.45f, 3.75f, 15f)
                verticalLineTo(21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 3.75f)
                curveTo(11.59f, 3.75f, 11.25f, 3.41f, 11.25f, 3f)
                verticalLineTo(2f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                verticalLineTo(3f)
                curveTo(12.75f, 3.41f, 12.41f, 3.75f, 12f, 3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.999f, 5.75f)
                curveTo(4.809f, 5.75f, 4.619f, 5.68f, 4.469f, 5.53f)
                lineTo(3.469f, 4.53f)
                curveTo(3.179f, 4.24f, 3.179f, 3.76f, 3.469f, 3.47f)
                curveTo(3.759f, 3.18f, 4.239f, 3.18f, 4.529f, 3.47f)
                lineTo(5.529f, 4.47f)
                curveTo(5.819f, 4.76f, 5.819f, 5.24f, 5.529f, 5.53f)
                curveTo(5.379f, 5.68f, 5.189f, 5.75f, 4.999f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 5.75f)
                curveTo(18.809f, 5.75f, 18.619f, 5.68f, 18.469f, 5.53f)
                curveTo(18.18f, 5.24f, 18.18f, 4.76f, 18.469f, 4.47f)
                lineTo(19.469f, 3.47f)
                curveTo(19.76f, 3.18f, 20.24f, 3.18f, 20.529f, 3.47f)
                curveTo(20.819f, 3.76f, 20.819f, 4.24f, 20.529f, 4.53f)
                lineTo(19.529f, 5.53f)
                curveTo(19.379f, 5.68f, 19.19f, 5.75f, 19f, 5.75f)
                close()
            }
        }.build()

        return _Alarm!!
    }

@Suppress("ObjectPropertyName")
private var _Alarm: ImageVector? = null
