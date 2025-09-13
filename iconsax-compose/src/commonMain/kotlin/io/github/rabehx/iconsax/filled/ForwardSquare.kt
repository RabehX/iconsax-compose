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


val Iconsax.Filled.ForwardSquare: ImageVector
    get() {
        if (_ForwardSquare != null) {
            return _ForwardSquare!!
        }
        _ForwardSquare = ImageVector.Builder(
            name = "Filled.ForwardSquare",
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
                moveTo(17.53f, 9.72f)
                lineTo(15.96f, 11.29f)
                curveTo(15.81f, 11.44f, 15.62f, 11.51f, 15.43f, 11.51f)
                curveTo(15.24f, 11.51f, 15.05f, 11.44f, 14.9f, 11.29f)
                curveTo(14.61f, 11f, 14.61f, 10.52f, 14.9f, 10.23f)
                lineTo(15.16f, 9.97f)
                horizontalLineTo(10.08f)
                curveTo(8.8f, 9.97f, 7.75f, 11.01f, 7.75f, 12.3f)
                curveTo(7.75f, 13.59f, 8.79f, 14.63f, 10.08f, 14.63f)
                horizontalLineTo(15f)
                curveTo(15.41f, 14.63f, 15.75f, 14.97f, 15.75f, 15.38f)
                curveTo(15.75f, 15.79f, 15.41f, 16.13f, 15f, 16.13f)
                horizontalLineTo(10.08f)
                curveTo(7.97f, 16.13f, 6.25f, 14.41f, 6.25f, 12.3f)
                curveTo(6.25f, 10.19f, 7.97f, 8.47f, 10.08f, 8.47f)
                horizontalLineTo(15.23f)
                lineTo(14.9f, 8.15f)
                curveTo(14.61f, 7.86f, 14.61f, 7.38f, 14.9f, 7.09f)
                curveTo(15.19f, 6.8f, 15.67f, 6.8f, 15.96f, 7.09f)
                lineTo(17.53f, 8.66f)
                curveTo(17.82f, 8.96f, 17.82f, 9.43f, 17.53f, 9.72f)
                close()
            }
        }.build()

        return _ForwardSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ForwardSquare: ImageVector? = null
