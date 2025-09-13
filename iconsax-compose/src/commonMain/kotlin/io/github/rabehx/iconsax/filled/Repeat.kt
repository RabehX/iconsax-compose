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


val Iconsax.Filled.Repeat: ImageVector
    get() {
        if (_Repeat != null) {
            return _Repeat!!
        }
        _Repeat = ImageVector.Builder(
            name = "Filled.Repeat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.418f, 4.411f)
                horizontalLineTo(5.388f)
                lineTo(7.268f, 2.531f)
                curveTo(7.558f, 2.241f, 7.558f, 1.761f, 7.268f, 1.471f)
                curveTo(6.978f, 1.181f, 6.498f, 1.181f, 6.208f, 1.471f)
                lineTo(3.048f, 4.631f)
                curveTo(2.978f, 4.701f, 2.928f, 4.781f, 2.888f, 4.871f)
                curveTo(2.848f, 4.961f, 2.828f, 5.061f, 2.828f, 5.161f)
                curveTo(2.828f, 5.261f, 2.848f, 5.361f, 2.888f, 5.451f)
                curveTo(2.928f, 5.541f, 2.978f, 5.621f, 3.048f, 5.691f)
                lineTo(6.208f, 8.851f)
                curveTo(6.358f, 9.001f, 6.548f, 9.071f, 6.738f, 9.071f)
                curveTo(6.928f, 9.071f, 7.118f, 9.001f, 7.268f, 8.851f)
                curveTo(7.558f, 8.561f, 7.558f, 8.081f, 7.268f, 7.791f)
                lineTo(5.388f, 5.911f)
                horizontalLineTo(17.418f)
                curveTo(18.658f, 5.911f, 19.668f, 6.921f, 19.668f, 8.161f)
                verticalLineTo(11.481f)
                curveTo(19.668f, 11.891f, 20.008f, 12.231f, 20.418f, 12.231f)
                curveTo(20.828f, 12.231f, 21.168f, 11.891f, 21.168f, 11.481f)
                verticalLineTo(8.161f)
                curveTo(21.168f, 6.091f, 19.488f, 4.411f, 17.418f, 4.411f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.168f, 18.84f)
                curveTo(21.168f, 18.74f, 21.148f, 18.639f, 21.108f, 18.549f)
                curveTo(21.068f, 18.459f, 21.018f, 18.379f, 20.948f, 18.309f)
                lineTo(17.788f, 15.149f)
                curveTo(17.498f, 14.859f, 17.018f, 14.859f, 16.728f, 15.149f)
                curveTo(16.438f, 15.439f, 16.438f, 15.92f, 16.728f, 16.209f)
                lineTo(18.608f, 18.09f)
                horizontalLineTo(6.578f)
                curveTo(5.338f, 18.09f, 4.328f, 17.08f, 4.328f, 15.84f)
                verticalLineTo(12.519f)
                curveTo(4.328f, 12.109f, 3.988f, 11.769f, 3.578f, 11.769f)
                curveTo(3.168f, 11.769f, 2.828f, 12.109f, 2.828f, 12.519f)
                verticalLineTo(15.84f)
                curveTo(2.828f, 17.91f, 4.508f, 19.59f, 6.578f, 19.59f)
                horizontalLineTo(18.608f)
                lineTo(16.728f, 21.469f)
                curveTo(16.438f, 21.76f, 16.438f, 22.24f, 16.728f, 22.529f)
                curveTo(16.878f, 22.68f, 17.068f, 22.75f, 17.258f, 22.75f)
                curveTo(17.448f, 22.75f, 17.638f, 22.68f, 17.788f, 22.529f)
                lineTo(20.948f, 19.369f)
                curveTo(21.018f, 19.299f, 21.068f, 19.219f, 21.108f, 19.129f)
                curveTo(21.148f, 19.039f, 21.168f, 18.94f, 21.168f, 18.84f)
                close()
            }
        }.build()

        return _Repeat!!
    }

@Suppress("ObjectPropertyName")
private var _Repeat: ImageVector? = null
