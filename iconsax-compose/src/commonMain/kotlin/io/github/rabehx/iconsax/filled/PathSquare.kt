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


val Iconsax.Filled.PathSquare: ImageVector
    get() {
        if (_PathSquare != null) {
            return _PathSquare!!
        }
        _PathSquare = ImageVector.Builder(
            name = "Filled.PathSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(16.66f, 11.25f)
                lineTo(15.04f, 12.27f)
                lineTo(15.18f, 14.67f)
                curveTo(15.31f, 16.01f, 14.85f, 16.47f, 13.58f, 16.62f)
                lineTo(8.51f, 17.22f)
                curveTo(8.232f, 17.258f, 8.137f, 16.943f, 8.336f, 16.744f)
                lineTo(9.88f, 15.2f)
                curveTo(10.17f, 14.91f, 10.17f, 14.43f, 9.88f, 14.14f)
                curveTo(9.58f, 13.85f, 9.11f, 13.85f, 8.81f, 14.14f)
                lineTo(7.275f, 15.683f)
                curveTo(7.077f, 15.882f, 6.762f, 15.788f, 6.8f, 15.51f)
                lineTo(7.39f, 10.44f)
                curveTo(7.55f, 9.17f, 8.01f, 8.76f, 9.35f, 8.84f)
                lineTo(11.74f, 8.98f)
                lineTo(12.77f, 7.35f)
                curveTo(13.24f, 6.61f, 14.2f, 6.57f, 14.9f, 7.27f)
                lineTo(16.75f, 9.12f)
                curveTo(17.41f, 9.77f, 17.37f, 10.8f, 16.66f, 11.25f)
                close()
            }
        }.build()

        return _PathSquare!!
    }

@Suppress("ObjectPropertyName")
private var _PathSquare: ImageVector? = null
