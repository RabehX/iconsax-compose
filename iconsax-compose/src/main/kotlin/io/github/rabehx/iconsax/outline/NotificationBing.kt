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

val Iconsax.Outline.NotificationBing: ImageVector
    get() {
        if (_NotificationBing != null) {
            return _NotificationBing!!
        }
        _NotificationBing = ImageVector.Builder(
            name = "Outline.NotificationBing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 10.52f)
                curveTo(11.59f, 10.52f, 11.25f, 10.18f, 11.25f, 9.77f)
                verticalLineTo(6.44f)
                curveTo(11.25f, 6.03f, 11.59f, 5.69f, 12f, 5.69f)
                curveTo(12.41f, 5.69f, 12.75f, 6.03f, 12.75f, 6.44f)
                verticalLineTo(9.77f)
                curveTo(12.75f, 10.19f, 12.41f, 10.52f, 12f, 10.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.02f, 20.35f)
                curveTo(9.44f, 20.35f, 6.87f, 19.94f, 4.42f, 19.12f)
                curveTo(3.51f, 18.82f, 2.82f, 18.17f, 2.52f, 17.35f)
                curveTo(2.22f, 16.53f, 2.32f, 15.59f, 2.81f, 14.77f)
                lineTo(4.08f, 12.65f)
                curveTo(4.36f, 12.18f, 4.61f, 11.3f, 4.61f, 10.75f)
                verticalLineTo(8.65f)
                curveTo(4.61f, 4.56f, 7.93f, 1.24f, 12.02f, 1.24f)
                curveTo(16.11f, 1.24f, 19.43f, 4.56f, 19.43f, 8.65f)
                verticalLineTo(10.75f)
                curveTo(19.43f, 11.29f, 19.68f, 12.18f, 19.96f, 12.65f)
                lineTo(21.23f, 14.77f)
                curveTo(21.7f, 15.55f, 21.78f, 16.48f, 21.47f, 17.33f)
                curveTo(21.16f, 18.18f, 20.48f, 18.83f, 19.62f, 19.12f)
                curveTo(17.17f, 19.95f, 14.6f, 20.35f, 12.02f, 20.35f)
                close()
                moveTo(12.02f, 2.75f)
                curveTo(8.76f, 2.75f, 6.11f, 5.4f, 6.11f, 8.66f)
                verticalLineTo(10.76f)
                curveTo(6.11f, 11.57f, 5.79f, 12.74f, 5.37f, 13.43f)
                lineTo(4.1f, 15.56f)
                curveTo(3.84f, 15.99f, 3.78f, 16.45f, 3.93f, 16.85f)
                curveTo(4.08f, 17.25f, 4.42f, 17.55f, 4.9f, 17.71f)
                curveTo(9.5f, 19.24f, 14.56f, 19.24f, 19.16f, 17.71f)
                curveTo(19.59f, 17.57f, 19.92f, 17.25f, 20.07f, 16.83f)
                curveTo(20.23f, 16.41f, 20.18f, 15.95f, 19.95f, 15.56f)
                lineTo(18.68f, 13.44f)
                curveTo(18.26f, 12.75f, 17.94f, 11.58f, 17.94f, 10.77f)
                verticalLineTo(8.67f)
                curveTo(17.93f, 5.4f, 15.28f, 2.75f, 12.02f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.9f)
                curveTo(10.93f, 22.9f, 9.88f, 22.46f, 9.12f, 21.7f)
                curveTo(8.36f, 20.94f, 7.92f, 19.89f, 7.92f, 18.82f)
                horizontalLineTo(9.42f)
                curveTo(9.42f, 19.5f, 9.7f, 20.16f, 10.18f, 20.64f)
                curveTo(10.66f, 21.12f, 11.32f, 21.4f, 12f, 21.4f)
                curveTo(13.42f, 21.4f, 14.58f, 20.24f, 14.58f, 18.82f)
                horizontalLineTo(16.08f)
                curveTo(16.08f, 21.07f, 14.25f, 22.9f, 12f, 22.9f)
                close()
            }
        }.build()

        return _NotificationBing!!
    }

@Suppress("ObjectPropertyName")
private var _NotificationBing: ImageVector? = null
