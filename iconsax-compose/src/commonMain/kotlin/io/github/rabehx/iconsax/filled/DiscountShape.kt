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


val Iconsax.Filled.DiscountShape: ImageVector
    get() {
        if (_DiscountShape != null) {
            return _DiscountShape!!
        }
        _DiscountShape = ImageVector.Builder(
            name = "Filled.DiscountShape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.529f, 10.869f)
                lineTo(20.009f, 9.349f)
                curveTo(19.749f, 9.089f, 19.539f, 8.579f, 19.539f, 8.219f)
                verticalLineTo(6.059f)
                curveTo(19.539f, 5.179f, 18.819f, 4.459f, 17.939f, 4.459f)
                horizontalLineTo(15.789f)
                curveTo(15.429f, 4.459f, 14.919f, 4.249f, 14.659f, 3.989f)
                lineTo(13.139f, 2.469f)
                curveTo(12.519f, 1.849f, 11.499f, 1.849f, 10.879f, 2.469f)
                lineTo(9.339f, 3.989f)
                curveTo(9.089f, 4.249f, 8.579f, 4.459f, 8.209f, 4.459f)
                horizontalLineTo(6.059f)
                curveTo(5.179f, 4.459f, 4.459f, 5.179f, 4.459f, 6.059f)
                verticalLineTo(8.209f)
                curveTo(4.459f, 8.569f, 4.249f, 9.079f, 3.989f, 9.339f)
                lineTo(2.469f, 10.859f)
                curveTo(1.849f, 11.479f, 1.849f, 12.499f, 2.469f, 13.119f)
                lineTo(3.989f, 14.639f)
                curveTo(4.249f, 14.899f, 4.459f, 15.409f, 4.459f, 15.769f)
                verticalLineTo(17.919f)
                curveTo(4.459f, 18.799f, 5.179f, 19.519f, 6.059f, 19.519f)
                horizontalLineTo(8.209f)
                curveTo(8.569f, 19.519f, 9.079f, 19.729f, 9.339f, 19.989f)
                lineTo(10.859f, 21.509f)
                curveTo(11.479f, 22.129f, 12.499f, 22.129f, 13.119f, 21.509f)
                lineTo(14.639f, 19.989f)
                curveTo(14.899f, 19.729f, 15.409f, 19.519f, 15.769f, 19.519f)
                horizontalLineTo(17.919f)
                curveTo(18.799f, 19.519f, 19.519f, 18.799f, 19.519f, 17.919f)
                verticalLineTo(15.769f)
                curveTo(19.519f, 15.409f, 19.729f, 14.899f, 19.989f, 14.639f)
                lineTo(21.509f, 13.119f)
                curveTo(22.159f, 12.509f, 22.159f, 11.489f, 21.529f, 10.869f)
                close()
                moveTo(7.999f, 8.999f)
                curveTo(7.999f, 8.449f, 8.449f, 7.999f, 8.999f, 7.999f)
                curveTo(9.549f, 7.999f, 9.999f, 8.449f, 9.999f, 8.999f)
                curveTo(9.999f, 9.549f, 9.559f, 9.999f, 8.999f, 9.999f)
                curveTo(8.449f, 9.999f, 7.999f, 9.549f, 7.999f, 8.999f)
                close()
                moveTo(9.529f, 15.529f)
                curveTo(9.379f, 15.679f, 9.189f, 15.749f, 8.999f, 15.749f)
                curveTo(8.809f, 15.749f, 8.619f, 15.679f, 8.469f, 15.529f)
                curveTo(8.179f, 15.239f, 8.179f, 14.759f, 8.469f, 14.469f)
                lineTo(14.469f, 8.469f)
                curveTo(14.759f, 8.179f, 15.239f, 8.179f, 15.529f, 8.469f)
                curveTo(15.819f, 8.759f, 15.819f, 9.239f, 15.529f, 9.529f)
                lineTo(9.529f, 15.529f)
                close()
                moveTo(14.999f, 15.999f)
                curveTo(14.439f, 15.999f, 13.989f, 15.549f, 13.989f, 14.999f)
                curveTo(13.989f, 14.449f, 14.439f, 13.999f, 14.989f, 13.999f)
                curveTo(15.539f, 13.999f, 15.989f, 14.449f, 15.989f, 14.999f)
                curveTo(15.989f, 15.549f, 15.549f, 15.999f, 14.999f, 15.999f)
                close()
            }
        }.build()

        return _DiscountShape!!
    }

@Suppress("ObjectPropertyName")
private var _DiscountShape: ImageVector? = null
