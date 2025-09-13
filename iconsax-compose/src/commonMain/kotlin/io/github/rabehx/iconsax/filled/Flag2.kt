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


val Iconsax.Filled.Flag2: ImageVector
    get() {
        if (_Flag2 != null) {
            return _Flag2!!
        }
        _Flag2 = ImageVector.Builder(
            name = "Filled.Flag2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.199f, 7.16f)
                lineTo(7.199f, 3.7f)
                verticalLineTo(2.75f)
                curveTo(7.199f, 2.34f, 6.859f, 2f, 6.449f, 2f)
                curveTo(6.039f, 2f, 5.699f, 2.34f, 5.699f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(5.699f, 21.66f, 6.039f, 22f, 6.449f, 22f)
                curveTo(6.859f, 22f, 7.199f, 21.66f, 7.199f, 21.25f)
                verticalLineTo(17.29f)
                lineTo(15.419f, 13.23f)
                curveTo(15.419f, 13.23f, 15.419f, 13.23f, 15.429f, 13.23f)
                curveTo(17.089f, 12.37f, 17.979f, 11.26f, 17.929f, 10.09f)
                curveTo(17.879f, 8.92f, 16.909f, 7.88f, 15.199f, 7.16f)
                close()
            }
        }.build()

        return _Flag2!!
    }

@Suppress("ObjectPropertyName")
private var _Flag2: ImageVector? = null
