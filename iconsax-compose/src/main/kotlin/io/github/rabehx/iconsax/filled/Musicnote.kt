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


val Iconsax.Filled.Musicnote: ImageVector
    get() {
        if (_Musicnote != null) {
            return _Musicnote!!
        }
        _Musicnote = ImageVector.Builder(
            name = "Filled.Musicnote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.719f, 6.279f)
                verticalLineTo(7.449f)
                curveTo(21.719f, 8.429f, 21.329f, 9.269f, 20.639f, 9.759f)
                curveTo(20.209f, 10.079f, 19.679f, 10.229f, 19.129f, 10.229f)
                curveTo(18.789f, 10.229f, 18.449f, 10.179f, 18.099f, 10.059f)
                lineTo(12.719f, 8.269f)
                verticalLineTo(17.999f)
                curveTo(12.719f, 20.619f, 10.589f, 22.749f, 7.969f, 22.749f)
                curveTo(5.349f, 22.749f, 3.219f, 20.619f, 3.219f, 17.999f)
                curveTo(3.219f, 15.379f, 5.349f, 13.249f, 7.969f, 13.249f)
                curveTo(9.229f, 13.249f, 10.369f, 13.749f, 11.219f, 14.549f)
                verticalLineTo(3.999f)
                curveTo(11.219f, 3.029f, 11.619f, 2.189f, 12.309f, 1.689f)
                curveTo(12.999f, 1.199f, 13.919f, 1.089f, 14.839f, 1.389f)
                lineTo(19.259f, 2.869f)
                curveTo(20.619f, 3.319f, 21.719f, 4.849f, 21.719f, 6.279f)
                close()
            }
        }.build()

        return _Musicnote!!
    }

@Suppress("ObjectPropertyName")
private var _Musicnote: ImageVector? = null
