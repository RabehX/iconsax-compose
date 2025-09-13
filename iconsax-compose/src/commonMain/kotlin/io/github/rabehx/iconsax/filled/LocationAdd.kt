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


val Iconsax.Filled.LocationAdd: ImageVector
    get() {
        if (_LocationAdd != null) {
            return _LocationAdd!!
        }
        _LocationAdd = ImageVector.Builder(
            name = "Filled.LocationAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.619f, 8.7f)
                curveTo(19.579f, 4.07f, 15.539f, 2f, 11.999f, 2f)
                curveTo(11.999f, 2f, 11.999f, 2f, 11.989f, 2f)
                curveTo(8.459f, 2f, 4.429f, 4.07f, 3.379f, 8.69f)
                curveTo(2.199f, 13.85f, 5.359f, 18.22f, 8.219f, 20.98f)
                curveTo(9.279f, 22f, 10.639f, 22.51f, 11.999f, 22.51f)
                curveTo(13.359f, 22.51f, 14.719f, 22f, 15.769f, 20.98f)
                curveTo(18.629f, 18.22f, 21.789f, 13.86f, 20.619f, 8.7f)
                close()
                moveTo(14.749f, 11.75f)
                horizontalLineTo(12.749f)
                verticalLineTo(13.75f)
                curveTo(12.749f, 14.16f, 12.409f, 14.5f, 11.999f, 14.5f)
                curveTo(11.589f, 14.5f, 11.249f, 14.16f, 11.249f, 13.75f)
                verticalLineTo(11.75f)
                horizontalLineTo(9.249f)
                curveTo(8.839f, 11.75f, 8.499f, 11.41f, 8.499f, 11f)
                curveTo(8.499f, 10.59f, 8.839f, 10.25f, 9.249f, 10.25f)
                horizontalLineTo(11.249f)
                verticalLineTo(8.25f)
                curveTo(11.249f, 7.84f, 11.589f, 7.5f, 11.999f, 7.5f)
                curveTo(12.409f, 7.5f, 12.749f, 7.84f, 12.749f, 8.25f)
                verticalLineTo(10.25f)
                horizontalLineTo(14.749f)
                curveTo(15.159f, 10.25f, 15.499f, 10.59f, 15.499f, 11f)
                curveTo(15.499f, 11.41f, 15.159f, 11.75f, 14.749f, 11.75f)
                close()
            }
        }.build()

        return _LocationAdd!!
    }

@Suppress("ObjectPropertyName")
private var _LocationAdd: ImageVector? = null
