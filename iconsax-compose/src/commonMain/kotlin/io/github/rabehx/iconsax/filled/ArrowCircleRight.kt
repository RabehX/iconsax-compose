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

val Iconsax.Filled.ArrowCircleRight: ImageVector
    get() {
        if (_ArrowCircleRight != null) {
            return _ArrowCircleRight!!
        }
        _ArrowCircleRight = ImageVector.Builder(
            name = "Filled.ArrowCircleRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                curveTo(2f, 17.51f, 6.49f, 22f, 12f, 22f)
                curveTo(17.51f, 22f, 22f, 17.51f, 22f, 12f)
                curveTo(22f, 6.49f, 17.51f, 2f, 12f, 2f)
                close()
                moveTo(14.79f, 12.53f)
                lineTo(11.26f, 16.06f)
                curveTo(11.11f, 16.21f, 10.92f, 16.28f, 10.73f, 16.28f)
                curveTo(10.54f, 16.28f, 10.35f, 16.21f, 10.2f, 16.06f)
                curveTo(9.91f, 15.77f, 9.91f, 15.29f, 10.2f, 15f)
                lineTo(13.2f, 12f)
                lineTo(10.2f, 9f)
                curveTo(9.91f, 8.71f, 9.91f, 8.23f, 10.2f, 7.94f)
                curveTo(10.49f, 7.65f, 10.97f, 7.65f, 11.26f, 7.94f)
                lineTo(14.79f, 11.47f)
                curveTo(15.09f, 11.76f, 15.09f, 12.24f, 14.79f, 12.53f)
                close()
            }
        }.build()

        return _ArrowCircleRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCircleRight: ImageVector? = null
