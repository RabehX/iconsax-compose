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


val Iconsax.Filled.ShopRemove: ImageVector
    get() {
        if (_ShopRemove != null) {
            return _ShopRemove!!
        }
        _ShopRemove = ImageVector.Builder(
            name = "Filled.ShopRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.8f, 22.148f)
                curveTo(5.15f, 22.148f, 2.99f, 19.998f, 2.99f, 17.338f)
                verticalLineTo(14.498f)
                curveTo(2.99f, 13.828f, 3.65f, 13.378f, 4.28f, 13.598f)
                curveTo(4.54f, 13.688f, 4.8f, 13.748f, 5.07f, 13.788f)
                curveTo(5.19f, 13.808f, 5.31f, 13.828f, 5.43f, 13.828f)
                curveTo(5.58f, 13.848f, 5.74f, 13.858f, 5.89f, 13.858f)
                curveTo(7f, 13.858f, 8.1f, 13.448f, 8.97f, 12.738f)
                curveTo(9.8f, 13.448f, 10.87f, 13.858f, 12.01f, 13.858f)
                curveTo(13.15f, 13.858f, 14.21f, 13.468f, 15.04f, 12.748f)
                curveTo(15.9f, 13.448f, 16.98f, 13.858f, 18.08f, 13.858f)
                curveTo(18.25f, 13.858f, 18.43f, 13.848f, 18.59f, 13.828f)
                curveTo(18.71f, 13.818f, 18.81f, 13.808f, 18.92f, 13.788f)
                curveTo(19.22f, 13.748f, 19.49f, 13.668f, 19.76f, 13.578f)
                curveTo(20.38f, 13.368f, 21.03f, 13.828f, 21.03f, 14.478f)
                verticalLineTo(17.338f)
                curveTo(21.03f, 19.988f, 18.88f, 22.148f, 16.22f, 22.148f)
                horizontalLineTo(7.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.98f, 8.592f)
                lineTo(21.7f, 5.932f)
                curveTo(21.3f, 3.032f, 19.98f, 1.852f, 17.17f, 1.852f)
                horizontalLineTo(6.82f)
                curveTo(4f, 1.852f, 2.69f, 3.032f, 2.28f, 5.962f)
                lineTo(2.02f, 8.602f)
                curveTo(1.92f, 9.632f, 2.2f, 10.632f, 2.81f, 11.412f)
                curveTo(3.54f, 12.362f, 4.66f, 12.902f, 5.91f, 12.902f)
                curveTo(7.12f, 12.902f, 8.28f, 12.292f, 9.02f, 11.322f)
                curveTo(9.67f, 12.292f, 10.78f, 12.902f, 12.02f, 12.902f)
                curveTo(13.26f, 12.902f, 14.35f, 12.322f, 15.01f, 11.362f)
                curveTo(15.75f, 12.312f, 16.9f, 12.902f, 18.09f, 12.902f)
                curveTo(19.37f, 12.902f, 20.52f, 12.332f, 21.24f, 11.332f)
                curveTo(21.82f, 10.562f, 22.08f, 9.592f, 21.98f, 8.592f)
                close()
                moveTo(13.5f, 7.732f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 7.732f, 9.75f, 7.402f, 9.75f, 6.982f)
                curveTo(9.75f, 6.572f, 10.09f, 6.232f, 10.5f, 6.232f)
                horizontalLineTo(13.5f)
                curveTo(13.91f, 6.232f, 14.25f, 6.572f, 14.25f, 6.982f)
                curveTo(14.25f, 7.402f, 13.91f, 7.732f, 13.5f, 7.732f)
                close()
            }
        }.build()

        return _ShopRemove!!
    }

@Suppress("ObjectPropertyName")
private var _ShopRemove: ImageVector? = null
