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


val Iconsax.Filled.Lamp: ImageVector
    get() {
        if (_Lamp != null) {
            return _Lamp!!
        }
        _Lamp = ImageVector.Builder(
            name = "Filled.Lamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.431f, 11.78f)
                lineTo(18.231f, 3.7f)
                curveTo(17.981f, 2.77f, 16.971f, 2f, 16.011f, 2f)
                horizontalLineTo(7.991f)
                curveTo(7.031f, 2f, 6.021f, 2.77f, 5.771f, 3.7f)
                lineTo(3.571f, 11.78f)
                curveTo(3.131f, 13.38f, 4.131f, 14.69f, 5.791f, 14.69f)
                horizontalLineTo(11.251f)
                verticalLineTo(20.5f)
                horizontalLineTo(8.001f)
                curveTo(7.591f, 20.5f, 7.251f, 20.84f, 7.251f, 21.25f)
                curveTo(7.251f, 21.66f, 7.591f, 22f, 8.001f, 22f)
                horizontalLineTo(16.001f)
                curveTo(16.411f, 22f, 16.751f, 21.66f, 16.751f, 21.25f)
                curveTo(16.751f, 20.84f, 16.411f, 20.5f, 16.001f, 20.5f)
                horizontalLineTo(12.751f)
                verticalLineTo(14.69f)
                horizontalLineTo(18.211f)
                curveTo(19.871f, 14.69f, 20.871f, 13.38f, 20.431f, 11.78f)
                close()
            }
        }.build()

        return _Lamp!!
    }

@Suppress("ObjectPropertyName")
private var _Lamp: ImageVector? = null
