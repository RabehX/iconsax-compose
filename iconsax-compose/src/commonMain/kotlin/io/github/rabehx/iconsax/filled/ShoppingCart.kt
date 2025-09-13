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


val Iconsax.Filled.ShoppingCart: ImageVector
    get() {
        if (_ShoppingCart != null) {
            return _ShoppingCart!!
        }
        _ShoppingCart = ImageVector.Builder(
            name = "Filled.ShoppingCart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.25f, 22.5f)
                curveTo(17.216f, 22.5f, 18f, 21.716f, 18f, 20.75f)
                curveTo(18f, 19.784f, 17.216f, 19f, 16.25f, 19f)
                curveTo(15.283f, 19f, 14.5f, 19.784f, 14.5f, 20.75f)
                curveTo(14.5f, 21.716f, 15.283f, 22.5f, 16.25f, 22.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.25f, 22.5f)
                curveTo(9.217f, 22.5f, 10f, 21.716f, 10f, 20.75f)
                curveTo(10f, 19.784f, 9.217f, 19f, 8.25f, 19f)
                curveTo(7.284f, 19f, 6.5f, 19.784f, 6.5f, 20.75f)
                curveTo(6.5f, 21.716f, 7.284f, 22.5f, 8.25f, 22.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.84f, 3.94f)
                lineTo(4.64f, 6.39f)
                curveTo(4.6f, 6.86f, 4.97f, 7.25f, 5.44f, 7.25f)
                horizontalLineTo(20.75f)
                curveTo(21.17f, 7.25f, 21.52f, 6.93f, 21.55f, 6.51f)
                curveTo(21.68f, 4.74f, 20.33f, 3.3f, 18.56f, 3.3f)
                horizontalLineTo(6.27f)
                curveTo(6.17f, 2.86f, 5.97f, 2.44f, 5.66f, 2.09f)
                curveTo(5.16f, 1.56f, 4.46f, 1.25f, 3.74f, 1.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 1.25f, 1.25f, 1.59f, 1.25f, 2f)
                curveTo(1.25f, 2.41f, 1.59f, 2.75f, 2f, 2.75f)
                horizontalLineTo(3.74f)
                curveTo(4.05f, 2.75f, 4.34f, 2.88f, 4.55f, 3.1f)
                curveTo(4.76f, 3.33f, 4.86f, 3.63f, 4.84f, 3.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.51f, 8.75f)
                horizontalLineTo(5.17f)
                curveTo(4.75f, 8.75f, 4.41f, 9.07f, 4.37f, 9.48f)
                lineTo(4.01f, 13.83f)
                curveTo(3.87f, 15.54f, 5.21f, 17f, 6.92f, 17f)
                horizontalLineTo(18.04f)
                curveTo(19.54f, 17f, 20.86f, 15.77f, 20.97f, 14.27f)
                lineTo(21.3f, 9.6f)
                curveTo(21.34f, 9.14f, 20.98f, 8.75f, 20.51f, 8.75f)
                close()
            }
        }.build()

        return _ShoppingCart!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingCart: ImageVector? = null
