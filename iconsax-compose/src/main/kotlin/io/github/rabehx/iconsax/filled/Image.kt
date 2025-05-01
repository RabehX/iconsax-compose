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


val Iconsax.Filled.Image: ImageVector
    get() {
        if (_Image != null) {
            return _Image!!
        }
        _Image = ImageVector.Builder(
            name = "Filled.Image",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.019f, 16.82f)
                lineTo(18.889f, 9.5f)
                curveTo(18.319f, 8.16f, 17.469f, 7.4f, 16.499f, 7.35f)
                curveTo(15.539f, 7.3f, 14.609f, 7.97f, 13.899f, 9.25f)
                lineTo(11.999f, 12.66f)
                curveTo(11.599f, 13.38f, 11.029f, 13.81f, 10.409f, 13.86f)
                curveTo(9.779f, 13.92f, 9.149f, 13.59f, 8.639f, 12.94f)
                lineTo(8.419f, 12.66f)
                curveTo(7.709f, 11.77f, 6.829f, 11.34f, 5.929f, 11.43f)
                curveTo(5.029f, 11.52f, 4.259f, 12.14f, 3.749f, 13.15f)
                lineTo(2.019f, 16.6f)
                curveTo(1.399f, 17.85f, 1.459f, 19.3f, 2.189f, 20.48f)
                curveTo(2.919f, 21.66f, 4.189f, 22.37f, 5.579f, 22.37f)
                horizontalLineTo(18.339f)
                curveTo(19.679f, 22.37f, 20.929f, 21.7f, 21.669f, 20.58f)
                curveTo(22.429f, 19.46f, 22.549f, 18.05f, 22.019f, 16.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.97f, 8.381f)
                curveTo(8.837f, 8.381f, 10.35f, 6.868f, 10.35f, 5.001f)
                curveTo(10.35f, 3.134f, 8.837f, 1.621f, 6.97f, 1.621f)
                curveTo(5.103f, 1.621f, 3.59f, 3.134f, 3.59f, 5.001f)
                curveTo(3.59f, 6.868f, 5.103f, 8.381f, 6.97f, 8.381f)
                close()
            }
        }.build()

        return _Image!!
    }

@Suppress("ObjectPropertyName")
private var _Image: ImageVector? = null
