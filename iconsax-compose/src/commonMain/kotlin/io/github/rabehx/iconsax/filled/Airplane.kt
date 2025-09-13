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

val Iconsax.Filled.Airplane: ImageVector
    get() {
        if (_Airplane != null) {
            return _Airplane!!
        }
        _Airplane = ImageVector.Builder(
            name = "Filled.Airplane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.049f, 10.629f)
                lineTo(15.379f, 8.619f)
                lineTo(14.339f, 8.179f)
                curveTo(14.179f, 8.099f, 14.039f, 7.889f, 14.039f, 7.709f)
                verticalLineTo(4.649f)
                curveTo(14.039f, 3.689f, 13.329f, 2.549f, 12.469f, 2.109f)
                curveTo(12.169f, 1.959f, 11.809f, 1.959f, 11.509f, 2.109f)
                curveTo(10.659f, 2.549f, 9.949f, 3.699f, 9.949f, 4.659f)
                verticalLineTo(7.719f)
                curveTo(9.949f, 7.899f, 9.809f, 8.109f, 9.649f, 8.189f)
                lineTo(3.949f, 10.639f)
                curveTo(3.319f, 10.899f, 2.809f, 11.689f, 2.809f, 12.369f)
                verticalLineTo(13.689f)
                curveTo(2.809f, 14.539f, 3.449f, 14.959f, 4.239f, 14.619f)
                lineTo(9.249f, 12.459f)
                curveTo(9.639f, 12.289f, 9.959f, 12.499f, 9.959f, 12.929f)
                verticalLineTo(14.039f)
                verticalLineTo(15.839f)
                curveTo(9.959f, 16.069f, 9.829f, 16.399f, 9.669f, 16.559f)
                lineTo(7.349f, 18.889f)
                curveTo(7.109f, 19.129f, 6.999f, 19.599f, 7.109f, 19.939f)
                lineTo(7.559f, 21.299f)
                curveTo(7.739f, 21.889f, 8.409f, 22.169f, 8.959f, 21.889f)
                lineTo(11.339f, 19.889f)
                curveTo(11.699f, 19.579f, 12.289f, 19.579f, 12.649f, 19.889f)
                lineTo(15.029f, 21.889f)
                curveTo(15.579f, 22.159f, 16.249f, 21.889f, 16.449f, 21.299f)
                lineTo(16.899f, 19.939f)
                curveTo(17.009f, 19.609f, 16.899f, 19.129f, 16.659f, 18.889f)
                lineTo(14.339f, 16.559f)
                curveTo(14.169f, 16.399f, 14.039f, 16.069f, 14.039f, 15.839f)
                verticalLineTo(12.929f)
                curveTo(14.039f, 12.499f, 14.349f, 12.299f, 14.749f, 12.459f)
                lineTo(19.759f, 14.619f)
                curveTo(20.549f, 14.959f, 21.189f, 14.539f, 21.189f, 13.689f)
                verticalLineTo(12.369f)
                curveTo(21.189f, 11.689f, 20.679f, 10.899f, 20.049f, 10.629f)
                close()
            }
        }.build()

        return _Airplane!!
    }

@Suppress("ObjectPropertyName")
private var _Airplane: ImageVector? = null
