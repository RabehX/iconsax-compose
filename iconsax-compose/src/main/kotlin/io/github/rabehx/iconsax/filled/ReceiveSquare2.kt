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


val Iconsax.Filled.ReceiveSquare2: ImageVector
    get() {
        if (_ReceiveSquare2 != null) {
            return _ReceiveSquare2!!
        }
        _ReceiveSquare2 = ImageVector.Builder(
            name = "Filled.ReceiveSquare2",
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
                moveTo(8.64f, 7.15f)
                curveTo(8.93f, 6.86f, 9.41f, 6.86f, 9.7f, 7.15f)
                lineTo(14.08f, 11.53f)
                verticalLineTo(9.1f)
                curveTo(14.08f, 8.69f, 14.42f, 8.35f, 14.83f, 8.35f)
                curveTo(15.24f, 8.35f, 15.58f, 8.69f, 15.58f, 9.1f)
                verticalLineTo(13.34f)
                curveTo(15.58f, 13.44f, 15.56f, 13.53f, 15.52f, 13.63f)
                curveTo(15.44f, 13.81f, 15.3f, 13.96f, 15.11f, 14.04f)
                curveTo(15.02f, 14.08f, 14.92f, 14.1f, 14.82f, 14.1f)
                horizontalLineTo(10.58f)
                curveTo(10.17f, 14.1f, 9.83f, 13.76f, 9.83f, 13.35f)
                curveTo(9.83f, 12.94f, 10.17f, 12.6f, 10.58f, 12.6f)
                horizontalLineTo(13.01f)
                lineTo(8.64f, 8.21f)
                curveTo(8.35f, 7.92f, 8.35f, 7.45f, 8.64f, 7.15f)
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

        return _ReceiveSquare2!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiveSquare2: ImageVector? = null
