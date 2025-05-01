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


val Iconsax.Filled.Dislike: ImageVector
    get() {
        if (_Dislike != null) {
            return _Dislike!!
        }
        _Dislike = ImageVector.Builder(
            name = "Filled.Dislike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.609f, 5.5f)
                verticalLineTo(15.66f)
                curveTo(15.609f, 16.059f, 15.489f, 16.449f, 15.269f, 16.779f)
                lineTo(12.539f, 20.84f)
                curveTo(12.109f, 21.49f, 11.039f, 21.949f, 10.129f, 21.61f)
                curveTo(9.149f, 21.279f, 8.499f, 20.18f, 8.709f, 19.199f)
                lineTo(9.229f, 15.929f)
                curveTo(9.269f, 15.63f, 9.189f, 15.359f, 9.019f, 15.149f)
                curveTo(8.849f, 14.96f, 8.599f, 14.84f, 8.329f, 14.84f)
                horizontalLineTo(4.219f)
                curveTo(3.429f, 14.84f, 2.749f, 14.519f, 2.349f, 13.96f)
                curveTo(1.969f, 13.42f, 1.899f, 12.719f, 2.149f, 12.009f)
                lineTo(4.609f, 4.52f)
                curveTo(4.919f, 3.28f, 6.269f, 2.27f, 7.609f, 2.27f)
                horizontalLineTo(11.509f)
                curveTo(12.179f, 2.27f, 13.119f, 2.5f, 13.549f, 2.93f)
                lineTo(14.829f, 3.92f)
                curveTo(15.319f, 4.3f, 15.609f, 4.88f, 15.609f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.789f, 17.608f)
                horizontalLineTo(19.819f)
                curveTo(21.369f, 17.608f, 21.999f, 17.008f, 21.999f, 15.528f)
                verticalLineTo(5.478f)
                curveTo(21.999f, 3.998f, 21.369f, 3.398f, 19.819f, 3.398f)
                horizontalLineTo(18.789f)
                curveTo(17.239f, 3.398f, 16.609f, 3.998f, 16.609f, 5.478f)
                verticalLineTo(15.538f)
                curveTo(16.609f, 17.008f, 17.239f, 17.608f, 18.789f, 17.608f)
                close()
            }
        }.build()

        return _Dislike!!
    }

@Suppress("ObjectPropertyName")
private var _Dislike: ImageVector? = null
