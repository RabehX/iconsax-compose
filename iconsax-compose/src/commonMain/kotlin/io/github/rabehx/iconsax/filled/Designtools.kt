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


val Iconsax.Filled.Designtools: ImageVector
    get() {
        if (_Designtools != null) {
            return _Designtools!!
        }
        _Designtools = ImageVector.Builder(
            name = "Filled.Designtools",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.039f, 13.279f)
                lineTo(20.119f, 12.379f)
                lineTo(12.369f, 20.119f)
                lineTo(13.299f, 21.049f)
                curveTo(14.079f, 21.829f, 14.889f, 22.219f, 15.689f, 22.219f)
                curveTo(16.489f, 22.219f, 17.299f, 21.829f, 18.079f, 21.049f)
                lineTo(21.039f, 18.089f)
                curveTo(22.629f, 16.489f, 22.629f, 14.879f, 21.039f, 13.279f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.69f, 2.931f)
                curveTo(9.12f, 1.361f, 7.47f, 1.361f, 5.9f, 2.931f)
                lineTo(2.93f, 5.891f)
                curveTo(1.37f, 7.461f, 1.37f, 9.111f, 2.93f, 10.681f)
                lineTo(3.85f, 11.601f)
                lineTo(11.6f, 3.851f)
                lineTo(10.69f, 2.931f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.81f, 3.938f)
                curveTo(20.5f, 7.208f, 17.51f, 11.478f, 14.66f, 14.268f)
                curveTo(14.25f, 11.688f, 12.19f, 9.668f, 9.59f, 9.308f)
                curveTo(12.39f, 6.448f, 16.69f, 3.418f, 19.97f, 2.098f)
                curveTo(20.55f, 1.878f, 21.13f, 2.048f, 21.49f, 2.408f)
                curveTo(21.87f, 2.788f, 22.05f, 3.358f, 21.81f, 3.938f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.779f, 15.091f)
                curveTo(13.579f, 15.261f, 13.379f, 15.431f, 13.179f, 15.591f)
                lineTo(11.389f, 17.021f)
                curveTo(11.389f, 16.991f, 11.379f, 16.951f, 11.379f, 16.911f)
                curveTo(11.239f, 15.841f, 10.739f, 14.851f, 9.929f, 14.041f)
                curveTo(9.109f, 13.221f, 8.089f, 12.721f, 6.969f, 12.581f)
                curveTo(6.939f, 12.581f, 6.899f, 12.571f, 6.869f, 12.571f)
                lineTo(8.319f, 10.741f)
                curveTo(8.459f, 10.561f, 8.609f, 10.391f, 8.769f, 10.211f)
                lineTo(9.449f, 10.301f)
                curveTo(11.599f, 10.601f, 13.329f, 12.291f, 13.669f, 14.431f)
                lineTo(13.779f, 15.091f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.43f, 17.621f)
                curveTo(10.43f, 18.721f, 10.01f, 19.771f, 9.21f, 20.561f)
                curveTo(8.6f, 21.181f, 7.78f, 21.601f, 6.78f, 21.721f)
                lineTo(4.33f, 21.991f)
                curveTo(2.99f, 22.141f, 1.84f, 20.991f, 1.99f, 19.641f)
                lineTo(2.26f, 17.181f)
                curveTo(2.5f, 14.991f, 4.33f, 13.591f, 6.27f, 13.551f)
                curveTo(6.46f, 13.541f, 6.67f, 13.551f, 6.87f, 13.571f)
                curveTo(7.72f, 13.681f, 8.54f, 14.071f, 9.23f, 14.751f)
                curveTo(9.9f, 15.421f, 10.28f, 16.211f, 10.39f, 17.041f)
                curveTo(10.41f, 17.241f, 10.43f, 17.431f, 10.43f, 17.621f)
                close()
            }
        }.build()

        return _Designtools!!
    }

@Suppress("ObjectPropertyName")
private var _Designtools: ImageVector? = null
