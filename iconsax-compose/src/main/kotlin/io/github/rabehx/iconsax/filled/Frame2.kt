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


val Iconsax.Filled.Frame2: ImageVector
    get() {
        if (_Frame2 != null) {
            return _Frame2!!
        }
        _Frame2 = ImageVector.Builder(
            name = "Filled.Frame2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 8f)
                curveTo(20.657f, 8f, 22f, 6.657f, 22f, 5f)
                curveTo(22f, 3.343f, 20.657f, 2f, 19f, 2f)
                curveTo(17.343f, 2f, 16f, 3.343f, 16f, 5f)
                curveTo(16f, 6.657f, 17.343f, 8f, 19f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.789f, 9.339f)
                curveTo(16.279f, 8.939f, 15.059f, 7.719f, 14.659f, 6.209f)
                curveTo(14.399f, 5.249f, 14.459f, 4.329f, 14.749f, 3.509f)
                curveTo(14.949f, 2.949f, 14.609f, 2.329f, 14.029f, 2.209f)
                curveTo(12.559f, 1.899f, 10.969f, 1.909f, 9.309f, 2.359f)
                curveTo(5.529f, 3.419f, 2.639f, 6.689f, 2.099f, 10.579f)
                curveTo(1.179f, 17.199f, 6.789f, 22.809f, 13.409f, 21.899f)
                curveTo(17.309f, 21.359f, 20.569f, 18.469f, 21.619f, 14.679f)
                curveTo(22.079f, 13.029f, 22.089f, 11.439f, 21.779f, 9.959f)
                curveTo(21.659f, 9.379f, 21.039f, 9.049f, 20.479f, 9.239f)
                curveTo(19.669f, 9.529f, 18.749f, 9.589f, 17.789f, 9.339f)
                close()
            }
        }.build()

        return _Frame2!!
    }

@Suppress("ObjectPropertyName")
private var _Frame2: ImageVector? = null
