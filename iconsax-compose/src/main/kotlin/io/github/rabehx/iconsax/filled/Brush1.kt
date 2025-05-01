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


val Iconsax.Filled.Brush1: ImageVector
    get() {
        if (_Brush1 != null) {
            return _Brush1!!
        }
        _Brush1 = ImageVector.Builder(
            name = "Filled.Brush1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.649f, 4.79f)
                horizontalLineTo(16.369f)
                curveTo(16.269f, 4f, 15.979f, 3.37f, 15.519f, 2.9f)
                curveTo(14.919f, 2.3f, 14.049f, 2f, 12.929f, 2f)
                horizontalLineTo(7.349f)
                curveTo(5.099f, 2f, 3.859f, 3.24f, 3.859f, 5.49f)
                curveTo(3.859f, 6.61f, 4.159f, 7.48f, 4.759f, 8.08f)
                curveTo(5.359f, 8.68f, 6.229f, 8.98f, 7.349f, 8.98f)
                horizontalLineTo(12.929f)
                curveTo(14.929f, 8.98f, 16.129f, 7.99f, 16.369f, 6.19f)
                horizontalLineTo(16.649f)
                curveTo(18.739f, 6.19f, 18.739f, 6.47f, 18.739f, 8.28f)
                verticalLineTo(10.14f)
                curveTo(18.739f, 11.95f, 18.739f, 12.23f, 16.649f, 12.23f)
                horizontalLineTo(12.929f)
                curveTo(9.939f, 12.23f, 9.509f, 13.65f, 9.449f, 15.03f)
                curveTo(8.549f, 15.09f, 7.579f, 15.51f, 7.579f, 17.11f)
                verticalLineTo(19.9f)
                curveTo(7.579f, 21.63f, 8.719f, 21.99f, 9.669f, 21.99f)
                horizontalLineTo(10.599f)
                curveTo(11.549f, 21.99f, 12.689f, 21.63f, 12.689f, 19.9f)
                verticalLineTo(17.11f)
                curveTo(12.689f, 15.53f, 11.739f, 15.09f, 10.839f, 15.03f)
                curveTo(10.889f, 14.02f, 11.179f, 13.62f, 12.919f, 13.62f)
                horizontalLineTo(16.639f)
                curveTo(19.889f, 13.62f, 20.129f, 12.3f, 20.129f, 10.13f)
                verticalLineTo(8.28f)
                curveTo(20.139f, 6.11f, 19.899f, 4.79f, 16.649f, 4.79f)
                close()
            }
        }.build()

        return _Brush1!!
    }

@Suppress("ObjectPropertyName")
private var _Brush1: ImageVector? = null
