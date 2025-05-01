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

val Iconsax.Filled.AlignBottom: ImageVector
    get() {
        if (_AlignBottom != null) {
            return _AlignBottom!!
        }
        _AlignBottom = ImageVector.Builder(
            name = "Filled.AlignBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.98f, 19.379f)
                horizontalLineTo(17.02f)
                curveTo(18.61f, 19.379f, 19.25f, 18.779f, 19.25f, 17.259f)
                verticalLineTo(5.379f)
                horizontalLineTo(13.75f)
                verticalLineTo(17.259f)
                curveTo(13.76f, 18.779f, 14.4f, 19.379f, 15.98f, 19.379f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.48f, 14.379f)
                horizontalLineTo(8.52f)
                curveTo(10.11f, 14.379f, 10.75f, 13.769f, 10.75f, 12.259f)
                verticalLineTo(5.379f)
                horizontalLineTo(5.25f)
                verticalLineTo(12.259f)
                curveTo(5.26f, 13.769f, 5.9f, 14.379f, 7.48f, 14.379f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.25f, 6.119f)
                horizontalLineTo(2.75f)
                curveTo(2.34f, 6.119f, 2f, 5.789f, 2f, 5.379f)
                curveTo(2f, 4.969f, 2.34f, 4.629f, 2.75f, 4.629f)
                horizontalLineTo(21.25f)
                curveTo(21.66f, 4.629f, 22f, 4.969f, 22f, 5.379f)
                curveTo(22f, 5.789f, 21.66f, 6.119f, 21.25f, 6.119f)
                close()
            }
        }.build()

        return _AlignBottom!!
    }

@Suppress("ObjectPropertyName")
private var _AlignBottom: ImageVector? = null
