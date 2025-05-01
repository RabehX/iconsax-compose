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

val Iconsax.Filled.ArrowLeft: ImageVector
    get() {
        if (_ArrowLeft != null) {
            return _ArrowLeft!!
        }
        _ArrowLeft = ImageVector.Builder(
            name = "Filled.ArrowLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 9.329f)
                verticalLineTo(14.669f)
                curveTo(18f, 17.989f, 15.65f, 19.339f, 12.78f, 17.689f)
                lineTo(11.5f, 16.949f)
                curveTo(11.19f, 16.769f, 11f, 16.439f, 11f, 16.079f)
                verticalLineTo(7.919f)
                curveTo(11f, 7.559f, 11.19f, 7.229f, 11.5f, 7.049f)
                lineTo(12.78f, 6.309f)
                curveTo(15.65f, 4.659f, 18f, 6.009f, 18f, 9.329f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.999f, 8.792f)
                verticalLineTo(15.222f)
                curveTo(9.999f, 15.611f, 9.579f, 15.851f, 9.249f, 15.651f)
                lineTo(8.149f, 15.012f)
                curveTo(5.279f, 13.361f, 5.279f, 10.642f, 8.149f, 8.992f)
                lineTo(9.249f, 8.352f)
                curveTo(9.579f, 8.162f, 9.999f, 8.402f, 9.999f, 8.792f)
                close()
            }
        }.build()

        return _ArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeft: ImageVector? = null
