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


val Iconsax.Filled.ForwardItem: ImageVector
    get() {
        if (_ForwardItem != null) {
            return _ForwardItem!!
        }
        _ForwardItem = ImageVector.Builder(
            name = "Filled.ForwardItem",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.25f, 5.77f)
                verticalLineTo(9f)
                curveTo(21.25f, 11.115f, 20.543f, 11.899f, 18.631f, 12.007f)
                curveTo(18.355f, 12.022f, 18.131f, 11.796f, 18.131f, 11.52f)
                verticalLineTo(10.38f)
                curveTo(18.131f, 7.26f, 16.74f, 5.87f, 13.62f, 5.87f)
                horizontalLineTo(12.481f)
                curveTo(12.204f, 5.87f, 11.978f, 5.645f, 11.994f, 5.369f)
                curveTo(12.101f, 3.458f, 12.886f, 2.75f, 15f, 2.75f)
                horizontalLineTo(18.23f)
                curveTo(20.521f, 2.75f, 21.25f, 3.48f, 21.25f, 5.77f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.629f, 10.381f)
                verticalLineTo(13.621f)
                curveTo(16.629f, 15.901f, 15.899f, 16.631f, 13.619f, 16.631f)
                horizontalLineTo(10.379f)
                curveTo(8.099f, 16.631f, 7.369f, 15.901f, 7.369f, 13.621f)
                verticalLineTo(10.381f)
                curveTo(7.369f, 8.101f, 8.099f, 7.371f, 10.379f, 7.371f)
                horizontalLineTo(13.619f)
                curveTo(15.899f, 7.371f, 16.629f, 8.101f, 16.629f, 10.381f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.52f, 18.131f)
                curveTo(11.796f, 18.131f, 12.022f, 18.355f, 12.007f, 18.631f)
                curveTo(11.899f, 20.543f, 11.115f, 21.25f, 9f, 21.25f)
                horizontalLineTo(5.77f)
                curveTo(3.48f, 21.25f, 2.75f, 20.521f, 2.75f, 18.23f)
                verticalLineTo(15f)
                curveTo(2.75f, 12.886f, 3.458f, 12.101f, 5.369f, 11.994f)
                curveTo(5.645f, 11.978f, 5.87f, 12.204f, 5.87f, 12.481f)
                verticalLineTo(13.62f)
                curveTo(5.87f, 16.74f, 7.26f, 18.131f, 10.38f, 18.131f)
                horizontalLineTo(11.52f)
                close()
            }
        }.build()

        return _ForwardItem!!
    }

@Suppress("ObjectPropertyName")
private var _ForwardItem: ImageVector? = null
