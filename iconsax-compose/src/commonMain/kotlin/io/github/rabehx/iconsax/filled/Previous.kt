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


val Iconsax.Filled.Previous: ImageVector
    get() {
        if (_Previous != null) {
            return _Previous!!
        }
        _Previous = ImageVector.Builder(
            name = "Filled.Previous",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.241f, 7.22f)
                verticalLineTo(16.79f)
                curveTo(20.241f, 18.75f, 18.111f, 19.98f, 16.411f, 19f)
                lineTo(12.261f, 16.61f)
                lineTo(8.111f, 14.21f)
                curveTo(6.411f, 13.23f, 6.411f, 10.78f, 8.111f, 9.8f)
                lineTo(12.261f, 7.4f)
                lineTo(16.411f, 5.01f)
                curveTo(18.111f, 4.03f, 20.241f, 5.25f, 20.241f, 7.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.762f, 18.93f)
                curveTo(3.352f, 18.93f, 3.012f, 18.59f, 3.012f, 18.18f)
                verticalLineTo(5.82f)
                curveTo(3.012f, 5.41f, 3.352f, 5.07f, 3.762f, 5.07f)
                curveTo(4.172f, 5.07f, 4.512f, 5.41f, 4.512f, 5.82f)
                verticalLineTo(18.18f)
                curveTo(4.512f, 18.59f, 4.172f, 18.93f, 3.762f, 18.93f)
                close()
            }
        }.build()

        return _Previous!!
    }

@Suppress("ObjectPropertyName")
private var _Previous: ImageVector? = null
