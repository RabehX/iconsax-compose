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


val Iconsax.Filled.Timer1: ImageVector
    get() {
        if (_Timer1 != null) {
            return _Timer1!!
        }
        _Timer1 = ImageVector.Builder(
            name = "Filled.Timer1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 4.648f)
                curveTo(7.22f, 4.648f, 3.33f, 8.538f, 3.33f, 13.318f)
                curveTo(3.33f, 18.098f, 7.22f, 21.998f, 12f, 21.998f)
                curveTo(16.78f, 21.998f, 20.67f, 18.108f, 20.67f, 13.328f)
                curveTo(20.67f, 8.548f, 16.78f, 4.648f, 12f, 4.648f)
                close()
                moveTo(12.75f, 12.998f)
                curveTo(12.75f, 13.408f, 12.41f, 13.748f, 12f, 13.748f)
                curveTo(11.59f, 13.748f, 11.25f, 13.408f, 11.25f, 12.998f)
                verticalLineTo(7.998f)
                curveTo(11.25f, 7.588f, 11.59f, 7.248f, 12f, 7.248f)
                curveTo(12.41f, 7.248f, 12.75f, 7.588f, 12.75f, 7.998f)
                verticalLineTo(12.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.891f, 3.45f)
                horizontalLineTo(9.111f)
                curveTo(8.711f, 3.45f, 8.391f, 3.13f, 8.391f, 2.73f)
                curveTo(8.391f, 2.33f, 8.711f, 2f, 9.111f, 2f)
                horizontalLineTo(14.891f)
                curveTo(15.291f, 2f, 15.611f, 2.32f, 15.611f, 2.72f)
                curveTo(15.611f, 3.12f, 15.291f, 3.45f, 14.891f, 3.45f)
                close()
            }
        }.build()

        return _Timer1!!
    }

@Suppress("ObjectPropertyName")
private var _Timer1: ImageVector? = null
