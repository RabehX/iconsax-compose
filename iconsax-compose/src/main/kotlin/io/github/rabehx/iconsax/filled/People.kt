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


val Iconsax.Filled.People: ImageVector
    get() {
        if (_People != null) {
            return _People!!
        }
        _People = ImageVector.Builder(
            name = "Filled.People",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.529f, 7.77f)
                curveTo(17.459f, 7.76f, 17.389f, 7.76f, 17.319f, 7.77f)
                curveTo(15.769f, 7.72f, 14.539f, 6.45f, 14.539f, 4.89f)
                curveTo(14.539f, 3.3f, 15.829f, 2f, 17.429f, 2f)
                curveTo(19.019f, 2f, 20.319f, 3.29f, 20.319f, 4.89f)
                curveTo(20.309f, 6.45f, 19.079f, 7.72f, 17.529f, 7.77f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.792f, 14.7f)
                curveTo(19.672f, 15.45f, 18.102f, 15.73f, 16.652f, 15.54f)
                curveTo(17.032f, 14.72f, 17.232f, 13.81f, 17.242f, 12.85f)
                curveTo(17.242f, 11.85f, 17.022f, 10.9f, 16.602f, 10.07f)
                curveTo(18.082f, 9.87f, 19.652f, 10.15f, 20.782f, 10.9f)
                curveTo(22.362f, 11.94f, 22.362f, 13.65f, 20.792f, 14.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.44f, 7.77f)
                curveTo(6.51f, 7.76f, 6.58f, 7.76f, 6.65f, 7.77f)
                curveTo(8.2f, 7.72f, 9.43f, 6.45f, 9.43f, 4.89f)
                curveTo(9.43f, 3.29f, 8.14f, 2f, 6.54f, 2f)
                curveTo(4.95f, 2f, 3.66f, 3.29f, 3.66f, 4.89f)
                curveTo(3.66f, 6.45f, 4.89f, 7.72f, 6.44f, 7.77f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.551f, 12.851f)
                curveTo(6.551f, 13.821f, 6.761f, 14.741f, 7.141f, 15.571f)
                curveTo(5.731f, 15.721f, 4.261f, 15.421f, 3.181f, 14.711f)
                curveTo(1.601f, 13.661f, 1.601f, 11.951f, 3.181f, 10.901f)
                curveTo(4.251f, 10.181f, 5.761f, 9.891f, 7.181f, 10.051f)
                curveTo(6.771f, 10.891f, 6.551f, 11.841f, 6.551f, 12.851f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.121f, 15.87f)
                curveTo(12.041f, 15.86f, 11.951f, 15.86f, 11.861f, 15.87f)
                curveTo(10.021f, 15.81f, 8.551f, 14.3f, 8.551f, 12.44f)
                curveTo(8.561f, 10.54f, 10.091f, 9f, 12.001f, 9f)
                curveTo(13.901f, 9f, 15.441f, 10.54f, 15.441f, 12.44f)
                curveTo(15.431f, 14.3f, 13.971f, 15.81f, 12.121f, 15.87f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.871f, 17.941f)
                curveTo(7.361f, 18.951f, 7.361f, 20.611f, 8.871f, 21.611f)
                curveTo(10.591f, 22.761f, 13.411f, 22.761f, 15.131f, 21.611f)
                curveTo(16.641f, 20.601f, 16.641f, 18.941f, 15.131f, 17.941f)
                curveTo(13.421f, 16.791f, 10.601f, 16.791f, 8.871f, 17.941f)
                close()
            }
        }.build()

        return _People!!
    }

@Suppress("ObjectPropertyName")
private var _People: ImageVector? = null
