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


val Iconsax.Filled.SliderHorizontal: ImageVector
    get() {
        if (_SliderHorizontal != null) {
            return _SliderHorizontal!!
        }
        _SliderHorizontal = ImageVector.Builder(
            name = "Filled.SliderHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 22f)
                horizontalLineTo(15f)
                curveTo(16.66f, 22f, 18f, 20.66f, 18f, 19f)
                verticalLineTo(5f)
                curveTo(18f, 3.34f, 16.66f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(7.34f, 2f, 6f, 3.34f, 6f, 5f)
                verticalLineTo(19f)
                curveTo(6f, 20.66f, 7.34f, 22f, 9f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.5f, 5.929f)
                verticalLineTo(18.069f)
                curveTo(4.5f, 18.389f, 4.21f, 18.619f, 3.9f, 18.559f)
                curveTo(2.42f, 18.289f, 2f, 17.429f, 2f, 15.329f)
                verticalLineTo(8.669f)
                curveTo(2f, 6.569f, 2.42f, 5.709f, 3.9f, 5.439f)
                curveTo(4.21f, 5.379f, 4.5f, 5.609f, 4.5f, 5.929f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 8.669f)
                verticalLineTo(15.329f)
                curveTo(22f, 17.429f, 21.58f, 18.289f, 20.1f, 18.559f)
                curveTo(19.79f, 18.619f, 19.5f, 18.379f, 19.5f, 18.069f)
                verticalLineTo(5.929f)
                curveTo(19.5f, 5.609f, 19.79f, 5.379f, 20.1f, 5.439f)
                curveTo(21.58f, 5.709f, 22f, 6.569f, 22f, 8.669f)
                close()
            }
        }.build()

        return _SliderHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _SliderHorizontal: ImageVector? = null
