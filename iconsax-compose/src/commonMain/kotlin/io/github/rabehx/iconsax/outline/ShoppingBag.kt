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

val Iconsax.Outline.ShoppingBag: ImageVector
    get() {
        if (_ShoppingBag != null) {
            return _ShoppingBag!!
        }
        _ShoppingBag = ImageVector.Builder(
            name = "Outline.ShoppingBag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.49f, 22.75f)
                horizontalLineTo(7.5f)
                curveTo(5.78f, 22.75f, 4.49f, 22.29f, 3.69f, 21.38f)
                curveTo(2.89f, 20.47f, 2.58f, 19.15f, 2.79f, 17.44f)
                lineTo(3.69f, 9.94f)
                curveTo(3.95f, 7.73f, 4.51f, 5.75f, 8.41f, 5.75f)
                horizontalLineTo(15.61f)
                curveTo(19.5f, 5.75f, 20.06f, 7.73f, 20.33f, 9.94f)
                lineTo(21.23f, 17.44f)
                curveTo(21.43f, 19.15f, 21.13f, 20.48f, 20.33f, 21.38f)
                curveTo(19.5f, 22.29f, 18.22f, 22.75f, 16.49f, 22.75f)
                close()
                moveTo(8.4f, 7.25f)
                curveTo(5.52f, 7.25f, 5.38f, 8.39f, 5.17f, 10.11f)
                lineTo(4.27f, 17.61f)
                curveTo(4.12f, 18.88f, 4.3f, 19.81f, 4.81f, 20.38f)
                curveTo(5.32f, 20.95f, 6.22f, 21.24f, 7.5f, 21.24f)
                horizontalLineTo(16.49f)
                curveTo(17.77f, 21.24f, 18.67f, 20.95f, 19.18f, 20.38f)
                curveTo(19.69f, 19.81f, 19.87f, 18.88f, 19.72f, 17.61f)
                lineTo(18.82f, 10.11f)
                curveTo(18.61f, 8.38f, 18.48f, 7.25f, 15.59f, 7.25f)
                horizontalLineTo(8.4f)
                close()
            }
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
                moveTo(20.41f, 17.78f)
                horizontalLineTo(8f)
                curveTo(7.59f, 17.78f, 7.25f, 17.44f, 7.25f, 17.03f)
                curveTo(7.25f, 16.62f, 7.59f, 16.28f, 8f, 16.28f)
                horizontalLineTo(20.41f)
                curveTo(20.82f, 16.28f, 21.16f, 16.62f, 21.16f, 17.03f)
                curveTo(21.16f, 17.44f, 20.82f, 17.78f, 20.41f, 17.78f)
                close()
            }
        }.build()

        return _ShoppingBag!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingBag: ImageVector? = null
