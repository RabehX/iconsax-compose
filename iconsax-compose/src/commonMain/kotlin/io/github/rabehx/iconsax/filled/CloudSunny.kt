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


val Iconsax.Filled.CloudSunny: ImageVector
    get() {
        if (_CloudSunny != null) {
            return _CloudSunny!!
        }
        _CloudSunny = ImageVector.Builder(
            name = "Filled.CloudSunny",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.612f, 10.83f)
                curveTo(19.842f, 9.91f, 18.852f, 9.31f, 17.702f, 9.05f)
                curveTo(17.442f, 7.89f, 16.992f, 6.89f, 16.332f, 6.06f)
                curveTo(16.312f, 6.03f, 16.292f, 6f, 16.272f, 5.98f)
                curveTo(14.072f, 3.32f, 10.472f, 3.33f, 8.042f, 4.71f)
                curveTo(5.962f, 5.9f, 4.192f, 8.41f, 5.122f, 11.99f)
                curveTo(2.992f, 12.51f, 2.012f, 14.37f, 2.012f, 16.05f)
                curveTo(2.012f, 17.93f, 3.242f, 20.04f, 5.982f, 20.24f)
                horizontalLineTo(16.322f)
                curveTo(16.332f, 20.24f, 16.352f, 20.24f, 16.362f, 20.24f)
                curveTo(17.782f, 20.24f, 19.142f, 19.711f, 20.192f, 18.75f)
                curveTo(22.702f, 16.53f, 22.372f, 12.91f, 20.612f, 10.83f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.759f, 8.742f)
                curveTo(21.759f, 9.082f, 21.719f, 9.412f, 21.619f, 9.732f)
                curveTo(20.889f, 8.882f, 19.959f, 8.252f, 18.929f, 7.862f)
                curveTo(18.609f, 6.862f, 18.149f, 5.972f, 17.549f, 5.192f)
                curveTo(17.519f, 5.152f, 17.489f, 5.112f, 17.449f, 5.062f)
                curveTo(17.639f, 5.022f, 17.839f, 5.012f, 18.029f, 5.012f)
                curveTo(20.089f, 5.012f, 21.759f, 6.682f, 21.759f, 8.742f)
                close()
            }
        }.build()

        return _CloudSunny!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSunny: ImageVector? = null
