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

val Iconsax.Outline.NotificationFavorite: ImageVector
    get() {
        if (_NotificationFavorite != null) {
            return _NotificationFavorite!!
        }
        _NotificationFavorite = ImageVector.Builder(
            name = "Outline.NotificationFavorite",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.81f, 18.33f)
                curveTo(8.89f, 18.33f, 6.75f, 17.21f, 6.09f, 15.15f)
                curveTo(5.64f, 13.74f, 6.16f, 11.89f, 7.79f, 11.36f)
                curveTo(8.49f, 11.13f, 9.22f, 11.24f, 9.8f, 11.61f)
                curveTo(10.37f, 11.24f, 11.12f, 11.13f, 11.82f, 11.36f)
                curveTo(13.45f, 11.89f, 13.98f, 13.74f, 13.52f, 15.15f)
                curveTo(12.87f, 17.25f, 10.63f, 18.33f, 9.81f, 18.33f)
                close()
                moveTo(7.52f, 14.7f)
                curveTo(7.98f, 16.15f, 9.54f, 16.81f, 9.82f, 16.84f)
                curveTo(10.14f, 16.81f, 11.67f, 16.07f, 12.09f, 14.71f)
                curveTo(12.32f, 13.98f, 12.09f, 13.04f, 11.36f, 12.8f)
                curveTo(11.05f, 12.7f, 10.63f, 12.76f, 10.43f, 13.05f)
                curveTo(10.29f, 13.26f, 10.07f, 13.38f, 9.82f, 13.39f)
                curveTo(9.58f, 13.39f, 9.34f, 13.28f, 9.2f, 13.08f)
                curveTo(8.96f, 12.75f, 8.54f, 12.7f, 8.25f, 12.8f)
                curveTo(7.53f, 13.03f, 7.29f, 13.97f, 7.52f, 14.7f)
                close()
            }
        }.build()

        return _NotificationFavorite!!
    }

@Suppress("ObjectPropertyName")
private var _NotificationFavorite: ImageVector? = null
