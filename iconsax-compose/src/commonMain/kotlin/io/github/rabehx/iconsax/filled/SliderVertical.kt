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


val Iconsax.Filled.SliderVertical: ImageVector
    get() {
        if (_SliderVertical != null) {
            return _SliderVertical!!
        }
        _SliderVertical = ImageVector.Builder(
            name = "Filled.SliderVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 7.34f, 20.66f, 6f, 19f, 6f)
                horizontalLineTo(5f)
                curveTo(3.34f, 6f, 2f, 7.34f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 16.66f, 3.34f, 18f, 5f, 18f)
                horizontalLineTo(19f)
                curveTo(20.66f, 18f, 22f, 16.66f, 22f, 15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.929f, 19.5f)
                horizontalLineTo(18.069f)
                curveTo(18.389f, 19.5f, 18.619f, 19.79f, 18.559f, 20.1f)
                curveTo(18.289f, 21.58f, 17.419f, 22f, 15.329f, 22f)
                horizontalLineTo(8.669f)
                curveTo(6.569f, 22f, 5.709f, 21.58f, 5.439f, 20.1f)
                curveTo(5.379f, 19.79f, 5.609f, 19.5f, 5.929f, 19.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.669f, 2f)
                horizontalLineTo(15.329f)
                curveTo(17.429f, 2f, 18.289f, 2.42f, 18.559f, 3.9f)
                curveTo(18.619f, 4.21f, 18.379f, 4.5f, 18.069f, 4.5f)
                horizontalLineTo(5.929f)
                curveTo(5.609f, 4.5f, 5.379f, 4.21f, 5.439f, 3.9f)
                curveTo(5.709f, 2.42f, 6.569f, 2f, 8.669f, 2f)
                close()
            }
        }.build()

        return _SliderVertical!!
    }

@Suppress("ObjectPropertyName")
private var _SliderVertical: ImageVector? = null
