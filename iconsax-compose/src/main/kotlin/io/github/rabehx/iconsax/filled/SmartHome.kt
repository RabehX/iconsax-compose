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


val Iconsax.Filled.SmartHome: ImageVector
    get() {
        if (_SmartHome != null) {
            return _SmartHome!!
        }
        _SmartHome = ImageVector.Builder(
            name = "Filled.SmartHome",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.859f, 8.561f)
                lineTo(13.929f, 3.021f)
                curveTo(12.859f, 2.161f, 11.129f, 2.161f, 10.069f, 3.011f)
                lineTo(3.139f, 8.561f)
                curveTo(2.359f, 9.181f, 1.859f, 10.491f, 2.029f, 11.471f)
                lineTo(3.359f, 19.431f)
                curveTo(3.599f, 20.851f, 4.959f, 22.001f, 6.399f, 22.001f)
                horizontalLineTo(17.599f)
                curveTo(19.029f, 22.001f, 20.399f, 20.841f, 20.639f, 19.431f)
                lineTo(21.969f, 11.471f)
                curveTo(22.129f, 10.491f, 21.629f, 9.181f, 20.859f, 8.561f)
                close()
                moveTo(9.379f, 17.381f)
                curveTo(8.819f, 17.381f, 8.379f, 16.931f, 8.379f, 16.381f)
                curveTo(8.379f, 15.831f, 8.829f, 15.381f, 9.379f, 15.381f)
                curveTo(9.929f, 15.381f, 10.379f, 15.831f, 10.379f, 16.381f)
                curveTo(10.379f, 16.931f, 9.929f, 17.381f, 9.379f, 17.381f)
                close()
                moveTo(12.389f, 17.121f)
                curveTo(12.379f, 17.121f, 12.379f, 17.121f, 12.369f, 17.121f)
                curveTo(11.959f, 17.121f, 11.629f, 16.791f, 11.619f, 16.391f)
                curveTo(11.589f, 15.041f, 10.699f, 14.151f, 9.349f, 14.121f)
                curveTo(8.939f, 14.111f, 8.609f, 13.771f, 8.619f, 13.351f)
                curveTo(8.629f, 12.941f, 8.959f, 12.621f, 9.369f, 12.621f)
                curveTo(9.379f, 12.621f, 9.379f, 12.621f, 9.389f, 12.621f)
                curveTo(11.539f, 12.671f, 13.079f, 14.201f, 13.119f, 16.351f)
                curveTo(13.129f, 16.771f, 12.809f, 17.121f, 12.389f, 17.121f)
                close()
                moveTo(15.379f, 17.121f)
                curveTo(14.959f, 17.121f, 14.629f, 16.791f, 14.619f, 16.381f)
                curveTo(14.609f, 15.721f, 14.499f, 15.091f, 14.299f, 14.501f)
                curveTo(13.789f, 13.041f, 12.699f, 11.961f, 11.239f, 11.441f)
                curveTo(10.649f, 11.231f, 10.019f, 11.121f, 9.359f, 11.121f)
                curveTo(8.949f, 11.121f, 8.609f, 10.781f, 8.619f, 10.361f)
                curveTo(8.619f, 9.951f, 8.959f, 9.621f, 9.369f, 9.621f)
                horizontalLineTo(9.379f)
                curveTo(10.209f, 9.631f, 10.999f, 9.771f, 11.739f, 10.031f)
                curveTo(13.629f, 10.701f, 15.039f, 12.111f, 15.709f, 14.001f)
                curveTo(15.969f, 14.741f, 16.109f, 15.541f, 16.119f, 16.361f)
                curveTo(16.129f, 16.781f, 15.799f, 17.121f, 15.379f, 17.121f)
                close()
            }
        }.build()

        return _SmartHome!!
    }

@Suppress("ObjectPropertyName")
private var _SmartHome: ImageVector? = null
