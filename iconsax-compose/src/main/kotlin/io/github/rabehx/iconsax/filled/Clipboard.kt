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


val Iconsax.Filled.Clipboard: ImageVector
    get() {
        if (_Clipboard != null) {
            return _Clipboard!!
        }
        _Clipboard = ImageVector.Builder(
            name = "Filled.Clipboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.89f, 2.878f)
                lineTo(9.2f, 2.138f)
                curveTo(5.29f, 1.528f, 3.48f, 2.848f, 2.86f, 6.758f)
                lineTo(2.12f, 11.448f)
                curveTo(1.72f, 14.008f, 2.14f, 15.668f, 3.59f, 16.678f)
                curveTo(4.35f, 17.218f, 5.39f, 17.578f, 6.74f, 17.788f)
                lineTo(11.43f, 18.528f)
                curveTo(15.34f, 19.138f, 17.15f, 17.818f, 17.77f, 13.908f)
                lineTo(18.5f, 9.218f)
                curveTo(18.62f, 8.448f, 18.67f, 7.758f, 18.63f, 7.148f)
                curveTo(18.5f, 4.648f, 17.03f, 3.368f, 13.89f, 2.878f)
                close()
                moveTo(8.24f, 9.348f)
                curveTo(7.07f, 9.348f, 6.12f, 8.398f, 6.12f, 7.238f)
                curveTo(6.12f, 6.068f, 7.07f, 5.118f, 8.24f, 5.118f)
                curveTo(9.4f, 5.118f, 10.35f, 6.068f, 10.35f, 7.238f)
                curveTo(10.35f, 8.398f, 9.4f, 9.348f, 8.24f, 9.348f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.501f, 13.469f)
                lineTo(19.001f, 17.979f)
                curveTo(17.751f, 21.739f, 15.751f, 22.739f, 11.991f, 21.489f)
                lineTo(7.481f, 19.989f)
                curveTo(6.071f, 19.519f, 5.051f, 18.939f, 4.391f, 18.209f)
                curveTo(5.021f, 18.459f, 5.751f, 18.649f, 6.581f, 18.779f)
                lineTo(11.281f, 19.519f)
                curveTo(11.921f, 19.619f, 12.521f, 19.669f, 13.081f, 19.669f)
                curveTo(16.381f, 19.669f, 18.151f, 17.889f, 18.761f, 14.059f)
                lineTo(19.491f, 9.369f)
                curveTo(19.591f, 8.789f, 19.631f, 8.279f, 19.631f, 7.809f)
                curveTo(21.151f, 9.059f, 21.371f, 10.839f, 20.501f, 13.469f)
                close()
            }
        }.build()

        return _Clipboard!!
    }

@Suppress("ObjectPropertyName")
private var _Clipboard: ImageVector? = null
