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


val Iconsax.Filled.DirectNotification: ImageVector
    get() {
        if (_DirectNotification != null) {
            return _DirectNotification!!
        }
        _DirectNotification = ImageVector.Builder(
            name = "Filled.DirectNotification",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 8f)
                curveTo(20.657f, 8f, 22f, 6.657f, 22f, 5f)
                curveTo(22f, 3.343f, 20.657f, 2f, 19f, 2f)
                curveTo(17.343f, 2f, 16f, 3.343f, 16f, 5f)
                curveTo(16f, 6.657f, 17.343f, 8f, 19f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.34f, 12.721f)
                horizontalLineTo(17.03f)
                curveTo(16.1f, 12.721f, 15.27f, 13.241f, 14.85f, 14.061f)
                lineTo(14.05f, 15.641f)
                curveTo(13.86f, 16.021f, 13.48f, 16.251f, 13.06f, 16.251f)
                horizontalLineTo(9.95f)
                curveTo(9.66f, 16.251f, 9.23f, 16.191f, 8.96f, 15.631f)
                lineTo(8.17f, 14.061f)
                curveTo(7.75f, 13.231f, 6.92f, 12.711f, 5.99f, 12.711f)
                horizontalLineTo(2.66f)
                curveTo(2.3f, 12.721f, 2f, 13.021f, 2f, 13.381f)
                verticalLineTo(16.471f)
                curveTo(2f, 19.941f, 4.07f, 22.001f, 7.53f, 22.001f)
                horizontalLineTo(15.49f)
                curveTo(18.75f, 22.001f, 20.76f, 20.211f, 21f, 17.041f)
                verticalLineTo(13.381f)
                curveTo(21f, 13.021f, 20.7f, 12.721f, 20.34f, 12.721f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 10.4f)
                verticalLineTo(11.33f)
                curveTo(20.79f, 11.26f, 20.57f, 11.22f, 20.34f, 11.22f)
                horizontalLineTo(17.03f)
                curveTo(15.53f, 11.22f, 14.18f, 12.05f, 13.52f, 13.39f)
                lineTo(12.82f, 14.76f)
                horizontalLineTo(10.19f)
                lineTo(9.51f, 13.4f)
                curveTo(8.83f, 12.05f, 7.49f, 11.22f, 5.99f, 11.22f)
                horizontalLineTo(2.66f)
                curveTo(2.43f, 11.22f, 2.21f, 11.26f, 2f, 11.33f)
                verticalLineTo(8.52f)
                curveTo(2f, 5.47f, 4.47f, 3f, 7.52f, 3f)
                horizontalLineTo(13.6f)
                curveTo(14.24f, 3f, 14.7f, 3.58f, 14.58f, 4.2f)
                curveTo(14.42f, 5f, 14.49f, 5.87f, 14.88f, 6.79f)
                curveTo(15.33f, 7.83f, 16.17f, 8.67f, 17.21f, 9.12f)
                curveTo(18.13f, 9.51f, 19f, 9.58f, 19.8f, 9.42f)
                curveTo(20.42f, 9.3f, 21f, 9.76f, 21f, 10.4f)
                close()
            }
        }.build()

        return _DirectNotification!!
    }

@Suppress("ObjectPropertyName")
private var _DirectNotification: ImageVector? = null
