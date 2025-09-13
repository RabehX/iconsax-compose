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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.ShoppingCart: ImageVector
    get() {
        if (_ShoppingCart != null) {
            return _ShoppingCart!!
        }
        _ShoppingCart = ImageVector.Builder(
            name = "Outline.ShoppingCart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.19f, 17.75f)
                horizontalLineTo(7.54f)
                curveTo(6.55f, 17.75f, 5.6f, 17.33f, 4.93f, 16.6f)
                curveTo(4.26f, 15.87f, 3.92f, 14.89f, 4f, 13.9f)
                lineTo(4.83f, 3.94f)
                curveTo(4.86f, 3.63f, 4.75f, 3.33f, 4.54f, 3.1f)
                curveTo(4.33f, 2.87f, 4.04f, 2.75f, 3.73f, 2.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 2.75f, 1.25f, 2.41f, 1.25f, 2f)
                curveTo(1.25f, 1.59f, 1.59f, 1.25f, 2f, 1.25f)
                horizontalLineTo(3.74f)
                curveTo(4.47f, 1.25f, 5.16f, 1.56f, 5.65f, 2.09f)
                curveTo(5.92f, 2.39f, 6.12f, 2.74f, 6.23f, 3.13f)
                horizontalLineTo(18.72f)
                curveTo(19.73f, 3.13f, 20.66f, 3.53f, 21.34f, 4.25f)
                curveTo(22.01f, 4.98f, 22.35f, 5.93f, 22.27f, 6.94f)
                lineTo(21.73f, 14.44f)
                curveTo(21.62f, 16.27f, 20.02f, 17.75f, 18.19f, 17.75f)
                close()
                moveTo(6.28f, 4.62f)
                lineTo(5.5f, 14.02f)
                curveTo(5.45f, 14.6f, 5.64f, 15.15f, 6.03f, 15.58f)
                curveTo(6.42f, 16.01f, 6.96f, 16.24f, 7.54f, 16.24f)
                horizontalLineTo(18.19f)
                curveTo(19.23f, 16.24f, 20.17f, 15.36f, 20.25f, 14.32f)
                lineTo(20.79f, 6.82f)
                curveTo(20.83f, 6.23f, 20.64f, 5.67f, 20.25f, 5.26f)
                curveTo(19.86f, 4.84f, 19.32f, 4.61f, 18.73f, 4.61f)
                horizontalLineTo(6.28f)
                verticalLineTo(4.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.25f, 22.75f)
                curveTo(15.15f, 22.75f, 14.25f, 21.85f, 14.25f, 20.75f)
                curveTo(14.25f, 19.65f, 15.15f, 18.75f, 16.25f, 18.75f)
                curveTo(17.35f, 18.75f, 18.25f, 19.65f, 18.25f, 20.75f)
                curveTo(18.25f, 21.85f, 17.35f, 22.75f, 16.25f, 22.75f)
                close()
                moveTo(16.25f, 20.25f)
                curveTo(15.97f, 20.25f, 15.75f, 20.47f, 15.75f, 20.75f)
                curveTo(15.75f, 21.03f, 15.97f, 21.25f, 16.25f, 21.25f)
                curveTo(16.53f, 21.25f, 16.75f, 21.03f, 16.75f, 20.75f)
                curveTo(16.75f, 20.47f, 16.53f, 20.25f, 16.25f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.25f, 22.75f)
                curveTo(7.15f, 22.75f, 6.25f, 21.85f, 6.25f, 20.75f)
                curveTo(6.25f, 19.65f, 7.15f, 18.75f, 8.25f, 18.75f)
                curveTo(9.35f, 18.75f, 10.25f, 19.65f, 10.25f, 20.75f)
                curveTo(10.25f, 21.85f, 9.35f, 22.75f, 8.25f, 22.75f)
                close()
                moveTo(8.25f, 20.25f)
                curveTo(7.97f, 20.25f, 7.75f, 20.47f, 7.75f, 20.75f)
                curveTo(7.75f, 21.03f, 7.97f, 21.25f, 8.25f, 21.25f)
                curveTo(8.53f, 21.25f, 8.75f, 21.03f, 8.75f, 20.75f)
                curveTo(8.75f, 20.47f, 8.53f, 20.25f, 8.25f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 8.75f)
                horizontalLineTo(9f)
                curveTo(8.59f, 8.75f, 8.25f, 8.41f, 8.25f, 8f)
                curveTo(8.25f, 7.59f, 8.59f, 7.25f, 9f, 7.25f)
                horizontalLineTo(21f)
                curveTo(21.41f, 7.25f, 21.75f, 7.59f, 21.75f, 8f)
                curveTo(21.75f, 8.41f, 21.41f, 8.75f, 21f, 8.75f)
                close()
            }
        }.build()

        return _ShoppingCart!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingCart: ImageVector? = null
