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

val Iconsax.Filled.ArrowBottom: ImageVector
    get() {
        if (_ArrowBottom != null) {
            return _ArrowBottom!!
        }
        _ArrowBottom = ImageVector.Builder(
            name = "Filled.ArrowBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.329f, 6f)
                horizontalLineTo(14.669f)
                curveTo(17.989f, 6f, 19.339f, 8.35f, 17.689f, 11.22f)
                lineTo(16.949f, 12.5f)
                curveTo(16.769f, 12.81f, 16.439f, 13f, 16.079f, 13f)
                horizontalLineTo(7.919f)
                curveTo(7.559f, 13f, 7.229f, 12.81f, 7.049f, 12.5f)
                lineTo(6.309f, 11.22f)
                curveTo(4.659f, 8.35f, 6.009f, 6f, 9.329f, 6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.792f, 14f)
                horizontalLineTo(15.222f)
                curveTo(15.611f, 14f, 15.851f, 14.42f, 15.651f, 14.75f)
                lineTo(15.012f, 15.85f)
                curveTo(13.361f, 18.72f, 10.642f, 18.72f, 8.992f, 15.85f)
                lineTo(8.352f, 14.75f)
                curveTo(8.162f, 14.42f, 8.402f, 14f, 8.792f, 14f)
                close()
            }
        }.build()

        return _ArrowBottom!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottom: ImageVector? = null
