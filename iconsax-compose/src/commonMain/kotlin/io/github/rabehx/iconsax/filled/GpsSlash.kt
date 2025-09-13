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


val Iconsax.Filled.GpsSlash: ImageVector
    get() {
        if (_GpsSlash != null) {
            return _GpsSlash!!
        }
        _GpsSlash = ImageVector.Builder(
            name = "Filled.GpsSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.751f, 11.999f)
                curveTo(22.751f, 12.409f, 22.411f, 12.749f, 22.001f, 12.749f)
                horizontalLineTo(19.961f)
                curveTo(19.611f, 16.559f, 16.561f, 19.609f, 12.751f, 19.959f)
                verticalLineTo(21.999f)
                curveTo(12.751f, 22.409f, 12.411f, 22.749f, 12.001f, 22.749f)
                curveTo(11.591f, 22.749f, 11.251f, 22.409f, 11.251f, 21.999f)
                verticalLineTo(19.959f)
                curveTo(10.641f, 19.909f, 10.041f, 19.779f, 9.471f, 19.589f)
                curveTo(8.761f, 19.349f, 8.541f, 18.449f, 9.071f, 17.919f)
                lineTo(11.881f, 15.109f)
                curveTo(11.921f, 15.119f, 11.951f, 15.119f, 11.991f, 15.119f)
                curveTo(13.721f, 15.119f, 15.111f, 13.729f, 15.111f, 11.999f)
                curveTo(15.111f, 11.959f, 15.111f, 11.929f, 15.101f, 11.889f)
                lineTo(17.911f, 9.079f)
                curveTo(18.441f, 8.549f, 19.341f, 8.769f, 19.581f, 9.479f)
                curveTo(19.771f, 10.049f, 19.901f, 10.639f, 19.951f, 11.259f)
                horizontalLineTo(22.001f)
                curveTo(22.411f, 11.249f, 22.751f, 11.589f, 22.751f, 11.999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.77f, 2.23f)
                curveTo(21.47f, 1.93f, 20.98f, 1.93f, 20.68f, 2.23f)
                lineTo(17.07f, 5.84f)
                curveTo(15.87f, 4.85f, 14.37f, 4.2f, 12.74f, 4.05f)
                verticalLineTo(2f)
                curveTo(12.74f, 1.59f, 12.4f, 1.25f, 11.99f, 1.25f)
                curveTo(11.58f, 1.25f, 11.24f, 1.59f, 11.24f, 2f)
                verticalLineTo(4.04f)
                curveTo(7.43f, 4.4f, 4.38f, 7.44f, 4.03f, 11.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 11.25f, 1.25f, 11.59f, 1.25f, 12f)
                curveTo(1.25f, 12.41f, 1.59f, 12.75f, 2f, 12.75f)
                horizontalLineTo(4.04f)
                curveTo(4.19f, 14.38f, 4.84f, 15.88f, 5.83f, 17.08f)
                lineTo(2.22f, 20.69f)
                curveTo(1.92f, 20.99f, 1.92f, 21.48f, 2.22f, 21.78f)
                curveTo(2.38f, 21.92f, 2.57f, 22f, 2.77f, 22f)
                curveTo(2.97f, 22f, 3.16f, 21.92f, 3.31f, 21.77f)
                lineTo(21.77f, 3.31f)
                curveTo(22.08f, 3.01f, 22.08f, 2.53f, 21.77f, 2.23f)
                close()
                moveTo(8.88f, 12f)
                curveTo(8.88f, 10.28f, 10.28f, 8.88f, 12f, 8.88f)
                curveTo(12.58f, 8.88f, 13.12f, 9.05f, 13.58f, 9.33f)
                lineTo(9.33f, 13.58f)
                curveTo(9.05f, 13.12f, 8.88f, 12.58f, 8.88f, 12f)
                close()
            }
        }.build()

        return _GpsSlash!!
    }

@Suppress("ObjectPropertyName")
private var _GpsSlash: ImageVector? = null
