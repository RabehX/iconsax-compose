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


val Iconsax.Filled.ReceiveSquare: ImageVector
    get() {
        if (_ReceiveSquare != null) {
            return _ReceiveSquare!!
        }
        _ReceiveSquare = ImageVector.Builder(
            name = "Filled.ReceiveSquare",
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
                moveTo(8.47f, 10.98f)
                curveTo(8.76f, 10.69f, 9.24f, 10.69f, 9.53f, 10.98f)
                lineTo(11.25f, 12.7f)
                verticalLineTo(6.51f)
                curveTo(11.25f, 6.1f, 11.59f, 5.76f, 12f, 5.76f)
                curveTo(12.41f, 5.76f, 12.75f, 6.1f, 12.75f, 6.51f)
                verticalLineTo(12.7f)
                lineTo(14.47f, 10.98f)
                curveTo(14.76f, 10.69f, 15.24f, 10.69f, 15.53f, 10.98f)
                curveTo(15.82f, 11.27f, 15.82f, 11.75f, 15.53f, 12.04f)
                lineTo(12.53f, 15.04f)
                curveTo(12.46f, 15.11f, 12.38f, 15.16f, 12.29f, 15.2f)
                curveTo(12.2f, 15.24f, 12.1f, 15.26f, 12f, 15.26f)
                curveTo(11.9f, 15.26f, 11.81f, 15.24f, 11.71f, 15.2f)
                curveTo(11.62f, 15.16f, 11.54f, 15.11f, 11.47f, 15.04f)
                lineTo(8.47f, 12.04f)
                curveTo(8.18f, 11.75f, 8.18f, 11.28f, 8.47f, 10.98f)
                close()
                moveTo(18.24f, 17.22f)
                curveTo(16.23f, 17.89f, 14.12f, 18.23f, 12f, 18.23f)
                curveTo(9.88f, 18.23f, 7.77f, 17.89f, 5.76f, 17.22f)
                curveTo(5.37f, 17.09f, 5.16f, 16.66f, 5.29f, 16.27f)
                curveTo(5.42f, 15.88f, 5.84f, 15.66f, 6.24f, 15.8f)
                curveTo(9.96f, 17.04f, 14.05f, 17.04f, 17.77f, 15.8f)
                curveTo(18.16f, 15.67f, 18.59f, 15.88f, 18.72f, 16.27f)
                curveTo(18.84f, 16.67f, 18.63f, 17.09f, 18.24f, 17.22f)
                close()
            }
        }.build()

        return _ReceiveSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiveSquare: ImageVector? = null
