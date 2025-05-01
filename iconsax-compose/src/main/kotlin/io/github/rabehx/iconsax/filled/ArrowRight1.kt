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

val Iconsax.Filled.ArrowRight1: ImageVector
    get() {
        if (_ArrowRight1 != null) {
            return _ArrowRight1!!
        }
        _ArrowRight1 = ImageVector.Builder(
            name = "Filled.ArrowRight1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 9.329f)
                verticalLineTo(14.669f)
                curveTo(6f, 17.989f, 8.35f, 19.339f, 11.22f, 17.689f)
                lineTo(12.5f, 16.949f)
                curveTo(12.81f, 16.769f, 13f, 16.439f, 13f, 16.079f)
                verticalLineTo(7.919f)
                curveTo(13f, 7.559f, 12.81f, 7.229f, 12.5f, 7.049f)
                lineTo(11.22f, 6.309f)
                curveTo(8.35f, 4.659f, 6f, 6.009f, 6f, 9.329f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 8.792f)
                verticalLineTo(15.222f)
                curveTo(14f, 15.611f, 14.42f, 15.851f, 14.75f, 15.651f)
                lineTo(15.85f, 15.012f)
                curveTo(18.72f, 13.361f, 18.72f, 10.642f, 15.85f, 8.992f)
                lineTo(14.75f, 8.352f)
                curveTo(14.42f, 8.162f, 14f, 8.402f, 14f, 8.792f)
                close()
            }
        }.build()

        return _ArrowRight1!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight1: ImageVector? = null
