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


val Iconsax.Filled.ShieldSlash: ImageVector
    get() {
        if (_ShieldSlash != null) {
            return _ShieldSlash!!
        }
        _ShieldSlash = ImageVector.Builder(
            name = "Filled.ShieldSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.361f, 4.64f)
                lineTo(5.831f, 18.17f)
                lineTo(4.731f, 17.35f)
                curveTo(4.081f, 16.86f, 3.551f, 15.8f, 3.551f, 14.98f)
                verticalLineTo(6.89f)
                curveTo(3.551f, 5.76f, 4.411f, 4.52f, 5.461f, 4.12f)
                lineTo(10.961f, 2.06f)
                curveTo(11.531f, 1.85f, 12.471f, 1.85f, 13.041f, 2.06f)
                lineTo(18.541f, 4.12f)
                curveTo(18.831f, 4.23f, 19.111f, 4.41f, 19.361f, 4.64f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.449f, 14.979f)
                curveTo(20.449f, 15.799f, 19.919f, 16.859f, 19.269f, 17.349f)
                lineTo(13.769f, 21.459f)
                curveTo(12.789f, 22.179f, 11.209f, 22.179f, 10.229f, 21.459f)
                lineTo(8.469f, 20.149f)
                curveTo(7.979f, 19.789f, 7.929f, 19.069f, 8.359f, 18.639f)
                lineTo(18.739f, 8.259f)
                curveTo(19.369f, 7.629f, 20.449f, 8.079f, 20.449f, 8.969f)
                verticalLineTo(14.979f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.769f, 2.229f)
                curveTo(21.469f, 1.929f, 20.979f, 1.929f, 20.679f, 2.229f)
                lineTo(2.229f, 20.689f)
                curveTo(1.929f, 20.989f, 1.929f, 21.479f, 2.229f, 21.779f)
                curveTo(2.379f, 21.919f, 2.569f, 21.999f, 2.769f, 21.999f)
                curveTo(2.969f, 21.999f, 3.159f, 21.919f, 3.309f, 21.769f)
                lineTo(21.769f, 3.309f)
                curveTo(22.079f, 3.009f, 22.079f, 2.529f, 21.769f, 2.229f)
                close()
            }
        }.build()

        return _ShieldSlash!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSlash: ImageVector? = null
