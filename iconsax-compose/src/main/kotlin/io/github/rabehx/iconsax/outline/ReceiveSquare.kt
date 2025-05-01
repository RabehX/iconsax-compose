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

val Iconsax.Outline.ReceiveSquare: ImageVector
    get() {
        if (_ReceiveSquare != null) {
            return _ReceiveSquare!!
        }
        _ReceiveSquare = ImageVector.Builder(
            name = "Outline.ReceiveSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.26f)
                curveTo(11.809f, 15.26f, 11.62f, 15.19f, 11.469f, 15.04f)
                lineTo(8.469f, 12.04f)
                curveTo(8.179f, 11.75f, 8.179f, 11.27f, 8.469f, 10.98f)
                curveTo(8.759f, 10.69f, 9.239f, 10.69f, 9.529f, 10.98f)
                lineTo(12f, 13.45f)
                lineTo(14.469f, 10.98f)
                curveTo(14.759f, 10.69f, 15.24f, 10.69f, 15.53f, 10.98f)
                curveTo(15.819f, 11.27f, 15.819f, 11.75f, 15.53f, 12.04f)
                lineTo(12.53f, 15.04f)
                curveTo(12.38f, 15.19f, 12.189f, 15.26f, 12f, 15.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.26f)
                curveTo(11.59f, 15.26f, 11.25f, 14.92f, 11.25f, 14.51f)
                verticalLineTo(6.51f)
                curveTo(11.25f, 6.1f, 11.59f, 5.76f, 12f, 5.76f)
                curveTo(12.41f, 5.76f, 12.75f, 6.1f, 12.75f, 6.51f)
                verticalLineTo(14.51f)
                curveTo(12.75f, 14.93f, 12.41f, 15.26f, 12f, 15.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.23f)
                curveTo(9.89f, 18.23f, 7.77f, 17.89f, 5.76f, 17.22f)
                curveTo(5.37f, 17.09f, 5.16f, 16.66f, 5.29f, 16.27f)
                curveTo(5.42f, 15.88f, 5.84f, 15.66f, 6.24f, 15.8f)
                curveTo(9.96f, 17.04f, 14.05f, 17.04f, 17.77f, 15.8f)
                curveTo(18.16f, 15.67f, 18.59f, 15.88f, 18.72f, 16.27f)
                curveTo(18.85f, 16.66f, 18.64f, 17.09f, 18.25f, 17.22f)
                curveTo(16.23f, 17.9f, 14.11f, 18.23f, 12f, 18.23f)
                close()
            }
        }.build()

        return _ReceiveSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiveSquare: ImageVector? = null
