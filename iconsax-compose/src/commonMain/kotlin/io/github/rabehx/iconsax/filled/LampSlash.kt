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


val Iconsax.Filled.LampSlash: ImageVector
    get() {
        if (_LampSlash != null) {
            return _LampSlash!!
        }
        _LampSlash = ImageVector.Builder(
            name = "Filled.LampSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.701f, 4.349f)
                lineTo(6.401f, 13.649f)
                curveTo(5.931f, 14.119f, 5.111f, 14.019f, 4.811f, 13.419f)
                curveTo(4.271f, 12.349f, 3.971f, 11.179f, 3.971f, 10.049f)
                curveTo(3.971f, 7.599f, 5.061f, 5.309f, 6.971f, 3.769f)
                curveTo(8.881f, 2.229f, 11.381f, 1.659f, 13.831f, 2.199f)
                curveTo(14.371f, 2.319f, 14.901f, 2.489f, 15.401f, 2.719f)
                curveTo(16.041f, 3.009f, 16.201f, 3.849f, 15.701f, 4.349f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.449f, 20.628f)
                curveTo(13.189f, 19.988f, 10.809f, 19.988f, 8.549f, 20.628f)
                curveTo(8.179f, 20.738f, 7.959f, 21.118f, 8.069f, 21.488f)
                curveTo(8.179f, 21.858f, 8.559f, 22.068f, 8.929f, 21.968f)
                curveTo(10.939f, 21.398f, 13.049f, 21.398f, 15.059f, 21.968f)
                curveTo(15.119f, 21.988f, 15.189f, 21.998f, 15.249f, 21.998f)
                curveTo(15.549f, 21.998f, 15.829f, 21.798f, 15.919f, 21.488f)
                curveTo(16.029f, 21.118f, 15.819f, 20.738f, 15.449f, 20.628f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.559f, 1.952f)
                curveTo(20.269f, 1.662f, 19.789f, 1.662f, 19.499f, 1.952f)
                lineTo(3.649f, 17.802f)
                curveTo(3.359f, 18.092f, 3.359f, 18.572f, 3.649f, 18.862f)
                curveTo(3.799f, 19.012f, 3.989f, 19.082f, 4.179f, 19.082f)
                curveTo(4.369f, 19.082f, 4.559f, 19.012f, 4.709f, 18.862f)
                lineTo(7.169f, 16.402f)
                curveTo(7.389f, 16.582f, 7.619f, 16.762f, 7.859f, 16.922f)
                verticalLineTo(17.752f)
                curveTo(7.849f, 18.032f, 7.839f, 18.462f, 8.169f, 18.812f)
                curveTo(8.519f, 19.162f, 9.039f, 19.212f, 9.449f, 19.212f)
                horizontalLineTo(14.579f)
                curveTo(15.119f, 19.212f, 15.529f, 19.062f, 15.809f, 18.782f)
                curveTo(16.199f, 18.382f, 16.179f, 17.882f, 16.169f, 17.622f)
                verticalLineTo(16.922f)
                curveTo(19.279f, 14.832f, 21.229f, 10.422f, 19.209f, 6.362f)
                curveTo(18.989f, 5.932f, 18.719f, 5.522f, 18.419f, 5.142f)
                lineTo(20.549f, 3.012f)
                curveTo(20.849f, 2.722f, 20.849f, 2.242f, 20.559f, 1.952f)
                close()
            }
        }.build()

        return _LampSlash!!
    }

@Suppress("ObjectPropertyName")
private var _LampSlash: ImageVector? = null
