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

val Iconsax.Outline.DirectNotification: ImageVector
    get() {
        if (_DirectNotification != null) {
            return _DirectNotification!!
        }
        _DirectNotification = ImageVector.Builder(
            name = "Outline.DirectNotification",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.76f, 17.75f)
                horizontalLineTo(10.231f)
                curveTo(9.13f, 17.75f, 8.26f, 17.21f, 7.77f, 16.23f)
                lineTo(6.88f, 14.44f)
                curveTo(6.67f, 14.01f, 6.24f, 13.75f, 5.76f, 13.75f)
                horizontalLineTo(1.98f)
                curveTo(1.57f, 13.75f, 1.23f, 13.41f, 1.23f, 13f)
                curveTo(1.23f, 12.59f, 1.57f, 12.25f, 1.98f, 12.25f)
                horizontalLineTo(5.77f)
                curveTo(6.82f, 12.25f, 7.76f, 12.83f, 8.23f, 13.77f)
                lineTo(9.12f, 15.56f)
                curveTo(9.35f, 16.02f, 9.72f, 16.25f, 10.241f, 16.25f)
                horizontalLineTo(13.771f)
                curveTo(14.25f, 16.25f, 14.681f, 15.99f, 14.891f, 15.56f)
                lineTo(15.781f, 13.77f)
                curveTo(16.25f, 12.83f, 17.191f, 12.25f, 18.24f, 12.25f)
                horizontalLineTo(21.98f)
                curveTo(22.39f, 12.25f, 22.73f, 12.59f, 22.73f, 13f)
                curveTo(22.73f, 13.41f, 22.39f, 13.75f, 21.98f, 13.75f)
                horizontalLineTo(18.24f)
                curveTo(17.76f, 13.75f, 17.33f, 14.01f, 17.121f, 14.44f)
                lineTo(16.23f, 16.23f)
                curveTo(15.75f, 17.17f, 14.811f, 17.75f, 13.76f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 8.75f)
                curveTo(16.93f, 8.75f, 15.25f, 7.07f, 15.25f, 5f)
                curveTo(15.25f, 2.93f, 16.93f, 1.25f, 19f, 1.25f)
                curveTo(21.07f, 1.25f, 22.75f, 2.93f, 22.75f, 5f)
                curveTo(22.75f, 7.07f, 21.07f, 8.75f, 19f, 8.75f)
                close()
                moveTo(19f, 2.75f)
                curveTo(17.76f, 2.75f, 16.75f, 3.76f, 16.75f, 5f)
                curveTo(16.75f, 6.24f, 17.76f, 7.25f, 19f, 7.25f)
                curveTo(20.24f, 7.25f, 21.25f, 6.24f, 21.25f, 5f)
                curveTo(21.25f, 3.76f, 20.24f, 2.75f, 19f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(14f)
                curveTo(14.41f, 1.25f, 14.75f, 1.59f, 14.75f, 2f)
                curveTo(14.75f, 2.41f, 14.41f, 2.75f, 14f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(10f)
                curveTo(21.25f, 9.59f, 21.59f, 9.25f, 22f, 9.25f)
                curveTo(22.41f, 9.25f, 22.75f, 9.59f, 22.75f, 10f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
            }
        }.build()

        return _DirectNotification!!
    }

@Suppress("ObjectPropertyName")
private var _DirectNotification: ImageVector? = null
