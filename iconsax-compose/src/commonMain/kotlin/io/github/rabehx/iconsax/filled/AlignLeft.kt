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

val Iconsax.Filled.AlignLeft: ImageVector
    get() {
        if (_AlignLeft != null) {
            return _AlignLeft!!
        }
        _AlignLeft = ImageVector.Builder(
            name = "Filled.AlignLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.381f, 15.98f)
                verticalLineTo(17.02f)
                curveTo(19.381f, 18.61f, 18.781f, 19.25f, 17.261f, 19.25f)
                horizontalLineTo(5.381f)
                verticalLineTo(13.75f)
                horizontalLineTo(17.261f)
                curveTo(18.781f, 13.75f, 19.381f, 14.39f, 19.381f, 15.98f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.381f, 7.48f)
                verticalLineTo(8.52f)
                curveTo(14.381f, 10.11f, 13.771f, 10.75f, 12.261f, 10.75f)
                horizontalLineTo(5.381f)
                verticalLineTo(5.25f)
                horizontalLineTo(12.261f)
                curveTo(13.771f, 5.25f, 14.381f, 5.89f, 14.381f, 7.48f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.379f, 22f)
                curveTo(4.969f, 22f, 4.629f, 21.66f, 4.629f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(4.619f, 2.33f, 4.959f, 2f, 5.379f, 2f)
                curveTo(5.799f, 2f, 6.129f, 2.34f, 6.129f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(6.119f, 21.66f, 5.789f, 22f, 5.379f, 22f)
                close()
            }
        }.build()

        return _AlignLeft!!
    }

@Suppress("ObjectPropertyName")
private var _AlignLeft: ImageVector? = null
