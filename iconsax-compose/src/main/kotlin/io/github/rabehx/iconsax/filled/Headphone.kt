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


val Iconsax.Filled.Headphone: ImageVector
    get() {
        if (_Headphone != null) {
            return _Headphone!!
        }
        _Headphone = ImageVector.Builder(
            name = "Filled.Headphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.75f, 18.651f)
                curveTo(2.34f, 18.651f, 2f, 18.311f, 2f, 17.901f)
                verticalLineTo(12.201f)
                curveTo(1.95f, 9.491f, 2.96f, 6.931f, 4.84f, 5.011f)
                curveTo(6.72f, 3.101f, 9.24f, 2.051f, 11.95f, 2.051f)
                curveTo(17.49f, 2.051f, 22f, 6.561f, 22f, 12.101f)
                verticalLineTo(17.801f)
                curveTo(22f, 18.211f, 21.66f, 18.551f, 21.25f, 18.551f)
                curveTo(20.84f, 18.551f, 20.5f, 18.211f, 20.5f, 17.801f)
                verticalLineTo(12.101f)
                curveTo(20.5f, 7.391f, 16.67f, 3.551f, 11.95f, 3.551f)
                curveTo(9.64f, 3.551f, 7.5f, 4.441f, 5.91f, 6.061f)
                curveTo(4.31f, 7.691f, 3.46f, 9.861f, 3.5f, 12.181f)
                verticalLineTo(17.891f)
                curveTo(3.5f, 18.311f, 3.17f, 18.651f, 2.75f, 18.651f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.94f, 12.449f)
                horizontalLineTo(5.81f)
                curveTo(3.71f, 12.449f, 2f, 14.159f, 2f, 16.259f)
                verticalLineTo(18.139f)
                curveTo(2f, 20.239f, 3.71f, 21.949f, 5.81f, 21.949f)
                horizontalLineTo(5.94f)
                curveTo(8.04f, 21.949f, 9.75f, 20.239f, 9.75f, 18.139f)
                verticalLineTo(16.259f)
                curveTo(9.75f, 14.159f, 8.04f, 12.449f, 5.94f, 12.449f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.19f, 12.449f)
                horizontalLineTo(18.06f)
                curveTo(15.96f, 12.449f, 14.25f, 14.159f, 14.25f, 16.259f)
                verticalLineTo(18.139f)
                curveTo(14.25f, 20.239f, 15.96f, 21.949f, 18.06f, 21.949f)
                horizontalLineTo(18.19f)
                curveTo(20.29f, 21.949f, 22f, 20.239f, 22f, 18.139f)
                verticalLineTo(16.259f)
                curveTo(22f, 14.159f, 20.29f, 12.449f, 18.19f, 12.449f)
                close()
            }
        }.build()

        return _Headphone!!
    }

@Suppress("ObjectPropertyName")
private var _Headphone: ImageVector? = null
