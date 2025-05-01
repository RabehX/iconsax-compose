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

val Iconsax.Filled.Alarm: ImageVector
    get() {
        if (_Alarm != null) {
            return _Alarm!!
        }
        _Alarm = ImageVector.Builder(
            name = "Filled.Alarm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 21.25f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                curveTo(21f, 10.03f, 16.97f, 6f, 12f, 6f)
                curveTo(7.03f, 6f, 3f, 10.03f, 3f, 15f)
                verticalLineTo(21.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 21.25f, 1.25f, 21.59f, 1.25f, 22f)
                curveTo(1.25f, 22.41f, 1.59f, 22.75f, 2f, 22.75f)
                horizontalLineTo(22f)
                curveTo(22.41f, 22.75f, 22.75f, 22.41f, 22.75f, 22f)
                curveTo(22.75f, 21.59f, 22.41f, 21.25f, 22f, 21.25f)
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
                moveTo(5.001f, 5.751f)
                curveTo(4.811f, 5.751f, 4.621f, 5.681f, 4.471f, 5.531f)
                lineTo(3.471f, 4.531f)
                curveTo(3.181f, 4.241f, 3.181f, 3.761f, 3.471f, 3.471f)
                curveTo(3.761f, 3.181f, 4.241f, 3.181f, 4.531f, 3.471f)
                lineTo(5.531f, 4.471f)
                curveTo(5.821f, 4.761f, 5.821f, 5.241f, 5.531f, 5.531f)
                curveTo(5.381f, 5.681f, 5.191f, 5.751f, 5.001f, 5.751f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.001f, 5.751f)
                curveTo(18.811f, 5.751f, 18.621f, 5.681f, 18.471f, 5.531f)
                curveTo(18.181f, 5.241f, 18.181f, 4.761f, 18.471f, 4.471f)
                lineTo(19.471f, 3.471f)
                curveTo(19.761f, 3.181f, 20.241f, 3.181f, 20.531f, 3.471f)
                curveTo(20.821f, 3.761f, 20.821f, 4.241f, 20.531f, 4.531f)
                lineTo(19.531f, 5.531f)
                curveTo(19.381f, 5.681f, 19.191f, 5.751f, 19.001f, 5.751f)
                close()
            }
        }.build()

        return _Alarm!!
    }

@Suppress("ObjectPropertyName")
private var _Alarm: ImageVector? = null
