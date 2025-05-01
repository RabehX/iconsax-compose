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


val Iconsax.Filled.TickSquare: ImageVector
    get() {
        if (_TickSquare != null) {
            return _TickSquare!!
        }
        _TickSquare = ImageVector.Builder(
            name = "Filled.TickSquare",
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
                moveTo(16.78f, 9.7f)
                lineTo(11.11f, 15.37f)
                curveTo(10.97f, 15.51f, 10.78f, 15.59f, 10.58f, 15.59f)
                curveTo(10.38f, 15.59f, 10.19f, 15.51f, 10.05f, 15.37f)
                lineTo(7.22f, 12.54f)
                curveTo(6.93f, 12.25f, 6.93f, 11.77f, 7.22f, 11.48f)
                curveTo(7.51f, 11.19f, 7.99f, 11.19f, 8.28f, 11.48f)
                lineTo(10.58f, 13.78f)
                lineTo(15.72f, 8.64f)
                curveTo(16.01f, 8.35f, 16.49f, 8.35f, 16.78f, 8.64f)
                curveTo(17.07f, 8.93f, 17.07f, 9.4f, 16.78f, 9.7f)
                close()
            }
        }.build()

        return _TickSquare!!
    }

@Suppress("ObjectPropertyName")
private var _TickSquare: ImageVector? = null
