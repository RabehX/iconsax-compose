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


val Iconsax.Filled.UserSquare: ImageVector
    get() {
        if (_UserSquare != null) {
            return _UserSquare!!
        }
        _UserSquare = ImageVector.Builder(
            name = "Filled.UserSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2f, 19f, 3.29f, 20.93f, 5.56f, 21.66f)
                curveTo(6.22f, 21.89f, 6.98f, 22f, 7.81f, 22f)
                horizontalLineTo(16.19f)
                curveTo(17.02f, 22f, 17.78f, 21.89f, 18.44f, 21.66f)
                curveTo(20.71f, 20.93f, 22f, 19f, 22f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(20.5f, 16.19f)
                curveTo(20.5f, 18.33f, 19.66f, 19.68f, 17.97f, 20.24f)
                curveTo(17f, 18.33f, 14.7f, 16.97f, 12f, 16.97f)
                curveTo(9.3f, 16.97f, 7.01f, 18.32f, 6.03f, 20.24f)
                horizontalLineTo(6.02f)
                curveTo(4.35f, 19.7f, 3.5f, 18.34f, 3.5f, 16.2f)
                verticalLineTo(7.81f)
                curveTo(3.5f, 4.99f, 4.99f, 3.5f, 7.81f, 3.5f)
                horizontalLineTo(16.19f)
                curveTo(19.01f, 3.5f, 20.5f, 4.99f, 20.5f, 7.81f)
                verticalLineTo(16.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.002f, 8f)
                curveTo(10.022f, 8f, 8.422f, 9.6f, 8.422f, 11.58f)
                curveTo(8.422f, 13.56f, 10.022f, 15.17f, 12.002f, 15.17f)
                curveTo(13.982f, 15.17f, 15.582f, 13.56f, 15.582f, 11.58f)
                curveTo(15.582f, 9.6f, 13.982f, 8f, 12.002f, 8f)
                close()
            }
        }.build()

        return _UserSquare!!
    }

@Suppress("ObjectPropertyName")
private var _UserSquare: ImageVector? = null
