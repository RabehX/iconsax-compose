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


val Iconsax.Filled.ShoppingBag: ImageVector
    get() {
        if (_ShoppingBag != null) {
            return _ShoppingBag!!
        }
        _ShoppingBag = ImageVector.Builder(
            name = "Filled.ShoppingBag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 8.75f)
                curveTo(15.59f, 8.75f, 15.25f, 8.41f, 15.25f, 8f)
                verticalLineTo(4.5f)
                curveTo(15.25f, 3.42f, 14.58f, 2.75f, 13.5f, 2.75f)
                horizontalLineTo(10.5f)
                curveTo(9.42f, 2.75f, 8.75f, 3.42f, 8.75f, 4.5f)
                verticalLineTo(8f)
                curveTo(8.75f, 8.41f, 8.41f, 8.75f, 8f, 8.75f)
                curveTo(7.59f, 8.75f, 7.25f, 8.41f, 7.25f, 8f)
                verticalLineTo(4.5f)
                curveTo(7.25f, 2.59f, 8.59f, 1.25f, 10.5f, 1.25f)
                horizontalLineTo(13.5f)
                curveTo(15.41f, 1.25f, 16.75f, 2.59f, 16.75f, 4.5f)
                verticalLineTo(8f)
                curveTo(16.75f, 8.41f, 16.41f, 8.75f, 16f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.001f, 17.78f)
                curveTo(7.591f, 17.78f, 7.251f, 17.44f, 7.251f, 17.03f)
                curveTo(7.251f, 16.61f, 7.591f, 16.28f, 8.001f, 16.28f)
                horizontalLineTo(19.761f)
                curveTo(20.061f, 16.28f, 20.291f, 16.02f, 20.261f, 15.72f)
                lineTo(19.581f, 10.03f)
                curveTo(19.341f, 8.09f, 19.001f, 6.5f, 15.601f, 6.5f)
                horizontalLineTo(8.401f)
                curveTo(5.001f, 6.5f, 4.661f, 8.09f, 4.431f, 10.03f)
                lineTo(3.531f, 17.53f)
                curveTo(3.241f, 19.99f, 4.001f, 22f, 7.511f, 22f)
                horizontalLineTo(16.491f)
                curveTo(19.651f, 22f, 20.581f, 20.37f, 20.531f, 18.25f)
                curveTo(20.521f, 17.98f, 20.301f, 17.78f, 20.031f, 17.78f)
                horizontalLineTo(8.001f)
                close()
            }
        }.build()

        return _ShoppingBag!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingBag: ImageVector? = null
