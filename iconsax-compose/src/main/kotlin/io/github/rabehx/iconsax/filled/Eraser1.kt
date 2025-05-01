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


val Iconsax.Filled.Eraser1: ImageVector
    get() {
        if (_Eraser1 != null) {
            return _Eraser1!!
        }
        _Eraser1 = ImageVector.Builder(
            name = "Filled.Eraser1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.03f, 22f)
                horizontalLineTo(13.99f)
                curveTo(13.57f, 22f, 13.24f, 21.66f, 13.24f, 21.25f)
                curveTo(13.24f, 20.84f, 13.58f, 20.5f, 13.99f, 20.5f)
                horizontalLineTo(21.03f)
                curveTo(21.45f, 20.5f, 21.78f, 20.84f, 21.78f, 21.25f)
                curveTo(21.78f, 21.66f, 21.45f, 22f, 21.03f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.64f, 16.689f)
                curveTo(14.03f, 17.079f, 14.03f, 17.709f, 13.64f, 18.109f)
                lineTo(10.66f, 21.089f)
                curveTo(9.55f, 22.199f, 7.77f, 22.259f, 6.59f, 21.269f)
                curveTo(6.52f, 21.209f, 6.46f, 21.149f, 6.4f, 21.089f)
                lineTo(5.53f, 20.219f)
                lineTo(3.74f, 18.429f)
                lineTo(2.88f, 17.569f)
                curveTo(2.81f, 17.499f, 2.75f, 17.429f, 2.69f, 17.359f)
                curveTo(1.71f, 16.179f, 1.78f, 14.419f, 2.88f, 13.319f)
                lineTo(5.86f, 10.339f)
                curveTo(6.25f, 9.949f, 6.88f, 9.949f, 7.27f, 10.339f)
                lineTo(13.64f, 16.689f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.119f, 10.641f)
                lineTo(16.119f, 15.641f)
                curveTo(15.729f, 16.031f, 15.099f, 16.031f, 14.709f, 15.641f)
                lineTo(8.339f, 9.291f)
                curveTo(7.949f, 8.901f, 7.949f, 8.271f, 8.339f, 7.871f)
                lineTo(13.339f, 2.881f)
                curveTo(14.509f, 1.711f, 16.429f, 1.711f, 17.599f, 2.881f)
                lineTo(21.119f, 6.391f)
                curveTo(22.289f, 7.561f, 22.289f, 9.471f, 21.119f, 10.641f)
                close()
            }
        }.build()

        return _Eraser1!!
    }

@Suppress("ObjectPropertyName")
private var _Eraser1: ImageVector? = null
