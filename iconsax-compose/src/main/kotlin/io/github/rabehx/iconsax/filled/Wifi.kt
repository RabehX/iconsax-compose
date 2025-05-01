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


val Iconsax.Filled.Wifi: ImageVector
    get() {
        if (_Wifi != null) {
            return _Wifi!!
        }
        _Wifi = ImageVector.Builder(
            name = "Filled.Wifi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.091f, 12.588f)
                curveTo(18.931f, 12.588f, 18.771f, 12.538f, 18.631f, 12.428f)
                curveTo(14.601f, 9.318f, 9.391f, 9.318f, 5.361f, 12.428f)
                curveTo(5.031f, 12.678f, 4.561f, 12.618f, 4.311f, 12.298f)
                curveTo(4.061f, 11.968f, 4.121f, 11.498f, 4.441f, 11.248f)
                curveTo(9.031f, 7.698f, 14.961f, 7.698f, 19.541f, 11.248f)
                curveTo(19.871f, 11.498f, 19.931f, 11.968f, 19.671f, 12.298f)
                curveTo(19.541f, 12.488f, 19.321f, 12.588f, 19.091f, 12.588f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 9.108f)
                curveTo(21.84f, 9.108f, 21.68f, 9.058f, 21.54f, 8.948f)
                curveTo(15.74f, 4.468f, 8.25f, 4.468f, 2.46f, 8.948f)
                curveTo(2.13f, 9.198f, 1.66f, 9.138f, 1.41f, 8.818f)
                curveTo(1.15f, 8.498f, 1.21f, 8.018f, 1.54f, 7.768f)
                curveTo(7.89f, 2.858f, 16.1f, 2.858f, 22.46f, 7.768f)
                curveTo(22.79f, 8.018f, 22.85f, 8.488f, 22.59f, 8.818f)
                curveTo(22.45f, 9.008f, 22.22f, 9.108f, 22f, 9.108f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.21f, 16.241f)
                curveTo(17.05f, 16.241f, 16.89f, 16.191f, 16.75f, 16.081f)
                curveTo(13.87f, 13.851f, 10.14f, 13.851f, 7.25f, 16.081f)
                curveTo(6.92f, 16.331f, 6.45f, 16.271f, 6.2f, 15.951f)
                curveTo(5.95f, 15.621f, 6.01f, 15.151f, 6.33f, 14.901f)
                curveTo(9.77f, 12.241f, 14.22f, 12.241f, 17.66f, 14.901f)
                curveTo(17.99f, 15.151f, 18.05f, 15.621f, 17.79f, 15.951f)
                curveTo(17.65f, 16.141f, 17.43f, 16.241f, 17.21f, 16.241f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.599f, 19.9f)
                curveTo(14.439f, 19.9f, 14.279f, 19.851f, 14.139f, 19.74f)
                curveTo(12.839f, 18.73f, 11.149f, 18.73f, 9.849f, 19.74f)
                curveTo(9.519f, 19.99f, 9.049f, 19.931f, 8.799f, 19.611f)
                curveTo(8.549f, 19.281f, 8.609f, 18.81f, 8.929f, 18.56f)
                curveTo(10.789f, 17.121f, 13.189f, 17.121f, 15.049f, 18.56f)
                curveTo(15.379f, 18.81f, 15.439f, 19.281f, 15.179f, 19.611f)
                curveTo(15.049f, 19.791f, 14.829f, 19.9f, 14.599f, 19.9f)
                close()
            }
        }.build()

        return _Wifi!!
    }

@Suppress("ObjectPropertyName")
private var _Wifi: ImageVector? = null
