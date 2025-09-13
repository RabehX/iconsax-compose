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


val Iconsax.Filled.StarSlash: ImageVector
    get() {
        if (_StarSlash != null) {
            return _StarSlash!!
        }
        _StarSlash = ImageVector.Builder(
            name = "Filled.StarSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.699f, 14.459f)
                curveTo(18.349f, 14.809f, 18.149f, 15.509f, 18.259f, 15.989f)
                lineTo(18.949f, 19.009f)
                curveTo(19.239f, 20.259f, 19.059f, 21.199f, 18.439f, 21.649f)
                curveTo(18.189f, 21.829f, 17.889f, 21.919f, 17.539f, 21.919f)
                curveTo(17.029f, 21.919f, 16.429f, 21.729f, 15.769f, 21.339f)
                lineTo(12.839f, 19.599f)
                curveTo(12.379f, 19.329f, 11.619f, 19.329f, 11.159f, 19.599f)
                lineTo(8.229f, 21.339f)
                curveTo(7.119f, 21.989f, 6.169f, 22.099f, 5.559f, 21.649f)
                curveTo(5.519f, 21.619f, 5.479f, 21.589f, 5.449f, 21.549f)
                lineTo(18.069f, 8.929f)
                curveTo(18.529f, 8.469f, 19.179f, 8.259f, 19.819f, 8.369f)
                lineTo(19.969f, 8.399f)
                curveTo(21.029f, 8.579f, 21.739f, 9.059f, 21.969f, 9.759f)
                curveTo(22.189f, 10.459f, 21.889f, 11.269f, 21.129f, 12.029f)
                lineTo(18.699f, 14.459f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.739f, 16f)
                curveTo(5.849f, 15.52f, 5.649f, 14.81f, 5.299f, 14.46f)
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
                lineTo(5.069f, 18.93f)
                lineTo(5.739f, 16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.771f, 2.229f)
                curveTo(21.471f, 1.929f, 20.981f, 1.929f, 20.681f, 2.229f)
                lineTo(2.231f, 20.689f)
                curveTo(1.931f, 20.989f, 1.931f, 21.479f, 2.231f, 21.779f)
                curveTo(2.381f, 21.919f, 2.571f, 21.999f, 2.771f, 21.999f)
                curveTo(2.971f, 21.999f, 3.161f, 21.919f, 3.311f, 21.769f)
                lineTo(21.771f, 3.309f)
                curveTo(22.081f, 3.009f, 22.081f, 2.529f, 21.771f, 2.229f)
                close()
            }
        }.build()

        return _StarSlash!!
    }

@Suppress("ObjectPropertyName")
private var _StarSlash: ImageVector? = null
