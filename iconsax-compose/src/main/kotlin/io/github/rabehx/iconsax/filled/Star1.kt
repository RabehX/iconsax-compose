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


val Iconsax.Filled.Star1: ImageVector
    get() {
        if (_Star1 != null) {
            return _Star1!!
        }
        _Star1 = ImageVector.Builder(
            name = "Filled.Star1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.739f, 16f)
                curveTo(5.849f, 15.51f, 5.649f, 14.81f, 5.299f, 14.46f)
                lineTo(2.869f, 12.03f)
                curveTo(2.109f, 11.27f, 1.809f, 10.46f, 2.029f, 9.76f)
                curveTo(2.259f, 9.06f, 2.969f, 8.58f, 4.029f, 8.4f)
                lineTo(7.149f, 7.88f)
                curveTo(7.599f, 7.8f, 8.149f, 7.4f, 8.359f, 6.99f)
                lineTo(10.079f, 3.54f)
                curveTo(10.579f, 2.55f, 11.259f, 2f, 11.999f, 2f)
                curveTo(12.739f, 2f, 13.419f, 2.55f, 13.919f, 3.54f)
                lineTo(15.639f, 6.99f)
                curveTo(15.769f, 7.25f, 16.039f, 7.5f, 16.329f, 7.67f)
                lineTo(5.559f, 18.44f)
                curveTo(5.419f, 18.58f, 5.179f, 18.45f, 5.219f, 18.25f)
                lineTo(5.739f, 16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.701f, 14.462f)
                curveTo(18.341f, 14.822f, 18.141f, 15.512f, 18.261f, 16.002f)
                lineTo(18.951f, 19.012f)
                curveTo(19.241f, 20.262f, 19.061f, 21.202f, 18.441f, 21.652f)
                curveTo(18.191f, 21.832f, 17.891f, 21.922f, 17.541f, 21.922f)
                curveTo(17.031f, 21.922f, 16.431f, 21.732f, 15.771f, 21.342f)
                lineTo(12.841f, 19.602f)
                curveTo(12.381f, 19.332f, 11.621f, 19.332f, 11.161f, 19.602f)
                lineTo(8.231f, 21.342f)
                curveTo(7.121f, 21.992f, 6.171f, 22.102f, 5.561f, 21.652f)
                curveTo(5.331f, 21.482f, 5.161f, 21.252f, 5.051f, 20.952f)
                lineTo(17.211f, 8.792f)
                curveTo(17.671f, 8.332f, 18.321f, 8.122f, 18.951f, 8.232f)
                lineTo(19.961f, 8.402f)
                curveTo(21.021f, 8.582f, 21.731f, 9.062f, 21.961f, 9.762f)
                curveTo(22.181f, 10.462f, 21.881f, 11.272f, 21.121f, 12.032f)
                lineTo(18.701f, 14.462f)
                close()
            }
        }.build()

        return _Star1!!
    }

@Suppress("ObjectPropertyName")
private var _Star1: ImageVector? = null
