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


val Iconsax.Filled.Diamonds: ImageVector
    get() {
        if (_Diamonds != null) {
            return _Diamonds!!
        }
        _Diamonds = ImageVector.Builder(
            name = "Filled.Diamonds",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.77f, 9.798f)
                lineTo(20.97f, 7.998f)
                lineTo(19.21f, 4.038f)
                curveTo(18.74f, 2.998f, 18f, 2.148f, 16.3f, 2.148f)
                horizontalLineTo(7.7f)
                curveTo(6f, 2.148f, 5.26f, 2.998f, 4.79f, 4.038f)
                lineTo(3.03f, 7.998f)
                lineTo(2.23f, 9.798f)
                curveTo(1.77f, 10.848f, 2.02f, 12.388f, 2.79f, 13.238f)
                lineTo(9.64f, 20.778f)
                curveTo(10.94f, 22.208f, 13.06f, 22.208f, 14.36f, 20.778f)
                lineTo(21.21f, 13.238f)
                curveTo(21.98f, 12.388f, 22.23f, 10.848f, 21.77f, 9.798f)
                close()
            }
        }.build()

        return _Diamonds!!
    }

@Suppress("ObjectPropertyName")
private var _Diamonds: ImageVector? = null
